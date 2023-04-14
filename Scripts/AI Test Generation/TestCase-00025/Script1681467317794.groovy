import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.model.FailureHandling

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'--> Navigate to test case start point'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/pricing')

'step 1: At Page_pricing click on div_object'

testObj = findTestObject('Object Repository/Page_pricing/div_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/pricing(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 2: Add visual checkpoint at Page_pricing'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00025_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
