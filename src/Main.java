public class Main {
    public static void main(String[] args) {
        int initialAmount = 100;
        int replenishmentAmount = 1100;
        int totalAmount = initialAmount + replenishmentAmount;
        boolean isReplenished = true;

        int bonusRubles;
         if (isReplenished && replenishmentAmount > 1000) {
             bonusRubles = replenishmentAmount / 100;
         } else {
             bonusRubles = 0;
         }
         int totalSum = totalAmount + bonusRubles;
        System.out.println("Итоговая сумма на счету клиента: " + totalSum );
        System.out.println("Бонусные рубли: " + bonusRubles);


    }
}
