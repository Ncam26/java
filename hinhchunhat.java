package demo;

public class hinhchunhat extends hinhhoc {
private double chieudai;
private double chieurong;

	public double getChieudai() {
	return chieudai;
}

public void setChieudai(double chieudai) {
	this.chieudai = chieudai;
}

public double getChieurong() {
	return chieurong;
}

public void setChieurong(double chieurong) {
	this.chieurong = chieurong;
}

	public hinhchunhat(double chieudai, double chieurong) {
	super();
	this.chieudai = chieudai;
	this.chieurong = chieurong;
}

	@Override
	public double getDientich() {
		// TODO Auto-generated method stub
		return 0;
	}

}
