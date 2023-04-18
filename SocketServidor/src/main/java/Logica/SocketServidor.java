/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.IOException;

import Sockets.Servidor;

/**
 *
 * @author bruno
 */
public class SocketServidor {
    
    public static void main(String[] args) throws IOException {
        
        //instancio servidor 
        Servidor servidor = new Servidor();
        //pruebo si inicio 
        System.out.println("Iniciando Servidor... \n"  );
        //inicio el servidor, espero mensajes y cuando recibo uno cierro la conexion 
        servidor.StartServer();


    }
    
}
