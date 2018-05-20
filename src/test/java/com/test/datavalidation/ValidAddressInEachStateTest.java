package com.test.datavalidation;

import com.test.data.state.ValidAddressInEachState;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidAddressInEachStateTest {

	@Test(dataProvider="Valid Address In All States",dataProviderClass = ValidAddressInEachState.class)
	public void testStateAddress(String address){
		System.out.println(address);
		String zipAtEnd = ".*\\d{5,5}$";
		Assert.assertTrue(address.matches(zipAtEnd));
		String threeCommas =".*,.*,.*";
		Assert.assertTrue(address.matches(threeCommas));
		String numberToBegin ="^\\d+[ ].*";
		Assert.assertTrue(address.matches(numberToBegin));

	}
}
