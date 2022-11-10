//NG MING XUAN 
//P2100043
//DIT/1B/01
package ca2;

import java.util.*;

import java.text.DecimalFormat;

public class StudentManagement {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    int num = -1;
    int mNum = 0;
    int current = 0;

    List<Module> listMod = new ArrayList();
    List<Student> listStd = new ArrayList();
    InternationalStudent intStd = new InternationalStudent();

    public int getpMNum() {
        int i = listMod.get(num).getMCode().length;
        do {
            int x = i - 1;

            return mNum + x;

        } while (i < getAllM());

    }

    public void getModule() {
        int count = 0;
        int i = getAllM();
        do {

            count++;
        } while (count < getAllM());

    }

    public int getNext() {
        return mNum + 2;
    }

    public void setMNum(int modNum) {
        this.mNum = modNum;
    }
//length of student

    public int getAllStu() {
        return listStd.size();
    }
//length of module

    public int getAllM() {

        return listMod.get(num).getMCode().length;

    }

    public void getStudent() {
        IOFile io = new IOFile();
        // read students file

        List list = io.readStudent();
        listMod = (List<Module>) list.get(0);
        listStd = (List<Student>) list.get(1);

    }

    public int getStuN() {
        return num + 1;
    }

    public void setStuN(int num) {
        this.num = num;
    }

    public int getMNum() {
        int i = 1;
        do {
            if (i == 1) {
                return mNum + i;

            } else {
                i = i + 1;
                return mNum + i;
            }

        } while (i < getAllM());

    }

    public void setCurrent(int mNumber) {
        this.current = mNumber;
    }

// Compute GPA
    public double computeGpa(int i) {

        double gpa = 0;
        double tc = 0;
        double tp = 0;
        double p = 0;
        double div = 0;
        double tdiv = 0;

        for (int n = 0; n < listMod.get(i).getmark().length; n++) {
            double marks = Double.parseDouble(listMod.get(i).getmark()[n]);
            double credit = Integer.parseInt(listMod.get(i).getCredit()[n]);
            if (marks >= 80) {
                div = 4;
                p = div * credit;

            } else if (marks >= 70) {
                div = 3;
                p = div * credit;

            } else if (marks >= 60) {
                div = 2;
                p = div * credit;

            } else if (marks >= 50) {
                div = 1;
                p = div * credit;

            } else {
                div = 0;
                p = div * credit;

            }
            tp = p + tp;
            tdiv = div + tdiv;
            tc = tc + credit;

            gpa = tp / tc;
        }

        return gpa;

    }

    public String getStudentMC() {
        return listMod.get(num).getMCode()[mNum];
    }

    public String getStudentMN() {
        return listMod.get(num).getMName()[mNum];
    }

    public String getStudentMCr() {
        return listMod.get(num).getCredit()[mNum];
    }

    public String getStudentMM() {
        return listMod.get(num).getmark()[mNum];
    }

    public String getStudentC() {
        return listStd.get(num).getCourse();
    }

    public String getStudentAm() {
        return listStd.get(num).getAm();
    }

    public String getStudentN() {
        return listStd.get(num).getName();
    }

    public String getGPA() {
        String gpa = df.format(computeGpa(num));
        return gpa;
    }

    public String getType() {
        return listStd.get(num).getType();
    }

    public String getStudentPass() {
        return intStd.getPass();
    }

//Search  student
    public String getSearchStudent(String input) {
        String msg = "";

        for (int i = 0; listStd.size() > i; i++) {
            if (input.equalsIgnoreCase(listStd.get(i).getName())) {
                num = i;
                msg = "Successful! Found the student: " + input + ".";
                break;
            } else if (!input.equalsIgnoreCase(listStd.get(i).getName())) {
                msg = "Cannot find the student: " + input + " !!";
            }
        }
        return msg;
    }

//Search Modules 
    public String getSearchModule(String input) {

        int count = 0;
        double mark = 0;
        double AvgMark;
        String msg = "";

        for (int i = 0; listMod.size() > i; i++) {
            for (int n = 0; n < listMod.get(i).getMName().length; n++) {
                if (input.equalsIgnoreCase(listMod.get(i).getMName()[n])) {
                    count++;
                    mark = Double.parseDouble(listMod.get(i).getmark()[n]) + mark;

                }

            }

        }
        if (mark > 0) {
            AvgMark = mark / count;
            msg = "Modules exists! There are " + count + " student(s) taking " + input + " module.\n The average marks for " + input + " is " + String.format("%.1f", AvgMark) + ".";
        }
        if (mark == 0) {
            msg = "No student taking module " + input + " !!";
        }
        return msg;
    }

// statictics 
    public String getStatistic() {
        double num = 0;
        int count3 = 0;
        int count1 = 0;
        double HIGH = 0;
        double less = 0;
        for (int i = 0; i < listMod.size(); i++) {

            if (computeGpa(i) > 3.5) {
                count3++;
            }
            if (computeGpa(i) < 1) {
                count1++;
            }
            num++;
        }

        HIGH = (count3 / num) * 100;
        less = (count1 / num) * 100;
        String msg = "There are " + (int) num + " student in total. \n "
                + "There is " + count3 + "student(s) getting GPA greater that 3.5 .This is  " + String.format("%.2f", HIGH) + "%\n"
                + "There is/are " + count1 + "student(s) getting GPA less than 1 .This is  " + String.format("%.2f", less) + "%\n ";
        return msg;

    }

}
