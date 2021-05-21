
public class Aula
{
    int cantEst;
    int [] notas = new int[100];
    int cont = 0;
    double promedio; 
    double promedioNotAp;
    int cantAp;
    int cantRep;
    int notaMasAlta;
    public Aula(int cantEst){
     this.cantEst = cantEst;
    }
    public void aniadiirNota(){
       for(cont =0;cont < cantEst;cont++){
         notas[cont] = (int)(Math.random()*100+1);
        }
    }    
    public double promedio(){
        double res;
     for (double not: notas){
        promedio += not / cont;
        }
        res= promedio;
        return res;
    } 
    public double promedioNotaAprob(){
        double res;
        int r=1;
       int cont2=0;
       for(double s: notas){
        if(s>=51){
         cont2++;
         } else{
          if(r >= cont){
            break;
            }
        }  
        r++;
      }
      for (double not: notas){
        if(not>=51){
                promedioNotAp += not / cont2;
            }
        } 
        res= promedioNotAp;
        return res;
    }
    public int cantidadAprob(){
      cantAp=0;
      int res;
      for(int i =0; i<cantEst; i++){
       if(notas[i]>=51){
        cantAp++;
        }
      }
      res = cantAp;
      return res;
     }
    public int cantidadReprob(){
      cantRep=0;
      int res;
     for(int i =0; i<cantEst; i++){
      if(notas[i]<51){
       cantRep++;
        }
     }
     res = cantRep;
     return res;
    }
    public int notaMasAlta(){
       notaMasAlta = notas[0];
        int res;
        for(int i =0; i<=cantEst; i++){
            if(notas[i]>notaMasAlta){
             notaMasAlta = notas[i];
            }
        }
      res = notaMasAlta;
      return res;
    }
}
    