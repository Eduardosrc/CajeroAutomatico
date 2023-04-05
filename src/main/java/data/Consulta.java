package data;


public class Consulta extends Datos{

    @Override
    public void Transaccion(){
        System.out.println("");
        System.out.println("----------------------------------");
        System.out.println("----Su saldo actual es de: S/."+ getSaldo());
        System.out.println("----------------------------------");
        System.out.println("");
    }
}
