import java.util.Date;

/**
 * Created by MANU on 2018/6/4.
 */
public class PackDate {
    private Date tmpDate;

    public PackDate(Date dt){
        tmpDate = dt;
    }


    public Date getTmpDate() {
        return tmpDate;
    }

    public void setTmpDate(Date tmpDate) {
        this.tmpDate = tmpDate;
    }

    public int getYear(){
        return tmpDate.getYear();
    }

    public int getMonth(){
        return tmpDate.getMonth();
    }

    public int getDate(){
        return tmpDate.getDate();
    }


    Date nextDay(){
        return new Date(getYear(),getMonth(),getDate()+1);
    }
}
