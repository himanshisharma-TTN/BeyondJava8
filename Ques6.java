package BeyondJava8;

//You are tasked with writing a processOrderStatus method that takes an OrderStatus enum as input and returns a descriptive string based on the order status.
//Here's the OrderStatus enum:
//
//public enum OrderStatus {
//    PENDING,
//    PROCESSING,
//    SHIPPED,
//    DELIVERED,
//    CANCELLED,
//    REFUNDED
//}
//Your processOrderStatus method should adhere to the following rules:
//
//For PENDING orders, return: "Order is awaiting confirmation."
//For PROCESSING orders, return: "Order is being prepared."
//For SHIPPED orders, return: "Order has been dispatched."
//For DELIVERED orders, return: "Order has been successfully delivered."
//For CANCELLED orders, return: "Order has been canceled."
//For REFUNDED orders, return: "Refund has been issued for the order."
//Use a single switch expression to achieve this.
//
//Enhancements: yield Keyword: If your logic requires more complex processing within a case, demonstrate the use of the yield keyword to return a value from the switch expression.

enum OrderStatus {
    PENDING("Order is awaiting confirmation"),
    PROCESSING("Order is being prepared"),
    SHIPPED("Order has been dispatched"),
    DELIVERED("Order has been successfully delivered."),
    CANCELLED("0rder has been canceled."),
    REFUNDED("Refund has been issued for the order.");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}

public class Ques6 {
    public static void main(String[] args) {
        OrderStatus status =  OrderStatus.SHIPPED;
        String result = switch (status){
            case PENDING ,PROCESSING, SHIPPED ,DELIVERED, CANCELLED, REFUNDED->  status.getDescription();
            default -> "No such Status of Product";
        };
        System.out.println(result);
    }
}
