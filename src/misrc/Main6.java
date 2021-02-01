package misrc;

public class Main6 {

    public static void main(String[] args) {
        char[] cadena1 = {'A','B','C','D','E'}; 
        char[] cadena2 = {'F','G','H','I','J','K','L','M','N'};
        System.arraycopy(cadena1, 0, cadena2, 4, cadena1.length);
        for(int i=0; i<cadena2.length;i++){
            System.out.println(cadena2[i]);
        }
    }
}
