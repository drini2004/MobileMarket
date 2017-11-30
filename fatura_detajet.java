
package BL;

import BO.Fatura_Dalje;
import BO.Fatura_Dalje_Detajet;
import DAL.DALFatura_Dalje;
import DAL.DALFatura_Dalje_Detajet;
import java.util.ArrayList;


public class BLFatura_Dalje_Detajet {
      public static void insert(Fatura_Dalje_Detajet fatura_dalje_detajet) throws Exception{
        DALFatura_Dalje_Detajet.insert(fatura_dalje_detajet);
    }
    
    //Kjo metode regjistron faturen dhe detajet e fatures
    public static void createFaturaDaljeAndInsertFaturaDaljeDetajet(Fatura_Dalje fatura_dalje, ArrayList<Fatura_Dalje_Detajet> faturaDaljeDetajetList) throws Exception{
        //regjistrohet fatura dalese dhe merret id e gjenruar ne databaze
        int Fatura_Dalje_ID = DALFatura_Dalje.insert(fatura_dalje);
        //id i vendoset objektit fatures dalese
        fatura_dalje.setFatura_Dalje_ID(Fatura_Dalje_ID);
        
        //behet regjistrimi i detajeve
        for(Fatura_Dalje_Detajet faturaDaljeDetajet: faturaDaljeDetajetList){
            //cdo fat.detajet i shtohet objekti fatura dalese
            faturaDaljeDetajet.setFatura_dalje(fatura_dalje);
            //regjistrohen detajet ne databaze
            DALFatura_Dalje_Detajet.insert(faturaDaljeDetajet);
        }
    }
}
