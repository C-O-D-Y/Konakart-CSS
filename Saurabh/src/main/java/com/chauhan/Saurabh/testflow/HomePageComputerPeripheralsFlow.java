package com.chauhan.Saurabh.testflow;

import java.util.Properties;

import com.chauhan.Saurabh.helpers.WebUtility;

/**
 * Class maintains the flow by clicking computer peripherals page scenario
 */
public class HomePageComputerPeripheralsFlow {

	/**
	 * Method use to click on the computer peripherals button on the header bar
	 */
	public void clickComputerPeripherals(Properties locator) {
		WebUtility.clickElement(locator.getProperty("loc.btn.customerPeripherals"));
		WebUtility.explicitWait(locator.getProperty("loc.btn.customerPeripherals"));
	}

	/**
	 * Method use to select the pricing by sliding of the slider bar range
	 */
	public void selectPricing(int value, Properties locator) {
		WebUtility.scrollBySpacebar();
		// WebUtility.clickElement(locator.getProperty("loc.pricingRoller.price"));
		WebUtility.setAttributeValue(locator.getProperty("loc.pricingRoller.price"), value);
		WebUtility.explicitWait(locator.getProperty("loc.btn.customerPeripherals"));
	}
}
