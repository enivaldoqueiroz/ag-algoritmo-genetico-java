package AGDetalhado;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Mutacao {

    public void realizarMutacao(List<Individuo> pop) {
        int chance = 2;
        
        System.out.println("MUTACAO----------------");
        for (Individuo individuo : pop) {
            int num = ThreadLocalRandom.current().nextInt(100);
            if (num < chance) {
                System.out.print("ANTES: ");
                individuo.toString();
                int i = ThreadLocalRandom.current().nextInt(individuo.genes.length);
                individuo.genes[i] = individuo.genes[i] == 1 ? 0 : 1;
                System.out.print("DEPOIS: ");
                individuo.toString();
            }
        }
        System.out.println("-----------------------");
    }
}
