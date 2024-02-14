package com.mycompany.ejvideojuego;

import com.mycompany.ejvideojuego.Logica.VideoJuego;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class EjVideoJuego {

    public static void main(String[] args) {

        List<VideoJuego> listaVideoJuegos = new ArrayList<VideoJuego>();

        /*
       Para crear un video juego declaramos un objeto del tipo de la clase 
       que queremos crear, en este caso la clase VideoJuego
         */
        VideoJuego video1 = new VideoJuego(123, "Banjo", "Nintendo 64", 4, "Plataforma");
        VideoJuego video2 = new VideoJuego(124, "Pokemon", "Family Game", 2, "Shooter");
        VideoJuego video3 = new VideoJuego(125, "Contra", "Play Station 2", 5, "Plataforma Virtual");

        /*
        Para agregar a la lista creada debo realizar lo siguiente
         */
        listaVideoJuegos.add(video1);
        listaVideoJuegos.add(video2);
        listaVideoJuegos.add(video3);

        /*
        Recorrer el ArrayList y mostrarlo por consola
        Lo podemos realizar con un foreach, por cada elemento de la collection que voy a recorrer hago "x" cosa 
        Por cada "VideoJuego" de la lista de "listaVideoJuegos" hago una acción.
         */
        for (VideoJuego juego : listaVideoJuegos) {
            System.out.println("Titulo: " + juego.getTitulo()
                    + " Consola: " + juego.getConsola()
                    + " Cantidad de player: " + juego.getCantJugadores());
        }

        /*
        Cambiar elementos de la collection
         */
        video1.setCantJugadores(1);
        video1.setTitulo("titulo modificado");
        video2.setConsola("Nintendo 64");

        for (VideoJuego video : listaVideoJuegos) {
            if (video.getConsola().equals("Nintendo 64")) {
                System.out.println(video.toString());
            }
        }

    }
}
