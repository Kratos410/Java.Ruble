public class Main {
    public static void main(String[] args) {
        int balance = 2_000; // Ваш баланс
        System.out.println("Ваш баланс: " + balance + "р.");
        int replenishment = 2_256; // Сумма пополнения
        System.out.println("Счет пополнен на: " + replenishment + "р.");

        int bonus;
        if (replenishment >= 1_000) {
            bonus = replenishment / 100; //Бонус
            System.out.println("Ваш бонус составляет: " + bonus);

        } else {
            bonus = 0; //Бонус
            System.out.println("Ваш бонус составляет: 0 р. ");

        }
        int sum = balance + replenishment + bonus; //Общий счет
        System.out.println("Общий счет: " + sum + "р.");



        System.out.println("Спасибо за доверие, ваш оператор!");
    }
}