package academy.learning.sort.sort;

import java.util.Stack;

public class practice {
    public static void main(String[] args) {
        a(12);
    }

    static Stack<Integer> binary = new Stack<>();

    public static void a(int n) {
        if (n / 2 == 0) {
            for (int i = 0; i < binary.size(); i++) {
                Integer y = binary.pop();
                System.out.println(y);
            }
        }
        if (n / 2 > 0) {
            a(n / 2);
            binary.push(n % 2);
        }

    }
}
