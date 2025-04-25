import Models.Direccion;
import Models.Persona;
import Controllers.PersonaController;
import Views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {
       // Crear un arreglo de 5 personas
        Persona[] personas = new Persona[5];

        // Crear direcciones y personas
        personas[0] = new Persona("Maria", 30,
                new Direccion("Calle 2", 23, 56));
        personas[1] = new Persona("Pedro", 35, new Direccion("Calle 3", 34, 67));
        personas[2] = new Persona("Ana", 28, new Direccion("Calle 4", 45, 78));
        personas[3] = new Persona("Juan", 25, new Direccion("Calle 1", 12, 45));
        personas[4] = new Persona("Luis", 40, new Direccion("Calle 5", 56, 89));
        ViewConsole mostrar = new ViewConsole();
        PersonaController controlador = new PersonaController();
    
        mostrar.printMessage("--ARREGLO ORIGINAL--");
        mostrar.printArray(personas);

        mostrar.printMessage("--ARREGLO ORDENADO--");    
        controlador.sortByDireccionCodigo(personas);
        mostrar.printArray(personas);

        Persona pB = controlador.findByCodigo(personas, 45);
     
            System.out.println("La persona es " + pB == null? "No existe" : "La persona es "+ pB);
        
    }




}
