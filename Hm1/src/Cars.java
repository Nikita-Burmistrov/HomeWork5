public class Cars {
    String brandName;
    int speed;
    int maxs = 100;
    Cars () {
        brandName = "Porsche 918 Spyder";
        speed = 90;
    }
    Cars (String brandName,int speed){
        this.brandName = brandName;
        this.speed = speed ;
    }
    void printInfo() {
        String info = "Марка машины " + brandName + ",скорость " + speed+"км/ч" ;
        System.out.println(info);
    }
    void checkSpeed() {
        if (speed > maxs) {
            System.out.println(brandName + " быстрее 100км/ч");
        } else if (speed < maxs) {
            System.out.println(brandName + " медленнее 100км/ч");
        } else {
            System.out.println(brandName + "Равна 100км/ч");
        }
    }
}