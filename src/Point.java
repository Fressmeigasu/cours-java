import java.util.Scanner;

public class Point 
{// début de la classe Point
	
	/*------------------------------*/
	/* attributs de la classe Espace */
	/*------------------------------*/
	
	private double x; //abscisse pas directement modifiable
	private double y; //ordonnée pas directement modifiable
	private double z; //côte pas directement modifiable
	private String nom;// donne un nom au point
	
	/*------------------------------*/
	/* méthodes de la classe Espace */
	/*------------------------------*/
	
	/*------------------------------*/
	/*constructeur de la classe Point*/
	/*------------------------------*/
	
	public Point(String nom, double x, double y, double z) /*nous sommes forcer dès lors qu'un point est construit de lui donner 4 arg*/
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this.nom = nom;
	}
	
	 /*---------------------------------*/
	 /*surdéfinition de la méthode Point*/
	 /*---------------------------------*/
	
	public Point()
	{
		
		Scanner clavier; //déclaration d'une référence sur un objet permettant d'intéragir avec le clavier
		clavier = new Scanner(System.in); //création de l'objet permettant d'intéragir avec le clavier
		System.out.println("x?");//écrit 'x?' sur la sortie standarde
		this.x = clavier.nextDouble();//le programme attend que l'on tape l'abcisse x
		System.out.print("y?");//écrit 'y?' sur la sortie standarde sans retour a la ligne
		this.y = clavier.nextDouble();//le programme attend que l'on tape l'ordonnée y
		System.out.print("z?");//écrit 'z?' sur la sortie standarde sans retour a la ligne
		this.z = clavier.nextDouble();//le programme attend que l'on tape la côte z
		System.out.print("nom?");//écrit 'nom?' sur la sortie standarde sans retour a la ligne
		this.nom = clavier.next();//le programme attend que l'on tape le nom du point
		clavier.close();//referme l'objet clavier(stop l'écoute du clavier)
		
	}
	
	/*------------------------------*/
	/* méthode initialise */
	/*------------------------------*/
	
	void initialise(String nom, double x, double y, double z)// Sring n donne un nom a l'oject
	{// début de la méthode initialise
		this.x = x;
		this.y = y;
		this.z = z;
		this.nom = nom;
		
		
	}// fin de la méthode initialise
	
	//surdéfinition de la méthode initialise
	void initialise(String nom)
	{
		this.nom = nom;
	}
	
	void deplace(double dx, double dy, double dz) 
	{
		x += dx;//x+=dx vaut x=x+dx
		y += dy;
		z += dz;
	}
	
	/*------------------------------*/
	/*---------abscisse-------------*/
	/*------------------------------*/
	double abscisse()
	{
		return x;
	}
	/*surdefinition abscisse (facultatif pour exam)*/
	
	void abscisse(double x)
	{
		this.x=x;
	}
	/*------------------------------*/
	/*---------ordonnée-------------*/
	/*------------------------------*/
	double ordonnée()
	{
		return y;
	}
	/*------------------------------*/
	/*------------cote--------------*/
	/*------------------------------*/
	double cote()
	{
		return z;
	}
	
	/*--retourne la valeur de la variable nom*/
	String nom()
	{
		return this.nom;
	}
	/*------------------------------*/
	/*--distance du pt à un autre---*/
	/*------------------------------*/
	double distance(Point Pt)
	{
		double M;
		M=Math.sqrt(Math.pow(x-Pt.abscisse(), 2) + Math.pow(y-Pt.ordonnée(), 2) + Math.pow(z-Pt.cote(), 2)); /*indication d'une distance entre 2 pts*/
		/*c'est a dire [(delta x)^2 + (delta y)^2 + (delta z)^2]^1/2*/ 
		return M;	
	}
	/*------------------------------*/
	/*-----------affiche------------*/
	/*------------------------------*/
	void affiche()
	{
		System.out.println(nom+"("+x+","+y+","+z+")");//affichage des caractéristiques du points
		//"(" affiche ( ; "("+x affiche (x, le + indique ce qui suit
	}
}// fin de la classe Point 
