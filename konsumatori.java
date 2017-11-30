package BL;

import BO.Konsumatori;
import DAL.DALKonsumatori;



public class BLKonsumatori {
    public static void insert(Konsumatori konsumatori) throws Exception{
      DALKonsumatori.insert(konsumatori);
      
   } 
    
   public static Konsumatori select(int Konsumatori_ID) throws Exception{
        return DALKonsumatori.select(Konsumatori_ID);
    }
}
