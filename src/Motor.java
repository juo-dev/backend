public class Motor {
    private int potencia;
    private String tipo;

    public Motor(int potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
    }

    public void Ligar() {
        System.out.printf("Motor %d%s ligado!\n", potencia, tipo);
    }

    public void Desligar() {
        System.out.printf("Motor %d%s desligado!\n", potencia, tipo);
    }
}
