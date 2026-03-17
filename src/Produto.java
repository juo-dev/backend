public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto() {
        this.nome = "Sem nome";
        this.preco = preco;
        this.quantidade = 0;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirInfo() {
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Preco do produto: " + this.preco);
        System.out.println("Quantidade do produto: " + this.quantidade + "\n");
    }
}
