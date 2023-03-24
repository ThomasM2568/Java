//On va creer un tableau contenant des points, mais on peut aussi
//mettre des point3d car c'est une classe fille
Point[] tab=new Point[3];

tab[0]=new Point(2,3);
tab[1]=new Point3D(2,3,2);
tab[2]=new Point(1,5);
for(int i=0;i<tab.length;i++){
    System.out.println(tab[i].className()+";"+tab[i].sumOfSquare()+";"+tab[i].radius());
    //Avec les valeurs ci-dessus, on aura :
    //Point : 13;3.60
    //Point3d:17;4.12
    //Point : 26;5.09
}