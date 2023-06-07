public class Principal 
{
    public static void main (String[] args) {
        Gato gato1 = new Gato("Tom", 3, "Persa");
        Gato gato2 = new Gato("Garfield", 5, "Naranja");
        Gato gato3 = new Gato("Luna", 2, "Siames");
    
        System.out.println("Información inicial de los gatos:");
        gato1.mostrarInfo();
        gato2.mostrarInfo();
        gato3.mostrarInfo();

        gato1.setEdad(4);
        gato2.setRaza("Gato callejero");
        gato3.setNombre("Mimi");

        System.out.println("\nInformación actualizada de los gatos:");
        System.out.println("Nombre del gato 1: " + gato1.getNombre());
        System.out.println("Edad del gato 2: " + gato2.getEdad());
        System.out.println("Raza del gato 3: " + gato3.getRaza());

        System.out.println("\nInformación completa de los gatos:");
        gato1.mostrarInfo();
        gato2.mostrarInfo();
        gato3.mostrarInfo();

    }
}