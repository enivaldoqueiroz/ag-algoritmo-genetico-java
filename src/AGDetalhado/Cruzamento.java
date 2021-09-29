package AGDetalhado;

public class Cruzamento {
    
    public Cruzamento() {
    }
    
    public Individuo[] cruzar(Individuo i1, Individuo i2){
        Individuo[] filhos = new Individuo[2];
        filhos[0] = new Individuo();
        filhos[1] = new Individuo();
        
        int pontoDeCorte = i1.genes.length/2;
        
        int[] fgenes1 = new int[i1.genes.length];
        int[] fgenes2 = new int[i2.genes.length];
        
        for (int i = 0; i < fgenes2.length; i++) {
            if(i < pontoDeCorte){
                fgenes1[i] = i1.genes[i];
                fgenes2[i] = i2.genes[i];
            } else {
                fgenes1[i] = i2.genes[i];
                fgenes2[i] = i1.genes[i];
            }
        }
        
        filhos[0].genes = fgenes1;
        filhos[1].genes = fgenes2;
        
        return filhos;
    }
}
