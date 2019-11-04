package fr.dauphine.ja.xunicolas.shapes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LigneBrisee {
	ArrayList<Point> ArrayLigneBrisee;
	private Point [] TabLigneBrisee;

	public LigneBrisee (int taille_tab) {
		TabLigneBrisee= new Point[taille_tab];
	}


	public void ajoutPoint (Point p) {
		int tailleTab = this.TabLigneBrisee.length ;
		Point [] tab2 = new Point[tailleTab+1];
		for(int i=0 ; i < this.TabLigneBrisee.length; i++) {
			tab2[i] = this.TabLigneBrisee[i];	
		}
		tab2[tailleTab] = p;
		this.TabLigneBrisee = tab2;
	}

	static Point[] addElement(Point[] a, Point e) {
		a  = Arrays.copyOf(a, a.length + 1);
		a[a.length - 1] = e;
		return a;
	}



	static Point[] ajout (Point p,Point[] l) {
		Point[] a = l;

		int pointer = l.length;
		for (int i = l.length-2 ; i >=0  ; i--) {
			if (l[i]== null) {
				pointer = pointer- i-1   ;
			}
			else if (l[i+1]!=null) {
				pointer = 999999;
			}
		}
		System.out.println(pointer-1);

		l[pointer-1]=p;

		return a;

	}

	public int pointCapacity(Point[] l) {
		int capacite;
		capacite = l.length;
		return capacite;
	}

	public static int nbPoints(Point[] l) {
		int nbpts =0;
		for (int i = l.length-1 ; i >=0  ; i--) {
			if (l[i]== null) {
				nbpts = nbpts + 1 ;
			}
		}
		return nbpts;
	}

	public static boolean contains (Point[] l, Point p) {
		int tester = 0;
		boolean indicateur = false;
		for (Point elemL : l) {
			if ( elemL == p) {
				tester = tester +1;
			}

			if (tester >= 1 ) {
				indicateur = true;
			} else {
				indicateur = false;
			}

		}
		return indicateur;
	}


	public static void main(String[] args) {
		Point p1=new Point(1,2);
		Point p2=new Point(2,5);
		Point p3=new Point(3,7);
		Point p4=new Point(5,9);
		/*
		Point[] l = {p1,p2};
		System.out.println(l.length);
		l = addElement(l,p3);
		System.out.println(l.length);*/

		Point[] tata = new Point[2];
		System.out.println(tata.length);
		System.out.println(tata[0]);
		System.out.println("il reste " +nbPoints(tata) + " places");
		ajout(p1,tata);
		System.out.println(tata[0]);
		System.out.println("------------------");
		System.out.println(tata[1]);
		System.out.println("il reste " +nbPoints(tata) + " places");
		ajout(p2,tata);
		System.out.println(tata[1]);
		//ajout(p3,tata);
		System.out.println(tata[0]);
		System.out.println(tata[1]);
		System.out.println(tata[0]==null);
		System.out.println(tata[1]==null);
		System.out.println("il reste " +nbPoints(tata) + " places");
		System.out.println("Présence du Point 1 dans tata : " +contains( tata,p1));
		System.out.println("Présence du Point 3 dans tata : " +contains( tata,p3));
		System.out.println(contains(tata,null));
		//ajout(null,tata);
		//System.out.println(contains(tata,null));


	}
}