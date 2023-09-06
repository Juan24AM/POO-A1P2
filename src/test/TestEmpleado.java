
package test;

import source.Empleado;


public class TestEmpleado {
    
    public static void main(String[] args) {
        Empleado Emp1 = new Empleado("01_AB", "Carlos Ortega", "Sistemas", 1500, 24, "AFP");
        System.out.println(Emp1.toString());
        Empleado Emp2 = new Empleado("02-N2A", "Pedro Castillo", "Marketing", 3580, 5, "SNP");
        System.out.println(Emp2.toString());
    }
    
}
