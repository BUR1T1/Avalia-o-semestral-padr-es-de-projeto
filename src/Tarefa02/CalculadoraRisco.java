package Tarefa02;

public class CalculadoraRisco {

    private EstrategiaRisco estrategia;

    public void setEstrategia(EstrategiaRisco estrategia) {
        this.estrategia = estrategia;
    }

    public double calcular(double patrimonio, double rendaMensal, int idade) {
        return estrategia.calcular(patrimonio, rendaMensal, idade);
    }

}
