
import java.util.Scanner;
import java.util.Stack;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        Validaciones val = new Validaciones();
        System.out.println("Ingrese la dimension del vector: ");
        int n = val.ValidarEntero(sc);
        int[] vector = new int[n];
        vector = m.LlenarVector(vector, n);
        System.out.println("----------------------------------");
        System.out.println("\nVector ingresado: ");
        m.MostrarVector(vector);
        Stack<Integer> pila = new Stack<>();

        pila = m.FactorialEnPila(vector, pila);
        System.out.println("\nPila con los factoriales: ");
        System.out.println(pila);
    }
}
