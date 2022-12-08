public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
     cliente.nombre="abel";
     cliente.edad=37;
     cliente.teléfono="8095662271";
     cliente.credito =500;
     System.out.println(cliente.nombre);
     System.out.println(cliente.edad);
     System.out.println(cliente.teléfono);
     System.out.println(cliente.credito);
    
      
    }
}
 class Persona{
    int credito;

    int  edad;

    String nombre;

    String teléfono;
 }

 class Cliente extends Persona{
    int credito;
 }

 class Trabajador extends Persona{
int salario;
 }