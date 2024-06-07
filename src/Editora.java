import java.util.ArrayList;

public class Editora {

    static int contadorEditora = 1;
    int id;
    String nome;
    String email;
    ArrayList<Livro> livros = new ArrayList<Livro>();

    public Editora(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.id = contadorEditora;
        contadorEditora += 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public String toString(){
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("\nLivros: ");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
        return "";
    }



}
