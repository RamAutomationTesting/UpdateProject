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

WebUI.navigateToUrl('https://demowebshop.tricentis.com/')

WebUI.click(findTestObject('Object Repository/CartPage/Page_Demo Web Shop/a_Log in'))

WebUI.setText(findTestObject('Object Repository/CartPage/Page_Demo Web Shop. Login/input_Email_Email'), 'demoAutomarion@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/CartPage/Page_Demo Web Shop. Login/input_Password_Password'), 'HBiNh08voQs=')

WebUI.click(findTestObject('Object Repository/CartPage/Page_Demo Web Shop. Login/input_Forgot password_button-1 login-button'))

WebUI.click(findTestObject('Object Repository/CartPage/Page_Demo Web Shop/span_Shopping cart'))

WebUI.click(findTestObject('Object Repository/CartPage/Page_Demo Web Shop. Shopping Cart/input_Remove_removefromcart'))

WebUI.click(findTestObject('Object Repository/CartPage/Page_Demo Web Shop. Shopping Cart/div_I agree with the terms of service and I_c30d4c'))

WebUI.click(findTestObject('Object Repository/CartPage/Page_Demo Web Shop. Shopping Cart/input_I agree with the terms of service and_f529a0'))

WebUI.click(findTestObject('Object Repository/CartPage/Page_Demo Web Shop. Shopping Cart/button_Checkout'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Test - Copy (1)'), '3249660', false)

WebUI.delay(20)

WebUI.selectOptionByLabel(findTestObject('Test - Copy (1)'), 'New Address', false)

WebUI.click(findTestObject('Test'))

WebUI.click(findTestObject('Test - Copy'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/CartPage/Page_Demo Web Shop. Checkout/input_City_BillingNewAddress.City'), 
    'NEW ZELAND')

WebUI.setText(findTestObject('Object Repository/CartPage/Page_Demo Web Shop. Checkout/input_Address 1_BillingNewAddress.Address1'), 
    '')

WebUI.click(findTestObject('Object Repository/CartPage/Page_Demo Web Shop. Checkout/input_Address 1_BillingNewAddress.Address1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/CartPage/Page_Demo Web Shop. Checkout/select_Select countryUnited StatesCanadaAfg_dd1e54'), 
    '55', true)

WebUI.setText(findTestObject('Object Repository/CartPage/Page_Demo Web Shop. Checkout/input_Address 1_BillingNewAddress.Address1'), 
    'TEST')

WebUI.setText(findTestObject('Object Repository/CartPage/Page_Demo Web Shop. Checkout/input_Address 2_BillingNewAddress.Address2'), 
    'RED')

WebUI.setText(findTestObject('Object Repository/CartPage/Page_Demo Web Shop. Checkout/input_Zip  postal code_BillingNewAddress.Zi_77bd94'), 
    '12345')

WebUI.setText(findTestObject('Object Repository/CartPage/Page_Demo Web Shop. Checkout/input_Phone number_BillingNewAddress.PhoneNumber'), 
    '2345')

WebUI.click(findTestObject('Object Repository/CartPage/Page_Demo Web Shop. Checkout/input_Fax number_button-1 new-address-next-_2f210c'))

WebUI.click(findTestObject('Object Repository/CartPage/Page_Demo Web Shop. Checkout/input_Fax number_button-1 new-address-next-_2f210c'))

WebUI.click(findTestObject('Object Repository/CartPage/Page_Demo Web Shop. Checkout/input__button-1 shipping-method-next-step-button'))

WebUI.click(findTestObject('Object Repository/CartPage/Page_Demo Web Shop. Checkout/a_Log out'))

WebUI.closeBrowser()

