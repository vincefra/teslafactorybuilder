package javafactorybuild;

import javafactorybuild.CarModels.ModelAccessories;
import javafactorybuild.CarModels.ModelBase;

/**
 *
 * @author work
 */
public class TeslaFactoryBuild 
{
    public static void main(String[] args) 
    {
        TeslaFactory teslaFactorySthlm = new TeslaFactory();
        TeslaStore teslaSthlm = new TeslaStore(teslaFactorySthlm);
        
        ModelAccessories a1 = 
            new ModelAccessories.AccessoriesBuilder(false, true)
                .pickSmartAutopilot(true).Build();
        
        ModelBase tesla1 = teslaSthlm.orderCar("3", 2018, a1);
        
        tesla1.showTeslaInfo();
        a1.showInfo();

        
        
        
        ModelAccessories a2 = 
            new ModelAccessories.AccessoriesBuilder(false, true)
                .pickGlassRoof(true)
                .pickSmartAirSuspension(true)
                .pickSmartAutopilot(true).Build();

        ModelBase tesla2 = teslaSthlm.orderCar("X", 2017, a2);
        
        tesla2.showTeslaInfo();
        a2.showInfo();
    }  
}
