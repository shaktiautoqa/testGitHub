package com.growsure.app;

import org.testng.annotations.Test;

import basePkg.baseClass;

public class toVerifyHeaderContent extends baseClass {

	@Test
	public void toVerifyHeader() {
		homePage h = new homePage();
		h.verifyHeaderContent(driver);
	}

}
