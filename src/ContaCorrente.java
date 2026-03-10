public class ContaCorrente {
    private String titular;
    private String numeroConta;
    private double saldo = 0.0;
    private double limite = 0.0;

    // construtor:
    public ContaCorrente(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return this.limite;
    }

    public void mostrarInfo() {
        System.out.printf("Nome do titular: %s\n", getTitular());
        System.out.printf("Nome do numero conta: %s\n", getNumeroConta());
        System.out.printf("Nome do limite: %s\n", getLimite());
        System.out.printf("Nome do saldo: %s\n", getSaldo());
    }
}
