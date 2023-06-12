import java.util.ArrayList;
import java.util.List;

public class Market implements I_MarketBehaviour, I_QueueBehaviour{
    Person person;


    private List<Person> queue;
    public Market(){
        queue = new ArrayList<>();
    }

    @Override
    public void add_person() {
        queue.add(person);

    }

    @Override
    public void remove_person() {
        queue.remove(person);

    }

    @Override
    public void update(Person person) {
        if(queue.size()>0) {
                System.out.println("Принят заказ от: " + person.getName());
                System.out.println("Заказ в обработке");
                System.out.println("Заказ для " + person.getName() + " готов к выдаче");
                remove_person();
            }
        else{
                System.out.println("Заказов нет.");
            }

    }

    @Override
    public void is_empty() {
        if(queue.size()>0){
            System.out.println("Есть очередь");
        }
        else{
            System.out.println("Очереди нет");
        }
    }

    @Override
    public void size() {
        System.out.println("Количество людей в очереди: " + queue.size());
    }

}
