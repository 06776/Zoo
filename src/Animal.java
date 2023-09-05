public class Animal {
    private String nev = "névtelen";

    public void nevBeallitas(String nev) {
        if (nev.isEmpty()) {
            System.out.println("Hiba! Nem adta meg a nevet!");
            System.exit(1);
        }
        this.nev = nev;
    }

    public String nevLeker() {
        return this.nev;
    }

    

    public void hangotad(String hang) {
        System.out.println(hang);
    }

    public void mezgyujtes() {
    }

    public void dorombol() {
    }

    
}
