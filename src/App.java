public class App {
    public static void main(String[] args) {
        Animal medve = new Animal();
        Animal macska = new Animal();
        
        medve.hangotad("Brumm...");
        medve.mezgyujtes();
        // medve.nev = "Brumi";
        
        macska.hangotad("Miau...");
        macska.dorombol();
        // macska.nev = "";
        macska.nevBeallitas("");
        // System.out.println(macska.nev);
    }
}
