package examenii_andreamendoza;

import java.util.ArrayList;

public class Mantenimiento extends Usuarios {

    ArrayList<ATM> Asignados;

    public Mantenimiento(ArrayList<ATM> Asignados, String UN, String PNombre, String SNombre, String PApellido, String SApellido, String PW, String BYear, String AffYear, ArrayList Transacciones) {
        super(UN, PNombre, SNombre, PApellido, SApellido, PW, BYear, AffYear, Transacciones);
        this.Asignados = Asignados;
    }

    public ArrayList<ATM> getAsignados() {
        return Asignados;
    }

    public void setAsignados(ArrayList<ATM> Asignados) {
        this.Asignados = Asignados;
    }

    public void addATMs(ATM a) {
        this.Asignados.add(a);
    }

    public void addMoney(ATM A, int cant100, int cant500) {
        int cant = cant100 * (100) + cant500 * (500);
        A.setSaldoTotal(A.getSaldoTotal() + cant);
    }

}
