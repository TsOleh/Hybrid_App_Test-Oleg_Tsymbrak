
1. Instruments:
- Appium
- IDE Android studio
- android studio emulator
- phone - Nexus 4 API 24 (7.0)

2. There is absolute path specified(relative is not working)

3. command to run test - gradlew testDebugUnitTest

4. build report path - C:\Android_projects\SecondAndroidProject\app\build\reports\tests\testDebugUnitTest\index.html
5. test class to run - app\src\test\java\com\example\tsoleg\secondandroidproject\ExampleUnitTest.java

6.Because of task simplicity I didn't use any patterns(page object for example)
7.I don't know why but I don't have to use driver.switchTo().window("WEBVIEW"); to work with web
  it's work correct without it. I can't fix it.

  Taras, if you find the reason, please let me know what it is.
