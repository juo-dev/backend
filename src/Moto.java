public class Moto extends Veiculo {
    private boolean temBagageiro;

    public Moto(String modelo, int ano) {
        super(modelo, ano);
    }

    protected void Empinar() {
        System.out.printf("A moto %s está empinando!\n", this.modelo);
    }
}
