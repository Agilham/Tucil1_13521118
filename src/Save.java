import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Save {

    public static void savePromt(StrArr array) throws IOException {
        String prompt;
        boolean back = false;
        System.out.println("\nApakah ingin menyimpan solusi? (Y/N) : ");
        do {
            Scanner scanner = new Scanner(System.in);
            prompt = scanner.nextLine().toLowerCase();
            if (prompt.equals("y")) {
                System.out.println("Masukkan nama file (.txt)");
                String fileName = scanner.nextLine();
                // Algoritma save to file isi disini
                writeFile(fileName, array);
                back = true;
            } else if (prompt.equals("n")) {
                back = true;
            }
        } while (!back);
    }

    public static void writeFile(String fileName, StrArr array) {
        try (FileWriter writer = new FileWriter("../Tucil1_13521118/test/" + fileName)) {
            writer.write("Solusi:\n");
            for (int i = 1; i < array.len; i++) {
                // writer.write(Double.toString(array.Arr[i]));
            }
            writer.write("\n");
            writer.write("Berhasil menyimpan solusi pada " + fileName);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
