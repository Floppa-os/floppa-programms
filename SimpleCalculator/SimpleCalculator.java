public class SimpleCalculator {
    public void run() {
        System.out.println("\n--- Простой калькулятор ---");
        System.out.print("Введите первое число: ");
        double a = InputUtils.getDoubleInput();
        System.out.print("Введите операцию (+, -, *, /): ");
        char op = InputUtils.getCharInput();
        System.out.print("Введите второе число: ");
        double b = InputUtils.getDoubleInput();

        switch (op) {
            case '+' -> System.out.printf("Результат: %.2f%n", a + b);
            case '-' -> System.out.printf("Результат: %.2f%n", a - b);
            case '*' -> System.out.printf("Результат: %.2f%n", a * b);
            case '/' -> {
                if (b != 0) {
                    System.out.printf("Результат: %.2f%n", a / b);
                } else {
                    System.out.println("Ошибка: деление на ноль!");
                }
            }
            default -> System.out.println("Неверная операция!");
        }
    }
}
