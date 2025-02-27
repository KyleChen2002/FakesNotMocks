public class Main {
    public static void main(String[] args) {
        Exchange exchange = new FakeExchange();
        Cash dollar = new Cash(exchange, 100);
        System.out.println("Dollar: " + dollar.toString());

        Cash euro = dollar.in("Euro");
        System.out.println("Dollar to Euro: " + euro.toString());
    }
}
