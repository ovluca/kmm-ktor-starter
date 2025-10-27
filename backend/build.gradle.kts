plugins {
    kotlin("jvm") version "1.8.22"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-netty:2.3.2")
    implementation("io.ktor:ktor-server-core:2.3.2")
    implementation("io.ktor:ktor-server-auth:2.3.2")
    implementation("io.ktor:ktor-server-content-negotiation:2.3.2")
    implementation("io.ktor:ktor-serialization-kotlinx-json:2.3.2")
    testImplementation(kotlin("test"))
}

application {
    mainClass.set("com.example.backend.ApplicationKt")
}
