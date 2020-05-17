package lt.uzdavinys3n;

public abstract class Figure implements Color {

    private int color;  // 0 = juoda, 0xffffff - balta
    private int x, y;   // figuros centro kordinates plokstumoje

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}