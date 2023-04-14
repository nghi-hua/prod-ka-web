import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'--> Navigate to test case start point'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/test-automation-for-developers')

'step 1: At Page_test-automation-for-developers hover on span_object'

testObj = findTestObject('Object Repository/Page_test-automation-for-developers/span_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/test-automation-for-developers(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(testObj)

'step 2: At Page_test-automation-for-developers hover on div_object'

testObj = findTestObject('Object Repository/Page_test-automation-for-developers/div_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/test-automation-for-developers(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(testObj)

'step 3: Add visual checkpoint at Page_test-automation-for-developers'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00026_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
