package animais;

/**
 *
 * @author Larisse
 */
public class Mamifero extends Animal {
    private String corPelo;

    public Mamifero() {
        this.corPelo = "Caramelo";
        this.idade = 1;
        this.peso = 3.5f;
        this.membros = 4;
    }
    
    
     public void status(){
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso + "kg");
        System.out.println("Cor do pelo: " + this.corPelo);
        System.out.println("Membros:  " + this.membros);
        this.locomover();
        this.alimentar();
        this.emitirSom();
    }
    
    
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
    
    @Override
    public void locomover() {
        System.out.println("Andando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo..."); 
   }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som...");    }
    
   
}
