package Igra;

public class Massive implements Area {

    private int[][] mas;

    @Override
    public int getVerticalSize() {
        return this.mas.length;
    }

    @Override
    public int getHorizontalSize() {
        return this.mas[0].length;
    }

    @Override
    public void setPosition(int x, int y) {
            this.mas[x][y]++;
    }

    @Override
    public void show() {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public Massive(int n, int m) {
        this.mas = new int[n][m];
    }

}
