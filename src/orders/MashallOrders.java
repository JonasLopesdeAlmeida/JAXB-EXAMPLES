package orders;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MashallOrders {
    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();
        orderList = new OrderDAO().getAllOrders();
        File file = new File("order1.xml");

        try {

            FileOutputStream out = new FileOutputStream("orders.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Order.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            for (Order order : orderList) {
                marshaller.marshal(order, out);
            }

        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
