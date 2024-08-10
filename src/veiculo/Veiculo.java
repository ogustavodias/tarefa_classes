package veiculo;

public abstract class Veiculo {
  protected int ano;
  protected int portas;
  protected int rodas;
  protected Combustivel combustivel;

  public int getAno() {
    return ano;
  }

  public Combustivel getCombustivel() {
    return combustivel;
  }

  public int getRodas() {
    return rodas;
  }

  public int getPortas() {
    return portas;
  }
}