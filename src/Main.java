public class Main {
    public static void main(String[] args) {
        int balance = 300;
        int entrance = 1200;
        if (entrance > 1000) {
            System.out.println("Начислено бонусных рублей:");
        } else {
            System.out.println("Бонусы не начислены");
        }
        int bonus = (entrance / 100);
        System.out.println(bonus);
        int result = bonus + entrance + balance;
        System.out.println("Баланс " + result);
    }
}