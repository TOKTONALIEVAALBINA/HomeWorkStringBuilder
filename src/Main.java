import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String st = new String();

        try (FileWriter fileWriter = new FileWriter("alphabet.txt")) {
            fileWriter.write("Alphabet : ");
            fileWriter.write("A a\n" +
                    "B b\n" +
                    "C c\n" +
                    "D d\n" +
                    "E e\n" +
                    "F f\n" +
                    "G g\n" +
                    "H h\n" +
                    "I i\n" +
                    "J j\n" +
                    "K k\n" +
                    "L l\n" +
                    "M m\n" +
                    "N n\n" +
                    "O o\n" +
                    "P p\n" +
                    "Q q\n" +
                    "R r\n" +
                    "S s\n" +
                    "T t\n" +
                    "U u\n" +
                    "V v\n" +
                    "W w\n" +
                    "X x\n" +
                    "Y y\n" +
                    "Z z\n");
            fileWriter.write("Numbers : " +
                    "1\n" +
                    "2\n" +
                    "3\n" +
                    "4\n" +
                    "5\n" +
                    "6\n" +
                    "7\n" +
                    "8\n" +
                    "9\n ");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        Alphabet alphabet = new Alphabet();

        FileReader fileReader = new FileReader("alphabet.txt");
        Scanner scanner = new Scanner(fileReader);
        StringBuilder stringBuilder = new StringBuilder();
        alphabet.setLetters(scanner.nextLine());
        alphabet.setNumbers(scanner.nextLine());
        while (scanner.hasNextLine()) {
            stringBuilder.append(scanner.nextLine() + "\n");
//            for (String[] a: stringBuilder){
//
//            }

        }
        System.out.println(stringBuilder);
    }
}