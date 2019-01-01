package javafactorybuild;

import javafactorybuild.CarModels.Model3;
import javafactorybuild.CarModels.ModelAccessories;
import javafactorybuild.CarModels.ModelBase;
import javafactorybuild.CarModels.ModelS;
import javafactorybuild.CarModels.ModelY;
import javafactorybuild.CarModels.ModelX;

/**
 *
 * @author work
 */
public class TeslaFactory 
{  
    public ModelBase buildBaseModel(String modelName, int productionYear)
    {
        switch (modelName.toLowerCase())
        {
            case "3":
                return new Model3(modelName, productionYear);
                
            case "x":
                return new ModelX(modelName, productionYear);
                
            case "s":
                return new ModelS(modelName, productionYear);
                
            case "y":
                return new ModelY(modelName, productionYear);
        }   
        
        return null;
    }
    
    public ModelBase buildTesla(String modelName, int productionYear)
    {
        ModelBase tesla = buildBaseModel(modelName, productionYear);
        
        return tesla;
    }
    
    public void addAccessories(ModelBase tesla, ModelAccessories accessories)
    {
        if (accessories != null)
            tesla.setModelAccessories(accessories);
    }
}
