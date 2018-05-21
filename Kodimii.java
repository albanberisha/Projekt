
import javax.swing.*;
import javax.swing.JOptionPane;
public class Kodimii{

    public static void main(String[] args) {
        JDialog.setDefaultLookAndFeelDecorated(true);
      JOptionPane.showMessageDialog(null,"Pershendetje, ketu mund te kodoni dhe te dekodoni shprehje");

       Object[] mundesite = {"Kodim", "Dekodim"};
      Object vleraa=JOptionPane.showInputDialog(null, "Zghidhni operacionin qe deshironi ta shfrytezoni?","Kodimi", JOptionPane.QUESTION_MESSAGE, null,mundesite , "Kodimi");
   String vlera=""+vleraa;
      if (vleraa==null)
            {JOptionPane.showMessageDialog(null, "Keni nderprere procesin");}
      else{ qelesiKontroll(vlera);}}
      
      
      
      
      private static void qelesiKontroll(String vlera1)
      {String operacioni=vlera1;
          String qelesi= JOptionPane.showInputDialog("Shtypni qelesin");
          if(qelesi== null)
          {JOptionPane.showMessageDialog(null,"Keni anuluar operacionin");
          }
       
      if(qelesi.matches("^[0-9]*$") && qelesi.length() > 2){
          String fjalia=JOptionPane.showInputDialog("Shtypni fjaline qe deshironi ta dekodoni");
          if(fjalia== null)
             {JOptionPane.showMessageDialog(null, "Keni abortuar operacionin");
             }else{
                  if(fjalia.length()<2*qelesi.length())
                     {JOptionPane.showMessageDialog(null, "Fjalia nuk mund te jete me i vogel se qelesi apo e zbrazet");
                     qelesiKontroll(operacioni);}
                  else{
                       if(vlera1.charAt(0) =='K')
                       { Kodim kodi=new Kodim();
                         Object[] options = {"Prapa",
                          "Largohu"};
                        int n = JOptionPane.showOptionDialog(null,
                       kodi.stringu(fjalia,qelesi)
                      + "","Rezultati",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,options,options[1]);
                    if(n == 0)
                    { qelesiKontroll(operacioni);}
                    else{JOptionPane.showMessageDialog(null,"Keni abortuar procesin");}
                   // else
                    //{ JOptionPane.showMessageDialog(null,"Keni abortuar procesin");}
                     //  JOptionPane.showMessageDialog(null,kodi.stringu(fjalia,qelesi));
                       }else{Dekodim kodi=new Dekodim();
                         Object[] options = {"Prapa",
                          "Largohu"};
                        int n = JOptionPane.showOptionDialog(null,
                       kodi.stringu(fjalia,qelesi)
                      + "","Rezultati",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,options,options[1]);
                    if(n == 0)
                    { qelesiKontroll(operacioni);}
                    else{JOptionPane.showMessageDialog(null,"Keni abortuar procesin");}}}}
      }else
      {  JOptionPane.showMessageDialog(null,"Qelesi nuk mund te permbaje shkronja, te jete me i vogel se 2 apo te jete i zbrazet");
       qelesiKontroll(operacioni);}
          }
      }
    
    

