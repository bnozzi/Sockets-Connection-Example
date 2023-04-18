/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sockets;

import java.io.DataOutputStream;
import java.io.IOException;

/**
 *
 * @author bruno
 */
public class Cliente extends ConexionSockets{
    
    public Cliente() throws IOException {
        super("Cliente");
    }

    //iniciar cliente
    public void StartCliente() {
        try{
            //flujo de datos para el servidor 
            salidaServidor= new DataOutputStream(socketCliente.getOutputStream());

            //enviar mensaje al servidor 
            salidaServidor.writeUTF("Hola servidor, soy el cliente");

            //finalizar conexion
            socketCliente.close();
            
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
    
    
    
    
    
    
}
