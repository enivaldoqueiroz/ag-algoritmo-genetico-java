package AGDetalhado;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Individuo implements Comparable<Individuo>{

    int[] genes = new int[10];

    public Individuo() {
        for (int i = 0; i < genes.length; i++) {
            genes[i] = ThreadLocalRandom.current().nextInt(2);
        }
    }

    //Aptidão
    public int getFitness() {
        String s = Arrays.toString(genes).replace("[", "")
                .replace("]", "")
                .replace(",", "")
                .replace(" ", "");
        return Integer.parseInt(s, 2);
    }

    @Override
    public String toString() {
        System.out.println(Arrays.toString(genes) + " f(x): " + getFitness());
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    
    @Override
    public int compareTo(Individuo o) {
        if(this.getFitness() < o.getFitness()){
            return -1;
        } else if(this.getFitness() == o.getFitness()) {
            return 0;
        } else {
            return 1;
        }
    }

    
}
