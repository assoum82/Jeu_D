/**
 * Created by toshiba on 07/11/2016.
 */ 
// this SRC code not finished i shared it in order to give me my errors than i'll do it again in a clean project thanx 

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        int n,j,k,cmptr,der;
        String name;
        ArrayList<joueur> g = new ArrayList<joueur>();
        De de= new De();
        Scanner na=new Scanner(System.in);
        Scanner s= new Scanner(System.in);

        System.out.println("svp donnez le nombre des joueurs :");
        n=s.nextInt();
        joueur tab[]= new joueur[n];
        for(j=0;j<n;j++){
            System.out.println("svp donnez le nome de joueur n"+(j+1));
            name = na.nextLine();
            tab[j]=new joueur(name);
        }


        for(k=0;k<n;k++){
            der = de.renvoyant();
            tab[k].calscore(der);
        }


        System.out.println(tab[0].name+": scored :"+tab[0].getscore());//pour tester*/
        //System.out.println(tab[1].name+": scored :"+tab[1].getscore());//pour tester
        //nbrjrsg = 0;
        //joueur f = new joueur();
        //g.add(tab[0]);
        //f=tab[0];
        //System.out.println(f.score);//pour tester quel score vas nous afiicherai
		/*for(j=1;j<n;j++){
			if(/*g.get(nbrjrsg).getscore()#/f.getscore() < tab[j].getscore()){
				//g.remove(0);
				//g.add(tab[j]);
				f=tab[j];
			}
			/*if(g.get(nbrjrsg).getscore()== tab[j].getscore()){
				g.add(tab[j]);
				nbrjrsg++;
			}#/
		}
		//g.add(f);
		*/
		/*for(j=0;j<n;j++){
			if(f.getscore()==tab[j].getscore()){
				g.add(tab[j]);
			}
		}*/
		/*for(k=0;k<n;k++){
		for(j=1;j<n;j++){
			if((tab[k].getscore() !=f.getscore() )&& ((tab[k].getscore()>tab[j].getscore()) || tab[k].getscore()==tab[j].getscore())){
				g.add(tab[k]);
			}
			}
		}*/
        //System.out.println(g.size());//juste pour savoir la taille de Arrayliste sortante
        System.out.println(g.size());
        cmptr=6;
        k=0;
        do{
            if(tab[k].getscore()==cmptr){
                g.add(tab[k]);
            }
            k++;
            cmptr--;
        }while((cmptr>=0)&&(k<n));
        System.out.println(g.size()+"\n"+g.get(0).getname()+"***"+g.get(0).getscore());
        System.out.println("voici les resultats");
        for(k=0;k<g.size();k++){
            System.out.println("le #"+(k+1)+":"+g.get(k).getname()+"\n avec un score de:"+g.get(k).getscore());
        }
		/* pour afficher que les gagnats
		if(g.size()>1){
		System.out.println("les gagnats sont :");
		for(j=0;j<n;j++){
			System.out.println("gagnat numoer"+(j+1)+"est :"+g.get(j).getname()+"\n"+"avec un score de :"+g.get(j).getscore());
		}}
		else{
			System.out.println("le gagnat est :"+g.get(0).getname()+"\n"+"avec un score de :"+g.get(0).getscore());
		}*/
    }

}
