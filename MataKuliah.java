package Pertemuan08;

	public class MataKuliah {
	    private String kode;
	    private String nama;
	    private int sks;

	    // Konstruktor
	    public MataKuliah(String kode, String nama, int sks) {
	        super();
	        this.kode = kode;
	        this.nama = nama;
	        this.sks = sks;
	    }

	    // Setter untuk kode
	    public void setKode(String kode) {
	        this.kode = kode;
	    }

	    // Getter untuk kode
	    public String getKode() {
	        return kode;
	    }

	    // Setter untuk nama
	    public void setNama(String nama) {
	        this.nama = nama;
	    }

	    // Getter untuk nama
	    public String getNama() {
	        return nama;
	    }

	    // Setter untuk sks
	    public void setSks(int sks) {
	        this.sks = sks;
	    }

	    // Getter untuk sks
	    public int getSks() {
	        return sks;
	    }
	}
