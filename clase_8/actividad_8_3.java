package clase_8;

public class actividad_8_3 {
    public static void main(String[] args) {
        //Crear una función que sea un generador de contraseñas. Al llamarla debe devolver una contraseña (por ejemplo, puedes utilizar Math.random() para devolver un número aleatorio que podría ser una contraseña.
        System.out.println(generadorConotrasenas());
    }

    private static String generadorConotrasenas(){
        double numero = Math.random()*10000;
        return "xDdht" + (int)numero;
    }
}
