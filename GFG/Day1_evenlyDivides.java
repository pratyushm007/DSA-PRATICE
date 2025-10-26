public class Main {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(Solution.evenlyDivides(n));
    }
}

// Your GFG solution
class Solution {
    static int evenlyDivides(int n) {
        int rem, k;
        k = Math.abs(n);
        int count = 0;
        while (k > 0) {
            rem = k % 10;
            if (rem != 0 && (n % rem == 0)) {
                count++;
            }
            k = k / 10;
        }
        return count;
    }
}
