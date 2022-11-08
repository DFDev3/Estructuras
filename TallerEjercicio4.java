package tallerejercicio4;
 import java.util.Scanner;
public class TallerEjercicio4 {
    public static String eliminarUltimaPalabra(String s) {                                    
    int pos;
    s = s.trim();
    pos = s.lastIndexOf(" ");
    if (pos != -1) {
         s = s.substring(0, pos);                                                                                 
    } else {
         s = "";
    }
    return s;
} 
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    String texto;
    do {
           System.out.println("Introduce texto: ");
           texto = sc.nextLine();
     } while (texto.isEmpty());
     texto = eliminarUltimaPalabra(texto);                                                                        
     System.out.println(texto);
    }   
}
