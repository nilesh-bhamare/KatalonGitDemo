import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser("https://mytestp2.itp2.virginmedia.com/home/index")

WebUI.waitForElementVisible(findTestObject('Object Repository/MyVM/SignInPage/SignInButton'), 60)

WebUI.click(findTestObject('Object Repository/MyVM/SignInPage/SignInButton'))

WebUI.waitForElementVisible(findTestObject('Object Repository/MyVM/SignInPage/Username'), 60)

WebUI.sendKeys(findTestObject('Object Repository/MyVM/SignInPage/Username'), "sub.useruxpAuto31105@virginmedia.com")

WebUI.sendKeys(findTestObject('Object Repository/MyVM/SignInPage/Password'), "sub.useruxpAuto31105@virginmedia.com")

WebUI.waitForElementClickable(findTestObject('Object Repository/MyVM/SignInPage/LoginButton'), 60)

WebUI.click(findTestObject('Object Repository/MyVM/SignInPage/LoginButton'))

WebUI.delay(10)

WebUI.verifyTextPresent('Welcome to My Virgin Media', false)

WebUI.closeBrowser()