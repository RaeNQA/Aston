package task1;

public class Main {
    public static void main(String[] args) {
        // создание животных
        Dog dogBobik = new Dog("Бобик");
        Cat catBarsik = new Cat("Барсик");
        Cat catTom = new Cat("Том");

        Animals[] animals = {dogBobik, catBarsik, catTom};

        System.out.println("Количество животных: " + Animals.getCount());
        System.out.println("Количество котов: " + Cat.getCount());

        Food food = new Food(20); //добавление еды в миску

        for (Animals animal : animals) {
            animal.run(200);
            animal.swim(5);
        }

        Cat[] cats = {catBarsik, catTom};
        for (Cat cat : cats) {
            cat.eat(food, 15);
            food.addFood(10);
            System.out.println("Остаток еды в миске: " + food.getFoodAmount());
        }
        // catBarsik.eat(food, 15);       // сколько сьели коты
        // catTom.eat(food, 10);         // сколько сьели коты

        // System.out.println("Сытость кота Барсика: " + catBarsik.satiety());
        // System.out.println("Сытость кота Том: " + catTom.satiety());


    }
}
