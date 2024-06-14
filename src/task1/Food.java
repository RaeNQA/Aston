package task1;

class Food {
    private int foodAmount;

    public Food(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public void addFood(int amount) {
        if (amount <= 0) {
            System.out.println("Нельзя добавить отрицательное количество еды.");
        } else {
            foodAmount += amount;
            System.out.println("Добавлено " + amount + " еды в миску.");
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public boolean eat(int amount) {
        if (foodAmount < amount) {
            System.out.println("В миске недостаточно еды.");
            return false;
        } else {
            foodAmount -= amount;
            return true;
        }
    }
}