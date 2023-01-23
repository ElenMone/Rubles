public class Main {
    public static void main(String[] args) {
        int x = 300;
        int a = 1200;
        if (a > 1000) {
            System.out.println("Начислено бонусных рублей:");
        }  else {
            System.out.println("Бонусы не начислены");
        }
        int b = (a / 100);
            System.out.println(b);
        int i = b + x + a;
            System.out.println("Баланс " + i);
    }
}