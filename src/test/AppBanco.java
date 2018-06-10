
package test;

import java.util.ArrayList;
import java.util.List;
import model.Banco;
import model.CuentaAhorro;
import model.CuentaCorriente;
import model.CuentaJoven;


public class AppBanco {
    public static void main(String[] args) {
        
        CuentaAhorro c1 = new CuentaAhorro(100,"Mafer","Tobar");
        CuentaCorriente c2 = new CuentaCorriente (200, "Majo", "Tobar");
        CuentaJoven c3 = new CuentaJoven (300, "Juliana","Tobar");
        
        List<Banco> listaBanco = new ArrayList<>();
        listaBanco.add(c1);
        listaBanco.add(c2);
        listaBanco.add(c3);
        
        System.out.println(listaBanco);
                
    }
    
}
