public class Race {
    String Racename;
    int speed;
    int lvl;
    int slvl = 30;
    int intelligence;
    int sint = 20;
    Race () {
        Racename = "Гоблины";
        lvl = 15;
        intelligence = 5;
        speed = 20;
    }
    Race (String Racename,int speed,int lvl, int intelligence){
        this.Racename = Racename;
        this.lvl = lvl;
        this.speed = speed;
        this.intelligence = intelligence;
    }
    void Info(){
        String info = "Название расы: " + Racename + " " + intelligence + " - интеллект." + " " + speed +" - скорость. " + lvl + " - уровень.";
        System.out.println(info);
    }
    void CheckInt(){
        if (sint < intelligence){
            System.out.println(Racename + " умные");
        } else if (sint> intelligence){
            System.out.println(Racename + " тупые");
        } else {
            System.out.println("Вроде разумны");
        }
    }
    void checkLvl (){
        if (slvl > lvl){
            System.out.println(Racename + " ниже среднего уровня");
        } else if (slvl < lvl) {
            System.out.println(Racename + " выше среднего уровня");
        } else {
            System.out.println("Средний уровень");
        }
    }
}
