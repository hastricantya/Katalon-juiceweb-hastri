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

WebUI.click(findTestObject('Object Repository/Checkout Juice/Page_OWASP Juice Shop/btn_Checkout'))

WebUI.click(findTestObject('Object Repository/Add Address/Page_OWASP Juice Shop/button_addaddress'))

WebUI.setText(findTestObject('Object Repository/Add Address/Page_OWASP Juice Shop/text_address'), 'Indonesia')

WebUI.setText(findTestObject('Object Repository/Add Address/Page_OWASP Juice Shop/text_name'), 'Cancan')

WebUI.click(findTestObject('Object Repository/Add Address/Page_OWASP Juice Shop/text_mobilenumber'))

WebUI.click(findTestObject('Object Repository/Add Address/Page_OWASP Juice Shop/text_country'))

WebUI.setText(findTestObject('Object Repository/Add Address/Page_OWASP Juice Shop/text_mobile'), '1000000000')

WebUI.setText(findTestObject('Object Repository/Add Address/Page_OWASP Juice Shop/text_zipcode'), '12345')

WebUI.setText(findTestObject('Object Repository/Add Address/Page_OWASP Juice Shop/text_ZIP Code_address'), 'jakarta')

WebUI.setText(findTestObject('Object Repository/Add Address/Page_OWASP Juice Shop/text_state'), 'jakarta')

WebUI.click(findTestObject('Object Repository/Add Address/Page_OWASP Juice Shop/button_submit'))

