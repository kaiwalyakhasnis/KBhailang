import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
    application
    id("maven-publish")
}

publishing {
    publications {
        create("mavenJava", MavenPublication::class.java).apply {
            groupId = "me.kk.kbhailang"
            this.artifactId = "kbhailang"
            version = "0.0.3"
            from(components["java"])
        }
    }
}

group = "me.user"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}