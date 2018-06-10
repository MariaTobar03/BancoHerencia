
package model;


public class CuentaJoven extends Banco{
    private double Saldo;

    public CuentaJoven() {
    }

    public CuentaJoven(int NumCuenta, String Nombre, String Apellido) {
        super(NumCuenta, Nombre, Apellido);
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
    
    
    
}
