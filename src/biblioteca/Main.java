package biblioteca;
/*
  Este sistema de biblioteca permitira
  Agregar libros mediante una serie de parametros como: Nombre, Autor, Codigo.
  Buscar libros ya sea por el nombre, codigo, autor.
  Listar todos los libros
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean bandera = true;

        while (bandera==true){

            System.out.println("BIENVENIDO A MR BOOKS AND BITS");
            System.out.println("Seleccione una opción: ");
            System.out.printf("1. Agregar libros\n2. Buscar libros\n3. Listar libros\n4. Salir\n>>");

            Scanner sc = new Scanner(System.in);
            int llave = sc.nextInt();

            switch (llave){
                case 1:
                    

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("!!Gracias por preferir nuestro sistema!!");
                    bandera = false;
                    break;

            }

        }

    }
}
