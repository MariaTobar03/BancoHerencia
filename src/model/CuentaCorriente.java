
package model;


public class CuentaCorriente extends Banco{
    
    private double Saldo;
    
    

    public CuentaCorriente() {
    }

    public CuentaCorriente(int NumCuenta, String Nombre, String Apellido) {
        super(NumCuenta, Nombre, Apellido);
        
        
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
    

    
    
}
