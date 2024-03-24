package Pertemuan08;

public class ListMkTest {
	public static void main(String[] args) {
        ListMataKuliah list = new ListMataKuliah();

        list.addHead(new MataKuliah("IF001", "Dasar Pemrograman", 4));
        list.addHead(new MataKuliah("IF002", "Pemrograman Web", 3));
        list.displayElement();
    }
}
