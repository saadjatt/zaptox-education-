/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Saad Jatt
 */
public class SubjectBean {
    
    String Subject;
    double fee;

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public SubjectBean(String Subject, double fee) {
        this.Subject = Subject;
        this.fee = fee;
    }

    

    @Override
    public String toString() {
        return  Subject ;
    }
    
    
}
