package javafactorybuild.CarModels;

/**
 *
 * @author work
 */
public class ModelY extends ModelBase 
{
    public ModelY(String modelName, int productionYear)
    {
        super(modelName, productionYear);
    }

    @Override
    public void setModelAccessories(ModelAccessories modelAccessories)
    {
        this.modelAccessories = modelAccessories;
    }
}
