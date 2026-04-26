package modul3;

class Node {
    String data;
    Node nextNode;
}

public class tesNode{
    public static void main(String args[]) {
        Node emptyList = null; /* membuat list kosong */

        /* head points untuk node pertama dalam list */
        Node head = new Node();
        /* inisialisasi node pertama dalam list */
        head.data = "Rizqy";

        head.nextNode = new Node();
        head.nextNode.data = "Lawu";

        head.nextNode.nextNode = new Node();
        head.nextNode.nextNode.data = "Saputra";

        /* null menandai akhir dari list */
        head.nextNode.nextNode.nextNode = null;

        /* mencetak elemen list */
        Node currNode = head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.nextNode;
        }
    }
}