import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'--> Navigate to test case start point'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/ebooks/digital-transformation-in-insurance')

'step 1: Add visual checkpoint at Page_ebooks_digital-transformation-in-insurance'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00018_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
