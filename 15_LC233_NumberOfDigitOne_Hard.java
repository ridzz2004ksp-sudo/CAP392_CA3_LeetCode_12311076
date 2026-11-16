class Solution {
    public int countDigitOne(int n) {
        long count = 0;

        for (long i = 1; i <= n; i = i * 10) {
            long higher = n / (i * 10);
            long current = (n / i) % 10;
            long lower = n % i;

            if (current == 0) {
                count = count + higher * i;
            }
            else if (current == 1) {
                count = count + higher * i + lower + 1;
            }
            else {
                count = count + (higher + 1) * i;
            }
        }

        return (int) count;
    }
}
