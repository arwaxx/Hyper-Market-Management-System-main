//.abstract ..class .abstract .abstract .abstract .abstract .abstract .abstract .abstract ..class .abstract .abstract .abstract ..class .abstract .abstract .abstract .abstract .abstract .abstract .abstract .abstract .abstract .abstract .abstract .abstract .abstract .abstract .abstract .abstract .abstract .abstract .abstract .abstract .abstract .abstract .abstract .abstract .abstract .abstract ..class .abstract .abstract .abstract .abstract .abstract .abstract .abstract ..class ..class .abstract .abstract .abstract .abstract .abstract .abstract ..class .abstract .abstract .abstract ..class .abstract .abstract .abstract .abstract .abstract .abstract .abstract .abstract ..class ..class ..class .abstract .abstract .package utility;

import com.mycompany.supermarket_project.model.Employee;
import com.mycompany.supermarket_project.model.Order;
import com.mycompany.supermarket_project.model.Product;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ReadDataFromFile {

    public ObjectInputStream inputEmployees = null;
    public ObjectInputStream inputProducts = null;
    public ObjectInputStream inputOrders = null;
	public void openEmplyeeFile() {
		try {
			inputEmployees = new ObjectInputStream(new FileInputStream("./Employee.ser"));
		} catch (FileNotFoundException e) {
			SaveDataToFile output = new SaveDataToFile();
			output.openEmployeeFile();
			output.closeEmplyeesFile();
			openEmplyeeFile();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,"Unable to create/open the file Employee.");
		}
	}
        
        public void openProductsFile() {
		try {
			inputProducts = new ObjectInputStream(new FileInputStream("./Products.ser"));
		} catch (FileNotFoundException e) {
			SaveDataToFile output = new SaveDataToFile();
			output.openProductsFile();
			output.closeProductsFile();
			openProductsFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null,"Unable to create/open the file Products.");
		}
	}
        
        public void openOrdersFile() {
		try {
			inputOrders = new ObjectInputStream(new FileInputStream("./Orders.ser"));
		} catch (FileNotFoundException e) {
			SaveDataToFile output = new SaveDataToFile();
			output.openOrdersFile();
			output.closeOrdersFile();
			openOrdersFile();
		} catch (IOException e) {

			JOptionPane.showMessageDialog(null,"Unable to create/open the file Orders.");
		}
	}

        public List<Employee> readEmplyeesList() {
		Employee emp;
		List<Employee> employeeList=new ArrayList<>();
		try {
			while (true) {
				emp = (Employee) inputEmployees.readObject();
				employeeList.add(emp);
			}
		} catch (EOFException e) {
			// used to move out of the while loop
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, Employee.class.getName()+ " isn't exist");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,"Unable to read data from the file Emplyee");
		}
		return employeeList;
	}

        public List<Product> readProductsList() {
		Product product;
		List<Product> productList=new ArrayList<>();
		try {
			while (true) {
				product = (Product) inputProducts.readObject();
				productList.add(product);
			}
		} catch (EOFException e) {
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, Product.class.getName()+ " isn't exist");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,"Unable to read data from the file Product");
		}
		return productList;
	}
        
        public List<Order> readOrdersList() {
		Order order;
		List<Order> orderList=new ArrayList<>();
		try {
			while (true) {
				order = (Order) inputOrders.readObject();
				orderList.add(order);
			}
		} catch (EOFException e) {
			// used to move out of the while loop
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, Employee.class.getName()+ " isn't exist");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,"Unable to read data from the file Order");
		}
		return orderList;
	}

	public void closeEmployeeFile() {
		try {
			if (inputEmployees != null)
				inputEmployees.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error closing file Employee.");
		}

	}
        
        public void closeProductsFiles() {
		try {
			if (inputProducts != null)
				inputProducts.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error closing file Products.");
		}

	}
        
        public void closeOrderFile() {
		try {
			if (inputOrders != null)
				inputOrders.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error closing file Orders.");
		}

	}
        
        public static String [] ReadFromFile() {
            String []adminInfo=new String[2];
    	try {
    	       File file = new File("Admin_Account.txt");
    	       Scanner input = new Scanner(file);
    	      while (input.hasNextLine()) {
    	        String data = input.nextLine();
                String dataLines[] = data.split("\n");
    	        for (int i = 0; i < dataLines.length; i++) {
                    String wordsList[]=dataLines[i].split(";");
                        adminInfo=wordsList;    
                }
    	      }
    	      input.close();
              return adminInfo;
    	    } catch (FileNotFoundException e) {
                createNewFile();
    	    } catch (Exception ex){
                System.out.println(ex);
            }
        return null;
    }

    public static void createNewFile(){
        File yourFile = new File("Admin_Account.txt");
        try{
            yourFile.createNewFile();
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
}
