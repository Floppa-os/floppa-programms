public class AreaCalculator {
    public void run() {
        System.out.println("\n--- Калькулятор площади ---");
        System.out.println("1. Прямоугольник");
        System.out.println("2. Круг");
        System.out.print("Ваш выбор: ");
        int shape = InputUtils.getIntInput();

        switch (shape) {
            case 1 -> calculateRectangle();
            case 2 -> calculateCircle();
            default -> System.out.println("Неверный выбор!");
        }
    }

    private void calculateRectangle() {
        System.out.print("Длина: ");
        double length = InputUtils.getDoubleInput();
        System.out.print("Ширина: ");
        double width = InputUtils.getDoubleInput();
        double area = length * width;
        System.out.printf("Площадь прямоугольника: %.2f%n", area);
    }

    private void calculateCircle() {
        System.out.print("Радиус: ");
        double radius = InputUtils.getDoubleInput();
        double area = Math.PI * radius * radius;
        System.out.printf("Площадь круга: %.2f%n", area);
    }
}
