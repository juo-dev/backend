import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        //cria instancia do Scanner
        Scanner scanner = new Scanner(System.in);
        //Log no console
        System.out.print("Course name: ");
        //Lê o console
        String courseName = scanner.nextLine();

        //cria instancia da classe
        GradeBook myGradeBook = new GradeBook();
        // objeto chama o metodo da classe:
        myGradeBook.DisplayMessage(courseName);
    }
}
