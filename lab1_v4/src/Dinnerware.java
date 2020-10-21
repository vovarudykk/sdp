abstract class Dinnerware {

    protected String name;
    public Color color;
    public String manufacturer;

    public Dinnerware(String name, Color color, String manufacturer) {
        this.name = name;
        this.color = color;
        this.manufacturer = manufacturer;
    }

    public String getName() {return name;}

    public Color getColor() {return color;}

    public String getManufacturer() {return manufacturer;}
}
