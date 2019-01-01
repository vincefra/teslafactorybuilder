package javafactorybuild.CarModels;

/**
 *
 * @author work
 */
public class ModelS extends ModelBase
{
    private String[] performanceType = {"75D", "100D", "P100D"};
        
    public ModelS(String modelName, int productionYear)
    {
        super(modelName, productionYear);
    }

    @Override
    public void setModelAccessories(ModelAccessories modelAccessories)
    {
        this.modelAccessories = modelAccessories;
    }
}
