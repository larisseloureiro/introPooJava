package animais;
/**
 *
 * @author Larisse
 */
public class Ave extends Animal {
    private String corPena;

    public Ave() {
        this.corPena = "Azul";
        this.idade = 5;
        this.peso = 0.200f;
        this.membros = 2;
    }
    public void status(){
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso + " gramas");
        System.out.println("Cor da pena: " + this.corPena);
        System.out.println("Membros:  " + this.membros);
        this.locomover();
        this.alimentar();
        this.emitirSom();
    }
    
    public void fazerNinho(){
        System.out.println("Fazendo ninho...");
    }

    @Override
    public void locomover() {
        System.out.println("Voando...");    }

    @Override
    public void alimentar() {
        System.out.println("Comendo..");    }

    @Override
    public void emitirSom() {
        System.out.println("Piando...");    }
    
}
