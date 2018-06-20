
1. Instruments:
- Appium
- IDE Android studio
- android studio emulator
- phone - Nexus 4 API 24 (7.0)

2. There is absolute path specified(relative is not working)
3. The project is not completely finished(There is no work with web, only native). I will finish.

4. command to run test - gradlew testDebugUnitTest

5. build report path - C:\Android_projects\SecondAndroidProject\app\build\reports\tests\testDebugUnitTest\index.html
6. test class to run - C:\Android_projects\SecondAndroidProject\app\src\test\java\com\example\tsoleg\secondandroidproject\ExampleUnitTest.java

7.Because of task simplicity I didn't use any patterns(page object for example)
8.I don't know why but I don't have to use driver.switchTo().window("WEBVIEW");
  it's work correct without it. I can't fix it.
