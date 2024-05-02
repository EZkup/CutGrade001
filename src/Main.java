import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("In put you score");
        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt();
        if (sc >= 80 ) {
        System.out.println("Grade 4 ");
        System.out.println("Score "+sc);
        }
        else if (sc >= 75 ) {
            System.out.println("Grade 3.5 ");
            System.out.println("Score "+sc);
        }
        else if (sc >= 70 ) {
            System.out.println("Grade 3 ");
            System.out.println("Score "+sc);
        }
        else if (sc >= 65 ) {
            System.out.println("Grade 2.5 ");
            System.out.println("Score "+sc);
        }
        else if (sc >= 60 ) {
            System.out.println("Grade 2 ");
            System.out.println("Score "+sc);
        }
        else if (sc >= 55 ) {
            System.out.println("Grade 1.5 ");
            System.out.println("Score "+sc);
        }
        else if (sc >=  50 ) {
            System.out.println("Grade 1");
            System.out.println("Score "+sc);
        }
        else if (sc >= 49) {
            System.out.println("Grade 0");
            System.out.println("Score "+sc);
        }

    }
}