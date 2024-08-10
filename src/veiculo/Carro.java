package veiculo;

/**
 * <p>
 * Veiculo de passeio de 4 rodas.
 * </p>
 * 
 * Subclasse de {@link Veiculo}
 * 
 * 
 */

public class Carro extends Veiculo {

  public Carro(int ano, int portas, Combustivel combustivel) {
    this.ano = ano;
    this.portas = portas;
    this.combustivel = combustivel;
    this.rodas = 4;
  }

  @Override
  public String toString() {
    return "Ano: " + this.ano + " Portas: " + this.portas + " Rodas: " + this.rodas + " Combustivel: "
        + this.combustivel;
  }
}
