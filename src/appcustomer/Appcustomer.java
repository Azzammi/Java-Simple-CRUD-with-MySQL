/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcustomer;

import appcustomer.controllers.CustomerJpaController;
import appcustomer.models.Customer;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author mmut-
 */
public class Appcustomer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("appcustomerPU");
        Customer customer = new Customer();
        CustomerJpaController customerCtrl = new CustomerJpaController(emf);
        
        customer.setKodecustomer("C0004");
        customer.setNamacustomer("Customer contoh");
        customer.setEmail("kokoko@gmail.com");
        
        customerCtrl.create(customer);
        
        
        
    }
    
}
