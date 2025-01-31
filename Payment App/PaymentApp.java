/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Payment_Gateway;

/**
 *
 * @author kumar
 */
public class PaymentApp {

    public static void main(String[] args) {
        // Create user
        UserBean user = new UserBean("John Doe", "john.doe@example.com", "Regular");

        // Create payment details
        PaymentBean payment = new PaymentBean(200.50, "Credit Card");

        // Create the Payment Gateway and process the payment
        Payment paymentGateway = new Payment(user, payment);
        paymentGateway.processTransaction();
    }
}
