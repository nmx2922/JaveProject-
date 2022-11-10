//NG MING XUAN 
//P2100043
//DIT/1B/01
package ca2;
import java.io.Serializable;
public class Module implements Serializable {

    private String[] mName, mCode, credit, mark;

    public Module(){
        
    }

        public void setCredit(String[] credit) {       
        this.credit = credit;
    }
    
    public String[] getmark() {
        return mark;
    }

    public String[] getMCode() {     
        return mCode;
    }

    public void setMCode(String[] mCode) {       
        this.mCode = mCode;
    }
    
    public String[] getMName() {     
        return mName;
    }

    public void setMName(String[] mName) {       
        this.mName = mName;
    }
    
    public String[] getCredit() {     
        return credit;
    }


    public void setmark(String[] mark) {
        this.mark = mark;
    }

}
