import java.util.*;
import java.text.Normalizer;

public class Livro_main {
    public static void main(String[] args) {
        ArrayList<Livro> listaDeLivros = new ArrayList<>();

        listaDeLivros.add(new Livro("Harry Potter e a Criança Amaldiçoada", "J.K. Rowling", 2016, "978-8532530424"));
        listaDeLivros.add(new Livro("Dead Space: Martyr", "B. K. Evenson", 2010, "9780765324931"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lista de livros:");
        listarLivros(listaDeLivros);

        // Exemplo de busca
        System.out.print("Digite o título do livro que você deseja buscar: ");
        String tituloBuscado = scanner.nextLine();
        buscarLivroPorTitulo(listaDeLivros, tituloBuscado);
        
        // Exemplo de busca pelo ISBN
        System.out.print("Digite o ISBN do livro que você deseja buscar: ");
        String isbnBuscado = scanner.nextLine();
        buscarLivroPorIsbn(listaDeLivros, isbnBuscado);
        
        // Remover livro pelo ISBN
        System.out.print("Digite o ISBN do livro que você deseja remover: ");
        String isbnRemover = scanner.nextLine();
        removerLivroPorIsbn(listaDeLivros, isbnRemover);

        // Exibir lista atualizada de livros
        System.out.println("Lista de livros atualizada:");
        for (Livro livro : listaDeLivros) {
            System.out.println(livro);
        }
        scanner.close();
    }
    public static void listarLivros(ArrayList<Livro> listaDeLivros) {
        if (listaDeLivros.isEmpty()) {
            System.out.println("A lista de livros está vazia.");
        } else {
            for (Livro livro : listaDeLivros) {
                System.out.println(livro);
            }
        }
    }

    public static void buscarLivroPorTitulo(ArrayList<Livro> listaDeLivros, String titulo) {
        boolean encontrado = false;
        String tituloNormalizado = normalizarTexto(titulo.toLowerCase());
        
        for (Livro livro : listaDeLivros) {
            String tituloLivroNormalizado = normalizarTexto(livro.getTitulo().toLowerCase());
            if (tituloLivroNormalizado.contains(tituloNormalizado)) {
                System.out.println("Livro encontrado: " + livro);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum livro encontrado com o título: " + titulo);
        }
    }

    public static void buscarLivroPorIsbn(ArrayList<Livro> listaDeLivros, String isbn) {
        boolean encontrado = false;
        
        for (Livro livro : listaDeLivros) {
            if (livro.getIsbn().equals(isbn)) {
                System.out.println("Livro encontrado: " + livro);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum livro encontrado com o ISBN: " + isbn);
        }
    }

    public static void removerLivroPorIsbn(ArrayList<Livro> listaDeLivros, String isbn) {
        Iterator<Livro> iterator = listaDeLivros.iterator();
        boolean encontrado = false;

        while (iterator.hasNext()) {
            Livro livro = iterator.next();
            if (livro.getIsbn().equals(isbn)) {
                iterator.remove();
                System.out.println("Livro removido: " + livro);
                encontrado = true;
                break; // Para evitar continuar a busca após encontrar
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum livro encontrado para remover com o ISBN: " + isbn);
        }
    }

    public static String normalizarTexto(String texto) {
        return Normalizer.normalize(texto, Normalizer.Form.NFD)
                         .replaceAll("[^\\p{ASCII}]", "");
    }
}
