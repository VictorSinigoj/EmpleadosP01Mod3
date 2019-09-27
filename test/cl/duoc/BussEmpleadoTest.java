package cl.duoc;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BussEmpleadoTest {
    
    public BussEmpleadoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testBuscar(){ 
        System.out.println("Empleado Buscado.");
        Empleado empleado = new Empleado("11111111", "Joaquina", 22, 33); 
        BussEmpleado instance = new BussEmpleado(); 
        boolean esperado=true; 
        boolean obtenido=instance.Modificar(empleado); 
        Assert.assertEquals(esperado, obtenido);
    }
    
    @Test
    public void testCrear(){
        System.out.println("Empleado Agregadado.");
        Empleado empleado = new Empleado("857338", "Victor", 59, 8); 
        BussEmpleado instance = new BussEmpleado(); 
        boolean esperado=true; 
        boolean obtenido=instance.Crear(empleado); 
        Assert.assertEquals(esperado, obtenido);
    }

    @Test
    public void testModificar(){
        System.out.println("Empleado Modificado.");
        Empleado empleado = new Empleado("8547338", "Victor Sinigoj", 40, 8); 
        BussEmpleado instance = new BussEmpleado(); 
        instance.Crear(empleado);
        boolean esperado=true; 
        boolean obtenido=instance.Modificar(empleado); 
        Assert.assertEquals(esperado, obtenido);
    }

    @Test
    public void testEliminar(){ 
        System.out.println("Elimina Empleado.");
        String codigo="123";
        Empleado empleado = new Empleado("99999999", "Soraya", 54, 63); 
        BussEmpleado instance = new BussEmpleado(); 
        instance.Crear(empleado);
        boolean esperado=true; 
        boolean obtenido=instance.Eliminar(codigo); 
        Assert.assertEquals(esperado, obtenido);
    }

    @Test
    public void testMontoBono(){
        System.out.println("Monto del Empleado.");
        Empleado empleado = new Empleado("8547338", "Victor", 59, 8); 
        BussEmpleado instance = new BussEmpleado(); 
        boolean esperado=true; 
        boolean obtenido=instance.Crear(empleado); 
        Assert.assertEquals(esperado, obtenido);
        
    }    
}
