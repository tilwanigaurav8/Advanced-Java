public class employeetest {
    public static void main(String[] args){
        employee e=new employee(123, "gaurav", "tilwani", 100000);
        System.out.println(e.getId()+" "+e.getfirstname()+" "+e.getlastname()+" "+e.getannualsalary());
    }
}
