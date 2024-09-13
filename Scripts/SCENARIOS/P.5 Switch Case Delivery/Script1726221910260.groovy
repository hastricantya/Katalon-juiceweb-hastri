import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('BLOCKS/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('BLOCKS/Add Juice to Cart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('BLOCKS/Add Address'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Checkout Juice/RADIO ADDRESS/radio_address'))

WebUI.click(findTestObject('Object Repository/Checkout Juice/Page_OWASP Juice Shop/btn_continuetodelivery'))

//WebUI.click(findTestObject('Checkout Juice/Page_OWASP Juice Shop/RADIO DELIVERY/radio_oneday'))
// isi radio delivery
def select_radio = radio_delivery

'isi program'
switch (select_radio) {
	case select_radio = 'radio_fast':
		println(select_radio)
		WebUI.click(findTestObject('Object Repository/Checkout Juice/Page_OWASP Juice Shop/RADIO DELIVERY/radio_fast'))
		

		break
	case select_radio = 'radio_oneday':
		println(select_radio)
		WebUI.click(findTestObject('Object Repository/Checkout Juice/Page_OWASP Juice Shop/RADIO DELIVERY/radio_oneday'))
		

		break
	case select_radio = 'radio_standard':
		println(select_radio)
		WebUI.click(findTestObject('Object Repository/Checkout Juice/Page_OWASP Juice Shop/RADIO DELIVERY/radio_standard'))
		
	default:
		println(select_radio)
		WebUI.click(findTestObject('Object Repository/Checkout Juice/Page_OWASP Juice Shop/RADIO DELIVERY/radio_standard'))

		break
}


WebUI.click(findTestObject('Object Repository/Checkout Juice/Page_OWASP Juice Shop/btn_continuetopayment'))

