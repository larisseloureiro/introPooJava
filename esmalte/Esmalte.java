package esmalte;
public class Esmalte {
    public static void main(String[] args) {
        ClassEsmalte esmalt = new ClassEsmalte();
        esmalt.cor = "Rosa";
        esmalt.marca = "Vult";
        esmalt.tam = 30;
        esmalt.preco = 3.50f;
        esmalt.tampado = false;
        esmalt.semEsmalte = true;
        esmalt.status();
        esmalt.abrir();
        esmalt.passar();
        
        ClassEsmalte esmaltt = new ClassEsmalte();
        esmaltt.cor = "Azul";
        esmaltt.marca = "Vult";
        esmaltt.tam = 30;
        esmaltt.preco = 3.78f;
        esmaltt.tampado = true;
        esmaltt.semEsmalte = false;
        esmaltt.status();
        esmaltt.abrir();
        esmaltt.passar();
        
        
        
        
    }
    
}
