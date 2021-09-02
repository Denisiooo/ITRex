package ITRexx2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static <My> void main(String[] args) throws IOException {
        PrinceOfPersia princeOfPersia = new PrinceOfPersia();
        ArrayList<ArrayList<PrinceOfPersia>> MAZE = new ArrayList<ArrayList<PrinceOfPersia>>();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String fileName = in.nextLine();
        fileName = fileName.trim();
        FileReader reader = new FileReader(fileName + ".txt");
        Scanner in2 = new Scanner(reader);

        FileWriter writer = new FileWriter("INPUT.out");
        PrintWriter out = new PrintWriter(writer);
        boolean done = false;
        int maxCol = 0;
        int maxRow = 0;
    }
}

