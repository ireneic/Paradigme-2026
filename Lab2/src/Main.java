import java.util.*;

import static java.util.Collections.reverseOrder;
import static java.util.Collections.sort;
public class Main {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        List<Integer> xPlusY = new ArrayList();
        Set<Integer> zSet = new TreeSet();
        List<Integer> xMinusY = new ArrayList();
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList();

        x.add(23);
        x.add(14);
        x.add(2);
        x.add(27);
        x.add(100);
        System.out.println("Lista initiala X: " + x);
        Collections.sort(x);
        System.out.println("Lista X sortata crescator: "+ x);
        Collections.sort(x, reverseOrder());
        System.out.println("Lista X sortata descrescator: "+ x);

        y.add(23);
        y.add(9);
        y.add(12);
        y.add(34);
        y.add(8);
        y.add(100);
        y.add(1);
        System.out.println("Lista Y: "+y);
        Collections.sort(y);
        System.out.println("Lista Y sortata crescator: "+y);
        Collections.sort(y, reverseOrder());
        System.out.println("Lista Y sortata descrescator: "+y);

        xPlusY.addAll(x);
        xPlusY.addAll(y);
        System.out.println("Lista X+Y: "+xPlusY);

        zSet.addAll(x); //adaug toate elem din x
        zSet.retainAll(y); // pastrez doar duplicatele lor din y
        System.out.println("Elemente comune:" + zSet);

        xMinusY.addAll(x);
        xMinusY.removeAll(y);
        System.out.println("Elementele din X care nu se gasesc si in Y: "+xMinusY);

        for(Integer xElem : x){
            if(xElem <= p){
                xPlusYLimitedByP.add(xElem);
            }
        }
        for(Integer yElem : y){
            if(yElem <= p){
                xPlusYLimitedByP.add(yElem);
            }
        }
        System.out.println("Multimea elem. din x+y ce nu depasesc p: "+ xPlusYLimitedByP);
    }
}