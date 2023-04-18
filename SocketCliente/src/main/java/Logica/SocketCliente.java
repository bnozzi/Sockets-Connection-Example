/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Logica;

import java.io.IOException;

import Sockets.Cliente;

/**
 *
 * @author bruno
 */
public class SocketCliente {

    public static void main(String[] args) throws IOException {
        //new client 
        Cliente cliente = new Cliente();

        //start client , send msg and close connection  
        cliente.StartCliente();
        
        



    }
}
