package aula05;
public class ContaBanco {
    //Atributos
   public int numConta;
   protected String tipo;
   private String dono;
   private float saldo;
   private boolean status;

   public void estadoAtual(){
       System.out.println("----------------------------");
       System.out.println("Conta: " + this.getNumConta());
       System.out.println("Tipo: " + this.tipo);
       System.out.println("Dono: " + this.getDono());
       System.out.println("Saldo: " + this.getSaldo());
       System.out.println("Status: " + this.status);
   }
   
   //Métodos();
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if("CC".equals(t)){
            this.setSaldo(50);
    }  else if("CP".equals(t)) {
            this.setSaldo(150); 
        }
        System.out.println("Conta aberta com sucesso!");
        System.out.println("-------------------------");
    }
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta com dinheiro!");
        } else if(this.getSaldo() < 0){
            System.out.println("Conta em débito");
        } else{
            setStatus(false);
            System.out.println("Conta fechado com sucesso!");
            System.out.println("--------------------------");
        }
    }
    public void depositar(float v){
        if(this.isStatus() == true){
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Valor depositado na conta de " + this.getDono() + "!");
            System.out.println("-----------------");
        }else {
            System.out.println("Conta fechada, impossível depositar!");
            System.out.println("------------------------------------");
        }
    }
    public void sacar(float s){
        if(this.isStatus() == true){
            if(this.getSaldo() >= s){
               //this.saldo = this.saldo - s; 
               this.setSaldo(this.getSaldo()- s);
                System.out.println("Saque realizado na conta de " + this.getDono());
                System.out.println("-----------------------------------------------");
            } else {
                System.out.println("Valor insuficiente para sacar, escolha um valor menos!");
                System.out.println("-------------------------------------------------------");
            }   
        } else {
            System.out.println("Conta não está aberta");
            System.out.println("---------------------");
        }
    }
    public void pagarMensal(){
        float p = 0;
        if("CC".equals(getTipo())){
            p = 12f;
        } else if("CP".equals(getTipo())){
            p = 20;
        }
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() - p);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        }else{
            System.out.println("Impossível pagar uma conta fechada!");
        }
    }
    //Métodos especiais
    //Construtor
    public void ContaBanco(float saldo, boolean status) {
        this.saldo = 0;
        this.status = false;
    }
    
    //Getter e setter
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
 
}
