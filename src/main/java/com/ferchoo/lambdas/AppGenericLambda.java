package com.ferchoo.lambdas;

import com.ferchoo.fundamentals.Employee;
import com.ferchoo.fundamentals.Product;

public class AppGenericLambda {
    public static void main(String[] args) {
        Printer<String> printString = string -> System.out.println(string);
        Printer<Product> printProduct = product -> System.out.println(product);
        Printer<Employee> printEmployee = employee -> System.out.println(employee);

        Product myProd = new Product();
        myProd.setId(34L);
        myProd.setName("CPU");
        myProd.setPrice(20000.00);

        Employee myEmp = new Employee();
        myEmp.setDni("fgdfsg4545b");
        myEmp.setName("Ricardo Rivas");
        myEmp.setSalary(20000.00);

        printString.print("Hola mundo");
        printProduct.print(myProd);
        printEmployee.print(myEmp);
    }
}
