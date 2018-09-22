package examenii_andreamendoza;

import java.io.Serializable;

public class Cuenta implements Serializable {

private int C_ID;
private double Saldo;
private String ID_UN;

    public Cuenta(int C_ID, double Saldo, String ID_UN) {
        this.C_ID = C_ID;
        this.Saldo = Saldo;
        this.ID_UN = ID_UN;
    }

    public int getC_ID() {
        return C_ID;
    }

    public void setC_ID(int C_ID) {
        this.C_ID = C_ID;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public String getID_UN() {
        return ID_UN;
    }

    public void setID_UN(String ID_UN) {
        this.ID_UN = ID_UN;
    }

    @Override
    public String toString() {
        return "Cuenta #" + C_ID;
    }
    
    


    
}
