package client;

public class CalculatorClient {

    public static void main(String[] args) {
        CalculatorService service = new CalculatorService();
        Calculator port = service.getCalculatorPort();
        System.out.println(port.multiply(3,5));
        System.out.println(port.add(3,5));
        System.out.println(port.subtract(5,3));
        System.out.println(port.divide(4,2));
    }
}
