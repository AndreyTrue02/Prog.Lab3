public class fairytale {
    public static void main(String[] args) {
        System.out.println();
        Place House = new Place("Дом");
        Place courtyard = new Place("Двор");


        Moomintroll Moom = new Moomintroll("коротенькие", courtyard);
        Think Per = new Think(" Ага, Снусмумрик воспользовался веревочной лестницей.");
        Human snusnu = new Human("Снусмумрик", House) {
        };
        Decor window = new Decor();
        Decor Stairs = new Decor();
        Think kuv = new Think(" Это он от радости. А вот тут он перекувырнулся, уж это точно. ");
        track sled  = new track();
        snusnu.walk(courtyard);
        snusnu.somersault(courtyard);
        Moom.look(window, House, courtyard);
        Moom.thinking(Per, snusnu);
        Moom.climbed(Stairs);
        Moom.walk(courtyard);
        Moom.drewattention(snusnu, sled, courtyard);
        Moom.thinking(kuv, snusnu);
    }
}
