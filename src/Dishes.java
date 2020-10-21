abstract class Dishes {
    protected String name;
    private Material material;
    private String producer;
    private final Size size;

    public Dishes(String name, Material material, String producer, Size size) {
        this.name = name;
        this.material = material;
        this.producer = producer;
        this.size = size;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public Material getMaterial() {return material;}

    public void setMaterial(Material material) {this.material = material; }

    public String getProducer() {return producer;}

    public void setProducer(String producer) {this.producer = producer;}

    public Size getSize() {return size;}

    @Override
    public String toString() {
        return "\n" +
                "Name: '" + name + '\'' +
                ", " + material +
                ", Producer: " + producer +
                ", " + size.toString() + '\'' +
                '}';
    }

    static class Size {
        private double radius;
        private double deep;

        public Size(double radius, double deep) {
            this.radius = radius;
            this.deep = deep;
        }

        public double getRadius() {return radius;}

        public void setRadius(double radius) {this.radius = radius;}

        public double getDeep() {return deep;}

        public void setDeep(double deep) {this.deep = deep;}

        @Override
        public String toString() {
            return "Size(" +
                    "radius=" + radius +
                    ", deep=" + deep +
                    ')';
        }
    }
}
