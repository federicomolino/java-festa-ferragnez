
import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) throws Exception {
        String [] invitati = {"Dua Lipa","Paris Hilton","Manuel Agnelli","J-Ax","Francesco Totti","Ilary Blasi","Bebe Vio","Luis","Pardis Zarei","Martina Maccherone","Rachel Zeilic"};

        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome per poter entrare alla festa: ");
        String nome = scan.nextLine();
        
        for (int i = 0; i < invitati.length; i++) {
            //Verifico se nella posizione in cui si trova il nome nell'array è uguale a quanto inserito dall'utente
            if (invitati[i].equals(nome)) {
                System.out.println("Ciao " + nome +", puoi entrare");
            } else {
                System.out.println("Ciao " + nome +", mi dispiace ma il tuo nome non è in lista");
                break;
            }
        }
    }
}
