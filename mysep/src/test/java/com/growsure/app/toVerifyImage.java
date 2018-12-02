package com.growsure.app;

import org.testng.annotations.Test;

import basePkg.baseClass;

public class toVerifyImage extends baseClass{
		@Test
		public void verifyImage() {
			homePage h = new homePage();
			h.toVerifyImage(driver);

	}

}
