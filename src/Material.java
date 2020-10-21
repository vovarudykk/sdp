public enum Material {
    PORCELAIN("France"),
    GLASS("Ukraine"),
    CERAMICS("Italy");

    private String countryOfProduction;

    Material(String country) {
        this.countryOfProduction = country;
    }


    public static StringBuilder getStringAll() {
        Material[] mat = Material.values();
        StringBuilder str = new StringBuilder("We have " + (mat.length) + " kinds of materials:\n");
        String str_mat = "";
        for (Material materials : mat) {
            str_mat += materials.name() + " ";
        }
        for (String str_split : str_mat.split(" ")) {
            str.append(str_split.toLowerCase()).append("; ");
        }
        return str;
    }


    @Override
    public String toString() {
        return "Material: " + this.name().toLowerCase() + "(country of production: " + this.getCountryOfProduction() + ")";
    }

    public String getCountryOfProduction() {return countryOfProduction;}

    public void setCountryOfProduction(String countryOfProduction) {this.countryOfProduction = countryOfProduction;}
}

