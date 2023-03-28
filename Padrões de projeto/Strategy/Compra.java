// Classe que utiliza o padrão Strategy
class Compra {
    private double preco;
    private CalculadoraPreco calculadoraPreco;

    public Compra(double preco) {
        this.preco = preco;
    }

    public void setCalculadoraPreco(CalculadoraPreco calculadoraPreco) {
        this.calculadoraPreco = calculadoraPreco;
    }

    public double calcularPrecoTotal() {
        return calculadoraPreco.calcularPreco(preco);
    }
}
