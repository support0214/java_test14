package test02;
// 자바 빈 + 생성자 + toString(오버라이딩)
public class Student {
	private String stuNo;
	private String name;
	private int avg;
	private String address;
	private String tel;
	private boolean bool;
	
	Student() {	}
	
	
	public Student(String stuNo, String name, int avg, String address, String tel, boolean bool) {
		this.stuNo = stuNo;
		this.name = name;
		this.avg = avg;
		this.address = address;
		this.tel = tel;
		this.bool = bool;
	}

	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public boolean isBool() {
		return bool;
	}
	public void setBool(boolean bool) {
		this.bool = bool;
	}
	
	@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", name=" + name + ", avg=" + avg + ", address=" + address + ", tel=" + tel
				+ ", bool=" + bool + "]";

}
}