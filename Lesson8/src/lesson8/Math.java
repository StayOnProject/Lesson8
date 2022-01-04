package lesson8;

import java.awt.List;
import java.util.ArrayList;

public class Math {
   
    private class Mly
    {
        public int Value;
        public Mly(int value)
        {
            Value = value;
        }
    }
    
    private int Multiply(int[][] varibles, int cut)
    {
      ArrayList<Mly> list = new ArrayList<Mly>();

        for (int y = 0; y < cut+1; y++) {
             int value = varibles[0][y];
                
                if (value % 2 != 0)
                {
                   list.add(new Mly(value));
                }    
        }
        
        if (list.size() > 0) {
            int multiplay = list.get(0).Value;
            if (list.size() > 1)
            {
                for (int i = 1; i < list.size(); i++) {
                    multiplay *= list.get(i).Value;
                }
            }
            
            return multiplay;
        }
        
        return 0;
    }
    
    private int Sum(int[][] varibles, int cut)
    {
        int mplyValue = 0;
        
            for (int y = 0; y < cut+1; y++) {
                int value = varibles[0][y];
                
                if (value % 2 == 0)
                {
                    mplyValue += value;
                }     
            }
        
        return mplyValue;
    }
    
    public int[][] Calculate(int[][] varibles)
    {
        int[][] export = new int[2][10];
               
        for (int y = 0; y < 10; y++) {
                
       int multiplyValue = Multiply(varibles, y);
       int sumValue = Sum(varibles, y);
            
            System.err.println(multiplyValue);
       System.err.println(sumValue);
                int k = varibles[0][y];
                export[0][y] = k;
                
                if (k >= 0)
                {
                    int result = multiplyValue - sumValue;
                    varibles[1][y] = result;
                    export[1][y] = result;
                } 
        }
            
        return export;
    }
}
