package task2;

public class Triangle implements Calculate {
    private final double s1;
    private final double s2;
    private final double s3;
    private final String fColor;
    private final String bColor;

    public Triangle(double s1, double s2, double s3, String fColor, String bColor) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.fColor = fColor;
        this.bColor = bColor;
    }

    @Override
    public double cPerim() {
        return s1 + s2 + s3;
    }

    @Override
    public double cArea() {
        double s = (s1 + s2 + s3) / 2;
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
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