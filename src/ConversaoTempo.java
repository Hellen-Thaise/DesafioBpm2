import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ConversaoTempo {
    public static void main(String[] args) throws ParseException {
        System.out.println("Digite um número inteiro para a conversão: ");
        Scanner input = new Scanner(System.in);
        long seconds;

        seconds = input.nextInt();

        long millis = seconds * 1000;
        Date date = new Date(millis);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        formato.getCalendar().setTimeZone(TimeZone.getTimeZone("GMT-3"));

        System.out.println(formato.format(date));
    }
}
