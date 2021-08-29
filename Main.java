import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice \n Press 1 to add permanent Employee \n Press 2 to add temporary Employee");
        int choice  = sc.nextInt(); 
        String filename;
        EmployeeMangaement ob = new EmployeeMangaement();
        if(choice ==  1){
        filename = "C:\\Users\\Abhishek\\Desktop\\project\\CsvToDataBase\\PermanentEmp.csv";
        ob.addPermanentEmp(filename);
        System.out.println("Added Succesfully");
        }
        else if(choice == 2){
        filename = "C:\\Users\\Abhishek\\Desktop\\project\\CsvToDataBase\\PermanentEmp.csv";
        ob.addTemporaryEmp(filename);
        System.out.println("Added Succesfully");
        }
        else{
            System.out.println("Wrong Choice");
        }
    }
}