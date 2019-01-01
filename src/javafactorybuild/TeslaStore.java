package javafactorybuild;

import javafactorybuild.CarModels.ModelAccessories;
import javafactorybuild.CarModels.ModelBase;

/**
 *
 * @author work
 */
public class TeslaStore 
{
    private final TeslaFactory teslaFactory;
    
    public TeslaStore(TeslaFactory teslaFactory)
    {
        this.teslaFactory = teslaFactory;
    }
    
    public ModelBase orderCar(String modelName, int productionYear, ModelAccessories accessories)
    {
        ModelBase tesla = teslaFactory.buildTesla(modelName, productionYear);
        teslaFactory.addAccessories(tesla, accessories);
        
        return tesla;
    }
}
