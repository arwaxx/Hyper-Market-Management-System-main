package com.mycompany.supermarket_project;

import com.mycompany.supermarket_project.model.Employee;
import com.mycompany.supermarket_project.model.Order;
import com.mycompany.supermarket_project.model.Product;
import java.util.ArrayList;
import java.util.List;

public class Supermarket {
    
    public static List<Employee> employeesList=new ArrayList<>();
    public static List<Product> productList=new ArrayList<>();
    public static List<Order> orderList=new ArrayList<>();
    public static String[] employeeRoles={"Marketing","Inventory","Sales"};
    public static Employee currentEmplyee=null;
    
    public static void signout(){
        currentEmplyee=null;
    }
    
    public static void main(String[] args) {
        new LoginForm().setVisible(true);
        utility.Utilities.readDataFromFiles();
    }
}
