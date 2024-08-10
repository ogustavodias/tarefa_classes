import veiculo.Carro;
import veiculo.Combustivel;
import veiculo.Moto;

public class App {
    public static void main(String[] args) throws Exception {
        Carro civic = new Carro(2020, 4, Combustivel.ETANOL);
        Moto kawasaki = new Moto(2023, Combustivel.GASOLINA);
        System.err.println(civic + "\n" + kawasaki);
    }
}
