import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Dinnerware> ListService1 = new ArrayList<>();
        ArrayList<Cutlery> ListService2 = new ArrayList<>();

        Dinnerware plate3 = new Plate("Plate 3", Color.GREY, "Russia");
        Dinnerware cup2 = new Cup("Cup 2", Color.WHITE, "Italy", 0.25);
        ListService1.add(plate3);
        ListService1.add(cup2);

        Cutlery fork1 = new Fork("Fork 1", Material.STAINLESS_STEEL, 30, "Ukraine");
        Cutlery spoon1 = new Spoon("Spoon 1", Material.STEEL, 25, "Russia");
        ListService2.add(fork1);
        ListService2.add(spoon1);

        Service service1 = new Service(ListService1, ListService2);
        System.out.println(service1.toString());

        System.out.println(Material.STEEL.getCountryOfProduction());
        System.out.println(Material.getStringAll());


    }
}
