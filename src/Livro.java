public class Livro {

    static int contadorLivro = 1;
    int id;
    String nome;
    String autor;
    String editora;
    float preco;
    int quantidade;


    public Livro(String nome, String autor, String editora, float preco, int quantidade) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.preco = preco;
        this.quantidade = quantidade;
        this.id = contadorLivro;
        contadorLivro += 1;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String toString() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        return "";
    }
}
