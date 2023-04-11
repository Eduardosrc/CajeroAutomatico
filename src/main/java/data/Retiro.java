package data;


public class Retiro extends Datos{

    private boolean exec = true;

    @Override
    public void Transaccion(){
        String option = "";
        do{
            System.out.println("");
            System.out.print("Ingrese el monto que desea retirar: ");
            option = sc.nextLine();
            if(!isNumber(option)){
                System.out.println("Ingrese un monto válido");
            }else {
                exec = false;
            }
        }while (exec);

        retiro = Double.parseDouble(option);
        
        if(retiro <= getSaldo()){
            setSaldo(getSaldo() - retiro);
            System.out.println("");
            System.out.println("---------------------------------");
            System.out.println("----Retiró: S/." + retiro);
            System.out.println("---------------------------------");
            System.out.println("");
        }else{
            System.out.println("");
            System.out.println("----------------------------------------");
            System.out.println("-El monto ingresado es mayor a su saldo-");
            System.out.println("----------------------------------------");
            System.out.println("");
        }
    }
}
