package projetofinal;
/**
 *
 * @author Larisse
 */
public class ProjetoFinal {
    public static void main(String[] args) {
        // TODO code application logic here
        Video v[] = new Video[4];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 2 de POO");
        v[2] = new Video("Aula 3 de POO");
        v[3] = new Video("Projeto final - YouTube");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Lari", 22, "F", "larisse");
        g[1] = new Gafanhoto("Teste", 12, "M", "testando");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0],v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(g[0],v[1]);
        vis[0].avaliar(87.0f);
        System.out.println(vis[0].toString());
       /* g[0].status();
        g[1].status();
        
        v[0].status();
        v[1].status();
        v[2].status();
        */
    }
    
}
