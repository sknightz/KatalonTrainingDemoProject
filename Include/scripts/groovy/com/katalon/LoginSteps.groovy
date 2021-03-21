package com.katalon

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject


















public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {

		println "I am inside given"
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')
	}

	@When("user enters (.*) and (.*)")
	public void user_enters_username_and_password(String username, String password) {

		println "I am inside when"
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), username)
		WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_txtPassword'), password)
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {

		println "I am inside and"
		WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Password_Submit'))
	}

	@Then("user is naviageted to the home page")
	public void user_is_naviageted_to_the_home_page() {

		println "I am inside then"
		WebUI.verifyTextPresent('Welcome', false)
		WebUI.closeBrowser()
	}
}
