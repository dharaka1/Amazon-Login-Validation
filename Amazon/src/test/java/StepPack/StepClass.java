package StepPack;

import java.io.IOException;

import BasePack.BaseClass;
import PomPack.PomClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepClass extends BaseClass {
	PomClass ps = new PomClass();

	@Given("User launch {string}")
	public void user_launch(String browsers) {

		LaunchBrowsers(browsers);
	}

	@When("Launch The Url")
	public void launch_the_url() {

		LaunchUrl("https://www.amazon.in/");
	}

	@When("user click Sigin")
	public void user_click_sigin() throws IOException {
		ps.Signin();
	}

	@When("user Enter {string}")
	public void user_enter(String username) throws IOException {
		ps.User();
	}

	@When("user3 Clicks Continue")
	public void user3_clicks_continue() throws IOException {
		ps.ClickContiue();
	}

	@When("user2 Enter {string}")
	public void user2_enter(String password) throws IOException {

		ps.password();
	}

	@Then("user3 Clicks Sigin")
	public void user3_clicks_sigin() throws IOException {

		ps.ClickSigin();
	}

}