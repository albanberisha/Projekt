
public class Dekodim {
   
    public String stringu(String fjalia1, String qelesi)
    { String rezultati="";
   String fjalia="";
   
   

      for(int i=1; i<=fjalia1.length() ; i++)
      { if((i)%(qelesi.length()+1)==0)
          { }
           else{
               fjalia+=fjalia1.charAt(i-1);
               }
      }
     System.out.println(fjalia);
       int gjatesia_qelesi=qelesi.length();
       int gjatesia_fjalia=fjalia.length();
       int numri_kolonave=gjatesia_qelesi;
       int gjatesia_rreshtit_fund=gjatesia_fjalia%gjatesia_qelesi;
       int numri_rreshtave;
       
       
       
       if(gjatesia_fjalia%gjatesia_qelesi==0)
       {numri_rreshtave=gjatesia_fjalia/gjatesia_qelesi;
              }else{
                     numri_rreshtave=(int)((gjatesia_fjalia-gjatesia_rreshtit_fund)/gjatesia_qelesi)+1;
                    }
       
   String[][] tabela= new String[numri_rreshtave][numri_kolonave];
      int counter=0;
      for(int i=0; i!=numri_rreshtave ; i++)
          {
            for(int j=0  ; j!=numri_kolonave ; j++)
             {
                if(counter!=gjatesia_fjalia)
                   { tabela[i][j]=""+fjalia.charAt(counter);
                       counter++;
                    }   
             }
          }
      for(int l=numri_kolonave-1 ; l>=0 ; l--)
         {
          for (int p=0 ; p!=numri_rreshtave ; p++)
          {
              // if(tabela[l][numri_kolonave-(p+1)]==" "){}
               // else{
              if(tabela[p][l]==null){}
              else{
                  rezultati+= tabela[p][l];
                     
                   }
            }
           //rezultati+= " ";
       }
        System.out.println(rezultati);
            return rezultati;
    }
    
}
