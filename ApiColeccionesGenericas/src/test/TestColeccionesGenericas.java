package test;

import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        String elemento = miLista.get(0);
//        System.out.println("elemento = " + elemento);
        
//        imprimir(miLista);
//        for (Object elemnto : miLista) {
//            System.out.println("elemento = " + elemnto);
//        }
//
//        miLista.forEach(elemnto -> {
//            System.out.println("elemnto = " + elemnto);
//        });
 /* set no guarda el orden en el que se agregaron los objetos y no se pueden duplicar elementos de un mismo valor
*/
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");
//        imprimir(miSet);

        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("Valor3", "Rossario");
        miMapa.put("valor3", "Guissepe");
        String elementoMapa = miMapa.get("valor3");
//        System.out.println("elementoMapa = " + elementoMapa);
//        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
//    }

}
    public static void imprimir(Collection<String> coleccion) 
   {

        for(String elemento: coleccion) {
            System.out.println("elemento = " + elemento);
        }
//        coleccion.forEach(elemento -> {
//            System.out.println("elemento = " + elemento);
//        });

   }}