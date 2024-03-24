package Pertemuan08;

public class ListMataKuliah {
	private Node HEAD;

    // Konstruktor
    public ListMataKuliah() {
        HEAD = null;
    }

    // Metode untuk mengecek apakah daftar kosong
    public boolean isEmpty() {
        return HEAD == null;
    }

    // Metode untuk menambahkan elemen di awal daftar
    public void addHead(MataKuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    // Metode untuk menambahkan elemen di tengah daftar
    public void addMid(MataKuliah data, int posisi) {
        if (posisi <= 0) { // Jika posisi kurang dari atau sama dengan 0, tambahkan di awal
            addHead(data);
        } else if (posisi >= size()) { // Jika posisi lebih besar atau sama dengan ukuran daftar, tambahkan di akhir
            addTail(data);
        } else { // Jika posisi berada di tengah-tengah daftar
            Node newNode = new Node(data); // Membuat node baru dengan data yang diberikan
            Node current = HEAD;
            int counter = 0;

            while (counter < posisi - 1) { // Melintasi daftar hingga mencapai posisi sebelumnya
                current = current.getNext();
                counter++;
            }

            newNode.setNext(current.getNext()); // Mengatur node baru untuk menunjuk ke node berikutnya dari current
            current.setNext(newNode); // Mengatur node current untuk menunjuk ke node baru
        }
    }

    // Metode untuk menambahkan elemen di akhir daftar
    public void addTail(MataKuliah data) {
        Node newNode = new Node(data); // Membuat node baru dengan data yang diberikan

        if (isEmpty()) { // Jika daftar kosong, node baru akan menjadi HEAD
            HEAD = newNode;
        } else {
            Node current = HEAD;
            while (current.getNext() != null) { // Mencari node terakhir dalam daftar
                current = current.getNext();
            }
            current.setNext(newNode); // Menambahkan node baru sebagai node berikutnya dari node terakhir
        }
    }

    // Metode untuk menampilkan elemen-elemen dalam daftar
    public void displayElement() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else {
            Node curNode = HEAD;
            while (curNode != null) {
                System.out.println("Matakuliah: " + curNode.getData().getKode() + ", " + curNode.getData().getNama() + ", " + curNode.getData().getSks());
                curNode = curNode.getNext();
            }
        }
    }

    // Metode untuk mendapatkan ukuran daftar
    public int size() {
        int count = 0;
        Node current = HEAD;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }
}
