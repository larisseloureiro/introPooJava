package animais;
/**
 *
 * @author Larisse
 */
public class Reptil extends Animal {
    private String corEscama;

    public Reptil() {
        this.corEscama = "Verde";
        this.idade = 10;
        this.peso = 1.5f;
        this.membros = 4;
    }

    public void status(){
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso + "kg");
        System.out.println("Cor da pele: " + this.corEscama);
        System.out.println("Membros: " + this.membros);
        this.locomover();
        this.alimentar();
        this.emitirSom();
    }
    
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo insetos...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som..");
    }
    
    
    
}
