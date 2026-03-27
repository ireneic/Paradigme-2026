import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static <Iterator> void main(String[] args) {
        HashMap<String, Integer> varste = new HashMap<>();
        varste.put("Ioan", 21);
        varste.put("Maria", 22);
        varste.put("Victor", 20);
        varste.put("Simina", 21);
        varste.put("Marius", 23);
        varste.put("Mihai", 21);
        varste.put("Daniela", 20);

        Map<String, String> adrese = Map.of(
                "Ioan", "Sibiu", "Maria",
                "Bucuresti", "Victor", "Cluj",
                "Simina", "Alba-Iulia", "Marius",
                "Medias", "Mihai", "Cisnadie",
                "Daniela", "Sibiu"
        );
        System.out.println("Map varste:");
        for(Map.Entry<String, Integer> entry : varste.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        varste.put("Vlad", 19);
        varste.put("Iulia", 19);

        System.out.println("\nVarste dupa adaugare.");
        for(Map.Entry<String, Integer> entry : varste.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        HashMap<String, Tanar> tineri = new HashMap<>();
        Tanar ioan = new Tanar("Ioan", 21, "Sibiu");
        tineri.put("id1", ioan);

        Tanar maria = new Tanar("Maria", 22, "Bucuresti");
        tineri.put("id2", maria);

        Tanar victor = new Tanar("Victor",20 ,"Cluj");
        tineri.put("id3", victor);

        Tanar simina = new Tanar("Simina", 21, "Alba-Iulia");
        tineri.put("id4", simina);

        Tanar marius = new Tanar("Marius", 23, "Medias");
        tineri.put("id5", marius);

        Tanar mihai = new Tanar("Mihai", 21, "Cisnadie");
        tineri.put("id6", mihai);

        Tanar daniela = new Tanar("Daniela", 20, "Sibiu");
        tineri.put("id7", daniela);

        System.out.println("\nTineri: ");
        for(Map.Entry<String, Tanar> entry : tineri.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}