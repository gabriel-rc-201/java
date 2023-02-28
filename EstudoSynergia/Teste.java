import java.lang.*;
import java.util.*;
import java.util.function.*;

public class Teste {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("michelli", true, "123", 0);
        Cliente c2 = new Cliente("bruno", true, "456", 0);

        c1.autenticaSenha("23465");

        List<Cliente> clientes = Arrays.asList(c1, c2);

        // Consumer<Cliente> consumidor = (Cliente c) -> {
        // System.out.println(c.getNome());
        // };

        // clientes.forEach(c -> System.out.println(c.getNome())); // utilizando
        // expressão lambda () -> {}

        clientes.forEach(Cliente::getNome); // referência ao método

        // como utilizar referência nos métodos de instância
        Cliente c3 = new Cliente("Ana", false, "333", 0);

        Consumer<Cliente> consumidor1 = Cliente::getNome;
        consumidor1.accept(c3);

        Runnable r1 = c3::getNome;
        r1.run();

        Runnable r = () -> System.out.println("Olá Mundo!!");

        new Thread(r).start();
    }
}
