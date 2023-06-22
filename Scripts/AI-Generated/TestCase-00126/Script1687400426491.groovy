import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_resources-center_blog_stop-test-execution-fail-fast'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/resources-center/blog/stop-test-execution-fail-fast')

'step 2: Add visual checkpoint at Page_resources-center_blog_stop-test-execution-fail-fast'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00126_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
