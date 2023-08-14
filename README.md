# AlMosafer APIs Task

**Framework components:**

1. Programming language: JAVA
2. API automation framework: RestAssured/Gson/Jaxson
3. Build/Project management tool: Maven
4. Execution control: TestNG

**Before Run the project Make sure:**
* Java is installed and configured.
* Apache Maven is installed and configured.

**How to run:**
1. Clone/Pull the code into your local.
2. Open Terminal (On MacOS) or CMD (on WindowsOS), For example, on MacOS or Linux:
   ```sh
   cd path/to/your/project
      ```
   On Windows:
   ```sh
    cd path\to\your\project
`
3. Once you're in the project directory, you can run the following commands:
   
*- Run Get Flights API tests:*
   ```sh
   mvn clean test -Dtest=GetFlightsAPITest
 ```
*- Run POST Calendar Fears API tests:*
   ```sh
   mvn clean test -Dtest=PostCalenderFearsTest
```
   
   


