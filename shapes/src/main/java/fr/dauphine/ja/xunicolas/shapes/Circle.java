package fr.dauphine.ja.xunicolas.shapes;

public class Circle {

	Point center;
	double rayon;
	
	public Circle(Point center,double rayon) {
		this.center = center;
		this.rayon = rayon;
	}
	public String toString() {
		return "Le cercle a pour centre "+this.center.toString()+" comme rayon "+this.rayon;
		
	}
	private void translate(int i, int j) {
		this.center.setX(i);
		this.center.setY(j);
		
	}
	
	private Point getCenter() {

		return center ;
	}
	
	private double surface() {
		return (this.rayon*this.rayon)*3.14;
		
	}
	
	private boolean contains(Point p) {
		if(p.getX()<=getCenter().getX()+this.rayon & p.getY()<=getCenter().getY()+this.rayon)  {
			return true;
		}else {
		return false;}
	}
	
	private static boolean contains(Point p, Circle circles) {
		return circles.contains(p);
	}
	
	public static void main( String[] args )
    {
//		Point p=new Point(1,2);
//		Circle c=new Circle(p,1);
//		Circle c2=new Circle(p,2);
//		c2.translate(1,1);
//		System.out.println(c+" "+c2);
		Circle c=new Circle(new Point(1,2), 2);
		c.getCenter().translate(1,1);
		System.out.println(c.surface());
		Point p1 = new Point (2,2);
		System.out.println(c.contains(p1));
		System.out.println(contains(p1,c));
    }



}
