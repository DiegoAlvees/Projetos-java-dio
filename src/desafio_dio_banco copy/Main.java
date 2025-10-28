public class Main {
    public static void main(String[] args) {
        Cliente diego = new Cliente("Diego");

        Conta cc = new ContaCorrente(diego);
        cc.depositar(100);

        Conta cp = new ContaPoupanca(diego);

        cc.transferir(cp, 100);

       cp.imprimirExtrato();
       cc.imprimirExtrato();
    }
}
