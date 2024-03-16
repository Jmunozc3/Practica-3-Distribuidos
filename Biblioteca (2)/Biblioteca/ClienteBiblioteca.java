import Biblioteca.*;
import org.omg.CosNaming.*;
import org.omg.CORBA.*;


public class ClienteBiblioteca {

    public static Void suma(int n1, int n2) {
        int n=n1+n2;
        System.out.println("La suma de"+n1+"+"+n2+"="+n);
        return null;
    }
    public static void resta(int n1, int n2) {

        int n=n1-n2;
        System.out.println("La resta de"+n1+"+"+n2+"="+n);
    }
    public static void multiplicacion(int n1, int n2) {
        int n=n1*n2;
        System.out.println("La multiplicacion de"+n1+"+"+n2+"="+n);
    }
    public static void division(int n1, int n2) {
        int n=n1/n2;
        System.out.println("La division de"+n1+"+"+n2+"="+n);
    }


    public static void main(String args[]) {
        try {
            

            suma(1, 2);
            resta(3,4);
            multiplicacion(3, 4);
            division(15,5);

           

        } catch (Exception e) {
            System.out.println("Error: " + e);
            e.printStackTrace(System.out);
        }
    }
}

