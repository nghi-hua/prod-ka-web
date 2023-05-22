import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_resources-center_blog_automation-testing-tools'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/resources-center/blog/automation-testing-tools')

'step 2: At Page_resources-center_blog_automation-testing-tools click on hyperlink_resources_center_blog_end_to_end_testing --> navigate to Page_resources-center_blog_graphql-testing'

testObj = findTestObject('Object Repository/Page_resources-center_blog_automation-testing-tools/hyperlink_object_5')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/resources-center/blog/automation-testing-tools(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page_resources-center_blog_graphql-testing'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00007_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
