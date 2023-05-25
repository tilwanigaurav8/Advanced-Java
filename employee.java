import java.util.*;
public class employee {
    public int id;
    public String firstname;
    public String lastname;
    public int salary;

    public employee(int id,String firstname,String lastname,int salary){
        this.id=id;
        this.firstname=firstname;
        this.lastname=lastname;
        this.salary=salary;
    }
    public int getId(){
        return id;
    }
    public String getfirstname(){
        return firstname;
    }
    public String getlastname(){
        return lastname;
    }
    public String getname(){
        return firstname+lastname;
    }
    public int getsalary(){
        return salary;
    }
    public void setsalary(int salary){
        salary+=1;
    }
    public int getannualsalary(){
        return salary*12;
    }
    public int raiseSalary(int percent){
        return (salary*percent)/100;
    }
    @Override
    public String toString(){
        return "Employee "+id+" "+firstname+" "+lastname+" "+salary+"\n";
    }

    public static void main(String[] args){
        employee y=new employee(872,"Yash Raj","Mishra", 15000);
        employee g=new employee(429,"Gaurav","Tilwani",100000);
        String yi=y.toString();
        String gi=g.toString();
        System.out.println(yi);
        System.out.println(gi);
    }
}
