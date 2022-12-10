package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import core.StepBase;
import pages.DashboardPage;
import pages.LoginPage;

public class TestCases extends StepBase{
	
	LoginPage objlogin;
	DashboardPage objDashboardPage;


	@BeforeTest
	public void start() {
		setup();
	}

	@Test (priority = 1)
	public void login() {
		objlogin = new LoginPage();
		objlogin.login();

	}

	@Test (priority = 2)
	public void dashboard() {
		objDashboardPage = new DashboardPage();
		objDashboardPage.dashboard();

	}

	@Test (priority = 3)
	public void pimSection() {
		System.out.println("PIM Section");

	}

	@AfterTest
	public void close() {
		teardown();
	}

}
