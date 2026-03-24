import org.w3c.dom.ls.LSOutput;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    // citire din fisier
    /* public static void main(String[] args) {
        try {
            printSmallTextFile("in.txt");
            System.out.println("\n");
            printLargerTextFile("in.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    static void printSmallTextFile(String fileName) throws IOException{
        System.out.println("Using Files.readAllLines: ");
        Path path = Paths.get(fileName);
        List<String> allLinesInMemory = Files.readAllLines(path);
        for(String line : allLinesInMemory){
            System.out.println(": "+ line);
        }
    }
    static void printLargerTextFile(String fileName) throws IOException{
        System.out.println("Using Scanner: ");
        Path path = Paths.get(fileName);
        try(Scanner scanner = new Scanner(path)){
            while(scanner.hasNextLine()){
                System.out.println(": "+scanner.nextLine());
            }
        }
    }*/

    // scriere in fisier
    /*public static void main(String[] args){
        List<String> lines = Arrays.asList(
                "Lorem ipsum dolor sit amet, vim ne eripuit vulputate." ,
                "Vide tantas dicunt ne ius, mel pertinacia intellegebat ei." ,
                "Sea vidisse aperiam et, eu altera audiam percipitur vis, decore verterem ea nec." ,
                "Veri quando ad est. Ex quidam blandit nec, eos et percipit indoctum.",
                "\n" ,
                "Summo putant consetetur cu vel. Id eum adipisci philosophia, eos commodo principes an." ,
                "Duis eripuit laoreet qui ne, pri maiorum detracto definitiones et." ,
                "Sea quis laudem dolorem eu."
        );
        try{
            System.out.println("Writing out.txt");
            writeSmallTextFile(lines, "out.txt");
            writeLargeTextFile(lines, "out.txt");

        } catch (IOException e){
            e.printStackTrace();
        }
    }
    static void writeSmallTextFile(List<String> lines, String fileName) throws IOException{
        Path path = Paths.get(fileName);
        Files.write(path, lines);
    }

    static void writeLargeTextFile(List<String> lines, String fileName) throws IOException{
        Path path = Paths.get(fileName);
        try(BufferedWriter writer = Files.newBufferedWriter(path)){
            for(String line : lines){
                writer.write(line);
                writer.newLine();
            }
        }
    }
    */

    // metoda split()
    // separ un array de strings prin extragerea sirurilor
    // dintre aparitiile unui separator (de ex: spatiu)
    /* public static void main(String[] args){
        String line = "Lorem ipsum dolor sit amet, vim ne eripuit vulputate.\n" +
                "Vide tantas dicunt ne ius, mel pertinacia intellegebat ei.";
        System.out.println("Split by one space char: ");
        String[] words = line.split(" ");
        for(String w : words){
            System.out.println("[" + w + "]");
        }
        System.out.println("\nSplit by regex \\s+: ");
        String[] words2 = line.split("\\s+");
        for(String w : words2) {
            System.out.println("[" + w + "]");
        }
    }

     */

    //sortare strings
    /* public static void main(String[] args){
        String[] words = {"Lorem","ipsum","dolor"," sit","amet",",","vim","ne","eripui"};
        System.out.println("\nSort 1, array");
        Arrays.sort(words);
        for(String w : words) {
            System.out.println("[" + w + "]");
        }
        System.out.println();

        System.out.println("Sort 2, Collection");
        List<String> list = Arrays.asList(words);
        Collections.sort(list);
        for(String w : list) {
            System.out.println("[" + w + "]");
        }
        System.out.println();

        System.out.println("Sort3, TreeSet");
        Set<String> myTreeSet = new TreeSet<>(list);
        for(String w: myTreeSet) {
            System.out.println("[" + w + "]");
        }
    }

    */

    //3.5.1
    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("in.txt")));
        String[] linii = content.split("\n");

        System.out.println("SPLIT pe linii + \n");
        List<String> rezA = new ArrayList<>();
        for(String l : linii) {
            String modificat = l + "\n";
            rezA.add(modificat);
            System.out.println(modificat);
        }

        String[] propozitii = content.split("\\.");
        System.out.println("Split dupa punct.");
        List<String> rezB = new ArrayList<>();
        for(String p : propozitii) {
            String modificat = p.trim() + ".\n";
            rezB.add(modificat);
            System.out.println(modificat);
        }

        List<String> output = new ArrayList<>();
        output.addAll(rezA);
        output.addAll(rezB);
        Files.write(Paths.get("out.txt"), output);
    }
}