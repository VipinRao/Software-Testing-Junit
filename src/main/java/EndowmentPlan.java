public class EndowmentPlan extends InsurancePolicy {
	private int deathBenefit = 0;
	private int bonus = 50;
	EndowmentPlan(int SumAssured, int PolicyTerm, int PaymentTerm) {
		super(SumAssured, PolicyTerm, PaymentTerm);
		if(sumAssured >= 200000 && sumAssured <= 500000){
			deathBenefit = 500000;
		}
		else if(sumAssured > 500000){
			deathBenefit = 1000000;
		}
	}
	@Override
	public int getMaturityAmount(){
		return sumAssured + loyaltyAddition + bonus*paymentTerm;
	}

	public int getDeathBenefit() {
		return deathBenefit;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
}
