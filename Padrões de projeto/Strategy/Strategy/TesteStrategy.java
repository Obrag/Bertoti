// Teste do padrão Strategy
public class TesteStrategy {
    public static void main(String[] args) {
        Compra compraFeminina = new Compra(100.0);
        compraFeminina.setCalculadoraPreco(new CalculadoraPrecoFeminina());
        double precoTotalFeminino = compraFeminina.calcularPrecoTotal();
        System.out.println("Preço total da compra feminina: " + precoTotalFeminino);

        Compra compraMasculina = new Compra(100.0);
        compraMasculina.setCalculadoraPreco(new CalculadoraPrecoMasculina());
        double precoTotalMasculino = compraMasculina.calcularPrecoTotal();
        System.out.println("Preço total da compra masculina: " + precoTotalMasculino);
    }
}