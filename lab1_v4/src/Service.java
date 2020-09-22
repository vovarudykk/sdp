import java.util.ArrayList;

public class Service {
    private ArrayList<Dishes> dishes = new ArrayList<>();

    public Service(ArrayList<Dishes> dishes) {
        this.dishes = dishes;
    }

    public ArrayList<Dishes> getDishes() {
        return dishes;
    }

    public void setDishes(ArrayList<Dishes> dishes) {
        this.dishes = dishes;
    }

}
