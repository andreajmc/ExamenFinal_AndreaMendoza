package examenii_andreamendoza;

import java.io.Serializable;
import java.util.Date;

public class Logs implements Serializable {

private String U;
private String desc;
private Date Done;

    public Logs(String U, String desc, Date Done) {
        this.U = U;
        this.desc = desc;
        this.Done = Done;
    }

    public String getU() {
        return U;
    }

    public void setU(String U) {
        this.U = U;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getDone() {
        return Done;
    }

    public void setDone(Date Done) {
        this.Done = Done;
    }

    @Override
    public String toString() {
        return "DESCRIPCIÓN DE LA TRANSACCIÓN: " + desc + "\n FECHA: " + Done + "\n";
    }
    
    
   

}
