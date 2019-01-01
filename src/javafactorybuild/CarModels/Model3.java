package javafactorybuild.CarModels;

/**
 *
 * @author work
 */
public class Model3 extends ModelBase
{
    public Model3(String modelName, int productionYear)
    {
        super(modelName, productionYear);
    }

    @Override
    public void setModelAccessories(ModelAccessories modelAccessories)
    {
        this.modelAccessories = modelAccessories;
    }
}
