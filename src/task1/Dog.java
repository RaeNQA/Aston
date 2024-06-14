package task1;

class Dog extends Animals {

    private static int count = 0;
    public Dog(String petName) {
        super(petName);
        runLimit = 500;
        swimLimit = 10;
        Dog.count += 1;
    }

    public static int getCount() {
        return Dog.count;
    }
}
