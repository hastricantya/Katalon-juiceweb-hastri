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

WebUI.click(findTestObject('NEW/Page_OWASP Juice Shop/btn_Continuecheckout'))

WebUI.verifyElementVisible(findTestObject('NEW/Page_OWASP Juice Shop/h1_My Payment Options'))

WebUI.click(findTestObject('NEW/Page_OWASP Juice Shop/click_addcard'))

WebUI.click(findTestObject('NEW/Page_OWASP Juice Shop/click_name'))

WebUI.setText(findTestObject('NEW/Page_OWASP Juice Shop/input_Namecredit'), 'hastri')

WebUI.click(findTestObject('NEW/Page_OWASP Juice Shop/click_card'))

WebUI.setText(findTestObject('NEW/Page_OWASP Juice Shop/input_cardnumber'), '1234567812345678')

WebUI.selectOptionByValue(findTestObject('NEW/Page_OWASP Juice Shop/select_expmonth'), '7', true)

WebUI.selectOptionByValue(findTestObject('NEW/Page_OWASP Juice Shop/select_expyear'), '2084', true)

WebUI.click(findTestObject('NEW/Page_OWASP Juice Shop/btn_submitcard'))

WebUI.click(findTestObject('NEW/Page_OWASP Juice Shop/btn_Continuecheckout'))

WebUI.verifyElementVisible(findTestObject('NEW/Page_OWASP Juice Shop/div_Order Summary'))

