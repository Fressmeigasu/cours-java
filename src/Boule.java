public class Boule
{
	/*creation des attributs*/
	
	private Point centre;//création du point d'origine de la boule
	private double rayon;//rayon de la boule
	
	public Boule(String nom, double x, double y, double z, double rayon) 
	{
		
		centre = new Point(nom, x, y, z);
		this.rayon = rayon;
		
	}
	
	public void affiche() 
	{
		
		System.out.println(centre.nom()+"("+centre.abscisse()+","+centre.ordonnée()+","+centre.cote()+")<=>"+rayon);
		
	}
}
