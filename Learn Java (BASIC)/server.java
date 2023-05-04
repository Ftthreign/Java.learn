import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.Date;

public class server {

    static Scanner input() {
        Scanner input = new Scanner(System.in);

        return input;
    }

    public static void main(String[] args) throws Exception {
        try (ServerSocket server = new ServerSocket(8080)) {
            System.out.println("Waiting for connection for port 8080..");
            while (true) {
                try (Socket socket = server.accept()) {
                    Date today = new Date();
                    String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;

                    socket.getOutputStream().write(httpResponse.getBytes("UTF-8"));
                    socket.getOutputStream().write(welcoming().getBytes("UTF-8"));
                    socket.getOutputStream().write(dataPribadi().getBytes("UTF-8"));
                }
            }
        }
    }

    static String welcoming() {
        final String intro = "\n\nperkenalkan nama saya fadhil abdul fattah\n";
        String testing = "Disini saya mengetes server buatan saya....";

        String response = intro + testing;
        return response;
    }

    static String dataPribadi() {
        final String nama = "\n\n\nNAMA :  FADHIL ABDUL FATTAH\n";
        final String npm = "NPM  :  2215061019\n";
        final String kelas = "KELAS : PSTI C\n";

        String response = nama + npm + kelas;

        return response;
    }

}