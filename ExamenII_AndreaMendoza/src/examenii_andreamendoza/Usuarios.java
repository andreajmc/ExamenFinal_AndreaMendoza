package examenii_andreamendoza;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuarios implements Serializable {
protected String UN;    
protected String PNombre;   
protected String SNombre;   
protected String PApellido;   
protected String SApellido;  
protected String PW;  
protected String BYear;  
protected String AffYear;  
private ArrayList <Transaccion> Transacciones; 

    public Usuarios(String UN, String PNombre, String SNombre, String PApellido, String SApellido, String PW, String BYear, String AffYear, ArrayList <Transaccion> Transacciones) {
        this.UN = UN;
        this.PNombre = PNombre;
        this.SNombre = SNombre;
        this.PApellido = PApellido;
        this.SApellido = SApellido;
        this.PW = PW;
        this.BYear = BYear;
        this.AffYear = AffYear;
        this.Transacciones = Transacciones;
    }

    public String getUN() {
        return UN;
    }

    public void setUN(String UN) {
        this.UN = UN;
    }

    public String getPNombre() {
        return PNombre;
    }

    public void setPNombre(String PNombre) {
        this.PNombre = PNombre;
    }

    public String getSNombre() {
        return SNombre;
    }

    public void setSNombre(String SNombre) {
        this.SNombre = SNombre;
    }

    public String getPApellido() {
        return PApellido;
    }

    public void setPApellido(String PApellido) {
        this.PApellido = PApellido;
    }

    public String getSApellido() {
        return SApellido;
    }

    public void setSApellido(String SApellido) {
        this.SApellido = SApellido;
    }

    public String getPW() {
        return PW;
    }

    public void setPW(String PW) {
        this.PW = PW;
    }

    public String getBYear() {
        return BYear;
    }

    public void setBYear(String BYear) {
        this.BYear = BYear;
    }

    public String getAffYear() {
        return AffYear;
    }

    public void setAffYear(String AffYear) {
        this.AffYear = AffYear;
    }

    public ArrayList getTransacciones() {
        return Transacciones;
    }

    public void setTransacciones(ArrayList Transacciones) {
        this.Transacciones = Transacciones;
    }

    @Override
    public String toString() {
        return PNombre + " " + SNombre + " " + PApellido + " " + SApellido;
    }
    
    

}
