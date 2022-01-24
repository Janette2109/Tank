public class Tank {
    int Position = 0;
    void goForward(int hod){
        Position+= hod;
    }
    void printPosition(){
        System.out.println("The Tank is at " + Position + " now");
    }
    void goBackward(int hod){
        Position-= hod;
    }

    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.goForward(20);
        tank.printPosition();
        tank.goForward(50);
        tank.printPosition();
        tank.goBackward(100);
        tank.printPosition();
    }
}
