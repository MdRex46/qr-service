import com.google.zxing.BarcodeFormat
import com.google.zxing.qrcode.QRCodeWriter
import com.google.zxing.client.j2se.MatrixToImageWriter
import java.nio.file.Paths
import java.io.ByteArrayOutputStream

// Exercise 1: Save QR code to a file
fun saveQRCode(content: String, fileName: String) {
    val writer = QRCodeWriter()
    val bitMatrix = writer.encode(content, BarcodeFormat.QR_CODE, 300, 300)
    val path = Paths.get(fileName)
    MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path)
    println("QR code saved to $fileName")
}

// Exercise 2: Generate QR code into memory stream
fun generateQRCodeStream(content: String): ByteArrayOutputStream {
    val writer = QRCodeWriter()
    val bitMatrix = writer.encode(content, BarcodeFormat.QR_CODE, 300, 300)
    val outputStream = ByteArrayOutputStream()
    MatrixToImageWriter.writeToStream(bitMatrix, "PNG", outputStream)
    return outputStream
}

fun main() {
    saveQRCode("your.email@lehman.cuny.edu", "my_email.png")
}
