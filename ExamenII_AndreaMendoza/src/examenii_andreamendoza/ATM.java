package examenii_andreamendoza;

import java.io.Serializable;
import java.util.Date;

public class ATM implements Serializable {
private String Location;   
private int ID;   
private int FYear;   
private String Mant;  
private int SaldoTotal;

    public ATM(String Location, int ID, int FYear, String Mant) {
        this.Location = Location;
        this.ID = ID;
        this.FYear = FYear;
        this.Mant = Mant;
        this.SaldoTotal = 0;
    }

    public int getSaldoTotal() {
        return SaldoTotal;
    }

    public void setSaldoTotal(int SaldoTotal) {
        this.SaldoTotal = SaldoTotal;
    }   

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getFYear() {
        return FYear;
    }

    public void setFYear(int FYear) {
        this.FYear = FYear;
    }

    public String getMant() {
        return Mant;
    }

    public void setMant(String Mant) {
        this.Mant = Mant;
    }
    
    

    @Override
    public String toString() {
        return Location;
    }


}
