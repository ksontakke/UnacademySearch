$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/CourseData.feature");
formatter.feature({
  "line": 1,
  "name": "Unacademy Website course data",
  "description": "",
  "id": "unacademy-website-course-data",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1872448700,
  "status": "passed"
});
formatter.before({
  "duration": 1463266300,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Installed driver",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on unacademy course page",
  "keyword": "Given "
});
formatter.match({
  "location": "CourseInfo.user_is_on_unacademy_course_page()"
});
formatter.result({
  "duration": 12667129900,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "User wants course schedule",
  "description": "",
  "id": "unacademy-website-course-data;user-wants-course-schedule",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@schedule"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User click on Schedule",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User should see course schedule",
  "keyword": "Then "
});
formatter.match({
  "location": "CourseInfo.user_click_on_Schedule()"
});
formatter.result({
  "duration": 157806500,
  "status": "passed"
});
formatter.match({
  "location": "CourseInfo.user_should_see_course_schedule()"
});
formatter.result({
  "duration": 5031335400,
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertTrue(Assert.java:44)\r\n\tat org.testng.Assert.assertTrue(Assert.java:54)\r\n\tat stepDefinition.CourseInfo.user_should_see_course_schedule(CourseInfo.java:58)\r\n\tat ✽.Then User should see course schedule(src/test/resources/Feature/CourseData.feature:9)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 9151330500,
  "status": "passed"
});
formatter.after({
  "duration": 5127519500,
  "status": "passed"
});
formatter.before({
  "duration": 1491848800,
  "status": "passed"
});
formatter.before({
  "duration": 1474683900,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Installed driver",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on unacademy course page",
  "keyword": "Given "
});
formatter.match({
  "location": "CourseInfo.user_is_on_unacademy_course_page()"
});
formatter.result({
  "duration": 10642374400,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User wants to see saved course",
  "description": "",
  "id": "unacademy-website-course-data;user-wants-to-see-saved-course",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@saved"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User click on Saved",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User should see saved course",
  "keyword": "Then "
});
formatter.match({
  "location": "CourseInfo.user_click_on_Saved()"
});
formatter.result({
  "duration": 157523300,
  "status": "passed"
});
formatter.match({
  "location": "CourseInfo.user_should_see_saved_course()"
});
formatter.result({
  "duration": 5029393100,
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertTrue(Assert.java:44)\r\n\tat org.testng.Assert.assertTrue(Assert.java:54)\r\n\tat stepDefinition.CourseInfo.user_should_see_saved_course(CourseInfo.java:79)\r\n\tat ✽.Then User should see saved course(src/test/resources/Feature/CourseData.feature:14)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 9145640300,
  "status": "passed"
});
formatter.after({
  "duration": 5106987500,
  "status": "passed"
});
formatter.before({
  "duration": 1531488500,
  "status": "passed"
});
formatter.before({
  "duration": 1470947300,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Installed driver",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on unacademy course page",
  "keyword": "Given "
});
formatter.match({
  "location": "CourseInfo.user_is_on_unacademy_course_page()"
});
formatter.result({
  "duration": 7639171700,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "User wants to see enrolled courses",
  "description": "",
  "id": "unacademy-website-course-data;user-wants-to-see-enrolled-courses",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@enrollments"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "User click on Enrollments",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User should see enrolled courses",
  "keyword": "Then "
});
formatter.match({
  "location": "CourseInfo.user_click_on_Enrollments()"
});
formatter.result({
  "duration": 94996700,
  "status": "passed"
});
formatter.match({
  "location": "CourseInfo.user_should_see_enrolled_courses()"
});
formatter.result({
  "duration": 5022168900,
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertTrue(Assert.java:44)\r\n\tat org.testng.Assert.assertTrue(Assert.java:54)\r\n\tat stepDefinition.CourseInfo.user_should_see_enrolled_courses(CourseInfo.java:100)\r\n\tat ✽.Then User should see enrolled courses(src/test/resources/Feature/CourseData.feature:19)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 9140082000,
  "status": "passed"
});
formatter.after({
  "duration": 5096855100,
  "status": "passed"
});
formatter.before({
  "duration": 1560182800,
  "status": "passed"
});
formatter.before({
  "duration": 1585818700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Installed driver",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on unacademy course page",
  "keyword": "Given "
});
formatter.match({
  "location": "CourseInfo.user_is_on_unacademy_course_page()"
});
formatter.result({
  "duration": 9274536200,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "User wants to see course information",
  "description": "",
  "id": "unacademy-website-course-data;user-wants-to-see-course-information",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@libeary"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "User click on My Library",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "User should see course information",
  "keyword": "Then "
});
formatter.match({
  "location": "CourseInfo.user_click_on_My_Library()"
});
formatter.result({
  "duration": 115847600,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[normalize-space()\u003d\u0027My library\u0027]\"}\n  (Session info: chrome\u003d90.0.4430.93)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:53\u0027\nSystem info: host: \u0027LIN25003818\u0027, ip: \u0027192.168.1.101\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 90.0.4430.93, chrome: {chromedriverVersion: 90.0.4430.24 (4c6d850f087da..., userDataDir: C:\\Users\\kbaburao\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:53948}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 280696092d5c0c29254b3168cecf1152\n*** Element info: {Using\u003dxpath, value\u003d//a[normalize-space()\u003d\u0027My library\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepDefinition.CourseInfo.user_click_on_My_Library(CourseInfo.java:108)\r\n\tat ✽.When User click on My Library(src/test/resources/Feature/CourseData.feature:23)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CourseInfo.user_should_see_course_information()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 9125445100,
  "status": "passed"
});
formatter.after({
  "duration": 5107139500,
  "status": "passed"
});
});