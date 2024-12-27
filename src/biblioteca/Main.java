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
        Biblioteca biblioteca = new Biblioteca();

        while (bandera==true){

            System.out.println("BIENVENIDO A MR BOOKS AND BITS");
            System.out.println("Seleccione una opción: ");
            System.out.printf("1. Agregar libros\n2. Buscar libros\n3. Listar libros\n4. Salir\n>>");

            Scanner sc = new Scanner(System.in);
            int llave = sc.nextInt();
            sc.nextLine();

            switch (llave){
                case 1:
                System.out.println();
                System.out.println("************************************************");
                System.out.print("Ingrese el título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Ingrese el autor: ");
                    String author = sc.nextLine();
                    System.out.print("Ingrese el ISBN: ");
                    String cod = sc.nextLine();
                System.out.println("************************************************");

                biblioteca.agregarLibro(new Libro(titulo, author, cod));
                    break;
                case 2:
                System.out.println();
                System.out.println("************************************************");

                System.out.print("Ingrese el titulo del libro: ");
                String nombreLibro = sc.nextLine();
                Libro libroEncontrado = biblioteca.buscarLibro(nombreLibro);
                if(libroEncontrado!=null){
                    System.out.println("Libro encontrado!!");
                    System.out.println(libroEncontrado.toString());
                }else{
                    System.out.println("El libro no se encuentra en la biblioteca!!");
                }
                    break;
                case 3:
                System.out.println("");
                System.out.println("************************************************");
                biblioteca.listarLibros();
                System.out.println("************************************************");
                    break;
                case 4:
                    System.out.println("!!Gracias por preferir nuestro sistema!!");
                    bandera = false;
                    break;

            }

        }

    }
}
