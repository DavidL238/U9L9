public class Point {
    private int x, y;
    private String label;

    public Point(String label, int x, int y) {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    public int getY () {
        return y;
    }

    public int getX() {
        return x;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        } else if (!(o instanceof Point)) {
            return false;
        } else {
            return ((Point) o).getX() == this.x && ((Point) o).getY() == this.y;
        }
    }

    @Override
    public String toString() {
        return "Point " + label + " is at x = " + x + ", y = " + y;
    }
}