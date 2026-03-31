import java.util.Objects;

public class Student {
    Integer numarMatricol;
    String prenume;
    String nume;
    Double nota;
    String formatieDeStudiu;

    public Student(Integer numarMatricol, String prenume, String nume, String formatieDeStudiu) {
        this.numarMatricol = numarMatricol;
        this.prenume = prenume;
        this.nume = nume;
        this.formatieDeStudiu = formatieDeStudiu;
    }

    public Integer getNumarMatricol() {
        return numarMatricol;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getNume() {
        return nume;
    }

    public String getFormatieDeStudiu() {
        return formatieDeStudiu;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Student{" +
                "numarMatricol=" + numarMatricol +
                ", prenume='" + prenume + '\'' +
                ", nume='" + nume + '\'' +
                ", nota='" + nota +
                ", formatieDeStudiu='" + formatieDeStudiu + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if( o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(numarMatricol, student.numarMatricol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numarMatricol);
    }
}
