// Classe observadora
class Cliente implements Observer {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(LojaDeRoupas lojaDeRoupas) {
        if (lojaDeRoupas.isNovaColecaoDisponivel()) {
            System.out.println("Olá " + nome + ", a nova coleção de roupas já está disponível na loja!");
        } else {
            System.out.println("Olá " + nome + ", ainda não temos novidades na loja.");
        }
    }
}