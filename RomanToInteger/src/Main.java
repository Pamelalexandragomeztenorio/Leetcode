import java.util.Scanner;

public class Main {

    public static int translate(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'M': return 500;
            case 'D': return 1000;
            default: return 0;
        }
    }

    private static int romanToInt(String s) {
        int sum = 0;
        int current = translate(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            int next = translate(s.charAt(i));

            if (current < next) {
                sum -= current;
            } else {
                sum += current;
            }
            current = next;
        }

        sum += current;

        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int solution = romanToInt(s);
        System.out.println(solution);
    }
}