public class Point{
    private int x,y;
    public Point (int valx, int valy){
        x=valx;
        y=valy;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public String myName(){
        return "Point";
    }
    public int sumOfSquare(){
        return x**2 + y**2;
    }
    public double radius(){
        return Math.sqrt(sumOfSquare());
    }
}

public class Point3D extends Point{
    //On va heriter de toutes les methodes et variables de
    //la classe mere mais on peut tres bien ajouter d'autres
    //variables qui seront uniquement dans la classe fille
    //On ne redefinie que ce qui change entre la classe mere et la classe fille
    private int z;
    public Point3D(int valx,int valy,int valz){
        //super permet de faire appel au constructeur de la classe mere
        //ici, cela permet de creer les deux premieres coordonnees de la classe mere
        //on ajoute seulement la troisieme coordonnee qui n'etait pas presente precedemment.
        super(valx,valy);
        z=valz;
    }
    public int getZ(){
        return z;
    }

    public String myName(){
        //On peut redefinir une methode deja existante
        //elle ne sera utilisee que par les objets de
        //la classe fille
        return "Point3D";
    }
    public int sumOfSquare(){
        //on peut aussi s'appuyer sur une methode deja existante
        //On recupere la fonction sumOfSquare de la classe mere
        //et on y ajoute le carre de z en plus
        //on ne doit pas redefinir une methode mais on peut
        //s'appuyer sur un methode deja existante de la classe mere
        //de plus, les variables x et y sont privees, on ne peut pas
        //faire x**2+y**2+z**2, car seul z peut etre recupere dans
        //cette classe.
        return super.sumOfSquare()+z**2;
    }
    //Avec un objet de classe Point3D
    //La methode radius de point va utiliser la methode sumOfSquare
    //de point3d pour son calcul. Ce qui ne va pas etre le cas 
    //pour un objet de type point qui n'utilisera pas celle de point3d
    //mais plutot celle de point.
}