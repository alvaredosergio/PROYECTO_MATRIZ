package misrc;

public class Main3 {

    public static void main(String[] args) {
        int[] numeros = {8,5,2,9,2,1};
        int menor = 9999;
        int mayor = -9999;
        for(int i=0; i<numeros.length; i++){
            if(menor > numeros[i]) menor = numeros[i];
            if(mayor < numeros[i]) mayor = numeros[i];
                
        }
        System.out.println("Mayor = " + mayor);
        System.out.println("Menor = " + menor);
    }
}

