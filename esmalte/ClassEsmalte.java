package esmalte;
public class ClassEsmalte {
    String marca;
    String cor;
    float preco;
    int tam;
    boolean tampado;
    boolean semEsmalte;
    
    
    void status(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Preço: " + this.preco);
        System.out.println("Tamanho em ml: " + this.tam);
        System.out.println("Tampado: " + this.tampado);
        System.out.println("Sem esmalte: " + this.semEsmalte);
    }
    
    void abrir(){
        if(this.tampado == true) {
            System.out.println("O esmalte econtra-se tamapado");
        } else {
            System.out.println("O esmalte encontra-se aberto!");
        }
    }
    void passar(){
        if(this.semEsmalte == true) {
            System.out.println("Pode passar!");
        } else {
            System.out.println("Você já está com esmalte!");
        }
    }
    
    
}
