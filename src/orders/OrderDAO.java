package orders;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderDAO {

    private List<Order> orderList = new ArrayList<>();

    public OrderDAO() {
        Customer williams = new Customer(1317,"15, London Road","London", "Willians", "rgt453");
        orderList.add(new Order(1000, "MW97", 100, "MicroWare Office", 305, williams, new Date()));
        orderList.add(new Order(1002, "XM21", 5, "XVision Monitor", 712, williams, new Date()));

        Customer smith = new Customer(1036,"22, Gresham Court","Manchester","Smith","uyt6355");
        orderList.add(new Order(1003, "DS96", 3, "IPhone 22", 410, smith, new Date()));
        orderList.add(new Order(1004, "MW97", 200, "MicroWare Office", 305, smith, new Date()));
        orderList.add(new Order(1005, "ASM2", 20, "Activan", 55, smith, new Date()));

    }

    public List<Order> getAllOrders() {
        return orderList;
    }

}