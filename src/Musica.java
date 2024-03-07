public class Musica {
    private String titulo;
    private String compositor;
    private String duracao;

    public Musica(String titulo, String duracao, String compositor){

        this.titulo = titulo;
        this.duracao = duracao;
        this.compositor = compositor;
    }

    public void tocarMusica(){

        System.out.println("TOCANDO: "+ titulo + "COMPOSITOR" + compositor);
    }
}
