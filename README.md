# GTranslateTests
 How to use and run this project: 
 1. Java JDK should be installed on the PC, registered in the $PATH variable
 2. Download Gradle binary (builder) from gradle.org, add to $PATH variable
 3. Download chromedriver from https://chromedriver.chromium.org/downloads (version of chromedriver should be same as your browser version)
 4. How to run tests:
    1. v1: Via SDK (inInellijIdea) open project , open TextTranslationTests, click on the green arrow
    2. v2: Via terminal (cmd on Windows): copy path to project GTranslateTests, type commands:
       1. cd <Path to GTranslateTests> (for example: cd C:\Users\user\Documents\GTranslateTests)
       2. gradle cleanTest test (for windows: gradlew cleanTest test)
    If the test was ran from terminal, in any browser open http://localhost:63343/GTranslateTests/build/reports/tests/test/index.html - and enjoy from pretty testng report! 
