import java.util.Scanner;

public class SOAL3 {
    public static void main(String[] args) {

        String waktu;

        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Waktu (cont : 06:00:00AM ) : ");

        waktu = input.nextLine();

        int jam1 = (int) waktu.charAt(1) - '0';
        int jam2 = (int) waktu.charAt(0) - '0';
        int opr = ((jam2 * 10) + (jam1 % 10));

        if (waktu.charAt(8) == 'A') {
            if (opr == 12) {
                System.out.print("00");
                for (int i = 2; i <= 4; i++) {
                    System.out.print(waktu.charAt(i));
                }
            } else {
                for (int i = 0; i <= 4; i++) {
                    System.out.print(waktu.charAt(i));
                }
            }
        } else {
            if (opr == 12) {
                System.out.print("12");
                for (int i = 2; i <= 4; i++) {
                    System.out.print(waktu.charAt(i));
                }
            } else {
                opr = opr + 12;
                System.out.print(opr);
                for (int i = 2; i <= 4; i++) {
                    System.out.print(waktu.charAt(i));
                }
            }
        }

    }
}
