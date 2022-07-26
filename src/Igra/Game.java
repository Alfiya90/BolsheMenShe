package Igra;

public class Game {

    public static void main(String[] args) {
        Area area = new Massive(10, 10);
        area.show();


        Robot robot = new Robot(area);
        robot.go(11);
        robot.turnLeft();
        robot.go(5);
        robot.go();
        robot.turnLeft();
        robot.go(6);

        area.show();
    }
}
