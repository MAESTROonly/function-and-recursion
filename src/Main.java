import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Uncomment the method you want to test
        //minimum();
        //average();
        //prime();
        //facotrial();
        //fibonacci();
        //pow();
        //reversed();
        //binomial();
        //finding_gcd();
        //string();
    }

    // Problem 1: Find minimum
    public static void minimum() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int minimum = findMin(arr, n - 1);
        System.out.println("Minimum: " + minimum);
    }

    // Helper method to find minimum recursively
    private static int findMin(int[] arr, int index) {
        if (index == 0) {
            return arr[0];
        }
        int minNumber = findMin(arr, index - 1);
        return Math.min(arr[index], minNumber);
    }

    // Problem 2: Calculate average
    public static void average() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Average: " + averageSolution(arr, arr.length - 1));
    }

    // Helper method to calculate average recursively
    private static double averageSolution(int[] arr, int ind) {
        if (ind == 0) {
            return (double) arr[0] / arr.length;
        }
        return ((double) arr[ind] / arr.length) + averageSolution(arr, ind - 1);
    }

    // Problem 3: Check if a number is prime
    public static void prime() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Prime or Composite: " + Prime_check(n, n / 2));
    }

    // Helper method to check prime recursively
    private static String Prime_check(int n, int divisor) {
        if (n <= 1) {
            return "Composite";
        }
        if (divisor == 1) {
            return "Prime";
        }
        if (n % divisor == 0) {
            return "Composite";
        }
        return Prime_check(n, divisor - 1);
    }

    // Problem 4: Calculate factorial
    public static void facotrial() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial: " + factorial_sum(n));
    }

    // Helper method to calculate factorial recursively
    private static int factorial_sum(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial_sum(n - 1);
    }

    // Problem 5: Calculate Fibonacci number
    public static void fibonacci() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Fibonacci: " + fibbo(n));
    }

    // Helper method to calculate Fibonacci number recursively
    private static int fibbo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibbo(n - 1) + fibbo(n - 2);
    }

    // Problem 6: Calculate power
    public static void pow() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Power: " + power(a, n));
    }

    // Helper method to calculate power recursively
    private static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }

    // Problem 7: Reverse a sequence of numbers
    public static void reversed() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverse(n, sc);
    }

    // Helper method to reverse a sequence of numbers recursively
    private static void reverse(int n, Scanner sc) {
        int num = sc.nextInt();
        if (n == 1) {
            System.out.print(num + " ");
            return;
        }
        reverse(n - 1, sc);
        System.out.print(num + " ");
    }

    // Problem 8: Check if a string consists of only digits
    public static void string() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Contains only digits: " + containsOnlyDigits(s, s.length() - 1));
    }

    // Helper method to check if a string consists of only digits recursively
    private static boolean containsOnlyDigits(String s, int i) {
        if (i == 0) {
            return Character.isDigit(s.charAt(0));
        }
        return Character.isDigit(s.charAt(i)) && containsOnlyDigits(s, i - 1);
    }

    // Problem 9: Calculate binomial coefficient
    public static void binomial() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println("Binomial coefficient: " + binomial_sol(n, k));
    }

    // Helper method to calculate binomial coefficient recursively
    private static int binomial_sol(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
// Problem 10: Find the greatest common divisor (GCD) of two numbers
            public static void finding_gcd () {
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("GCD: " + GCD(a, b));
            }

// Helper method to find GCD recursively using Euclidean algorithm
            private static int GCD ( int a, int b){
                if (a == 0 || b == 0) {
                    return Math.max(a, b);
                }
                if (a < b) {
                    int temp = a;
                    a = b;
                    b = temp;
                }
                return GCD(a % b, b);
            }
        }
    }
}

