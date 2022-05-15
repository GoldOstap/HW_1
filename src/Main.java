import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b, rezi;
        float c,d, rezf;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение а: ");
        a = scan.nextInt();

        System.out.print("Введите значение b: ");
        b = scan.nextInt();

        System.out.print("Введите значение c: ");
        c = scan.nextFloat();

        System.out.print("Введите значение d: ");
        d = scan.nextFloat();

        rezi = a+b;
        System.out.println("a+b= "+ rezi);

        rezi = a-b;
        System.out.println("a-b= "+ rezi);

        rezf = d*c;
        System.out.println("b*c= "+rezf);

        rezf = d/c;
        System.out.println("b/c= "+rezf);

        rezi = (int) (d%c);
        System.out.println("Остаток от b/c : "+ rezi);


    }
}