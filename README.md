JavaProject26
A modern Java template and starter project using Java 17+, Gradle, JUnit 5, and Allure Framework for detailed test reporting.

📋 Features
Java 17+ Support: Utilizes modern Java language features (Records, Sealed Classes, Pattern Matching, etc.).
Gradle Wrapper: Pre-configured build automation with dependency management.
JUnit 5 (Jupiter): Unit testing framework configured out of the box.
Allure Report Integration: Automated visual test execution reports via the official Allure Gradle plugin.
🛠️ Prerequisites
Before building and running the project, ensure you have the following installed:
JDK 17 or higher 
Git
Note: You do not need to install Gradle globally; the included Gradle Wrapper (gradlew) handles build dependencies automatically.

📂 Project Structure
Plaintext
JavaProject26/
├── .gradle/
├── gradle/
│   └── wrapper/
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/example/App.java
│   └── test/
│       └── java/
│           └── com/example/AppTest.java
├── build.gradle
├── gradlew
├── gradlew.bat
├── settings.gradle
└── README.md

⚙️ Gradle Configuration (build.gradle)
Below is the project's build setup incorporating JUnit 5 and Allure:

Groovy
plugins {
id 'java'
id 'io.qameta.allure' version '2.11.2'
}

group = 'com.example'
version = '1.0.0'

repositories {
mavenCentral()
}

def allureVersion = '2.25.0'

dependencies {
// JUnit 5 API and Engine
testImplementation platform('org.junit:junit-bom:5.10.1')
testImplementation 'org.junit.jupiter:junit-jupiter'

    // Allure JUnit 5 Integration
    testImplementation "io.qameta.allure:allure-junit5:${allureVersion}"
}

java {
toolchain {
languageVersion = JavaLanguageVersion.of(17)
}
}

test {
useJUnitPlatform()
testLogging {
events "passed", "skipped", "failed"
}
}

allure {
version = allureVersion
autoconfigure = true
aspectjweaver = true
}
🚀 Getting Started
1. Clone the Repository
   Bash
   git clone https://github.com/your-username/JavaProject26.git
   cd JavaProject26
2. Build the Project
   Compile the application and download dependencies:

Bash
# Linux/macOS
./gradlew build

# Windows
gradlew.bat build
🧪 Running Tests & Allure Reports
Execute Unit Tests
To run the unit tests and collect raw Allure results:

Bash
./gradlew test

Test results raw files will be saved in build/allure-results.

Generate & View Allure Report

To launch a local web server and view the generated visual Allure report directly in your browser:

Bash
./gradlew allureServe

To build a static, standalone HTML report inside build/reports/allure-report:

Bash
./gradlew allureReport


📄 License
This project is licensed under the MIT License - see the LICENSE file for details.