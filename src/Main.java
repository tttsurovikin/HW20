public class Main {
    public static void main(String[] args) {
        FitnessTracker user1 = new FitnessTracker("Іван", "Іванов", 12, 3, 1990, "ivanov@gmail.com", "+380123456789", 80, 120, 5000);
        FitnessTracker user2 = new FitnessTracker("Марія", "Петренко", 5, 7, 1985, "petrenko@gmail.com", "+380987654321", 65, 110, 8000);
        FitnessTracker user3 = new FitnessTracker("Олександр", "Сидоренко", 23, 11, 1995, "sidorenko@gmail.com", "+380111111111", 90, 130, 3000);
        FitnessTracker user4 = new FitnessTracker("Олена", "Ковальчук", 17, 9, 1988, "kovalchuk@gmail.com", "+380222222222", 70, 115, 6000);
        FitnessTracker user5 = new FitnessTracker("Андрій", "Кравченко", 8, 2, 1992, "kravchenko@gmail.com", "+380333333333", 85, 125, 4000);

        System.out.println("Дані користувача 1:");
        user1.printAccountInfo();
        System.out.println("\nДані користувача 2:");
        user2.printAccountInfo();

        user1.setWeight(75);
        user1.setSteps(10000);
        user2.setPressure(100);

        System.out.println("\nНові дані користувача 1:");
        user1.printAccountInfo();
        System.out.println("\nНові дані користувача 2:");
        user2.printAccountInfo();
    }
}
