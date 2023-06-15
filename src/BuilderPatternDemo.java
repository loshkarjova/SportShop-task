import com.loskarjova.shop.Order;
import com.loskarjova.shop.OrderBuilder;

public class BuilderPatternDemo {

    public static void main(String[] args) {

        OrderBuilder orderBuilder = new OrderBuilder();
        Order orderA = orderBuilder.prepareOrderA();
        System.out.println("Order A: ");
        System.out.println("--------------");
        orderA.showOrder();
        System.out.println("Total cost: " + "$" + orderA.getCost());

        Order orderB = orderBuilder.prepareOrderB();
        System.out.println("\nOrder B: ");
        System.out.println("--------------");
        orderB.showOrder();
        System.out.println("Total cost: " + "$" + orderB.getCost());
    }
}
