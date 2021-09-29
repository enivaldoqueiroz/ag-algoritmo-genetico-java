package AGDetalhado;

import java.util.Arrays;
import java.util.Collections;

public class AGBasico {

    static int geracoes = 5;

    public static void main(String[] args) {
        Populacao p = new Populacao();
        Cruzamento c = new Cruzamento();
        Mutacao m = new Mutacao();

        for (int y = 0; y < geracoes; y++) {
            Individuo[] i = p.selecao();
            System.out.println("SELECIONADOS-----------");
            i[0].toString();
            i[1].toString();
            System.out.println("-----------------------");
            System.out.println("GERADOS----------------");
            Individuo[] i2 = c.cruzar(i[0], i[1]);
            p.pop.add(i2[0]);
            p.pop.add(i2[1]);
            i2[0].toString();
            i2[1].toString();
            System.out.println("----------------------");
            m.realizarMutacao(p.pop);
        }

        Collections.sort(p.pop);
        Individuo melhor = p.pop.getLast();
        System.out.println(Arrays.toString(melhor.genes) + " f(x): " + melhor.getFitness());
    }

}
