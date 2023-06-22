import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_community-hub'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/community-hub')

'step 2: At Page_community-hub click on hyperlink_forum_katalon_com_t_introducing_studioa'

testObj = findTestObject('Object Repository/Page_community-hub/hyperlink_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/community-hub(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page_community-hub'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00008_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
