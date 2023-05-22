import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'step 2: At Page_home click on hyperlink_case_studies_care_logistics_ --> navigate to Page_case-studies_care-logistics'

testObj = findTestObject('Object Repository/Page_home/hyperlink_object_13')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page_case-studies_care-logistics click on hyperlink_resources_center_blog --> navigate to Page_resources-center_blog'

testObj = findTestObject('Object Repository/Page_case-studies_care-logistics/hyperlink_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/case-studies/care-logistics(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: Add visual checkpoint at Page_resources-center_blog'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00006_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
