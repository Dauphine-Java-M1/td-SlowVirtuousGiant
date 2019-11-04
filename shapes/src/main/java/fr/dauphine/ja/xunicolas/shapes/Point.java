package fr.dauphine.ja.xunicolas.shapes;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Point 
{
	private int x,y;
	private static int count = 0;
	
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
		Point.count += 1;
		
	}
	
    public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}

	public boolean isSameAs(Point p) {
		if(this.getX()==p.getX() && this.getY()==p.getY()) {
			return true;
		}else {
		return false;
		}
	}
	
	// Q3 ex 2 
	public boolean equals(Object o) {
		if(this.getX()==((Point) o).getX() && this.getY()==((Point) o).getY()) {
			return true;
		}else {
		return false;
		}
	}
	
	public void translate(int i, int j) {
		setX(i);
		setY(j);
	}
	
	public String toString() {
		return "Le Point a comme valeur x = "+this.getX()+" et comme valeur y = "+this.getY();
	}
	
	public static void main( String[] args )
    {/*
        Point p0 = new Point(3,4);
        System.out.println("x value : " + p0.x+" & y value : "+p0.y + " élément n°" + p0.count);
        Point p1 = new Point(72,40);
        Point p2 = new Point(14,20);
        System.out.println("x value : " + p2.x+" & y value : "+p2.y + " élément n°" + p2.count);
    */
		Point p1 = new Point(1,2);
		Point p2=p1;
		Point p3 = new Point(1,2);
		
		System.out.println(p1==p2);
		System.out.println(p1==p3);

		// true car meme adresse mémoire
		// false car meme value != meme adresse mémoire		
		System.out.println(p1.isSameAs(p3));
		//true car les valleurs OK
		
		ArrayList<Point> list = new ArrayList<Point>();
		list.add(p1);
		System.out.println(list.indexOf(p1));
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
		System.out.println(p1.toString());
		
    }


}
