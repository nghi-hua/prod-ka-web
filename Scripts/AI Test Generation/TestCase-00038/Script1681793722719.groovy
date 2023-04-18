import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'--> Navigate to test case start point'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/resources-center/blog/mobile-testing-interview-questions')

'step 1: Add visual checkpoint at Page_resources-center_blog_mobile-testing-interview-questions'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00038_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
