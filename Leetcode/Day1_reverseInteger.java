class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;

            // Overflow checks BEFORE doing rev * 10 + digit
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            rev = rev * 10 + digit;
            x = x / 10;
        }
        return rev;
    }
}

/*Case A: rev > Integer.MAX_VALUE / 10

Integer.MAX_VALUE / 10 = 214748364

If rev is already greater than 214748364, then multiplying it by 10 will definitely push it beyond Integer.MAX_VALUE.

Example: rev = 300000000 → rev * 10 = 3000000000 → overflow.

👉 Case B: rev == Integer.MAX_VALUE / 10 && digit > 7

If rev is exactly 214748364, we’re very close to the limit.

Now, the last digit of Integer.MAX_VALUE is 7.

So if the next digit we’re adding (digit) is greater than 7, the result will exceed 2147483647.*/
