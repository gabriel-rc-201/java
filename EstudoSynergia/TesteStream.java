import java.lang.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class TesteStream {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("michelli", true, "123", 5);
        Cliente c2 = new Cliente("Arnaldo", true, "456", 10);
        Cliente c3 = new Cliente("Janaina", true, "789", 20);

        List<Cliente> clientes = Arrays.asList(c1, c2, c3);
        // clientes.forEach(c -> System.out.println(c.getPontos()));

        List<Cliente> stream = clientes.stream().filter(c -> c.getPontos() > 5).collect(Collectors.toList());

        stream.forEach(c -> System.out.println(c.getPontos()));
    }
}
