package animais;

/**
 *
 * @author Larisse
 */
public class Lobo extends Mamifero {

    public Lobo() {
        this.idade = 10;
        this.peso = 30.5f;
        this.setCorPelo("Marrom");
        this.membros = 4;
    }
    
    
    
     @Override
      public void status(){
        System.out.println("============LOBO============");
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso + "kg");
        System.out.println("Cor do pelo: " + this.getCorPelo());
        System.out.println("Membros:  " + this.membros);
        this.locomover();
        this.alimentar();
        this.emitirSom();
        System.out.println("=============================");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("AUUU");
    }
}
