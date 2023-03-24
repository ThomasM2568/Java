public class Cercle {
    //Les variables avec un private ne sont accessibles que par des méthodes
    //Tandis que les publics sont modifiables par n'importe qui
    private int centre_x;
    private int centre_y;
    private int rayon;
    public Cercle (int x,int y, int r){
        centre_x=x;
        centre_y=y;
        if (r<0){
            r=0;
        }
        rayon=r;
    }
    public int getRayon(){
        return rayon;
    }
    public void setRayon(int r){
        if(r<0){
            r=0;
        }
        rayon=r;
    }

}

Cercle c = new Cercle(10,15,30);
int sonRayon=c.getRayon();
c.setRayon(-5);
