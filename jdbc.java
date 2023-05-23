import java.sql.*;

class jdbc{
    /*
    public static void main(String[] args) throws SQLException{
        Connection myconn=null;
        Statement myst=null;
        ResultSet myrs=null;

        try{
            Class.forName("com.mysql.jdbc.Driver");  
            myconn=DriverManager.getConnection("jdbc:mysql://localhost:3306/adv_java_hosp","root","Chemistry93#");

            myst=myconn.createStatement();
            myrs=myst.executeQuery("Select * from hospital");
            
            while(myrs.next()){
                System.out.println(myrs.getInt("id")+" "+myrs.getString("Hospital_name")+" "+myrs.getInt("Bed_Count"));
            }
        }

        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(myrs!=null){
                myrs.close();
            }
            if(myst!=null){
                myst.close();
            }
            if(myconn!=null){
                myconn.close();
            }
        }
    }
    */
    
    public static void main(String[] args) throws SQLException{
        Connection myconn=null;
        Statement myst=null;
        ResultSet myrs=null;

        try{
            Class.forName("com.mysql.jdbc.Driver");  
            myconn=DriverManager.getConnection("jdbc:mysql://localhost:3306/adv_java_hosp","root","Chemistry93#");

            myst=myconn.createStatement();
            myrs=myst.executeQuery("Select * from doctor");
            
            while(myrs.next()){
                System.out.println(myrs.getString("dname")+" "+myrs.getInt("hid")+" "+myrs.getDate("jdate")+" "+myrs.getString("speciality")+" "+myrs.getInt("sal"));
            }
        }

        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(myrs!=null){
                myrs.close();
            }
            if(myst!=null){
                myst.close();
            }
            if(myconn!=null){
                myconn.close();
            }
        }
    }
    /* 
    public static void main(String[] args) throws SQLException{
        Connection myconn=null;
        Statement myst=null;
        ResultSet myrs=null;

        try{
            Class.forName("com.mysql.jdbc.Driver");  
            myconn=DriverManager.getConnection("jdbc:mysql://localhost:3306/adv_java_hosp","root","Chemistry93#");

            myst=myconn.createStatement();
            myrs=myst.executeQuery("Select doctor.dname, hospital.Hospital_name from doctor INNER JOIN ON hospital WHERE doctor.hid=hospital.id");
            
            while(myrs.next()){
                System.out.println(myrs.getString(1)+" "+myrs.getString(2));
            }
        }

        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(myrs!=null){
                myrs.close();
            }
            if(myst!=null){
                myst.close();
            }
            if(myconn!=null){
                myconn.close();
            }
        }
    }*/

}