public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 27;
        cliente.telefono = 95678342;
        cliente.nombre = "Cristian Javier";
        cliente.credito = true;
        System.out.println(cliente.nombre);

        Trabajador trabajador = new Trabajador();
        trabajador.salario = 450000;
        trabajador.nombre = "Juan Carlos";
        trabajador.edad = 20;
        trabajador.telefono = 957545474;
        System.out.println(trabajador.telefono);
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    Boolean credito;
}

class Trabajador extends Persona {
    int salario;


}


