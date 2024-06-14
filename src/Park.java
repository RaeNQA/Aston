public class Park {
    public static class Attractions {
        private String attracName;
        private String times;
        private double cost;

        public Attractions(String attracName, String times, double cost) {
            this.attracName = attracName;
            this.times = times;
            this.cost = cost;
        }

        public void Displaying() {
            System.out.println("Аттракцион: " + attracName);
            System.out.println("Время работы: " + times);
            System.out.println("Стоимость: " + cost);
        }

        public static void Main() {
            Attractions attDisplay = new Attractions("Качели", "08:00 - 20:00", 120);
            attDisplay.Displaying();
        }

    }
}