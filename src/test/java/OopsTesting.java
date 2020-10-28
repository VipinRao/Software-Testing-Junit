import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class OopsTesting {
	//Base Class Testing
	@Test
	public  void baseTestMaturityAmount(){
		InsurancePolicy insurancePolicy = new InsurancePolicy(500000, 15, 10);
		int actual = insurancePolicy.getMaturityAmount();
		int expected = 550000;
		assertEquals(expected, actual);
	}
	@Test
	public void baseTestLoyaltyBenefit(){
		InsurancePolicy insurancePolicy = new InsurancePolicy(200000, 15, 10);
		insurancePolicy.setLoyaltyAddition(10000);
		int expected = 10000;
		int actual = insurancePolicy.getLoyaltyAddition();
		assertEquals(expected, actual);
	}
	@Test
	public void baseTestPremium(){
		InsurancePolicy insurancePolicy = new InsurancePolicy(100000, 10, 5);
		int actual = insurancePolicy.getPremium();
		assertEquals(19000,actual );
	}

	//Derived Class Testing

	@Test
	public void derivedTestDeathBenefit(){
//		BVA
		EndowmentPlan endowmentPlan1 = new EndowmentPlan(199999, 15,10);
		int actual = endowmentPlan1.getDeathBenefit();
		assertEquals(0, actual);


		EndowmentPlan endowmentPlan2 = new EndowmentPlan(200000, 15,10);
		actual = endowmentPlan2.getDeathBenefit();
		assertEquals(500000, actual);


		EndowmentPlan endowmentPlan3 = new EndowmentPlan(200001, 15,10);
		actual = endowmentPlan3.getDeathBenefit();
		assertEquals(500000, actual);


		EndowmentPlan endowmentPlan4 = new EndowmentPlan(499999, 15,10);
		actual = endowmentPlan4.getDeathBenefit();
		assertEquals(500000, actual);


		EndowmentPlan endowmentPlan5 = new EndowmentPlan(500000, 15,10);
		actual = endowmentPlan5.getDeathBenefit();
		assertEquals(500000, actual);


		EndowmentPlan endowmentPlan6 = new EndowmentPlan(500001, 15,10);
		actual = endowmentPlan6.getDeathBenefit();
		assertEquals(1000000, actual);

		EndowmentPlan endowmentPlan7 = new EndowmentPlan(250000, 15,10);
		actual = endowmentPlan7.getDeathBenefit();
		assertEquals(500000, actual);
	}
	@Test
	public void derivedTestBonus(){
		EndowmentPlan endowmentPlan = new EndowmentPlan(500000, 15,10);
		endowmentPlan.setBonus(60);
		assertEquals(60, endowmentPlan.getBonus());
	}


	//overridden method test
	@Test
	public void overrideTestMaturityAmount(){
		EndowmentPlan endowmentPlan = new EndowmentPlan(100000, 20, 15);
		int expected = endowmentPlan.getMaturityAmount();
		int actual = 110750;
		assertEquals(expected, actual);
	}
}
