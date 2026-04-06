
import java.util.Scanner;
import java.util.Stack;

public class Metodos {
    public int [] LlenarVector(int[] v, int n){
        Scanner sc = new Scanner(System.in);
        Validaciones val = new Validaciones();
        for (int i=0; i<n; i++){
            System.out.println("Ingrese el valor del vector en la posicion [" + i + "]: ");
            v[i] = val.ValidarEntero(sc);
        }
        return v;
    }

    public void MostrarVector(int[] v){
        System.out.println("El vector ingresado es: ");
        for (int i=0; i<v.length; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println(); // Add a newline at the end
    }

    public int Factorial(int num){//sacar el factorial de un numero
        int fac = 1;
        for (int i = num; i >= 1; i--) {
            fac *= i;
        }
        return fac;
    }

    public Stack<Integer> FactorialEnPila(int [] v, Stack<Integer> p){
        for (int i=0; i<v.length; i++){
            p.push(Factorial(v[i]));
        }
        return p;
    }
}
