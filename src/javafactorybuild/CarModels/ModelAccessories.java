package javafactorybuild.CarModels;

/**
 *
 * @author work
 */
public class ModelAccessories 
{
    protected final boolean allWheelDrive;
    private final boolean longRangePackage;
    
    private final boolean glassRoof;
    private final boolean smartAirSuspension;
    private final boolean superSmartAutopilot;
    
    public boolean allWheelDrive()
    {
        return allWheelDrive;
    }
       
    public boolean longRangePackage()
    {
        return longRangePackage;
    }
          
    public boolean glassRoof()
    {
        return glassRoof;
    }
             
    public boolean smartAirSuspension()
    {
        return glassRoof;
    }
                
    public boolean superSmartAutopilot()
    {
        return glassRoof;
    }
    
    public void showInfo()
    {
        System.out.println("## Tillbehör ##");
        System.out.println("Fyrhjulsdrift: " + allWheelDrive);
        System.out.println("Längre räckvidd: " + longRangePackage);
        System.out.println("Glastak: " + glassRoof);
        System.out.println("Air Suspension: " + smartAirSuspension);
        System.out.println("Autopilot V2: " + superSmartAutopilot);
        System.out.println("");
    }
    
    private ModelAccessories(AccessoriesBuilder builder)
    {
        this.allWheelDrive = builder.allWheelDrive;
        this.longRangePackage = builder.longRangePackage;
        this.glassRoof = builder.glassRoof;
        this.smartAirSuspension = builder.smartAirSuspension;
        this.superSmartAutopilot = builder.superSmartAutopilot;
    }
    
    public static class AccessoriesBuilder
    {
        private final boolean allWheelDrive;
        private final boolean longRangePackage;
        
        private boolean glassRoof;
        private boolean smartAirSuspension;
        private boolean superSmartAutopilot;
        
        public AccessoriesBuilder(boolean awd, boolean longRangePackage)
        {
            this.allWheelDrive = awd;
            this.longRangePackage = longRangePackage;
        }
        
        public AccessoriesBuilder pickGlassRoof(boolean glassRoof)
        {
            this.glassRoof = glassRoof;
            return this;
        }
        
        public AccessoriesBuilder pickSmartAirSuspension(boolean smartAirSuspension)
        {
            this.smartAirSuspension = smartAirSuspension;
            return this;
        }
        
        public AccessoriesBuilder pickSmartAutopilot(boolean smartAutopilot)
        {
            this.superSmartAutopilot = smartAutopilot;
            return this;
        }
        
        public ModelAccessories Build()
        {
            return new ModelAccessories(this);
        }      
    }
}
