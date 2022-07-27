package Igra;

public interface Area {

    public int getVerticalSize();

    public int getHorizontalSize();

    public void setPosition(int x, int y) throws IndexOutOfBoundsException;

    public void show();

}
