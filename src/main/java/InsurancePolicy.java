import static java.lang.Integer.min;

public class InsurancePolicy {
	protected int sumAssured;
	protected int loyaltyAddition  = 100000;
	protected int policyTerm;
	protected int paymentTerm;
	protected int premium;
	InsurancePolicy(int SumAssured, int PolicyTerm, int PaymentTerm){
		sumAssured = SumAssured;
		policyTerm = PolicyTerm;
		paymentTerm = PaymentTerm;
		premium = sumAssured/paymentTerm - 10000/policyTerm;
		loyaltyAddition = min(loyaltyAddition, sumAssured/10);
	}
	public int getMaturityAmount(){
		return sumAssured + loyaltyAddition;
	}

	public int getSumAssured() {
		return sumAssured;
	}

	public int getLoyaltyAddition() {
		return loyaltyAddition;
	}

	public void setLoyaltyAddition(int loyaltyAddition) {
		this.loyaltyAddition = loyaltyAddition;
	}

	public int getPolicyTerm() {
		return policyTerm;
	}

	public int getPaymentTerm() {
		return paymentTerm;
	}

	public int getPremium() {
		return premium;
	}

}
