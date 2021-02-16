package testeaula04;
public class Esmalte {
    public String marca;
    public String cor;
    private float preco;
    private int tam;
    protected boolean fechado;

    public Esmalte(String marca, String cor, float preco, int tam, boolean fechado) {
        this.marca = marca;
        this.cor = cor;
        this.preco = preco;
        this.tam = tam;
        this.fechado = fechado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public boolean isFechado() {
        return fechado;
    }

    public void setFechado(boolean fechado) {
        this.fechado = fechado;
    }
    public void status(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Cor: " + getCor());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Tamanho: " + getTam() + " ml");
        System.out.println("Está fechado? " + isFechado());
    }

    
    
    
}
