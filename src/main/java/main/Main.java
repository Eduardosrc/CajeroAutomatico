package main;
import data.Consulta;
import data.Datos;

public class Main {
    public static void main(String[] args) {
        Datos c = new Consulta();
        c.setSaldo(1000);
        
        c.Operacion();
    }
}
