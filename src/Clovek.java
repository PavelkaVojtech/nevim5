import java.util.ArrayList;

public class Clovek {
    private String jmeno;

    public Clovek(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public static void main(String[] args) {
        ArrayList<Clovek> lide = new ArrayList<>();


        for (int i = 1; i < 41; i++){
            Clovek clovek = new Clovek("Clovek" + i);
            lide.add(clovek);
        }
        for (Clovek c: lide){
            System.out.println(c.getJmeno());
        }
    }
}
