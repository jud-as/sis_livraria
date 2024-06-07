import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Editora> arrayEditoras;
    static ArrayList<Livro> estoqueLivros;



    public static void main(String[] args) {
        arrayEditoras = new ArrayList<Editora>();
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
                //adicionarLivros();
                break;
            case 2:
                //removerLivros();
                break;
            case 3:
                //consultarEstoque();
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



    public static void listarEditoras() {
        System.out.println("Editoras: ");
        for (Editora e : arrayEditoras) {
            System.out.println(e);
        }
    }
}