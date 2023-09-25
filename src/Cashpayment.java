
public class Cashpayment implements PaymentStrategy {

	@Override
	public void pay(int amount) {
		System.out.println("Paid by Cash :" + amount);

	}

}

 

