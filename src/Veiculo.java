public class Veiculo {
    protected String modelo;
    protected int ano;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    protected void Ligar() {
        System.out.printf("O veículo %s está ligado.\n", this.modelo);
    }
}
