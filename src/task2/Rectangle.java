package task2;

public class Rectangle implements Calculate {
    private final double w;
    private final double h;
    private final String fColor;
    private final String bColor;

    public Rectangle(double w, double h, String fColor, String bColor) {
        this.w = w;
        this.h = h;
        this.fColor = fColor;
        this.bColor = bColor;
    }

    @Override
    public double cPerim() {
        return 2 * (w + h);
    }

    @Override
    public double cArea() {
        return w * h;
    }

    @Override
    public String getfColor() {
        return fColor;
    }

    @Override
    public String getbColor() {
        return bColor;
    }
}