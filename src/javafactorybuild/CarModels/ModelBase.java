package javafactorybuild.CarModels;

import javafactorybuild.Interface.IModelAccessories;

/**
 *
 * @author work
 */
public abstract class ModelBase implements IModelAccessories
{
    private String modelName;
    private String color;
    private int productionYear;
    
    ModelAccessories modelAccessories;
    
    ModelBase(){}
    
    public ModelBase(String modelName, int productionYear)
    {
        this.modelName = modelName;
        this.productionYear = productionYear;
    }
    
    @Override
    public void setModelAccessories(ModelAccessories modelAccessories)
    {
        this.modelAccessories = modelAccessories;
    }
    
    public String getModelName()
    {
        return modelName;
    }
    
    public int getProductionYear()
    {
        return productionYear;
    }
    
    public void showTeslaInfo()
    {
        System.out.println("Modelnamn: Model " + getModelName());
        System.out.println("Modelår: " + getProductionYear());
        System.out.println("");
    }
}
