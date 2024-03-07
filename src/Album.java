import java.util.ArrayList;

public class Album {
    private String genero;
    private int ano;
    private String nome;
    private String artista;
    private ArrayList<Musica> musicas;

    public Album(String genero, int ano, String nome, String artista) {
        this.genero = genero;
        this.ano = ano;
        this.nome = nome;
        this.artista = artista;
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public void mostraTodosOsDados() {
        System.out.println("Álbum: " + nome + ", Artista: " + artista + ", Gênero: " + genero + ", Ano: " + ano);
        for (Musica musica : musicas) {
            musica.tocarMusica();
        }
    }
}
