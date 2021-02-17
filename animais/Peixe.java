package animais;
/**
 *
 * @author Larisse
 */
public class Peixe extends Animal {
    private String corEscama;

    public Peixe() {
        this.corEscama = "Amarelo";
        this.idade = 2;
        this.peso = 0.100f;
        this.membros = 0;
    }
    
     public void status(){
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso + " gramas");
        System.out.println("Cor da escama: " + this.corEscama);
        System.out.println("Membros: " + this.membros);
        this.locomover();
        this.alimentar();
        this.emitirSom();
    }
    
    public void soltarBolas(){
        System.out.println("Soltando bolhas..");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando..");   
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo..");    
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som...");
    }
}
