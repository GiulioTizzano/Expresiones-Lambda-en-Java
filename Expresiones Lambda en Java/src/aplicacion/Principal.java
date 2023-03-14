package aplicacion;
import dominio.*;
import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
public class Principal{
    public static void main(String[] args){
        ;
        // Ejercicio 14:
        // a)
        IntStream stream = IntStream.of(1, 2, 3, 4, 5, 6, 7);
        stream.forEach(System.out::println);
        // b)
        IntStream stream2 = IntStream.range(1, 10); // where 10 isn't included 1 <= x < 10
        stream2.forEach(System.out::println);
        // c) 
        IntStream stream3 = IntStream.iterate(2, n -> n + 2).limit(10);
        stream3.forEach(System.out::println);
        // d)
        Random random = new Random();
        DoubleStream stream4 = random.doubles(10, 0, 3);
        stream4.forEach(System.out::println);
        //Scanner sc = new Scanner(System.in);

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numbers2 = {1,2,3};
        int[] numbers3 = {2,4,6};
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        List<String> palabras = new ArrayList<>();
        palabras.add("HOLA");
        palabras.add("MUNDO");
        palabras.add("muyBUENAS");
        palabras.add("ADIOS");
        int n = numbers.length;
        int m = numbers2.length;
        int x = 12;
        int y = 3;
        System.out.println("suma de los primeros " + x + " numeros: " + Matematicas.suma(x));
        System.out.println("factorial de " + x + ": " + Matematicas.factorial(x));
        System.out.println("potencia de " + x + " elevado a " + y + ": " + Matematicas.potencia(x, y));
        //int s = 0;
        System.out.println("suma de los num de la lista: " + Matematicas.sumaLista(numbers, n));
        //System.out.println("Suma de los elementos de la lista: " + Metodos.sumaMem(numbers, n, s));
        System.out.println("media de los num de la lista: " + Matematicas.media(numbers, n));
        System.out.println("desviacion de los num de la lista: " + Matematicas.desviacion(numbers, n));
        System.out.println("suma de num pares hasta " + x + ": " + Matematicas.sumaPares(x));
        System.out.println("suma de num pares de la lista: " + Matematicas.sumaParesLista(numbers, n));
        //int[] lista = Metodos.paresLista(numbers, n);
        System.out.println("lista de num pares de la lista: " + Matematicas.paresLista(numbers));
        System.out.println("lista de num pares desde " + x + ": " + Matematicas.pares(x));
        System.out.println("lista de productos escalares: " + Matematicas.productp(numbers2, numbers3, m));
        //System.out.println("fibonacchi de " +x+" : " + Metodos.fibonaci(x));
        //System.out.println(Metodos.cociente());
        System.out.println("lista de sus cuadrados: " + Matematicas.cuadrados(numbers));
        System.out.println("lista a minusculas: " + Matematicas.aMinusculas(palabras));
        System.out.println("lista de elementos que no epiezan por A: " + Matematicas.noEmpiezaPorA(palabras));
        System.out.println("lista de numeros > que 6, cuando multiplicados por 2: " + Matematicas.por2MayorQue6(lista));


 
    }      
}  




