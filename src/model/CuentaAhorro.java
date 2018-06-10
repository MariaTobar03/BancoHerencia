
package model;

public class CuentaAhorro extends Banco {
    
    private double Saldo;
    private double Interes;

    public CuentaAhorro() {
    }

    public CuentaAhorro(int NumCuenta, String Nombre, String Apellido) {
        super(NumCuenta, Nombre, Apellido);
      
    }

   
    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public double getInteres() {
        return Interes;
    }

    public void setInteres(double Interes) {
        this.Interes = Interes;
    }
    
    
    
    
    
}
