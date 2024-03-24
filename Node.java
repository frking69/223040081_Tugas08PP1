package Pertemuan08;

public class Node {
	private MataKuliah data;
    private Node next;

    // Konstruktor untuk inisialisasi atribut data
    public Node(MataKuliah data) {
        this.data = data;
    }

    // Setter untuk atribut data
    public void setData(MataKuliah data) {
        this.data = data;
    }

    // Getter untuk atribut data
    public MataKuliah getData() {
        return data;
    }

    // Setter untuk atribut next
    public void setNext(Node next) {
        this.next = next;
    }

    // Getter untuk atribut next
    public Node getNext() {
        return next;
    }

    // Metode untuk menambahkan elemen di awal daftar
    public void addHead(MataKuliah data) {
        Node newNode = new Node(data); // Membuat node baru dengan data yang diberikan
        newNode.setNext(this); // Menunjukkan node selanjutnya dari node baru ke node sebelumnya
        this.next = newNode; // Mengubah referensi node sekarang untuk menunjuk ke node baru
    }

    //Operasi DisplayElement
    public void displayElement() {
        if (this == null) {
            System.out.println("List Kosong");
        } else {
            Node curNode = this;
            while (curNode != null) {
                System.out.println("Kode: " + curNode.getData().getKode());
                System.out.println("Nama: " + curNode.getData().getNama());
                System.out.println("SKS: " + curNode.getData().getSks());
                System.out.println();
                curNode = curNode.getNext();
            }
        }
    }

}
