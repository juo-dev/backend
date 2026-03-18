public class Veiculo2Test {
    public static void main(String[] args) {
        Motor motor = new Motor(300, "cv");
        Carro2 carro = new Carro2("fusca", motor);

        carro.LigarCarro();
        carro.DesligarCarro();
    }
}
