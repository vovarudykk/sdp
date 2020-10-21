public class Fork extends Cutlery {

    public Fork(String name, Material material, double length, String manufacturer) {
        super(name, material, length, manufacturer);
    }

    @Override
    public String toString() {
        return "Fork{" +
                "name='" + name + '\'' +
                ", " + material +
                ", length=" + length +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}