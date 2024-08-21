package demo;

public class hinhvuong extends hinhhoc {

	private double canh;
		
	public double getCanh() {
		return canh;
	}

	public void setCanh(double canh) {
		this.canh = canh;
	}
 public hinhvuong() {
 }
public hinhvuong(String tenhinh) {
	super();
}

public hinhvuong(double canh , String tenhinh ) {
	super();
	this.canh = canh;
	this.tenhinh = tenhinh;
}

@Override
public double getDientich() {
	// TODO Auto-generated method stub
	return 0;
}

}
