import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_resources-center_blog_continuous-testing-best-practices'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/resources-center/blog/continuous-testing-best-practices')

'step 2: Add visual checkpoint at Page_resources-center_blog_continuous-testing-best-practices'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00138_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
