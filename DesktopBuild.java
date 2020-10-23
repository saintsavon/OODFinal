
public class DesktopBuild implements Command{

    Builder builder;
    String[] storageList, waterCoolList;
    String order;

    public DesktopBuild(Builder builder, String order, String[] storageList, String[] waterCoolList){
        this.builder = builder;
        this.order = order;
        this.storageList = storageList;
        this.waterCoolList = waterCoolList;
    }

    @Override
    public void buildReady() {
        builder.desktopType = order;
        builder.storageList = this.storageList; 
        builder.waterCoolList = this.waterCoolList; 
        builder.getOrder("Desktop");
    }
}
