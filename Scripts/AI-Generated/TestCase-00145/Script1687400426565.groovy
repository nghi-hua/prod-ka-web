import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_webinars_stay-productive-testing-from-home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/webinars/stay-productive-testing-from-home')

'step 2: Add visual checkpoint at Page_webinars_stay-productive-testing-from-home'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00145_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
