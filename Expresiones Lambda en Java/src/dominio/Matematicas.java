package dominio;
import aplicacion.*;
import java.util.function.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Matematicas{
    public static int suma(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
       return IntStream.range(1, n+1).sum();
       //Stream<Integer> iterateStream = Stream.iterate(0, x -> x + 1).limit(n).reduce((a, b) -> a + b);
    }
    public static int factorial(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        return IntStream.range(1, n+1).reduce(1, (a, b) -> a * b);
    }
    public static int potencia(int n, int x) throws IllegalArgumentException {
        if (n < 0 || x < 0) {
            throw new IllegalArgumentException("n and x must be >= 0");
        }
        return IntStream.range(1, x+1).reduce(1, (a, b) -> a * n);
    }
    public static double media(int[] lista, int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        return Arrays.stream(lista).mapToDouble(i -> i).average().getAsDouble();
    }
    public static double desviacion(int[] lista, int n) throws IllegalArgumentException{
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        if (n == 1) {
            return lista[0];
        } else {
            return Math.sqrt((Math.pow(lista[n-1], 2) + Math.pow(desviacion(lista, n - 1), 2)) / n);
        }
    }
    public static int sumaLista(int[] lista, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        return Arrays.stream(lista).sum();
    }
    public static int sumaPares(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        return IntStream.range(1, n+1).filter(i -> i % 2 == 0).sum();
    }
    public static int sumaParesLista(int[] lista, int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        return Arrays.stream(lista).filter(i -> i % 2 == 0).sum();
    }
    public static List<Integer> paresLista(int[] numbers) throws IllegalArgumentException {
        int n = numbers.length;
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        ArrayList<Integer> pares = new ArrayList<>();
        
        return Arrays.stream(numbers).filter(i -> i % 2 == 0).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }
    public static List<Integer> pares(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        List<Integer> pares = new ArrayList<>();
        return IntStream.range(1, n+1).filter(i -> i % 2 == 0).toArrayList();
    }
    public static int productp(int[] lista1, int[] lista2, int n) throws IllegalArgumentException{
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        return IntStream.range(0, n).map(i -> lista1[i] * lista2[i]).sum();
    }
    /*public static int fibonaci(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonaci(n - 1) + fibonaci(n - 2);
        }
    }*/
    /*public static String cociente(){
        double x = fibonaci(13);
        double z = fibonaci(12);
        double w = x/z;
        double y = (1 + Math.sqrt(5))/2;
        return "El cociente de el fibonacci de 13 y 12 es: " + w + " y 1+sqrt(5)/2 es: " + y;
    }
    /*public static int sumaMem(int[]A, int n, int s) {
        if (n == 1) {
            return s;
        } else {
            return sumaMem(A, n - 1, s+A[n]);
        }
    }*/

    public static List<Integer> cuadrados(int[] lista)throws IllegalArgumentException {
        if (lista.length < 0) {
            throw new IllegalArgumentException("n debe sr >= 0");
        }
        return Arrays.stream(lista).map(i -> i * i).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }

    public static List<String> aMinusculas(List<String> lista)throws IllegalArgumentException {
        if (lista.size() < 0) {
            throw new IllegalArgumentException("n debe sr >= 0");
        }
        return lista.stream().map(i -> i.toLowerCase()).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }

    public static List<String> noEmpiezaPorA(List<String> al){
        return al.stream().filter(i -> !i.startsWith("A")).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }

    public static List<Integer> por2MayorQue6(List<Integer> lista){
        return lista.stream().map(i -> i * 2).filter(i -> i > 6).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }


    

}
    
    


