package misrc;

public class Main4 {

    public static void main(String[] args) {
        int[] numeros1 = {5,1,3,7,2};
        int numelementos = numeros1.length;
        double media = 0.0;
        for(int i=0; i<numeros1.length; i++){
            media = media + numeros1[i];
        }
        media = media / numeros1.length;
        System.out.println("La media es = " + media);
    }
}
