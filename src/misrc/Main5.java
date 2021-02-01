package misrc;

public class Main5 {

    public static void main(String[] args) {
        int[] numeros2 = {3,5,6,1,9,8};
        int[] copia = new int[numeros2.length];
        System.arraycopy(numeros2, 0, copia, 0, numeros2.length);
    }   
}
