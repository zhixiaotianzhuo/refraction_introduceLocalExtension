import java.util.Date;

/**
 * Created by MANU on 2018/6/4.
 */
public class SubDate extends Date {

    /*public SubDate(String dStr){
        super(dStr);
    }*/

    public SubDate(Date dt){
        super(dt.getTime());
    }

    Date nextDay(){
        return new Date(getYear(),getMonth(),getDate()+1);
    }
}

