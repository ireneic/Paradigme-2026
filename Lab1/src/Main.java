import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    /*
    public static boolean existaStudentInLista(List<Student> lista, Integer numarMatricol, String prenume, String nume, String formatieDeStudiu) {
        for (Student s : lista)
            if (s.getNumarMatricol().equals(numarMatricol) &&
                    s.getPrenume().equals(prenume) &&
                    s.getNume().equals(nume) &&
                    s.getFormatieDeStudiu().equals(formatieDeStudiu)) {
                return true;
            }
        return false;
    }

     */
    /*
    public static List<Student> citireFisier(String cale) throws IOException {
        List<Student> studentiCititi = new ArrayList<>();
        Path path = Paths.get(cale);

        try {
            List<String> linii = Files.readAllLines(path);

            for(String l : linii) {
                if (l.trim().isEmpty()) continue;
                String[] parts = l.split(",");
                if(parts.length == 4) {
                    Integer numarMatricol = Integer.parseInt(parts[0].trim());
                    String prenume = parts[1].trim();
                    String nume = parts[2].trim();
                    String formatieDeStudiu = parts[3].trim();

                    studentiCititi.add(new Student(numarMatricol, prenume, nume, formatieDeStudiu));
                }
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        return studentiCititi;
    }

     */
    public static double gasesteNota(String prenume, String nume, Map<String, Student> notaStudent ){
        String key = prenume + "-" + nume;
        if (notaStudent.containsKey(key)) {
            return notaStudent.get(key).getNota();
        }

        return 0.0;

    }
    public static void main(String[] args) throws IOException {
        /*
        Student student = new Student(10, "Andreea", "Costeiu", "Calculatoare");
        System.out.println(student);

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(101, "Andrei", "Oancea", "C31/2"));
        studentList.add(new Student(105, "Patricia", "Buta", "ISM32/1"));
        studentList.add(new Student(120, "Alis", "Popa", "TI21/1"));

        for(Student s: studentList){
            System.out.println(s);
        }

         */

        /*
        boolean existaAlis = existaStudentInLista(studentList, 120, "Alis", "Popa", "TI21/1");
        //System.out.println("Exista in lista studenta Alis?" + existaAlis);
        if (existaAlis) {System.out.println("Studenta Alis a fost gasita in lista.");}
        else{System.out.println("Studenta Alis nu se afla in lista studentilor.");}

         */

        /*boolean existaMaria = existaStudentInLista(studentList, 112, "Maria", "Popa", "TI21/1");
        //System.out.println("Exista Maria?" + existaMaria);
        if (existaMaria) {
            System.out.println("Studenta Maria se gaseste in lista.");
        }
        else{
            System.out.println("Maria nu se afla in lista studentilor.");
        }

        Set<Student> studentSet = new HashSet<>(studentList);
        Student studentCautat = new Student(120, "", "", "");

        if(studentSet.contains(studentCautat)){
            System.out.println("Studentul cu numarul matricol 120 exista.");
        }
        else{
            System.out.println("Studentul cu numarul matricol 120 nu exista.");
        }
        */

        /* System.out.println("\n____LAB 3 - 3.5.2____");
        try {
            List<Student> studentiFisier = citireFisier("studenti_in.txt");
            for(Student s : studentiFisier){
                System.out.println(s);
            }
            studentiFisier.sort(Comparator.comparing(Student::getNume));
            List<String> liniiScriere = new ArrayList<>();
            for(Student s : studentiFisier){
                liniiScriere.add(s.getNumarMatricol() + "," + s.getPrenume() + "," + s.getNume() + "," + s.getFormatieDeStudiu());

            }
            Files.write(Paths.get("studenti_out.txt"), liniiScriere);
            System.out.println("\nLista sortata a fost salvata in studenti_out.txt");

            System.out.println("\n ____3.5.3____");
            studentiFisier.sort(Comparator.comparing(Student::getFormatieDeStudiu).thenComparing(Student::getNume));
            List<String> liniiScriere2 = new ArrayList<>();
            for(Student s : studentiFisier) {
                liniiScriere2.add(s.getNumarMatricol() + "," + s.getPrenume() + "," + s.getNume() + "," + s.getFormatieDeStudiu());
            }
            Files.write(Paths.get("studenti_out_sorted.txt"), liniiScriere2);
            System.out.println("Lista sortata dupa formatie si nume a fost salvata in studenti_out_sorted.txt\n");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        */

        System.out.println("-------Laborator 4 - 4.5.2--------");
        Path path = Paths.get("studenti_in.txt");
        Map<Integer, Student> studentMap = new HashMap<>();

        for(String line : Files.readAllLines(path)){
            String[] parts = line.split(",");
            int numarMatricol = Integer.parseInt(parts[0].trim());
            String prenume = parts[1].trim();
            String nume = parts[2].trim();
            String formatieDeStudiu = parts[3].trim();

            Student s = new Student(numarMatricol, prenume, nume, formatieDeStudiu);
            studentMap.put(numarMatricol, s);
        }

        Path pathNote = Paths.get("note_anon.txt");
        for (String line : Files.readAllLines(pathNote)) {
            String[] parts = line.split(",");
            int numarMatricol = Integer.parseInt(parts[0].trim());
            double nota = Double.parseDouble(parts[1].trim());

            Student s = studentMap.get(numarMatricol);
            if (s != null) {
                s.setNota(nota);
            }
        }
        for (Student s : studentMap.values()) {
            System.out.println(s);
        }
        Map<String, Student> notaStudent = new HashMap<>();
        for (Student s : studentMap.values()) {
            String key = s.getPrenume() + "-" + s.getNume();
            notaStudent.put(key, s);
        }
        double notaM = gasesteNota("Bianca", "Popescu", notaStudent);
        double notaN = gasesteNota("Ioan", "Popa", notaStudent);
        System.out.println("\nTema - 4.5.3\n");
        System.out.println("Prima nota returnata:" + notaM);
        System.out.println("A doua nota returnata: " +notaN);

    }
}