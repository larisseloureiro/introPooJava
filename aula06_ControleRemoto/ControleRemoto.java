package aula06;
public class ControleRemoto implements Controlador {
    private int volume;
    private int canal;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.canal = 5;
        this.ligado = true;
        this.tocando = false;
        
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }
    private int getCanal() {
        return canal;
    }

    private void setCanal(int canal) {
        this.canal = canal;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //Métodos abstratos do encapsulamento
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("----MENU----");
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Canal: " + this.getCanal());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.print("Volume: " + this.getVolume());
        for( int i = 0; i <= this.getVolume(); i+=10 ){
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if(this.isLigado()) {
            if(this.getVolume() > 0){
                this.setVolume(this.getVolume() + 5);
            }
        } else {
            System.out.println("Impossível aumentar volume, aparelho encontra-se desligado!");
        }
        
    }

    @Override
    public void menosVolume() {
        if(this.isLigado() == true){
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossível diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() == true && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() == true && this.getVolume() == 0){
        this.setVolume(50);
    }
    }

    @Override
    public void play() {
        if(this.isLigado() == true && !(this.isTocando())){
            this.setTocando(true);
        } else{
            System.out.println("Não consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() == true && this.isTocando()){
           this.setTocando(false);
        } else{
            System.out.println("Não consegui pausar!");
        }
    }

    @Override
    public void mudarCanal() {
        if(this.isLigado() == true){
            if(this.getCanal() >= 5){
                this.setCanal(this.getCanal() + 5);
            }
            
        }
    }

    @Override
    public void voltarCanal() {
        if(this.isLigado() == true){
            this.setCanal(this.getCanal() - 5);
        }
    }
    
    
    
}
