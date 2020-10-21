public enum Material {
    SILVER("France"),
    STEEL("Ukraine"),
    STAINLESS_STEEL("Italy");

    private String countryOfProduction;

    Material(String country) {
        this.countryOfProduction = country;
    }


    public static StringBuilder getStringAll() {
        Material[] mat = Material.values();
        StringBuilder str = new StringBuilder("We have " + (mat.length) + " kinds of materials:\n");
        for (Material materials : mat) {
            str.append(materials.name()).append(" ");
        }
        return str;
    }


    @Override
    public String toString() {
        return "Material: " + this.name() + "(country of production: " + this.getCountryOfProduction() + ")";
    }

    public String getCountryOfProduction() {return countryOfProduction;}

    public void setCountryOfProduction(String countryOfProduction) {this.countryOfProduction = countryOfProduction;}
}

