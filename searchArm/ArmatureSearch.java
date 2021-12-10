package searchArm;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ArmatureSearch extends ArmatureList {

    private String name;
    private String typeOfUse;// тип использования
    private String connectionType;// тип соединения
    private String bodyComposition;// матриал корпуса
    private String typeOfConstruction;// Конструкция (проход/угл)
    private Integer DN;  // DN
    private Integer minPn;
    private Integer maxPn;
    private String fig;// fig.

    public ArmatureSearch setName(String name) {
        this.name = name;
        return this;
    }

    public ArmatureSearch setTypeOfUse(String typeOfUse) {
        this.typeOfUse = typeOfUse;
        return this;
    }

    public ArmatureSearch setConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }
    public ArmatureSearch setBodyComposition(String bodyComposition) {
        this.bodyComposition = bodyComposition;
        return this;
    }
    public ArmatureSearch setTypeOfConstruction(String typeOfConstruction) {
        this.typeOfConstruction = typeOfConstruction;
        return this;
    }

    public ArmatureSearch setDN(Integer DN) {
        this.DN = DN;
        return this;
    }


    public ArmatureSearch setMinPn(Integer minPn) {
        this.minPn = minPn;
        return this;
    }

    public ArmatureSearch setMaxPn(Integer maxPn) {
        this.maxPn = maxPn;
        return this;
    }

    public ArmatureSearch setFig(String fig) {
        this.fig = fig;
        return this;
    }

    public List<CreateArmature> search(Collection<CreateArmature> valvesList) {
        return valvesList.stream()
                .filter(createArmature->name == null || createArmature.getName().equals(name))
                .filter(createArmature->typeOfUse == null || createArmature.getTypeOfUse().equals(typeOfUse))
                .filter(createArmature->connectionType == null || createArmature.getConnectionType().equals(connectionType))
                .filter(createArmature->bodyComposition == null || createArmature.getBodyComposition().equals(bodyComposition))
                .filter(createArmature->typeOfConstruction == null || createArmature.getTypeOfConstruction().equals(typeOfConstruction))
                .filter(createArmature->typeOfConstruction == null || createArmature.getTypeOfConstruction().equals(typeOfConstruction))
                .filter(createArmature->DN == null || createArmature.getDN()==(DN))
                .filter(createArmature->rangeOf(createArmature.getPN(), minPn, maxPn))
                .filter(createArmature->fig == null || createArmature.getFig().equals(fig))
                .collect(Collectors.toList());
    }

    private boolean rangeOf(Integer value, Integer min, Integer max) {
        if (min==null && max==null) return true;
        if (min!=null && max==null && min<=value) return true;
        if (max!=null && min==null && max>=value) return true;
        if (max!=null && min!=null && max>=value && min<=value) return true;
        return false;
    }

}
