import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'--> Navigate to test case start point'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/software-testers')

'step 1: At Page_software-testers hover on div_object'

testObj = findTestObject('Object Repository/Page_software-testers/div_object_11')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/software-testers(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(testObj)

'step 2: Add visual checkpoint at Page_software-testers'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00090_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
