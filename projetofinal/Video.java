package projetofinal;
/**
 *
 * @author Larisse
 */
public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao, views, likes;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.likes = 0;
        this.reproduzindo = false;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova =  (int) ((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    
    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
        System.out.println("Vídeo pausado..");
    }

    @Override
    public void like() {
        this.likes++;
    }
    
    public void status(){
        System.out.println("=============VÍDEO==============");
        System.out.println("Vídeo: " + this.titulo);
        System.out.println("Avaliação: " + this.avaliacao);
        System.out.println("Views: " + this.views);
        System.out.println("Likes: " + this.likes);
        System.out.println("Reproduzindo: " + this.reproduzindo);
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", likes=" + likes + ", reproduzindo=" + reproduzindo + '}';
    }
   
    
    
}
