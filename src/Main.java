import models.Banco;
import models.Cliente;
import models.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente(new Cliente("Gabriel", "001.002.003-04"));
        ContaCorrente cc2 = new ContaCorrente(new Cliente("Amelie", "001.002.003-04"));

        Banco banco = new Banco("Banco Babiel");

        banco.adicionarConta(cc1, cc2);
        banco.buscarConta("0002").imprimirExtrato();
    }
}