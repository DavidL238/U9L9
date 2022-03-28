public class ThreeDPoint extends Point{
    private int z;

    public ThreeDPoint(String label, int x, int y, int z) {
        super(label, x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public boolean equals(Object o) {
        boolean xy = super.equals(o);
        if (xy) {
            if (o instanceof ThreeDPoint) {
                return ((ThreeDPoint) o).getZ() == this.z;
            }
        }
        return false;
    }

    public String toString() {
        return super.toString() + ", z = " + z;
    }
}
