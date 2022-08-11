public class World {
    public static void main(String[] args) {
     Race race = new Race();
     race.lvl = 30;
     race.speed =18;
     race.Racename = "Эльф";
     race.intelligence = 40;
     race.Info();
     race.checkLvl();
     race.CheckInt();
     System.out.println(" ");

     Race race1 = new Race();
     race1.Info();
     race1.checkLvl();
     race1.CheckInt();
     System.out.println(" ");

     Race race2 = new Race("Человек",15,10,20);
     race2.Info();
     race2.checkLvl();
     race2.CheckInt();
    }
}
