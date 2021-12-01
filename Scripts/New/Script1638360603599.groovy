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

Mobile.startApplication('C:\\Users\\Elitebook 840\\Downloads\\Langit Musik_v5.11.0_apkpure.com.apk', true)

Mobile.tapAndHold(findTestObject('Object Repository/new/android.widget.TextView - Selanjutnya'), 0, 0)

Mobile.tapAndHold(findTestObject('Object Repository/new/android.widget.TextView - Selanjutnya (1)'), 0, 0)

Mobile.tapAndHold(findTestObject('Object Repository/new/android.widget.TextView - Selesai'), 0, 0)

Mobile.tapAndHold(findTestObject('Object Repository/new/android.widget.Button - Oke'), 0, 0)

Mobile.tapAndHold(findTestObject('Object Repository/new/android.widget.Button - Oke (1)'), 0, 0)

Mobile.tapAndHold(findTestObject('Object Repository/new/android.widget.ImageView'), 0, 0)

Mobile.tapAndHold(findTestObject('Object Repository/new/android.widget.ImageView (1)'), 0, 0)

Mobile.scrollToText('Keluar', FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHold(findTestObject('Object Repository/new/android.widget.TextView - Keluar'), 0, 0)

Mobile.tapAndHold(findTestObject('Object Repository/new/android.widget.Button - Hapus'), 0, 0)

Mobile.tapAndHold(findTestObject('new/android.widget.ImageView1'), 0, 0)

Mobile.tapAndHold(findTestObject('Object Repository/new/android.widget.Button - Daftar dan Masuk'), 0, 0)

Mobile.setText(findTestObject('Object Repository/new/android.widget.EditText - Isi nomor handphone disini'), '085777641438', 
    0)

Mobile.tapAndHold(findTestObject('Object Repository/new/android.widget.Button - Kirim'), 0, 0)

Mobile.setEncryptedText(findTestObject('Object Repository/new/android.widget.EditText - Isi kata sandi disini'), 'zWJY1KLRJ75aoSOSN3voXA==', 
    0)

Mobile.tapAndHold(findTestObject('Object Repository/new/android.widget.Button - Masuk'), 0, 0)

Mobile.tapAndHold(findTestObject('Object Repository/new/android.widget.TextView - SKIP'), 0, 0)

Mobile.tapAndHold(findTestObject('Object Repository/new/android.widget.ImageView (2)'), 0, 0)

Mobile.setText(findTestObject('Object Repository/new/android.widget.EditText'), 'Rossa - Karena Cinta Yang Me', 0)

Mobile.tapAndHold(findTestObject('Object Repository/new/android.widget.TextView - Rossa - Karena Cinta Yang Menemani'), 
    0, 0)

Mobile.tapAndHold(findTestObject('Object Repository/new/android.widget.TextView - Karena Cinta Yang Menemani'), 0, 0)

