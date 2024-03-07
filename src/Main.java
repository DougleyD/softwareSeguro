import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int escolha = 1;

        while (escolha != 0){

            System.out.println("Digite o nome da pessoa:");
            String nomePessoa = scanner.nextLine();
            System.out.println("DIgite a idade da pessoa:");
            int idadePessoa = scanner.nextInt();
            scanner.nextLine();

            Pessoa pessoa = new Pessoa(nomePessoa, idadePessoa);

            System.out.println("Digite um título de música:");
            String tituloMusica = scanner.nextLine();
            System.out.println("Qual a duração da música: ");
            String duracaoMusica = scanner.nextLine();
            scanner.nextLine();
            System.out.println("Informe o compositor da música:");
            String compositorMusica = scanner.nextLine();

            Musica musica = new Musica(tituloMusica, duracaoMusica, compositorMusica);

            System.out.println("Informe o gênero do álbum:");
            String generoAlbum = scanner.nextLine();
            System.out.println("Informe o ano do álbum:");
            int anoAlbum = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Informe o nome do álbum:");
            String nomeAlbum = scanner.nextLine();
            System.out.println("Informe o artista do álbum:");
            String artistaAlbum = scanner.nextLine();

            Album album = new Album(generoAlbum, anoAlbum, nomeAlbum, artistaAlbum);
            album.adicionarMusica(musica);
            album.mostraTodosOsDados();

            System.out.println("Digite 0 para sair ou Enter para continuar");
            int escolher = scanner.nextInt();
            scanner.nextLine();

        }
        



        scanner.close();
    }
}
