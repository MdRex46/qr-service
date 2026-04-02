plugins {
    kotlin("jvm") version "1.9.23"
    id("io.ktor.plugin") version "2.3.4"
}

application {
    mainClass.set("ApplicationKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core:2.3.4")
    implementation("io.ktor:ktor-server-netty:2.3.4")
    implementation("com.google.zxing:core:3.5.3")
    implementation("com.google.zxing:javase:3.5.3")
}
