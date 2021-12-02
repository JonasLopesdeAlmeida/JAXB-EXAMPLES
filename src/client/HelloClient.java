package client;

public class HelloClient {

    public static void main(String[] args) {
        HelloService service = new HelloService();
        Hello port = service.getHelloPort();
        String response = port.sayHello("jonas");
                System.out.println(response);
    }
}
