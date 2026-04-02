plugins {
    kotlin("jvm") version "1.9.0"
    application
}

application {
    mainClass.set("ApplicationKt")
}

repositories {
    mavenCentral()
}

val ktor_version = "2.3.4"

dependencies {
    implementation("io.ktor:ktor-server-core:$ktor_version")
    implementation("io.ktor:ktor-server-netty:$ktor_version")
    implementation("com.google.zxing:core:3.5.3")
    implementation("com.google.zxing:javase:3.5.3")
}
