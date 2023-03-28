// Teste do padrão Observer
public class TesteObserver {
    public static void main(String[] args) {
        LojaDeRoupas loja = new LojaDeRoupas();

        Cliente cliente1 = new Cliente("João");
        Cliente cliente2 = new Cliente("Maria");

        loja.adicionarCliente(cliente1);
        loja.adicionarCliente(cliente2);

        loja.setNovaColecaoDisponivel(true);
    }
}