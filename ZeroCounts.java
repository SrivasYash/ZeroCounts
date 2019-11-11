import java.util.*;
public class ZeroCounts {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter n");
        int n = s.nextInt();
        //System.out.println(n);

        ZeroCounts z = new ZeroCounts();
        int count = z.count(n);
        System.out.println("Number of zeros in " + n + " are: " + count);
    }
    public int count(int n) {
        int count = 0;
        if (n == 0) {
            return 1;
        }
        else {
            for (int i = 1; i <= n; i++) {
                count += count_zero(i);
            }
            //System.out.println(count);
            return count;
        }

    }
    public int count_zero(int n) {
        int zero_count = 0;
        while (n != 0) {
            if (n % 10 == 0)
                zero_count++;
            n = n / 10;
        }
        return zero_count;
    }
}
