import java.util.ArrayList;
import java.util.List;

// Classe observável
class LojaDeRoupas {
    private List<Cliente> clientes = new ArrayList<>();
    private boolean novaColecaoDisponivel = false;

    public boolean isNovaColecaoDisponivel() {
        return novaColecaoDisponivel;
    }

    public void setNovaColecaoDisponivel(boolean novaColecaoDisponivel) {
        this.novaColecaoDisponivel = novaColecaoDisponivel;
        if (novaColecaoDisponivel) {
            notificarClientes();
        }
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public void notificarClientes() {
        for (Cliente cliente : clientes) {
            cliente.atualizar(this);
        }
    }
}