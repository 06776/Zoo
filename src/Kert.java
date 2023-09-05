public class Kert {
    public void lifeStart() {
        Animal medve = new Animal();
        Animal macska = new Animal();
        
        medve.hangotad("Brumm...");
        medve.mezgyujtes();
        // medve.nev = "Brumi";
        
        macska.hangotad("Miau...");
        macska.dorombol();
        // macska.nev = "";
        macska.nevBeallitas("aaa");
        System.out.println(macska.nevLeker());
    }
}
