package task2;

class Circle implements Calculate {
    private final double r;
    private final String fColor;
    private final String bColor;
    public Circle(double r, String fColor, String bColor) {
        this.r = r;
        this.fColor = fColor;
        this.bColor = bColor;
    }

    @Override
    public double cPerim() {
        return 2 * 3.14 * r;
    }

    @Override
    public double cArea() {
        return 3.14 * r * r;
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