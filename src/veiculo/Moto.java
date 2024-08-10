package veiculo;

/**
 * <p>
 * Veiculo de passeio de 2 rodas.
 * </p>
 * 
 * Subclasse de {@link Veiculo}
 * 
 * 
 */

public class Moto extends Veiculo {

  public Moto(int ano, Combustivel combustivel) {
    this.ano = ano;
    this.portas = 0;
    this.combustivel = combustivel;
    this.rodas = 2;
  }

  @Override
  public String toString() {
    return "Ano: " + this.ano + " Rodas: " + this.rodas + " Combustivel: " + this.combustivel;
  }

}
