package org.opencv;

//javadoc:Point_
public class Point {
	
	public double x, y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		this(0, 0);
	}

	public Point clone() {
		return new Point(x, y);
	}
	
	public double dot(Point p) {
		return x * p.x + y * p.y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if ( ! (obj instanceof Point) ) return false;
		Point it = (Point) obj;
		return x == it.x && y == it.y;
	}

	public boolean inside(Rect r) {
		return r.contains(this);
	}


	@Override
	public String toString() {
		if (this == null) return "null";
		return "{" + x + ", " + y + "}";
	}
}