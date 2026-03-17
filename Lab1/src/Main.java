import java.util.ArrayList;
import java.util.List;

public class Main {
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
    public static void main(String[] args) {
        Student student = new Student(10, "Andreea", "Costeiu", "Calculatoare");
        System.out.println(student);

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(101, "Andrei", "Oancea", "C31/2"));
        studentList.add(new Student(105, "Patricia", "Buta", "ISM32/1"));
        studentList.add(new Student(120, "Alis", "Popa", "TI21/1"));

        for(Student s: studentList){
            System.out.println(s);
        }

        boolean existaAlis = existaStudentInLista(studentList, 120, "Alis", "Popa", "TI21/1");
        //System.out.println("Exista in lista studenta Alis?" + existaAlis);
        if (existaAlis) {System.out.println("Studenta Alis a fost gasita in lista.");}
        else{System.out.println("Studenta Alis nu se afla in lista studentilor.");}


        boolean existaMaria = existaStudentInLista(studentList, 112, "Maria", "Popa", "TI21/1");
        //System.out.println("Exista Maria?" + existaMaria);
        if (existaMaria) {
            System.out.println("Studenta Maria se gaseste in lista.");
        }
        else{
            System.out.println("Maria nu se afla in lista studentilor.");
        }

    }
}