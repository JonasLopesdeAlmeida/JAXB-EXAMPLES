package athlete;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MarchallAthlet {

    public static void main(String[] args) {



        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Athlete.class);
            Marshaller m = jaxbContext.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            Athlete athlete = createAthlete();

            File out = new File("athlete.xml");
            m.marshal(athlete,out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }


    }

    private static Athlete createAthlete() {

        Person ub = new Person("Usain", 37, "Male");
        List<String> list = new ArrayList<>();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        return new Athlete(ub, "Jamaica", list);

   }
}
