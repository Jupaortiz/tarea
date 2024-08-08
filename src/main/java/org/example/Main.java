package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1. Recibir datos
        Scanner lea = new Scanner(System.in);
        String playerName;
        String opcionUser;
        String opcionUserDos;
        String opcionUserTres;
        String opcionPc1, opcionPc2, opcionPc3;
        final String pcName = "SYNET";

        int userWins = 0;
        int pcWins = 0;
        int rounds;

        // Interfaz de bienvenida
        System.out.println("\n*********  *  *********");
        System.out.println("** SCISSORS PAPER GAME **");
        System.out.println("*********  *  *********\n");

        System.out.print("Digita tu nombre de usuario: ");
        playerName = lea.nextLine();

        System.out.print("¿Cuántas veces quieres jugar?: ");
        rounds = lea.nextInt();
        lea.nextLine();  // Consumir la nueva línea

        int contador = 0;

        while (contador < rounds) {
            System.out.print("Juega, escribe tu primera opción de juego (piedra, papel, tijera): ");
            opcionUser = lea.nextLine().toLowerCase();

            System.out.print("Escribe tu segunda opción de juego (piedra, papel, tijera): ");
            opcionUserDos = lea.nextLine().toLowerCase();

            System.out.print("Escribe tu tercera opción de juego (piedra, papel, tijera): ");
            opcionUserTres = lea.nextLine().toLowerCase();

            // Validar opciones del usuario
            if (!(opcionUser.equals("piedra") || opcionUser.equals("papel") || opcionUser.equals("tijera")) ||
                    !(opcionUserDos.equals("piedra") || opcionUserDos.equals("papel") || opcionUserDos.equals("tijera")) ||
                    !(opcionUserTres.equals("piedra") || opcionUserTres.equals("papel") || opcionUserTres.equals("tijera"))) {
                System.out.println("Una o más opciones son incorrectas");
                continue;  // Repetir la ronda si alguna opción es incorrecta
            }

            // Generar opciones aleatorias del computador
            Random aleatoria = new Random();
            int numeroAleatorio1 = aleatoria.nextInt(3);
            int numeroAleatorio2 = aleatoria.nextInt(3);
            int numeroAleatorio3 = aleatoria.nextInt(3);

            if (numeroAleatorio1 == 0) {
                opcionPc1 = "piedra";
            } else if (numeroAleatorio1 == 1) {
                opcionPc1 = "papel";
            } else {
                opcionPc1 = "tijera";
            }

            if (numeroAleatorio2 == 0) {
                opcionPc2 = "piedra";
            } else if (numeroAleatorio2 == 1) {
                opcionPc2 = "papel";
            } else {
                opcionPc2 = "tijera";
            }

            if (numeroAleatorio3 == 0) {
                opcionPc3 = "piedra";
            } else if (numeroAleatorio3 == 1) {
                opcionPc3 = "papel";
            } else {
                opcionPc3 = "tijera";
            }

            System.out.println("El usuario elige: " + opcionUser + ", " + opcionUserDos + ", " + opcionUserTres);
            System.out.println("El computador elige: " + opcionPc1 + ", " + opcionPc2 + ", " + opcionPc3);
            System.out.println("-------------------------------");

            // Elegir el ganador de cada ronda
            // Ronda 1
            if (opcionUser.equals(opcionPc1)) {
                System.out.println("Ronda 1: Empate");
            } else if ((opcionUser.equals("piedra") && opcionPc1.equals("tijera")) ||
                    (opcionUser.equals("papel") && opcionPc1.equals("piedra")) ||
                    (opcionUser.equals("tijera") && opcionPc1.equals("papel"))) {
                System.out.println("Ronda 1: Gana " + playerName);
                userWins++;
            } else {
                System.out.println("Ronda 1: Gana " + pcName);
                pcWins++;
            }

            // Ronda 2
            if (opcionUserDos.equals(opcionPc2)) {
                System.out.println("Ronda 2: Empate");
            } else if ((opcionUserDos.equals("piedra") && opcionPc2.equals("tijera")) ||
                    (opcionUserDos.equals("papel") && opcionPc2.equals("piedra")) ||
                    (opcionUserDos.equals("tijera") && opcionPc2.equals("papel"))) {
                System.out.println("Ronda 2: Gana " + playerName);
                userWins++;
            } else {
                System.out.println("Ronda 2: Gana " + pcName);
                pcWins++;
            }

            // Ronda 3
            if (opcionUserTres.equals(opcionPc3)) {
                System.out.println("Ronda 3: Empate");
            } else if ((opcionUserTres.equals("piedra") && opcionPc3.equals("tijera")) ||
                    (opcionUserTres.equals("papel") && opcionPc3.equals("piedra")) ||
                    (opcionUserTres.equals("tijera") && opcionPc3.equals("papel"))) {
                System.out.println("Ronda 3: Gana " + playerName);
                userWins++;
            } else {
                System.out.println("Ronda 3: Gana " + pcName);
                pcWins++;
            }

            contador++;
        }

        // Mostrar resultados finales
        System.out.println("\nResultados finales:");
        System.out.println(playerName + " ganó " + userWins + " veces.");
        System.out.println(pcName + " ganó " + pcWins + " veces.");
            }
        }


