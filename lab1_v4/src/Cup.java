public class Cup extends Dinnerware {
    private final double volume;

    public Cup(String name, Color color, String manufacturer, double volume) {
        super(name, color, manufacturer);
        this.volume = volume;
    }

    public double getVolume() {return volume;}

    @Override
    public String toString() {
        return "Cup{" + "name='" + name + '\'' + ", volume=" + volume + '\'' + ", color=" + color + ", manufacturer='" + manufacturer + '\'' + '}';
    }
}
