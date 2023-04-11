package data;
import java.util.Scanner;

public abstract class Datos {
    Scanner sc = new Scanner(System.in);
    private static double saldo;
    protected double retiro, deposito;
    private int tipo;
    
    public void Operacion(){
        int ejec = 0;
        
        do{
            System.out.println("");
            System.out.println("----------------------------------");
            System.out.println("--¿Qué operación desea realizar?--");
            System.out.println("----1.Consulta--------------------");
            System.out.println("----2.Retiro----------------------");
            System.out.println("----3.Depósito--------------------");
            System.out.println("----4.Salir-----------------------");
            System.out.println("----------------------------------");
            System.out.println("");
            String option = sc.nextLine();
            if(!isNumber(option)){
                tipo = 0;
            }else {
                tipo = Integer.parseInt(option);
            }
            
            if(tipo == 1){
                Datos c = new Consulta();
                c.Transaccion();
            }else if(tipo == 2){
                Datos r = new Retiro();
                Datos c = new Consulta();
                r.Transaccion();
                c.Transaccion();
                
            }else if(tipo == 3){
                Datos c = new Consulta();
                Datos d = new Deposito();
                d.Transaccion();
                c.Transaccion();
            }else if(tipo == 4){
                System.out.println("");
                System.out.println("----------------------------------");
                System.out.println("-----¡Gracias, vuelva pronto!-----");
                System.out.println("----------------------------------");
                System.out.println("");
                ejec = 1;
            }else{
                System.out.println("");
                System.out.println("---------------------------------");
                System.out.println("--------------ERROR--------------");
                System.out.println("----Ingrese una opción válida----");
                System.out.println("----------------------------------");
                System.out.println("");
            }
        }while(ejec == 0);
    }

    public boolean isNumber(String option){
        try {
            Double.parseDouble(option);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public abstract void Transaccion();
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return saldo;
    }
}
