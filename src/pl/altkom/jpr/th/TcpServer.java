package pl.altkom.jpr.th;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Copyright 2015 Administrator.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 *
 * @author Administrator
 */
public class TcpServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        String clientSentence;
        String capitalizedSentence;
        ServerSocket server = new ServerSocket(22);

        System.out.println("Starting TCP server");

        while (true) {
            System.out.println("wait for connection");
            Socket client = server.accept();
            System.out.println("client connected");

            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(client.getInputStream()));
            DataOutputStream outToClient = new DataOutputStream(client.getOutputStream());

            do {
                clientSentence = inFromClient.readLine();
                System.out.println("Received: " + clientSentence);
                if (clientSentence != null) {
                    capitalizedSentence = clientSentence.toUpperCase() + '\n' + '\r';
                    outToClient.writeBytes(capitalizedSentence);
                }
                System.out.println("responce sent");

            } while (!clientSentence.equals("end"));

            System.out.println("close client connection");

            inFromClient.close();
            outToClient.close();
            client.close();

        }
    }
}
