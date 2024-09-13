import java.util.Random;

public class GeradorDeCodigo {

    // Static method to generate random code in the format "0000-00"
    public static String gerarCodigo() {
        Random random = new Random();
        
        // Generating the first part of the code (0000)
        int parte1 = random.nextInt(10000); // Generates a number between 0 and 9999
        
        // Generating the second part of the code (00)
        int parte2 = random.nextInt(100);   // Generates a number between 0 and 99

        // Formatting the parts of the code to the format "0000-00"
        String codigo = String.format("%04d-%02d", parte1, parte2);
        
        return codigo;
    }
}
