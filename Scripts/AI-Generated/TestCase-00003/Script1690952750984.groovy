import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page_home'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

'step 2: At Page_home click on hyperlink_172_hon_chim_canh_cut_quy_hiem_bi_dan_on --> navigate to Page_hon-60-chim-canh-cut-quy-hiem-bi-dan-ong-dot-chet_'

testObj = findTestObject('Object Repository/Page_home/hyperlink_172_hon_chim_canh_cut_quy_hiem_bi_dan_on')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: At Page_hon-60-chim-canh-cut-quy-hiem-bi-dan-ong-dot-chet_ click on hyperlink_172_category_social --> navigate to Page_category_social_'

testObj = findTestObject('Object Repository/Page_home/hyperlink_172_category_social')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/.*/.*/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page_category_social_ click on hyperlink_172_trien_khai_du_an_dai_hoc_khong_rac_t --> navigate to Page_trien-khai-du-an-dai-hoc-khong-rac-thai-dau-tien_'

testObj = findTestObject('Object Repository/Page_category_social/hyperlink_172_trien_khai_du_an_dai_hoc_khong_rac_t')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/category/social(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: Add visual checkpoint at Page_trien-khai-du-an-dai-hoc-khong-rac-thai-dau-tien_'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00003_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
