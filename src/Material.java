public class Material {

    // enum van materiaaltypes
    public enum materialTypes {Sound, Light, SpecialEffects, TrussAndRigging, Video, Power}

    // instantievariabelen
    private long matPNumber;
    private static long helpMaterialNumber= 0;
    private long materialNumber;
    // private ... image;
    private String materialName;
    private materialTypes typeOfItem;
    private int availableAmount;
    private long priceDay;
    private String description;

    // constructor

    public Material(long matPNumber, String materialName, materialTypes typeOfItem, int availableAmount, long priceDay, String description) {
        this.matPNumber = matPNumber;
        this.materialNumber = helpMaterialNumber++;
        this.materialName = materialName;
        this.typeOfItem = typeOfItem;
        this.availableAmount = availableAmount;
        this.priceDay = priceDay;
        this.description = description;
    }
}
