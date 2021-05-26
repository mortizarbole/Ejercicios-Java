import java.util.Scanner;

public class TallerJava1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ejercicio 1");
        int n = scanner.nextInt();
        NumerosPares(n);
        System.out.println("ejercicio 2");
        int m = scanner.nextInt();
        n = scanner.nextInt();
        CantidadMultiplos(m,n);
        System.out.println("ejercicio 3");
        n = scanner.nextInt();
        SiValorPrimo(n);
        System.out.println("ejercicio 4");
        n = scanner.nextInt();
        NumerosPrimos(n);
        System.out.println("ejercicio 5");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        NumerosDigitos(m,n,d);
        scanner.close();
    }

    public static void NumerosDigitos(int m, int n, int d){
        int i = 0;
        int valor = 1;
        while (i < n){
            String iString = Integer.toString(valor);
            int ContadorDigitos = 0;
            for (int j = 0; j < iString.length(); j++) {
                if(Integer.toString(d).contains(Character.toString(iString.charAt(j)))){
                    ContadorDigitos++;
                }
            }
            if(ContadorDigitos >= m){
                i++;
                System.out.println(valor);

            }
            valor++;
        }
    }
    public static void NumerosPrimos(int n){
        for (int i = 1; i <= n; i++) {
            if(SiValorPrimo(i)) System.out.println(i);
        }
    }

    public static boolean SiValorPrimo(int n){
        int contadorMultiplos = 0;
        for (int i = 0; i < n; i++) {
            if(n % i == 0) contadorMultiplos++;
        }
        if(contadorMultiplos == 2){
            System.out.println("el "+n+" es un numero primo");
            return true;
        }
        return false;
    }

    public static void CantidadMultiplos(int m, int n){
        int contadorMultiplos = 0;
        for (int i = 1; i < m; i++) {
            if(m % i== 0 && contadorMultiplos < n){
                System.out.println(i);
                contadorMultiplos++;
            }
        }
    }

    public static void NumerosPares(int n){
        for (int i = 0; i <= n; i++) {
            if(i % 2 == 0) System.out.println(i);
        }
    }
}
