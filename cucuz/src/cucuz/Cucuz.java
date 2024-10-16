/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cucuz;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cucuz {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        HashMap<String, Double> productos = new HashMap<>();
        
        int resp;
        double prec;
        String prod;
        
        do {
        System.out.println("Indique que desea realizar: ");
        System.out.println("1.Agregar un producto");
        System.out.println("2.Eliminar un producto");
        System.out.println("3.Editar un producto");
        System.out.println("4.Mostrar todos los productos");
        System.out.println("5.Salir");
        resp = sc.nextInt();
        sc.nextLine();
        switch(resp){
            case 1:
                System.out.print("Deme el nombre del producto: ");
                prod = sc.nextLine();   
                    System.out.print("Deme el precio del producto: ");
                    prec = sc.nextInt();
                productos.put(prod,prec);
                System.out.println("Se ha agregado exitosamente el producto");
                break;
            case 2:
                System.out.print("Deme el nombre del producto: ");
                prod = sc.nextLine();
                    System.out.print("Deme el precio del producto: ");
                    prec = sc.nextInt();     
               productos.remove(prod);
               System.out.println("Se ha eliminado exitosamente el producto");
                break;
            case 3:
                System.out.print("Deme el nombre del producto: ");
                prod = sc.nextLine();
                    System.out.print("Deme el precio nuevo del producto: ");
                    prec = sc.nextInt();
                productos.replace(prod, prec);
                System.out.println("Se ha modificado exitosamente el producto");
                break;
            case 4:
                System.out.println("La lista de los producto es: ");
                for (String i : productos.keySet()) {
                System.out.println("Precio: $" + productos.get(i)+" Producto: " + i);
                }
                break;
            case 5:
                System.out.println("Gracias por utilizar la tienda");
                break;
        }
    }while(resp!=5);
}
}
