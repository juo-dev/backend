public class Carro extends Veiculo {
    private int portas;

    public Carro(String modelo, int ano) {
        super(modelo, ano);
    }

    protected void AbrirPortas(int portas) {
        System.out.printf("Abrindo %d portas do carro %s.\n", portas, this.modelo);
    }
}
