
plugins {
    id("org.jetbrains.kotlin.jvm") version "1.8.20"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.guava:guava:32.1.2-jre")
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useKotlinTest("1.8.20")
        }
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

application {
    mainClass.set("com.kamerling.AppKt")
}
