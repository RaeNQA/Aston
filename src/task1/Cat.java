package task1;

class Cat extends Animals {
    private boolean satiety;
    private static int count = 0;

    public static int getCount() {
        return Cat.count;
    }

    public Cat(String petName) {
        super(petName);
        runLimit = 200;
        swimLimit = 0;
        satiety = false;
        Cat.count += 1;

    }

    public void eat(Food food, int foodAmount) {
        if (foodAmount <= 0) {
            System.out.println("Нельзя съесть отрицательное количество еды.");
        } else {
            // boolean successEat = food.eat(foodAmount);
            satiety = food.eat(foodAmount);
            if (satiety) {
                System.out.println("Кот " + petName + " сыт");
            } else {
                System.out.println("Кот " + petName + " голоден");
            }
        }
    }

    public boolean satiety() {
        return satiety;
    }
}