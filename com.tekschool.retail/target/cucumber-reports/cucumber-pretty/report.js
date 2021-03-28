$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Desktop.feature");
formatter.feature({
  "line": 1,
  "name": "Desktops Feature",
  "description": "",
  "id": "desktops-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1976390700,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User verify all items are present in Desktops tab",
  "description": "",
  "id": "desktops-feature;user-verify-all-items-are-present-in-desktops-tab",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@DesktopPage"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User is on Retail website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click on Desktops tab",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User click on Show all desktops",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User should see all items are present in Desktop page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#Scenario: User add HP LP 3065  from Desktops tab to the cart"
    }
  ],
  "line": 10,
  "name": "User click on ‘HP LP3065’ item",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click add to Cart button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should see a message ‘Success: you have added HP LP 3065 to your Shopping cart!’",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 14,
      "value": "#Scenario: User add Canon EOS 5D from Desktops tab to the cart"
    }
  ],
  "line": 15,
  "name": "User click ADD TO CART option on ‘Canon EOS 5D’ item",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User select color from dropdown ‘Red’",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User select quantity 1",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User click add to Cart button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestStepDefinition.user_is_on_Retail_website()"
});
formatter.result({
  "duration": 3225596300,
  "status": "passed"
});
formatter.match({
  "location": "RetailPageDesktopDefinitions.user_click_on_Desktops_tab()"
});
formatter.result({
  "duration": 57787300,
  "status": "passed"
});
formatter.match({
  "location": "RetailPageDesktopDefinitions.user_click_on_Show_all_desktops()"
});
formatter.result({
  "duration": 582403200,
  "status": "passed"
});
formatter.match({
  "location": "RetailPageDesktopDefinitions.user_should_see_all_items_are_present_in_Desktop_page()"
});
formatter.result({
  "duration": 16300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3065",
      "offset": 20
    }
  ],
  "location": "RetailPageDesktopDefinitions.user_click_on_HP_LP_item(int)"
});
formatter.result({
  "duration": 1281271600,
  "status": "passed"
});
formatter.match({
  "location": "RetailPageDesktopDefinitions.user_click_add_to_Cart_button()"
});
formatter.result({
  "duration": 89100200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3065",
      "offset": 57
    }
  ],
  "location": "RetailPageDesktopDefinitions.user_should_see_a_message_Success_you_have_added_HP_LP_to_your_Shopping_cart(int)"
});
formatter.result({
  "duration": 41263000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 44
    }
  ],
  "location": "RetailPageDesktopDefinitions.user_click_ADD_TO_CART_option_on_Canon_EOS_D_item(int)"
});
formatter.result({
  "duration": 45040898600,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//body/div[@id\u003d\u0027product-category\u0027]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/h4[1]/a[1]\"}\n  (Session info: chrome\u003d88.0.4324.150)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.7.0\u0027, revision: \u00272321c73\u0027, time: \u00272017-11-02T22:22:35.584Z\u0027\nSystem info: host: \u0027DESKTOP-PA77RHI\u0027, ip: \u0027192.168.0.55\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.150, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\malik\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:60831}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 4ff77463f32f1550f12662ddf652126a\n*** Element info: {Using\u003dxpath, value\u003d//body/div[@id\u003d\u0027product-category\u0027]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/h4[1]/a[1]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:370)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:472)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy21.click(Unknown Source)\r\n\tat pageObjects.DesktopPageObj.addToCart(DesktopPageObj.java:77)\r\n\tat stepDefinitions.RetailPageDesktopDefinitions.user_click_ADD_TO_CART_option_on_Canon_EOS_D_item(RetailPageDesktopDefinitions.java:49)\r\n\tat ✽.And User click ADD TO CART option on ‘Canon EOS 5D’ item(Features/Desktop.feature:15)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "RetailPageDesktopDefinitions.user_select_color_from_dropdown_Red()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 21
    }
  ],
  "location": "RetailPageDesktopDefinitions.user_select_quantity(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RetailPageDesktopDefinitions.user_click_add_to_Cart_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 61
    }
  ],
  "location": "RetailPageDesktopDefinitions.user_should_see_a_message_Success_You_have_added_Canon_EOS_D_to_your_shopping_cart(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 4678848700,
  "status": "passed"
});
});