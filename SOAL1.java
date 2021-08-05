
/**
 * SOAL1
 */
import java.util.Scanner;

public class SOAL1 {

    public static void main(String[] args) {

        Integer nilai;

        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Nilai:");
        nilai = input.nextInt();

        if ((nilai % 5) == 0 && (nilai % 3) == 0) {
            System.out.println("Hello World");
        } else if ((nilai % 3) == 0) {
            System.out.println("World");
        } else if ((nilai % 5) == 0) {
            System.out.println("Hello");
        } else {
            System.out.println("Nilai Tidak Sesuai Kondisi");
        }

    }
}