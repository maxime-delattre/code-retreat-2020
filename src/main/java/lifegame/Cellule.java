package lifegame;

public class Cellule {
    private int x;
    private int y;

    public Cellule(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    boolean aEstCoté(int x, int y) {
        return (this.x >= x - 1 && this.x <= x + 1) && (this.y >= y - 1 && this.y <= y + 1);
    }
}
