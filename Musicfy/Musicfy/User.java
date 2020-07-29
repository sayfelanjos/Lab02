import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class User {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Digite uma data: ");
            String dataRecebida = s.nextLine();
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date dt = df.parse(dataRecebida);
            System.out.println(dt);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
