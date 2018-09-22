package examenii_andreamendoza;

import java.util.Date;

public class Transaccion {

private int ID;
private String Desc;
private Date Done;

    public Transaccion(int ID, String Desc, Date Done) {
        this.ID = ID;
        this.Desc = Desc;
        this.Done = Done;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public Date getDone() {
        return Done;
    }

    public void setDone(Date Done) {
        this.Done = Done;
    }


}
