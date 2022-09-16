public class Coche {
    public static void main(String[] args) {
        Automovil coche1 = new Automovil();
        coche1.AgregarPuerta();
        coche1.AgregarPuerta();
        coche1.AgregarPuerta();
        System.out.println(coche1.puerta);
    }
}
class Automovil {
    int puerta = 1;

    public void AgregarPuerta() {
        this.puerta++;
    }
}

