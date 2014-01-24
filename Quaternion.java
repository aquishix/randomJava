package mandeljava;

public class Quaternion {
	public double a, b, c, d = 0.0;
	
	public Quaternion() {
	}
	
	public Quaternion(double a, double b, double c, double d) {
		set(a,b,c,d);
	}

	public void set(double a, double b, double c, double d) {
		this.a = a;  this.b = b;  this.c = c;  this.d = d;
	}
	
	public void set(Quaternion q) {
		this.a = q.a;  this.b = q.b;  this.c = q.b;  this.d = q.d;
	}
	
	public boolean equals(Quaternion q) {
		if ((q.a == a) && (q.b == b) && (q.c == c) && (q.d == d)) {return true;}
			else {return false;}
	}
	
	public Quaternion multiplyOnRight(double e, double f, double g, double h) {
		return new Quaternion((a*e-b*f-c*g-d*h),(b*e+a*f+c*h-d*g),(a*g-b*h+c*e+d*f),(a*h+b*g-c*f+d*e));
	}
	
	public Quaternion multiplyOnRight(Quaternion q) {
		return new Quaternion((a*q.a-b*q.b-c*q.c-d*q.d),(b*q.a+a*q.b+c*q.d-d*q.c),(a*q.c-b*q.d+c*q.a+d*q.b),(a*q.d+b*q.c-c*q.b+d*q.a));
	}
	
	public Quaternion add(double e, double f, double g, double h) {
		return new Quaternion(a+e,b+f,c+g,d+h);
	}
	
	public Quaternion add(Quaternion q) {
		return new Quaternion(a+q.a,b+q.b,c+q.c,d+q.d);
	}
	
	public double norm() {
		return (Math.sqrt(a*a + b*b + c*c + d*d));
	}
	
	public double normSquared() {
		return a*a + b*b + c*c + d*d;
	}
	
	public Quaternion copy() {
		return new Quaternion(this.a, this.b, this.c, this.d);
	}
	
	
	
	
} // end Quaternion class
