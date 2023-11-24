import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.NotActiveException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter  fileWriter = new FileWriter("argen.txt");
        FileWriter  fileWriter2 = new FileWriter("argenCopy.txt");
        fileWriter.write("23\n");
        fileWriter.write("15\n");
        fileWriter.write("asd\n");
        fileWriter.write("16\n");
        fileWriter.write("asdas\n");
        fileWriter.write("24\n");

        fileWriter.close();

        FileReader fileReader = new FileReader("argen.txt");
        Scanner scanner = new Scanner(fileReader);

        while(scanner.hasNextLine()) {
            String numberText = scanner.nextLine();
            int number = 0;
            try {
                number = Integer.parseInt(numberText);
            } catch (NumberFormatException exception) {
                System.out.println("Ojidal chislo, a prishel text: " +  numberText);
            }

            System.out.println(number);
            fileWriter2.write(numberText + " Copy\n");
        }
        fileReader.close();
        fileWriter2.close();
    }
}
