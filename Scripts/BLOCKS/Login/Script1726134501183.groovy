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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://juice-shop.herokuapp.com/#/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('LOGIN/Page_OWASP Juice Shop/span_Dismiss'))

WebUI.click(findTestObject('Object Repository/LOGIN/Page_OWASP Juice Shop/button_account'))

WebUI.click(findTestObject('Object Repository/LOGIN/Page_OWASP Juice Shop/button_login'))

WebUI.click(findTestObject('Object Repository/LOGIN/Page_OWASP Juice Shop/click_Email'))

WebUI.setText(findTestObject('Object Repository/LOGIN/Page_OWASP Juice Shop/text_email'), 'hcd257hastri@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/LOGIN/Page_OWASP Juice Shop/text_password'), 'hwlV2QQH4zM=')

WebUI.click(findTestObject('Object Repository/LOGIN/Page_OWASP Juice Shop/click_login'))

WebUI.verifyElementVisible(findTestObject('Object Repository/LOGIN/Page_OWASP Juice Shop/div_All Products'))

