public class CurrencyConverter {
    private static final double FLOPPACOIN_RATE = 100.0; // 1 FC = 100 руб

    public void run() {
        System.out.println("\n--- Конвертер валют (Floppacoin) ---");
        System.out.println("Курс: 1 Floppacoin = " + FLOPPACOIN_RATE + " рублей");
        
        System.out.print("Введите сумму в рублях: ");
        double rubles = InputUtils.getDoubleInput();
        double floppacoins = rubles / FLOPPACOIN_RATE;
        System.out.printf("%.2f рублей = %.4f Floppacoin%n", rubles, floppacoins);

        System.out.print("Введите сумму в Floppacoin: ");
        double fc = InputUtils.getDoubleInput();
        double rublesFromFc = fc * FLOPPACOIN_RATE;
        System.out.printf("%.4f Floppacoin = %.2f рублей%n", fc, rublesFromFc);
    }
}
