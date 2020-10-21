import java.util.ArrayList;

public class Service {
    private ArrayList<Dinnerware> Dinnerwares = new ArrayList<>();
    private ArrayList<Cutlery> Cutlerys = new ArrayList<>();

    public Service(ArrayList<Dinnerware> dinnerwares, ArrayList<Cutlery> cutlerys) {
        Dinnerwares = dinnerwares;
        Cutlerys = cutlerys;
    }



    public String toString() {
        String str = "";
        for(int i= 0;i < getDinnerwares().size(); i++){
            str += getDinnerwaresItter(i).toString() + "\n";
        }
        for(int i= 0;i < getCutlerys().size(); i++){
            str += getCutlerysItter(i).toString() + "\n";
        }
        return str;
    }

    private Dinnerware getDinnerwaresItter(int i) {
        return Dinnerwares.get(i);
    }

    private ArrayList<Dinnerware> getDinnerwares() {
        return Dinnerwares;
    }

    private ArrayList<Cutlery> getCutlerys() {
        return Cutlerys;
    }

    private Cutlery getCutlerysItter(int i) {
        return Cutlerys.get(i);
    }
}
