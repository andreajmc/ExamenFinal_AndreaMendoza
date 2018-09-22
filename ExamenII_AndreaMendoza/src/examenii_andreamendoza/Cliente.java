package examenii_andreamendoza;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class Cliente extends Usuarios {

    private ArrayList<Cuenta> Cuentas;
    private File archive;
    private String path;
    private ArrayList<Logs> Log;

    public Cliente(ArrayList Cuentas, String UN, String PNombre, String SNombre, String PApellido, String SApellido, String PW, String BYear, String AffYear, ArrayList Transacciones) {
        super(UN, PNombre, SNombre, PApellido, SApellido, PW, BYear, AffYear, Transacciones);
        this.Cuentas = Cuentas;
        this.Log = new ArrayList();
    }

    public ArrayList<Cuenta> getCuentas() {
        return Cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> Cuentas) {
        this.Cuentas = Cuentas;
    }

    public void addCuenta(Cuenta c) {
        this.Cuentas.add(c);
    }

    public File getArchive() {
        return archive;
    }

    public void setArchive(File archive) {
        this.archive = archive;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ArrayList<Logs> getLog() {
        return Log;
    }

    public void setLog(ArrayList<Logs> Log) {
        this.Log = Log;
    }

    public void Deposito(Cuenta C, double Dep) {
        double SaldoA = C.getSaldo();
        C.setSaldo(SaldoA + Dep);
        JOptionPane.showMessageDialog(null, "¡Deposito realizado exitósamente!\n Su saldo actual es de HNL." + C.getSaldo());
        Log.add(new Logs(getUN(), "Deposito a cuenta propia de HNL." + Dep, new Date()));
    }
    
    public void DepositoOP(Cuenta C, double Ret) {
        double SaldoA = C.getSaldo();
        if (Ret > SaldoA) {
            JOptionPane.showMessageDialog(null, "No tiene dinero suficiente para realizar el retiro.");
        } else {
            C.setSaldo(SaldoA - Ret);
            JOptionPane.showMessageDialog(null, "¡Retiro realizado exitósamente!\n Su saldo actual es de HNL." + C.getSaldo());
            Log.add(new Logs(getUN(), "Deposito a cuenta ajena de HNL." + Ret, new Date()));
        }
    }
    
    

    public void writeLog() {
        archive = null;
        FileWriter fr = null;
        BufferedWriter bw = null;

        try {
            archive = new File(path);
            fr = new FileWriter(archive);
            bw = new BufferedWriter(fr);
            bw.write("-- TRANSACCIONES --");
            for (Logs log : Log) {
                bw.write((Log.indexOf(log) + 1) + ".- " + log.toString());
                bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
