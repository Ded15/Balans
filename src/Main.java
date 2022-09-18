public class Main {
    public static void main(String[] args) {

        int initialBalance = 250; //начальный баланс

        int replenishment = 1500; //сумма пополнения

        boolean condition = replenishment > 1_000;

        int bonus;

        if (condition) {
            bonus = replenishment/100;
        } else {
            bonus = 0;
        }
        System.out.println("Количество начисленных бонусных рублей:" + bonus);
        System.out.println("Итоговый баланс:" + (initialBalance+replenishment+bonus));
    }


}