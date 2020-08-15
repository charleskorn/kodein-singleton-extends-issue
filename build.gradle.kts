plugins {
    id("org.jetbrains.kotlin.jvm") version "1.3.72"
    application
}

repositories {
    jcenter()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.kodein.di:kodein-di:7.0.0")
}

application {
    mainClassName = "com.charleskorn.kodeinsingletonextendsissue.AppKt"
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions.jvmTarget = "1.8"
}