// Java program to find nth catalan number

class catalan {
 
    static int findCatalan(int n) {
      
        // Base case
        if (n <= 1) {
            return 1;
        }

        // catalan(n) is the sum of catalan(i) *
        // catalan(n-i-1)
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += findCatalan(i) * findCatalan(n - i - 1);
        }

        return res;
    }

    public static void main(String[] args) {
        int n = 6;
        int res = findCatalan(n);
         System.out.println(res);
    }
}
