/**
 * Created by toshiba on 07/11/2016.
 */
public class Joueur {
    String name;
    int score = 0;
    public void calscore(int m){
        this.score = score +m;
    }
    public joueur (){//ici
        this.name=null;
        this.score=0;
    }
    public joueur (String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public int getscore(){
        return score;
    }
    public int setscore(int s){
        return score = s;
    }
	/*joueur(joueur joueur, String name){
		this.score=getscore();
		this.name=name;
	}*/
}
