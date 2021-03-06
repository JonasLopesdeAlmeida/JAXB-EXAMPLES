package user;


import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlType(propOrder = {"name","age"})
public class User {

    @XmlAttribute
    private int id;
    private String name;
    private int age;

    public User(){
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
