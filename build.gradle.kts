plugins {
    kotlin("jvm") version "2.1.10"
}

kotlin {
    jvmToolchain(17) // targets Java 17
}


group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}