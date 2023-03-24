Point[] tab = new Point[3]; //construit un tableau de 3 cases points (_,_)
tab[0] = new Point(2, 3); //dans la premiere case on met un objet de coordonnées 2,3
tab[1] = new Point3D(2, 3, 2); //dans la seconde case on met un autre point de type point3D notion d'héritage, juste une adresse mémoire qui va dans la case comme dab 
tab[2] = new Point(1, 5); //dans la troisième
for (int i = 0; i < tab.length; i++) {
    System.out.println(
    tab[i].className() + " : " +    
    tab[i].sumOfSquare() + "; " +   
    tab[i].radius()                 
);
}


//résultat
/*
Point : 13 ; 3.60..
Point3D : 17 ; 4.12..
Point : 26 ; 5.09..
*/