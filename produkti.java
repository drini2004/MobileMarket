
package BL;

import BO.Produkti;
import DAL.DALProdukti;
import java.util.ArrayList;



public class BLProdukti {
   public static void insert(Produkti produkti) throws Exception{
      DALProdukti.insert(produkti);
      
   } 
   
   public static ArrayList<Produkti> selectAll() throws Exception{
        return DALProdukti.selectAll();
    }
   
   public static void update(Produkti produkti)throws Exception{
       
        DALProdukti.update(produkti);
        
   }
   
  public static void delete(int Produkti_ID) throws Exception{
        DALProdukti.delete(Produkti_ID);
    }
   
    public static Produkti select(int Produkti_ID) throws Exception{
        return DALProdukti.select(Produkti_ID);
    }
}
