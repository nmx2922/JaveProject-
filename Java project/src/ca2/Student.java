//NG MING XUAN 
//P2100043
//DIT/1B/01
package ca2;

import java.io.Serializable;

public class Student implements Serializable {

    private String course, adm, name, GPA, type;

    public Student() {

    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setGPA(String GPA) {
        this.GPA = GPA;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getAm() {
        return adm;
    }

    public void setAm(String admNo) {
        this.adm = admNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGPA() {
        return GPA;
    }



}
