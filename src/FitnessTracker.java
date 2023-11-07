public class FitnessTracker {
    private String firstName;
    private String lastName;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String email;
    private String phone;
    private int weight;
    private int pressure;
    private int steps;
    private int age;

    public FitnessTracker(String firstName, String lastName, int birthDay, int birthMonth, int birthYear, String email, String phone, int weight, int pressure, int steps) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phone = phone;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        this.age = 2020 - birthYear;
    }

    public void printAccountInfo() {
        System.out.println("Ім'я: " + firstName);
        System.out.println("Прізвище: " + lastName);
        System.out.println("Дата народження: " + birthDay + "." + birthMonth + "." + birthYear);
        System.out.println("Вік: " + age);
        System.out.println("Емейл: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Вага: " + weight);
        System.out.println("Тиск: " + pressure);
        System.out.println("Кількість кроків: " + steps);
    }
}
