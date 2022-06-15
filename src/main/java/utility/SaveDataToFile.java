package utility;

import com.mycompany.supermarket_project.model.Employee;
import com.mycompany.supermarket_project.model.Order;
import com.mycompany.supermarket_project.model.Product;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import javax.swing.JOptionPane;

public class SaveDataToFile {
    
	   ObjectOutputStream outputEmployee = null; // use ObjectOutputStream to write objects to files
           ObjectOutputStream outputProducts = null;
           ObjectOutputStream outputOrders = null;

	public void openEmployeeFile() {
		try {
			// ObjectOutputStream use FileOutputStream objects to access and
			// deal with files
			// if file isn't available it will create new one
			outputEmployee = new ObjectOutputStream(new FileOutputStream("./Employee.ser"));
		}catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "file is not found");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,"Unable to create/open the file.");
		}
	}
        
        public void openProductsFile() {
            try {
                    outputProducts = new ObjectOutputStream(new FileOutputStream("./Products.ser"));
            }catch (FileNotFoundException e) {
                    JOptionPane.showMessageDialog(null, "file is not found");
            } catch (IOException e) {
                    JOptionPane.showMessageDialog(null,"Unable to create/open the file.");
            }
        }
                
        public void openOrdersFile() {
		try {
			outputOrders = new ObjectOutputStream(new FileOutputStream("./Orders.ser"));
		}catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "file is not found");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,"Unable to create/open the file.");
		}
	}

	// write information objects to the file using writeObject() method
	public void writeEmplyeesList(List<Employee> employeeList) {
		for (int i=0;i<employeeList.size();i++) {
			try {
				outputEmployee.writeObject(employeeList.get(i));
			} catch (IOException e) {
				// can't write data to the file because of authentication/file
				// format
				JOptionPane.showMessageDialog(null,"Unable to write data to the file Emplyees");
			}
		}
	}
        
	public void writeProductsList(List<Product> productsList) {
		for (int i=0;i<productsList.size();i++) {
			try {
				outputProducts.writeObject(productsList.get(i));
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null,"Unable to write data to the file Products");
			}
		}
	}
        
	public void writeOrdersList(List<Order> ordersList) {
		for (int i=0;i<ordersList.size();i++) {
			try {
				outputOrders.writeObject(ordersList.get(i));
			} catch (IOException e) {
				// can't write data to the file because of authentication/file
				// format
				JOptionPane.showMessageDialog(null,"Unable to write data to the file Orders");
			}
		}
	}

	public void closeEmplyeesFile() {
            if (outputEmployee != null) 
            // if you try to close a null ObjectOutputStream object will cause an error so check it
                try {
                    outputEmployee.close();
                    } catch (IOException e) {
                        // if it couldn't close the file
                        JOptionPane.showMessageDialog(null, "Error closing file Emplyees.");
                }
	}
        
        public void closeProductsFile() {
            if (outputProducts != null) 
                try {
                    outputProducts.close();
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Error closing file Products.");
                }
	}
        
        public void closeOrdersFile() {
            if (outputOrders != null) 
                try {
                    outputOrders.close();
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Error closing file Orders.");
                }
	}
        
        public static void writeToFile(String adminUserName,String adminPassword) {
    	try { 
            new FileWriter("Admin_Account.txt", false).close();
                try (FileWriter myWriter = new FileWriter("Admin_Account.txt",false)) {
                    myWriter.write(adminUserName+";"+adminPassword+"\n");
                }
    		} catch (IOException ex) {
    		}
    }
}
