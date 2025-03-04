package admestacionamiento;

import java.util.Scanner;

public class AdmEstacionamiento {

    public static void main(String[] args) {
        String placa = "";
        double total;
        double totalDia = 0;
        int conTotal1 = 0;
        int conTotal2 = 0;
        int conTotal3 = 0;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int opciones = 0;

        while (!placa.equalsIgnoreCase("Fin")) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese la placa del vehículo");
            placa = teclado.nextLine();
            if (!placa.equalsIgnoreCase("Fin")) {
                while(true){
               try{
                    System.out.println("Ingrese el tipo de estacionamiento:");
                    System.out.println("1.Por Hora ");
                    System.out.println("2.Media Jornada(5 horas)");
                    System.out.println("3.Jornada Completa(Hasta 10 horas)");
                     opciones = teclado.nextInt();
                    break;
               }
               catch(Exception e){
                   System.out.println("Solo se permiten numeros.");
                   teclado.nextLine();
                  
               }
              
              
                }
                    switch (opciones) {
                        case 1:
                            while (true) {
                                int cantHora;
                                System.out.println("Ingrese la cantidad de horas(1-4)");
                                cantHora = teclado.nextInt();
                                if (cantHora >= 1 && cantHora <= 4) {
                                    total = cantHora * 3;
                                    System.out.println("El total a pagar es de " + total + "USD");
                                    conTotal1 += cont1 + 1;
                                    totalDia += total;

                                    break;
                                } else {
                                    System.out.println("Por favor. Ingrese un numero de horas entre(1-4)");

                                }

                            }
                            break;

                        case 2:
                            total = 15 - (15 * 0.05);
                            System.out.println("Con un descuento del 5%. El total a pagar es de " + total + "USD");
                            conTotal2 += cont2 + 1;
                            totalDia += total;
                            break;
                        case 3:
                            total = 30 - (30 * 0.10);
                            System.out.println("Con un descuento del 10%. El total a pagar es de" + total + "USD");
                            conTotal3 += cont3 + 1;
                            totalDia += total;
                            break;
                        default:
                            System.out.println("Opcion ingresada invalida. opciones(1-3)");
                            break;

                    }

                
            }
        }
        System.out.println("**************** Total del Dia ********************");
        System.out.println("Cantidad total de estacionamientos por hora " + conTotal1);
        System.out.println("Cantidad total de estacionamientos por Media Jornada " + conTotal2);
        System.out.println("Cantidad total de estacionamientos por Jornada Completa " + conTotal3);
        System.out.println("Total de ingresos en el dia " + totalDia);

    }
}
