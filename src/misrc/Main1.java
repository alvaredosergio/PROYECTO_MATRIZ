package misrc;

public class Main1 {

    public static void main(String[] args) {
        //Declaración del ARRAY//
        String[] nombre = {"Luis","Miguel","Carlos"};
        //RECORRER EL ARRAY//
        for(int i=0; i<nombre.length; i++){
            System.out.println(nombre[i]);
        }
        
        //Declaración ARRAY TIPO DOUBLE//
        double[] estatura = {1.72,1.75,1.65};
        //RECORRER EL ARRAY//
        for(int i = 0; i< estatura.length; i++){
            System.out.println(estatura[i]);
        }
        
    } 
}
