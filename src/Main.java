public class Main {
    public static void main(String[] args) {
        int balance = 300;
        int entrance = 1200;
        int bonus;
        if (entrance > 1000) {
            bonus = entrance / 100;
            System.out.println("Начислено бонусных рублей:" + bonus);
        } else {
            bonus = 0;
            System.out.println("Бонусы не начислены");
        }

        int result = balance + entrance + bonus;
        System.out.println("Баланс " + result);
    }
}