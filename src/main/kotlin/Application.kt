import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.http.*

// Exercise 3: Ktor QR-as-a-Service
fun main() {
    embeddedServer(Netty, port = 8080) {
        routing {
            get("/qr") {
                val text = call.request.queryParameters["text"]
                if (text != null) {
                    val outputStream = generateQRCodeStream(text)
                    call.response.header(HttpHeaders.ContentType, "image/png")
                    call.respondBytes(outputStream.toByteArray(), ContentType.Image.PNG)
                } else {
                    call.respond(HttpStatusCode.BadRequest, "Missing 'text' query parameter")
                }
            }
        }
    }.start(wait = true)
}
