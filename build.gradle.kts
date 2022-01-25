import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.6.3"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	kotlin("jvm") version "1.6.10"
	kotlin("plugin.spring") version "1.6.10"
}

group = "com.graphql.dsg"
version = "1.0-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenLocal()
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jdbc:2.6.3")
	implementation("org.springframework.boot:spring-boot-starter-webflux:2.6.3")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.1")
	implementation("io.projectreactor.kotlin:reactor-kotlin-extensions:1.1.5")
	implementation("org.jetbrains.kotlin:kotlin-reflect:1.6.10")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.10")
	implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor:1.6.0")
	implementation("org.postgresql:postgresql:42.3.1")

	implementation(platform("com.netflix.graphql.dgs:graphql-dgs-platform-dependencies:latest.release"))
	implementation("com.netflix.graphql.dgs:graphql-dgs-spring-boot-starter")


	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
