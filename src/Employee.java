public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String number;
    private double salary;
    private int age;

    public Employee(String fullName, String position, String email, String number, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public static void main() {
        Employee empDisplay = new Employee("Yanov Yanovich Yan", "AQA", "Test@mail.asd", "+12345566452", 50000, 33);
        empDisplay.display();
    }

    public void display() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + number);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

}
