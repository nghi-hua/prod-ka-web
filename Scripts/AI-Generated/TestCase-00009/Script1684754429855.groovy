import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_free-trial_web-testing'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/free-trial/web-testing')

'step 2: At Page_free-trial_web-testing input on input_fullname_testing'

testObj = findTestObject('Object Repository/Page_free-trial_web-testing/input_fullname_testing')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/free-trial/web-testing(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_1_input_fullname_testing)

'step 3: At Page_free-trial_web-testing input on input_email_testing'

testObj = findTestObject('Object Repository/Page_free-trial_web-testing/input_email_testing')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/free-trial/web-testing(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_2_input_email_testing)

'step 4: At Page_free-trial_web-testing click on input_receive_new_update'

testObj = findTestObject('Object Repository/Page_free-trial_web-testing/input_receive_new_update')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/free-trial/web-testing(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: At Page_free-trial_web-testing input on input_password_testing'

testObj = findTestObject('Object Repository/Page_free-trial_web-testing/input_password_testing')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/free-trial/web-testing(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_3_input_password_testing)

'step 6: At Page_free-trial_web-testing click on img_object'

testObj = findTestObject('Object Repository/Page_free-trial_web-testing/img_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/free-trial/web-testing(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 7: At Page_free-trial_web-testing click on button_object'

testObj = findTestObject('Object Repository/Page_free-trial_web-testing/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/free-trial/web-testing(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 8: At Page_free-trial_web-testing click on input_receive_new_update'

testObj = findTestObject('Object Repository/Page_free-trial_web-testing/input_receive_new_update')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/free-trial/web-testing(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 9: At Page_free-trial_web-testing click on button_object'

testObj = findTestObject('Object Repository/Page_free-trial_web-testing/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/free-trial/web-testing(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 10: Add visual checkpoint at Page_free-trial_web-testing'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00009_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
