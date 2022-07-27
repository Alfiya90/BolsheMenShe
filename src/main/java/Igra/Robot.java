package Igra;

import java.util.ArrayList;

public class Robot {

    private Area area;

    private int x = 0;
    private int y = 0;
    private String direction = RIGHT;

    static final String UP = "UP";
    static final String DOWN = "DOWN";
    static final String RIGHT = "RIGHT";
    static final String LEFT = "LEFT";

    private ArrayList<String> directions = new ArrayList<>();

    public void turnRight() {
        this.direction = directions.get(
                (directions.indexOf(this.direction) + 1) % directions.size()
        );
    }

    public void turnLeft() {
        this.direction = directions.get(
                (directions.indexOf(this.direction) - 1 + directions.size()) % directions.size()
        );
    }


    public void go() {
        switch (this.direction) {
            case UP: {
                goUp();
                break;
            }
            case DOWN: {
                goDown();
                break;
            }
            case RIGHT: {
                goRight();
                break;
            }
            case LEFT: {
                goLeft();
                break;
            }
        }
    }

    public void go(int n) {
        for (int i = 0; i < n; i++) {
            this.go();
        }

    }


    private void goUp() {
        try {
            this.y++;
            area.setPosition(x, y);
        } catch (IndexOutOfBoundsException e) {
            this.y--;
            System.out.println("Ошибка");
        }

    }

    private void goDown() {
        try {
            this.y--;
            area.setPosition(x, y);
        } catch (IndexOutOfBoundsException e) {
            this.y++;
            System.out.println("Ошибка");
        }
    }

    private void goRight() {
        try {
            this.x++;
            area.setPosition(x, y);
        } catch (IndexOutOfBoundsException e) {
            this.x--;
            System.out.println("Ошибка");
        }
    }

    private void goLeft() {
        try {
            this.x--;
            area.setPosition(x, y);
        } catch (IndexOutOfBoundsException e) {
            this.x++;
            System.out.println("Ошибка");
        }
    }


    public Robot(Area area) {
        this.area = area;
        directions.add(UP);
        directions.add(RIGHT);
        directions.add(DOWN);
        directions.add(LEFT);
        area.setPosition(x, y);
    }

}
