package p1;

import java.util.Set;

public class Student {
	private int sid;
	private String sname;
	private Set cou;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public Set getCou() {
		return cou;
	}
	public void setCou(Set cou) {
		this.cou = cou;
	}
	
}
