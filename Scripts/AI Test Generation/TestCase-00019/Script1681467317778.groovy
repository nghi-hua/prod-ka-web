import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'--> Navigate to test case start point'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/security')

'step 1: Add visual checkpoint at Page_security'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00019_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
