package clase_6;

import java.util.Scanner;

public class actividad_6_4 {
    public static void main (String[] args){
        System.out.println("El misterio del amuleto perdido ");
        System.out.println("Eres un joven arqueólogo llamado Alex que se encuentra en una expedición en busca de un antiguo amuleto legendario, conocido por sus poderes místicos.\n Según las antiguas leyendas, el amuleto se encuentra oculto en una misteriosa cueva en lo profundo de la selva amazónica. Te adentras en la densa jungla junto a tu equipo, \npero en un giro inesperado del destino, te separas de ellos y te encuentras solo.");
        System.out.println("Mientras exploras la selva, te topas con un antiguo mapa grabado en una roca. El mapa muestra una serie de enigmas y pistas que conducen al amuleto perdido.\n Ahora, debes resolver cada uno de los enigmas para avanzar en tu búsqueda. ¿Qué camino tomarás?");
        System.out.println("1. Seguir el camino marcado en el mapa que parece conducir a una antigua ruina.");
        System.out.println("2. Investigar los sonidos misteriosos provenientes de una cueva cercana.");
        System.out.println("Elige tu opción (1 o 2):");
        Scanner data = new Scanner(System.in);
        Integer opcion1 = data.nextInt();

        if (opcion1 == 1 ){
            System.out.println("Decides seguir el camino marcado en el mapa que parece conducir a una antigua ruina. Avanzas a través de la densa vegetación y \nfinalmente llegas a un claro donde se encuentra una imponente estructura antigua cubierta de enredaderas y musgo.");
            System.out.println("Al acercarte, descubres que la entrada de la ruina está bloqueada por una gran puerta de piedra tallada con símbolos enigmáticos.\n Parece que tendrás que descifrar el código para abrirla.");
            System.out.println("Observas detenidamente los símbolos tallados en la puerta y te das cuenta de que coinciden con una serie de imágenes que aparecen en el mapa.\n Decides analizar el mapa nuevamente para encontrar pistas.");
            System.out.println("Después de un tiempo, descubres una conexión entre las imágenes del mapa y los símbolos en la puerta. Te das cuenta de que los símbolos deben\n ser tocados en un orden específico para abrir la puerta.");
            System.out.println("A continuación, tienes tres opciones:");
            System.out.println("1. Toques los símbolos en el orden en el que aparecen en el mapa.\n" +
                    "2. Utilices tu conocimiento arqueológico para buscar patrones y deducir el orden correcto.\n" +
                    "3. Pruebes una combinación aleatoria de símbolos y esperes tener suerte.");
            Integer opcion2 = data.nextInt();
            if (opcion2 == 1) {
                System.out.println("y vivieron felices por siempre ...");
            }else if (opcion2 == 2) {
                System.out.println("y vivieron felices por siempre ...");
            }else if (opcion2 == 3) {
                System.out.println("y vivieron felices por siempre ...");
            }else {
                System.out.println("Respuesta incorrecta");
            }
        }else if(opcion1 == 2){
            System.out.println("Decides investigar los sonidos misteriosos provenientes de la cueva cercana. Te adentras en la oscura y húmeda cueva, siguiendo \nel eco de los sonidos que te llama la atención. A medida que avanzas, el aire se vuelve más espeso y sientes una energía extraña en el ambiente.");
            System.out.println("Llegas a una amplia sala iluminada por tenues rayos de luz que se filtran a través de pequeñas grietas en el techo de la cueva. \nEn el centro de la sala, descubres un pedestal antiguo con un amuleto brillante reposando sobre él.");
            System.out.println("Sin embargo, justo cuando te acercas al amuleto, escuchas un ruido siniestro detrás de ti. Te giras rápidamente y te encuentras \ncon una figura encapuchada y misteriosa, sosteniendo un cetro adornado con gemas resplandecientes. Parece que también está interesada en el amuleto.");
            System.out.println("La figura encapuchada te desafía a un enfrentamiento por el control del amuleto. Tienes tres opciones:");
            System.out.println("1. Aceptas el desafío y te preparas para la batalla.\n" +
                    "2. Intentas negociar y encontrar un acuerdo pacífico.\n" +
                    "3. Tratas de distraer a la figura y huir sigilosamente con el amuleto.");
            Integer opcion2 = data.nextInt();
            if (opcion2 == 1) {
                System.out.println("y vivieron felices por siempre ...");
            }else if (opcion2 == 2) {
                System.out.println("y vivieron felices por siempre ...");
            }else if (opcion2 == 3) {
                System.out.println("y vivieron felices por siempre ...");
            }else {
                System.out.println("Respuesta incorrecta");
            }
        }else {
            System.out.println("Respuesta incorrecta");
        }
    }
}
