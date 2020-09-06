import java.util.Scanner;

public class Main {
    public static long findLastInt(long a) {
        long mult = 9;
        long res = 0;
        while (a != 0) {
            long last = a % 10;
            res += last * mult;
            mult--;
            a /= 10;
        }
        return res % 11;
    }
    public static int countDigits(long a) {
        int counter = 0;
        while (a != 0) {
            counter++;
            a /= 10;
        }
        return counter;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long input = scanner.nextLong();
        int numberOfZeroes = 9 - countDigits(input);
        long last = findLastInt(input);
        for (int i = 0 ; i < numberOfZeroes ; i++) {
            System.out.print(0);
        }
        if (last == 10) {
            System.out.print(input);
            System.out.print('X');
        }
        else {
            System.out.print(input);
            System.out.print(last);
        }
    }
}
