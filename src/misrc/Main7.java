
package misrc;

import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el valor: ");
        int valor = sc.nextInt();
        String[] dinamico = new String[valor];
        for(int i=0; i<dinamico.length;i++){
            String caracter = sc.next();
            dinamico[i] = caracter;
        }
        for(int i=0; i<dinamico.length;i++){
            System.out.println(dinamico[i]);
        }
    }  
}
