public class Carro2 {
    private String modelo;
    private Motor motor;

    public Carro2(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public void LigarCarro() {
        System.out.printf("Ligando motor do %s...\n", this.modelo);
        this.motor.Ligar();
    }

    public void DesligarCarro() {
        System.out.printf("Desligando motor do %s...\n", this.modelo);
        this.motor.Desligar();
    }
}
