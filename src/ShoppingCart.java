
public class ShoppingCart {
	private PaymentStrategy paymentStrategy;
    public ShoppingCart() {
    	this.paymentStrategy = new Cashpayment();
    }
	
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }
    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}
