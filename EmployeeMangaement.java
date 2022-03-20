import java.util.Scanner;
import java.util.regex.*;
import java.io.*;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class EmployeeMangaement {


    //Add permanent Employee
    public void addPermanentEmp(String filepath){
        try {
            File file = new File(filepath);
            Scanner reader  = new Scanner(file);
            while(reader.hasNextLine()){
                String details = reader.nextLine();
                String [] data = details.split(",");
                if(validate(data[0])){
                permanentEmployee ob = new permanentEmployee(Integer.parseInt(data[0]),data[1],data[2],Long.parseLong(data[3]),Integer.parseInt(data[4]));
                ob.getempSalary();
                addtodb(ob.getEmpId(),ob.getEmpName(),ob.getCity(),ob.getSalary());

            }
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage());

        }
    }

    //add temporary employee
    public void addTemporaryEmp(String filepath){
        try {
            File file = new File(filepath);
            Scanner reader  = new Scanner(file);
            while(reader.hasNextLine()){
                String details = reader.nextLine();
                String [] data = details.split(",");
                if(validate(data[0])){
                TemporaryEmployee ob = new TemporaryEmployee(Integer.parseInt(data[0]),data[1],data[2],Long.parseLong(data[3]),Integer.parseInt(data[4]));
                ob.getempSalary();
                addtodb(ob.getEmpId(),ob.getEmpName(),ob.getCity(),ob.getSalary());

            }
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.getMessage());

        }
    }

    public void addtodb(int id , String name , String city , Long salary){
        dbHandler db = new dbHandler();
        try {

            Connection con =  db.getConnection();
            String query = "insert into employee(Id,name,City,Salary) values(?,?,?,?); ";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,city);
            preparedStatement.setLong(4,salary);
            preparedStatement.executeUpdate();

        } catch (ClassNotFoundException| SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public boolean validate(String id) throws invalidEmployeeIdException{
        boolean check = Pattern.matches("[0-9]{5}",id);
        if(check){
            return true;
        }
        else{
            throw new invalidEmployeeIdException("Employee Id is Invalid");
        } 
    }
}
