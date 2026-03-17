public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto("Teclado", 100.0);
        Produto produto3 = new Produto("Teclado", 50.0, 10);

        produto1.exibirInfo();
        produto2.exibirInfo();
        produto3.exibirInfo();
    }
}
