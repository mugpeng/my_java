interface IGrapghical {
	public void paint() ;
}

class Point {
	private double x ;
	private double y ;
	public Point(double x, double y) {
		this.x = x ;
		this.y = y ;
	}
	public double getX() {
		return this.x ;
	}
	public double getY() {
		return this.y ;
	}
}

class Triangle implements IGrapghical {
	private Point[] x ;
	private Point[] y ;
	private Point[] z ;
	public Triangle(Point[] x, Point[] y, Point[] z) {
		this.x = x ;
		this.y = y ;
		this.z = z ;
	}
	public void paint() { // 描述x,y,z 三边起始、终止位点的坐标 
		System.out.println(this.x[0].getX() + "," + this.x[0].getY() + " ; " + this.x[1].getX() + "," + this.x[1].getY());
		System.out.println(this.y[0].getX() + "," + this.y[0].getY() + " ; " + this.y[1].getX() + "," + this.y[1].getY());
		System.out.println(this.z[0].getX() + "," + this.z[0].getY() + " ; " + this.z[1].getX() + "," + this.z[1].getY());
	}
}

class Circular implements IGrapghical {
	private double radius ;
	private Point x ;
	public Circular(Point x, double radius) {
		this.x = x ;
		this.radius = radius ;
	}
	public void paint() {
		System.out.println(this.x.getX() + "," + this.x.getY() + " ; " + this.radius) ;
	}
}

class Factory {
	public static IGrapghical getInstance(String className, double ... args) { // 使用可变参数传递坐标
		if("triangle".equalsIgnoreCase(className)) {
			return new Triangle( // 获得三角形每边的起始位点、终止位点的坐标
				new Point[] {
					new Point(args[0], args[1]), new Point(args[2], args[3]) },
				new Point[] {
					new Point(args[4], args[5]), new Point(args[6], args[7]) },
				new Point[] {
					new Point(args[8], args[9]), new Point(args[10], args[11]) }
					) ;
		} else if ("circular".equalsIgnoreCase(className)) {
			return new Circular(
				new Point(args[0], args[1]), args[2] ) ; // 获得圆形所在位置的坐标及其半径
		} else {
			return null ;
		}
	}
}

public class MyInterface {
	public static void main(String[] args) {
		IGrapghical iga1 = Factory.getInstance("circular", 1.1, 1.2, 5) ;
		iga1.paint() ;
		IGrapghical iga2 = Factory.getInstance("triangle", 1.1, 1.2, 1.3, 1.6, 1.1, 1.8, 1.9, 1.15, 1.6, 1.1, 1.8, 1.9) ;
		iga2.paint() ; 
	}
}

