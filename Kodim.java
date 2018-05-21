
public class Kodim
{
    
    
    
    
    public Kodim()
    {
    
    
    }
    public String stringu(String fjalia, String qelesi)
    { String rezultati="";
       int gjatesia_qelesi=qelesi.length();
       int gjatesia_fjalia=fjalia.length();
       int numri_kolonave=gjatesia_qelesi;
       int gjatesia_rreshtit_fund=gjatesia_fjalia%gjatesia_qelesi;
       int numri_rreshtave;
       
       
       
       if(gjatesia_fjalia%gjatesia_qelesi==0)
       {numri_rreshtave=gjatesia_fjalia/gjatesia_qelesi;
       }else{numri_rreshtave=(int)((gjatesia_fjalia-gjatesia_rreshtit_fund)/gjatesia_qelesi)+1;}
        String[][] tabela= new String[numri_rreshtave][numri_kolonave];
     
       
        int counter=0;
        for(int i=0; i!=numri_kolonave ; i++)
        {for(int j=0  ; j!=numri_rreshtave ; j++)
            {
             if(counter!=gjatesia_fjalia)
               { tabela[j][i]=""+fjalia.charAt(counter);
               counter++;
               }   
            } 
         }
        
         for(int l=0 ; l!=numri_rreshtave ; l++)
         {
           for (int p=0 ; p!=numri_kolonave ; p++){
                if(tabela[l][numri_kolonave-(p+1)]==null){rezultati+=" ";}
                 else{
                      rezultati+= tabela[l][numri_kolonave-(p+1)];
                     }
           }
           rezultati+= " ";
        }
        System.out.println(rezultati);
            return rezultati;
    }
    
}  
