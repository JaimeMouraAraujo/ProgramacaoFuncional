public class Atividades {
    public static void pares(int i, int fim) {
        if (i <= fim) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

            pares(i + 1, fim);
        }
    }

    public static void primos(int i, int fim) {
        if (i <= fim) {
            if (ehPrimo(i)) {
                System.out.println(i);
            }

            primos(i + 1, fim);
        }
    }

    public static boolean ehPrimo(int n) {
        if (n == 0 || n == 1) {
            return false;
        } else {
            return checkPrimo(n, 2, (int) Math.floor(Math.sqrt(n)));
        }
    }

    public static boolean checkPrimo(int n, int i, int fim) {
        if (i <= fim) {
            if (n % i == 0) {
                return false;
            } else {
                return checkPrimo(n, i + 1, fim);
            }
        } else {
            return true;
        }
    }
}
