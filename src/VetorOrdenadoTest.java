public class VetorOrdenadoTest {
    public static void main(String[] args) {
        VetorOrdenado vetor = new VetorOrdenado(7);

        // Inserção (Note que o vetor se manterá em ordem alfabética)
        vetor.inserir("J");
        vetor.inserir("U");
        vetor.inserir("L");
        vetor.inserir("I");
        vetor.inserir("A");
        vetor.inserir("N");
        vetor.inserir("O");

        System.out.println("--- Vetor após inserções ---");
        vetor.imprime();

        System.out.println("\n--- Pesquisas Lineares ---");
        System.out.println("Posição de 'J': " + vetor.pesquisaLinear("J"));
        System.out.println("Posição de 'L': " + vetor.pesquisaLinear("L"));
        System.out.println("Posição de 'N': " + vetor.pesquisaLinear("N"));

        System.out.println("\n--- Excluindo 'J', 'L' e 'N' ---");
        vetor.excluir("J");
        vetor.excluir("L");
        vetor.excluir("N");

        System.out.println("\n--- Vetor Final ---");
        vetor.imprime();
    }
}