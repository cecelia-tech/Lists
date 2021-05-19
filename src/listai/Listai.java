package listai;

import java.util.ArrayList;
import java.util.List;

public class Listai {

    /*
sukurti metoda, kuris uzpildys duota lista nurodytu kiekiu elementu Math.random()       X

 

void fill(List l, int count);       X

 

sukurti metoda, kuris paskaiciuotu liste esanciu elementu vidurki
double fill(List l);

 

sukurti metoda, kuris surastu didziausia elementa
double max(List l);

 

sukurti metoda, kuris surastu maziausia elementa
double min(List l);
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<Double> l = new ArrayList<Double>();
        fill(l, 5);
        average(l);
        max(l);
        min(l);
    }

//    
    public static void fill(List<Double> l, int count) {
        for (int i = 0; i <= count; i++) {
            l.add(Math.random() * 10 + 1);
        }
        System.out.println(l);
    }

    public static double average(List<Double> l) {
        double sum = 0;
        for (int i = 0; i < l.size(); i++) {
            sum += l.get(i);

        }
        double av = sum / l.size();
        System.out.println("Average: " + av);
        return av;

    }

    public static double max(List<Double> l) {
        double max = l.get(0);

        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) > max) {
                max = l.get(i);
            }
        }
        System.out.println("Max: " + max);
        return max;
    }

    public static double min(List<Double> l) {
        double min = l.get(0);
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) < min) {
                min = l.get(i);
            }
        }
        System.out.println("Min: " + min);
        return min;
    }
}
