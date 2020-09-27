import java.util.ArrayList;

public class Service {
    private ArrayList<Dishes> dishes = new ArrayList<>();

    public Service() {
    }

    public ArrayList<Dishes> getDishes() {
        return dishes;
    }

    public void setDishes(ArrayList<Dishes> dishes) {
        this.dishes = dishes;
    }

    public void addDishes(Dishes dish) {
        dishes.add(dish);
    }

    @Override
    public String toString() {
        return "Service{" +
                "dishes=" + dishes +
                '}';
    }
}
