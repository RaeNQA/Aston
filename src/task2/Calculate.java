package task2;

interface Calculate {
    //double cPerim();
    double cArea();
    String getfColor();
    String getbColor();


    default void Display(){
        System.out.println("Периметр: " + this.cPerim());
        System.out.println("Площадь: " + this.cArea());
        System.out.println("Цвет фона: " + this.getfColor());
        System.out.println("Цвет границ: " + this.getbColor());
    }
    default double cPerim(){
        return 0;
    }
}
