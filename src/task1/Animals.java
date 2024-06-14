package task1;

class Animals {
    protected int runLimit;
    protected int swimLimit;
    protected String petName;
    private static int count = 0;

    public static int getCount() { return Animals.count; }

    public Animals(String petName) {
        this.petName = petName;
        Animals.count += 1;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(petName + " пробежал " + distance + " м.");
        } else {
            System.out.println( petName + " не может пробежать такое расстояние.");
        }
    }

    public void swim(int distance) {
        if (distance <= swimLimit) {
            System.out.println(petName + " проплыло " + distance + " м.");
        } else {
            System.out.println(petName + " не может плавать/проплыть ");
        }
    }
}
