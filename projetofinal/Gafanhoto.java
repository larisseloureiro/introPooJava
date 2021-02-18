package projetofinal;
/**
 *
 * @author Larisse
 */
public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;
    
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public void status(){
        System.out.println("===========Gafanhoto============");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Login: " + this.login);
        System.out.println("Assistindo? " + this.totAssistido);
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() +  "\nlogin=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
    
}
