public class Order {
    private String item;
    private int quantity;
    private double unitPrice;
    public double totalAmount;
    private PaymentMode paymentMethod;


    public Order(String item, int quantity, double unitPrice, PaymentMode paymentMethod){
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.paymentMethod = paymentMethod;
    }
 
    public String getItem() {
        return item;
    }
 
    public void setItem(String item) {
        this.item = item;
    }
 
    public int getQuantity() {
        return quantity;
    }
 
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
 
    public double getUnitPrice() {
        return unitPrice;
    }
 
    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }
 
    public PaymentMode getPaymentMethod() {
        return paymentMethod;
    }
 
    public void setPaymentMethod(PaymentMode paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getTotalAmount() {
        return (unitPrice*quantity)*(1-paymentMethod.determineDiscountRate());
    }
 
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
 
    public Order(){

    }
 }
