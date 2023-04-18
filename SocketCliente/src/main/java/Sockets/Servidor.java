/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sockets;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bruno
 */
//Servidor va a heredar de ConexionSockets
//para poder usar sus métodos
public class Servidor extends ConexionSockets{
// Implementa el Constructor de Conexión Sockets //pasamos el tipo para que Conexión lo tome e inicialice super("servidor");
public Servidor () throws IOException {
    
    super("servidor");
}

public void StartServer() throws IOException{
try{
//el metodo acept()inicializa el socket 
//queda a la espera de solicitudes 
System.out.println("Esperando por una Conexión..."); 
socketCliente = socketServidor.accept();

//Se obtiene el flujo de salida del cliente 
System.out.println("Cliente en linea"); 
salidaCliente = new DataOutputStream(socketCliente.getOutputStream());

//Enviamos un mensaje al cliente
salidaCliente.writeUTF("Petición recibida y aceptada");
//Se obtiene el flujo entrante desde el cliente
BufferedReader entrada = new BufferedReader(new InputStreamReader (socketCliente.getInputStream()));

//Mientras haya mensajes del cliente
while((mensajeServidor = entrada.readLine()) != null) { 
//Mostramos los mensajes recibidos
System.out.println(mensajeServidor);
//Una vez que termino de leer los mensajes 
//Finalizamos la conexión 
System.out.println("Fin de la conexión");
socketServidor.close(); //Se finaliza la conexión con el cliente


}

}
catch (IOException e) { 
        System.out.println(e.getMessage());
        }
}

   
}
