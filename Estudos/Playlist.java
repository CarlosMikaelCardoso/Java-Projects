package Estudos;
import java.util.ArrayList;
import java.util.Scanner;

public class Playlist {
    ArrayList<String> favoriteSongs = new ArrayList<>();

    public static void main(String[] args) {
        // Criar uma instância da classe Playlist para acessar os métodos não estáticos
        Playlist playlist = new Playlist();
        playlist.add_musica();
    }

    // Método para adicionar música
    void add_musica() {
        String artist;
        String music;
        String total;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nome do artista?: ");
        artist = scanner.nextLine();
        
        System.out.println("Nome da música?: ");
        music = scanner.nextLine();
        
        total = artist + " - " + music;
        favoriteSongs.add(total); // Adiciona a música à lista
        
        System.out.println("Música adicionada à playlist: " + total);
    }
}
