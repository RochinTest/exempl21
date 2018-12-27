import java.util.Scanner;

//Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите любое число");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int m = sc.nextInt();
            for (int i = 1; i < m; i++) {
    if( m%i==0) System.out.println(i);
            }
        }
    }
}
