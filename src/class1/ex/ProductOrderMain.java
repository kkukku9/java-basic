package class1.ex;

public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder product1 = new ProductOrder();
        ProductOrder product2 = new ProductOrder();
        ProductOrder product3 = new ProductOrder();

        ProductOrder[] productOrders = new ProductOrder[] {product1, product2, product3};

        productOrders[0].productName = "두부";
        productOrders[1].productName = "두부";
        productOrders[2].productName = "두부";

        productOrders[0].price = 2000;
        productOrders[1].price = 5000;
        productOrders[2].price = 1500;

        productOrders[0].quantity = 2;
        productOrders[1].quantity = 1;
        productOrders[2].quantity = 2;

        int totalPrice = 0;
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명: " + productOrder.productName + ", 가격: " + productOrder.price + ", 수량: " + productOrder.quantity);
            totalPrice += productOrder.price * productOrder.quantity;
        }

        System.out.println("총 결제 금액: " + totalPrice);


    }
}
