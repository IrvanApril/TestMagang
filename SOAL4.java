import java.util.Scanner;

public class SOAL4 {
    public static void main(String[] args) {
        String huruf;
        Integer size_kata;
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Kata Bebas : ");
        huruf = input.nextLine();

        size_kata = huruf.length();
        for (int i = 0; i < huruf.length(); i++) {
            System.out.print(huruf.charAt(size_kata - 1));
            size_kata--;
        }

    }
}
