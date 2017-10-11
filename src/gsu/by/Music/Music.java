package gsu.by.Music;

public class Music {

	private String name;
	private int kol_copy;
	private Boolean mp3;
	
	public Music(String name, int kol_copy, Boolean mp3) {
		super();
		this.name = name;
		this.kol_copy = kol_copy;
		this.mp3 = mp3;
	}

	public Music() {
		super();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKol_copy() {
		return kol_copy;
	}
	public void setKol_copy(int kol_copy) {
		this.kol_copy = kol_copy;
	}
	public Boolean getMp3() {
		return mp3;
	}
	public void setMp3(Boolean mp3) {
		this.mp3 = mp3;
	}

	@Override
	public String toString() {
		return "Music [name=" + name + ", kol_copy=" + kol_copy + ", mp3=" + mp3 + "]";
	}
	
	

}
