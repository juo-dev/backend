public class VeiculoTest {
    public static void main(String[] args) {
        Carro carro = new Carro("fusca", 67);
        Moto moto = new Moto("CG", 98);

        carro.Ligar();
        moto.Ligar();

        carro.AbrirPortas(4);
        moto.Empinar();
    }
}
