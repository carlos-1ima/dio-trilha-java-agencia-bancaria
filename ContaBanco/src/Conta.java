public class Conta {

    int numero;
    String agencia;
    String cliente;
    double saldo;

    public int getConta() {
        return this.numero;
    }

    public void setConta(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return " " + this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getCliente() {
        return this.cliente;
    }

    public void setCliente(String nome) {
        this.cliente = nome;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        return "Olá " + getCliente() + ", obrigado por criar uma conta em nosso banco,"
        + " sua agência é" + getAgencia() + ", conta " + getConta() + " e seu saldo " + getSaldo()
        + " já está disponível para saque!";
    }
}