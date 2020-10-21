abstract class Cutlery {

    protected String name;
    public Material material;
    public double length;
    public String manufacturer;

    public Cutlery(String name, Material material, double length, String manufacturer) {
        this.name = name;
        this.material = material;
        this.length = length;
        this.manufacturer = manufacturer;
    }

    public String getName() {return name;}

    public Material getMaterial() {return material;}

    public double getLength() {return length;}

    public String getManufacturer() {return manufacturer;}
}