plugins {
    kotlin("jvm") version "1.9.22"
}

group = "com.gmail.ait27ru"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}