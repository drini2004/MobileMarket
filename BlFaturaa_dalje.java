package BL;

import BO.Fatura_Dalje;
import DAL.DALFatura_Dalje;
import java.util.ArrayList;


public class BLFatura_Dalje {
     public static void insert(Fatura_Dalje fatura_dalje) throws Exception{
         DALFatura_Dalje.insert(fatura_dalje);
    }
    
   
    
    public static ArrayList<Fatura_Dalje> selectAll() throws Exception{
        return DALFatura_Dalje.selectAll();
    }
    
    public static Fatura_Dalje select(int Fatura_Dalje_ID) throws Exception{
        return DALFatura_Dalje.select(Fatura_Dalje_ID);
    } 
}