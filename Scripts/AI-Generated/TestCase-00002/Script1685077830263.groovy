import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_api-testing'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/api-testing')

'step 2: At Page_api-testing click on hyperlink_view_a_demo --> navigate to Page_view-a-demo'

testObj = findTestObject('Object Repository/Page_api-testing/hyperlink_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/api-testing(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page_view-a-demo click on div_wistia_87_big_play_button_graphic'

testObj = findTestObject('Object Repository/Page_view-a-demo/div_object_19')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/view-a-demo(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: Add visual checkpoint at Page_view-a-demo'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00002_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
