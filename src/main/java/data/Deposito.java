package data;


public class Deposito extends Datos{

    private boolean exec = true;

    @Override
    public void Transaccion(){
        String option = "";
        do{
            System.out.print("Ingrese el monto a depositar: ");
            option = sc.nextLine();
            if(!isNumber(option)){
                System.out.println("Ingrese un monto válido");
            }else {
                exec = false;
            }
        }while (exec);
        deposito = Double.parseDouble(option);
        setSaldo(getSaldo() + deposito);
        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("----Depositó: S/." + deposito);
        System.out.println("---------------------------------");  
    }
}
