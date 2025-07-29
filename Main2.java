/******************************************************************************
Multilevel Inheritance in java
*******************************************************************************/
class Building {
    void firstFloor() {
        System.out.println("1stfloor");
    }
    void secondFloor() {
        System.out.println("2ndfloor");
    }
    void thirdFloor() {
        System.out.println("3rdfloor");
    }
}

class Floor extends Building {
    String Classtype;
    int noofcomputers;
    int classSize;

    Floor(String Classtype, int noofcomputers, int classSize) {
        this.Classtype = Classtype;
        this.noofcomputers = noofcomputers;
        this.classSize = classSize;
    }

    void displayRoomDetails() {
        System.out.println("Class Type: " + Classtype);
        System.out.println("No. of Computers: " + noofcomputers);
        System.out.println("Class Size: " + classSize);
    }
}

class Rooms extends Floor {
    Rooms(String Classtype, int noofcomputers, int classSize) {
        super(Classtype, noofcomputers, classSize);
    }
}

public class Main2{
    public static void main(String[] args) {
        Rooms r = new Rooms("Computer Lab", 60, 30);
        r.firstFloor();
        r.secondFloor();
        r.thirdFloor();
        r.displayRoomDetails();
    }
}
