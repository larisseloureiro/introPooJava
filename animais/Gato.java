package animais;

/**
 *
 * @author Larisse
 */
public class Gato extends Mamifero {

    public Gato() {
        this.idade = 1;
        this.peso = 1f;
        this.setCorPelo("Preto");
        this.membros = 4;
    }
    
    
    
     @Override
      public void status(){
        System.out.println("============GATO=============");
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
        System.out.println("MIAUUU MIAUUU s2");    
    }
}
