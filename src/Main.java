public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        market.size();
        market.update(new Person("Masud"));
        market.size();
        market.is_empty();
        market.add_person();
        market.add_person();
        market.size();
        market.remove_person();
        market.size();




    }
}