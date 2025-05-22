public class PaymentController {
    private PaymentGateway gateway = new PaymentGateway();

    public boolean processPayment(int userId, double amount) {
        return gateway.initiateTransaction(userId, amount);
    }
}
