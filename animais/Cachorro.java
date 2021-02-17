package animais;

/**
 *
 * @author Larisse
 */
public class Cachorro extends Mamifero {

    public Cachorro() {
        this.idade = 3;
        this.peso = 5.5f;
        this.setCorPelo("Branco");
        this.membros = 4;
    }
    
    
    
      @Override
      public void status(){
        System.out.println("==========CACHORRO==========");
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
        System.out.println("AU AU AU ");
    }
}
