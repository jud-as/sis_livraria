import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Editora> arrayEditoras;
    static ArrayList<Livro> estoqueLivros;



    public static void main(String[] args) {
        arrayEditoras = new ArrayList<Editora>();
        estoqueLivros = new ArrayList<Livro>();
        cadastrarEditora();
        operacoes();
    }


    public static void operacoes() {

        System.out.println("----------------------------------");
        System.out.println("------SELECIONE UMA OPERAÇÃO------\n");
        System.out.println("|    1 - Adicionar Livros      |");
        System.out.println("|    2 - Remover Livros        |");
        System.out.println("|    3 - Consultar Estoque     |");
        System.out.println("|    4 - Listar Editoras       |");
        System.out.println("|    5 - Sair                  |");

        int opc = input.nextInt();
        switch (opc){
                case 1:
                adicionarLivros();
                break;
            case 2:
                removerLivros();
                break;
            case 3:
                consultarEstoque();
                break;
            case 4:
                listarEditoras();
                break;
            case 5:
                System.out.println("Encerrando programa.");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida.");
                operacoes();
                break;
             }

    }

    public static void cadastrarEditora() {
        // Instanciando Editoras e seus Catálogos:
        Editora editoraA = new Editora("Editora A", "editoraA@gmail.com");
        editoraA.livros.add(new Livro("Crime e Castigo", "Dostoiéviski", editoraA.getNome(), 50.0f, 100));
        editoraA.livros.add(new Livro("Razão e Sensibilidade", "Jane Austen", editoraA.getNome(), 60.0f, 100));
        editoraA.livros.add(new Livro("Livro De Receitas Piratas: East Blue", "Sanji", editoraA.getNome(), 90.0f, 100));

        Editora editoraB = new Editora("Editora B", "editoraB@gmail.com");
        editoraB.livros.add(new Livro("O Senhor dos Anéis", "J. R. R. Tolkien", editoraB.getNome(), 100.0f, 100));
        editoraB.livros.add(new Livro("Realismo Capitalista", "Mark Fisher", editoraB.getNome(), 25.0f, 100));
        editoraB.livros.add(new Livro("O Capital", "Karl Marx", editoraB.getNome(), 30.0f, 100));

        arrayEditoras.add(editoraA);
        arrayEditoras.add(editoraB);
    }

    public static void adicionarLivros() {
        System.out.println("ID do livro: ");
        int opc = input.nextInt();
        Livro livro = null;
        Livro livroAux;
        for (Editora e : arrayEditoras) {
            for (Livro l : e.livros) {
                if (l.getId() == opc) {
                    livro = l;
                }
            }
        }
        if (livro != null) {
            System.out.println("Quantidade: ");
            int quantidade = input.nextInt();
            livroAux = livro;
            livroAux.setQuantidade(quantidade);
            estoqueLivros.add(livroAux);
            System.out.println("Livro adicionado com sucesso.");
        }else{
            System.out.println("Livro não encontrado.");
        }
        operacoes();
    }

    public static void removerLivros() {
        if(!estoqueLivros.isEmpty()) {
            System.out.println("ID do livro: ");
            int opc = input.nextInt();
            Livro livro = buscarLivro(opc, estoqueLivros);
            if (livro != null) {
                System.out.println("Quantidade: ");
                int quantidade = input.nextInt();
                if (quantidade <= livro.getQuantidade()) {
                    livro.setQuantidade(livro.getQuantidade() - quantidade);
                    System.out.println("Livro removido com sucesso.");
                } else {
                    System.out.println("Quantidade indisponível.");
                }
            }
        }
        operacoes();
    }

    public static void consultarEstoque() {
        if (!estoqueLivros.isEmpty()) {
            for (Livro l : estoqueLivros) {
                System.out.println(l);
            }
        }else{
            System.out.println("Estoque vazio. Adicione livros.");
        }
        operacoes();
    }

    public static Livro buscarLivro(int id, ArrayList<Livro> listaLivros) {
        Livro livro = null;
        if (!listaLivros.isEmpty()) {
            for (Livro l : listaLivros) {
                if (l.getId() == id) {
                    livro = l;
                }
            }
        }else{
            System.out.println("Estoque vazio. Adicione livros.");
        }

        return livro;
    }

    public static void listarEditoras() {
        System.out.println("Editoras: ");
        for (Editora e : arrayEditoras) {
            System.out.println(e);
        }
        operacoes();
    }
}