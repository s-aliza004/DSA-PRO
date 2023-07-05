/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Management;

/**
 *
 * @author KAMRAN TECH
 */
import java.util.Stack;

public class Office {

    private int id;
    private String name;
    private String phone;
    private String qual;
    private String exp;
    private String cnic;
    private String salary;
    private String age;

    public Office(int id, String name, String phone, String qual, String exp, String cnic, String salary, String age) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.qual = qual;
        this.exp = exp;
        this.cnic = cnic;
        this.salary = salary;
        this.age = age;
    }

    //Getters Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getQual() {
        return qual;
    }

    public void setQual(String qual) {
        this.qual = qual;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getCnic() {
        return cnic;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}

//
class Office_Manager {

    private Stack<Management.Office> officestack;

    public Office_Manager() {
        officestack = new Stack<>();
    }

    public void add(Office off) {
        officestack.push(off);
    }

    public void update(int id, Office updatedoff) {
        Stack<Office> tempStack = new Stack<>();

        while (!officestack.isEmpty()) {
            Office currentoff = officestack.pop();
            if (currentoff.getId() == id) {
                tempStack.push(updatedoff);
            } else {
                tempStack.push(currentoff);
            }
        }

        while (!tempStack.isEmpty()) {
            officestack.push(tempStack.pop());
        }
    }

    public void remove(int id) {
        Stack<Office> tempStack = new Stack<>();

        while (!officestack.isEmpty()) {
            Office currentoff = officestack.pop();
            if (currentoff.getId() != id) {
                tempStack.push(currentoff);
            }
        }

        while (!tempStack.isEmpty()) {
            officestack.push(tempStack.pop());
        }
    }

    public Stack<Office> getAlldata() {
        return officestack;
    }

//    public void addCustomer(Testing.Customer customer) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
