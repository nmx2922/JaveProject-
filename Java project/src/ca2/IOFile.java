//NG MING XUAN 
//P2100043
//DIT/1B/01
package ca2;


import java.io.*;
import javax.swing.JOptionPane;
import java.util.*;

public class IOFile {

    public static void main(String[] args) {
        IOFile io = new IOFile();
        // read students file
        io.readStudent();
        //save students object
        io.saveStudent();
    }


    public List<Student> readStudent() {
        List list = new ArrayList();             
        List<Module> listMod = new ArrayList();        
        List<Student> listStd = new ArrayList();         
        try {
            BufferedReader br = new BufferedReader(new FileReader("students.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                
                String[] temp = s.split(";");          
                if (temp.length > 3) {
//                    Student std = new Student();
                    InternationalStudent std = new InternationalStudent();
                    std.setCourse(temp[0]);
                    std.setAm(temp[1]);
                    std.setName(temp[2]);
                   // std.setPass(temp[temp.length-1]);

                    if ((temp[temp.length-1]).equals("true")) {
                        std.setPass(temp[temp.length-1]);
                        std.setType(temp[temp.length -2]);

                    } else if ((temp[temp.length-1]).equals("false")) {
                        std.setPass(temp[temp.length-1]);
                        std.setType(temp[temp.length - 2]);

                    } else {
                        std.setPass("");
                        std.setType(temp[temp.length-1]);
                    }

            
//add std to listStu
                    listStd.add(std);
//get length of module from temp[3]
                    String[] mCode = new String[Integer.parseInt(temp[3])];
                    //Module start form 4 
                    int num = 4;
                    for (int i = 0; i < mCode.length; i++) {

                        mCode[i] = temp[num];

                        num += 4;
                    }

                    String[] mName = new String[Integer.parseInt(temp[3])];
                    num = 5;
                    for (int i = 0; i < mName.length; i++) {
                        mName[i] = temp[num];
                        num += 4;
                    }

                    String[] credit = new String[Integer.parseInt(temp[3])];
                    num = 6;
                    for (int i = 0; i < credit.length; i++) {
                        credit[i] = temp[num];
                        num += 4;
                    }

                    String[] mark = new String[Integer.parseInt(temp[3])];
                    num = 7;
                    for (int i = 0; i < mark.length; i++) {
                        mark[i] = temp[num];
                        num += 4;
                    }

                    Module mod = new Module();
                    mod.setMCode(mCode);
                    mod.setCredit(credit);
                    mod.setmark(mark);
                    mod.setMName(mName);
                    listMod.add(mod);
                }

            }
            br.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
        }
        list.add(listMod);
        list.add(listStd);

        return list;
    }


    public void saveStudent() {
        File f = new File("students.dat");
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(f));
            os.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    
    public void print(String txt){
       File print=new File("C:\\Users\\mingx\\Desktop\\SP DIT\\SP YEAR 1 SEM 2\\JPRG\\CA2\\java.txt");
       FileOutputStream out = null;
       try{
           out = new FileOutputStream(print);
           byte[] data = txt.getBytes("UTF-8");
           out.write(data);
           out.flush();
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e.getMessage());
       }finally{
           if(out!=null){
               try{
                    out.close();
               }catch(Exception e){
           JOptionPane.showMessageDialog(null, e.getMessage());
       }
              
           }
       }
       
}
}
