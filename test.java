import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz: ");
        double n1 = scanner.nextDouble();
        System.out.print("ikinci sayıyı giriniz: ");
        double n2 = scanner.nextDouble();

        System.out.println("islem seciniz: ");
        System.out.println("1-toplama\n2-cıkarma\n3-carpma\n4-bölme");
        int choose = scanner.nextInt();

        switch (choose) {
            case 1:
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println(n1 - n2);
                break;
            case 3:
                System.out.println(n1 * n2);
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("payda 0 olamaz");
                } else {
                    System.out.println(n1 / n2);
                }
                break;
            default:
                System.out.println("gecersiz secim! ");
        }
    }
}