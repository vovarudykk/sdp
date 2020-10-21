import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Dishes> dishes_list = new ArrayList<>();

        Dishes.Size sizeOfPlate = new Dishes.Size(20.5, 2);
        Dishes plate1 = new Plate("Plate1", Material.PORCELAIN, "China", sizeOfPlate);
        dishes_list.add(plate1);

        Dishes.Size sizeOfSoupPlate = new Dishes.Size(8, 5);
        Dishes soup_plate1 = new SoupPlate("SoupPlate1", Material.CERAMICS, "Ukraine", sizeOfSoupPlate, 2);
        dishes_list.add(soup_plate1);

        Dishes.Size sizeOfCup1 = new Dishes.Size(5, 12);
        Dishes cup1 = new Cup("Cup1", Material.GLASS, "China", false, sizeOfCup1);
        dishes_list.add(cup1);

        Dishes.Size sizeOfCup2 = new Dishes.Size(7, 8);
        Dishes cup2 = new Cup("Cup2", Material.CERAMICS, false, sizeOfCup2);
        dishes_list.add(cup2);

        Dishes.Size sizeOfShaker = new Dishes.Size(1.5, 5);
        SaltShaker saltshaker1 = new SaltShaker("SaltShaker1", Material.GLASS, "China", sizeOfShaker);
        dishes_list.add(saltshaker1);

        Service service1 = new Service();

        Iterator<Dishes> iterator = dishes_list.iterator();
        while(iterator.hasNext()){
            service1.addDishes(iterator.next());
        }
        System.out.println(service1);

        System.out.println(Material.getStringAll());
    }
}
