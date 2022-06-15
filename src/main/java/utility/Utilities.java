package utility;

import com.mycompany.supermarket_project.Supermarket;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Utilities {
    
    public static boolean isEmplyeeIdExist(JFrame frm, long Id){
        for (int i = 0; i < Supermarket.employeesList.size(); i++) {
            if(Id==Supermarket.employeesList.get(i).getId()){
                JOptionPane.showMessageDialog(frm, "This Id is already exist");
                return true;
            }
        }
        return false;
    }
    
    public static boolean isProductIdExist(JFrame frm, long Id){
        for (int i = 0; i < Supermarket.productList.size(); i++) {
            if(Id==Supermarket.productList.get(i).getId()){
                JOptionPane.showMessageDialog(frm, "This Id is already exist");
                return true;
            }
        }
        return false;
    }
    
    public static boolean passwordValidation(JFrame frm, char[]input){
        if(input.length<6){
            JOptionPane.showMessageDialog(frm, "Password should be at least 6 characters");
            return false;
        }
        return true;
    }
    
    public static boolean isValidInteger(JFrame frm, String input){
        try {
          Integer.parseInt(input);
          return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frm, "You have entered non-numeric value in numeric input(age,quantity)");
            return false;
        }
    }
    
    public static boolean isValidLong(JFrame frm, String input){
        try {
          Long.parseLong(input);
          return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frm, "You have entered non-numeric value in numeric input(Id)");
            return false;
        }
    }
    
    public static boolean isValidDouble(JFrame frm, String input){
        try {
          Double.parseDouble(input);
          return true;
        } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(frm, "You have entered non-numeric value in numeric input(Price)");
         return false;
        }
    }
    
    public static void readDataFromFiles(){
        utility.ReadDataFromFile input=new utility.ReadDataFromFile();
        //read Employees File
        input.openEmplyeeFile();
        Supermarket.employeesList=input.readEmplyeesList();
        input.closeEmployeeFile();
        //read Products file
        input.openProductsFile();
        Supermarket.productList=input.readProductsList();
        input.closeProductsFiles();
        //read orders file
        input.openOrdersFile();
        Supermarket.orderList=input.readOrdersList();
        input.closeOrderFile();
    }
    
    public static void saveEmployeesToFile(){
        SaveDataToFile output=new SaveDataToFile();
        output.openEmployeeFile();
        output.writeEmplyeesList(Supermarket.employeesList);
        output.closeEmplyeesFile();
    }
    
    public static void saveProductsToFile(){
        SaveDataToFile output=new SaveDataToFile();
        output.openProductsFile();
        output.writeProductsList(Supermarket.productList);
        output.closeProductsFile();
    }
    
    public static void saveOrdersToFile(){
        SaveDataToFile output=new SaveDataToFile();
        output.openOrdersFile();
        output.writeOrdersList(Supermarket.orderList);
        output.closeOrdersFile();
    }
}
