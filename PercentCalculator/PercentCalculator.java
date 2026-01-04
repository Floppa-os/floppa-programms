public class PercentCalculator {
    public void run() {
        System.out.println("\n--- Калькулятор процентов ---");
        System.out.print("Введите число: ");
        double number = InputUtils.getDoubleInput();
        System.out.print("Введите процент: ");
        double percent = InputUtils.getDoubleInput();

        double result = number * (percent / 100);
        System.out.printf("%.2f%% от %.2f = %.2f%n", percent, number, result);

        System.out.print("Хотите вычислить, сколько процентов составляет число от другого? (y/n): ");
        if (InputUtils.getCharInput() == 'y') {
            System.out.print("Введите исходное число: ");
            double base = InputUtils.getDoubleInput();
            System.out.print("Введите часть: ");
            double part = InputUtils.getDoubleInput();
            if (base != 0) {
                double percentage = (part / base) * 100;
                System.out.printf("%.2f составляет %.2f%% от %.2f%n", part, percentage, base);
            } else {
                System.out.println("Ошибка: исходное число не может быть нулём!");
            }
        }
    }
}
