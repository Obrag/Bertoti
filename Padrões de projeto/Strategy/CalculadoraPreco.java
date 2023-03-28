interface CalculadoraPreco {
    double calcularPreco(double preco);
}

// Implementação da calculadora de preço para mulheres
class CalculadoraPrecoFeminina implements CalculadoraPreco {
    @Override
    public double calcularPreco(double preco) {
        return preco * 1.2;
    }
}

// Implementação da calculadora de preço para homens
class CalculadoraPrecoMasculina implements CalculadoraPreco {
    @Override
    public double calcularPreco(double preco) {
        return preco * 1.1;
    }
}