import java.util.HashMap;
import java.util.LinkedList;

public class graph {
    private final HashMap<String, LinkedList<String>> adjList;
    private int countVertex, countEdge;

    public graph() {
        adjList = new HashMap<>();
        countEdge = countVertex = 0;
    }

    /*
     * Setelah kita melakukan inisialisasi awal pada constructor kita membuat sebuah
     * method fungsi yang dinamakan addVertex untuk
     * memasukkan vertex-vertex yang akan kita gunakan menggunakan method put.
     */
    public void addVertex(String vertex) {
        adjList.put(vertex, new LinkedList<>());
        countVertex++;
    }

    /*
     * CountVertex++, berfungsi untuk menambahkan setiap vertex yang sudah
     * dimasukan.
     */
    public void addEdge(String src, String dst) {
        if (adjList.containsKey(src) && adjList.containsKey(dst)) {
            adjList.get(src).add(dst);
            countEdge++;
        }
    }

    /*
     * method addEdge berfungsi untuk menambahkan edge antara vertex awal dengan
     * vertex tujuan.
     * dibuat pengecekan berupa if apakah vertex awal dan vertex tujuan sudah dibuat
     * atau belum,
     * kemudian jika sudah dibuat, maka jalankan perintah :
     * adjList.get(src).add(dst);
     */
    public int lengthVertex() {
        return countVertex;
    }

    /*
     * fungsi method lengthVertex berfungsi untuk mengembalikan nilai, dari
     * countVertex yang sudah dimasukkan.
     */
    public int lengthEdge() {
        return countEdge;
    }

    /*
     * fungsi dari method ini sama dengan method diatas, hanya saja method ini
     * berfungsi untuk mengembalikan jumlah edge nya.
     */
    public void printGraph() {
        for (String vertex : adjList.keySet()) {
            System.out.println(vertex + ":");
            for (String data : adjList.get(vertex))
                System.out.print(" → " + data + " ");
            System.out.println();
        }
    }
}
/*
 * Method ini berfungsi untuk mencetak graph yang sudah dibuat diatas.
 * for (String vertex : adjList.keySet()) berfungsi untuk mendapatkan semua
 * kunci atau key dari adjList;
 */
