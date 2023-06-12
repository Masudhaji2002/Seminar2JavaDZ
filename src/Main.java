import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Person person = new Person("Dmitri", 10);
        market.size();
        market.add_person();
        market.update(new Person("Masud", 20));
        market.size();
        market.is_empty();
        market.add_person();
        market.add_person();
        market.size();
        market.remove_person();
        market.size();
        int ageDiscount = 18;
        BooleanOper isOper = (age, b) -> (age <= ageDiscount);
        if(isOper.BooleanOper(person.getAge(), ageDiscount)){
            System.out.printf(person.getName() + " возрастом: "+ person.getAge() + " получает скидку в %s процентов", ageDiscount);
        }





    }
}