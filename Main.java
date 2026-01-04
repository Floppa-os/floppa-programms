public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в многофункциональный калькулятор!");
        while (true) {
            System.out.println("\nВыберите операцию:");
            System.out.println("1. Простой калькулятор");
            System.out.println("2. Конвертер валют (Floppacoin)");
            System.out.println("3. Калькулятор площади");
            System.out.println("4. Калькулятор процентов");
            System.out.println("0. Выход");
            System.out.print("Ваш выбор: ");

            int choice = InputUtils.getIntInput();
            switch (choice) {
                case 1 -> new SimpleCalculator().run();
                case 2 -> new CurrencyConverter().run();
                case 3 -> new AreaCalculator().run();
                case 4 -> new PercentCalculator().run();
                case 0 -> {
                    System.out.println("До свидания!");
                    return;
                }
                default -> System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}
