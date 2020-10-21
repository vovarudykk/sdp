public class Spoon extends Cutlery {

    public Spoon(String name, Material material, double length, String manufacturer) {
        super(name, material, length, manufacturer);
    }

    @Override
    public String toString() {
        return "Spoon{" +
                "name='" + name + '\'' +
                ", " + material +
                ", length=" + length +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}