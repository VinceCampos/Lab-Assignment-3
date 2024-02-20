public class PaymentApp {
    public static void main(String[] args){

        Order payment1 = new Order("keyboard", 10, 300, new GCash());
 
        System.out.println("Order item is " + payment1.getItem());
        System.out.println("Unit Price is "+ payment1.getUnitPrice());
        System.out.println("Quantity is " + payment1.getQuantity());
        showOrderDetails(payment1);
 
        Order payment2 = new Order("keyboard", 10, 300, new Maya());
        showOrderDetails(payment2);


        Order payment3 = new Order("keyboard", 10, 300, new ShopeePay());
        showOrderDetails(payment3);    
   }

   public static void showOrderDetails(Order order){
        System.out.println("\nPayment Order details if " + order.getPaymentMethod().getClass().getSimpleName());
        System.out.println("Discount rate is " + order.getPaymentMethod().determineDiscountRate());
        System.out.println("Payment amount is " + order.getTotalAmount());
   }
}
