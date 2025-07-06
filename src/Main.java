import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var carros = new ArrayList<Carro>();
        var motos = new ArrayList<Moto>();
        carros.add(new Carro("Gol", "1.0", 1.0F, 150));
        carros.add(new Carro("Ford Ka", "Zetec Rocam 1.2", 2.0F, 200));
        carros.add(new Carro("Fiat Uno", "Firefly 1.0", 1.6F, 200));

        motos.add(new Moto("Harley Davidson", "Milwaukee-Eight", 1868, 1.5F));
        motos.add(new Moto("Honda Biz", "OHC 4 tempos", 125, 2.5F));



        for (var carro : carros) {
            System.out.println(carro.imprimir());
        }

        for (var moto : motos) {
            System.out.println(moto.imprimir());
        }


    }
}


