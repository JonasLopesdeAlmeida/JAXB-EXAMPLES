package user;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class MarshallUser {

    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(22);
        user1.setName("Carlos");
        user1.setAge(56);
        File file = new File("user1.xml");
        try{
            JAXBContext jaxbContext = JAXBContext.newInstance(User.class);
            Marshaller marshaller = jaxbContext.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(user1, file);
            marshaller.marshal(user1, System.out);

        }catch(JAXBException e){
            e.printStackTrace();

        }
    }
}
