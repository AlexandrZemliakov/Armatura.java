package searchArm;

public class CreateArmature {

    private final String name;//имя
    private final String typeOfUse;// тип использования
    private final String connectionType;// тип соединения
    private final String bodyComposition;// матриал корпуса
    private final String typeOfConstruction;// Конструкция (проход/угл)
    private final int DN;// DN
    private final int PN;// PN
    private final String fig;// fig.
    private final int price;// цена
    private final String comments;//Комментарии

    public CreateArmature
            (String name, String typeOfUse, String connectionType,
             String bodyComposition, String typeOfConstruction,
             int DN, int PN, String fig, int price, String comments) {
        this.name = name; // 1
        this.typeOfUse = typeOfUse;// 2
        this.connectionType = connectionType;// 3
        this.bodyComposition = bodyComposition;// 4
        this.typeOfConstruction = typeOfConstruction;// 5
        this.DN = DN;// 6
        this.PN = PN;// 7
        this.fig = fig;// 8
        this.price = price;
        this.comments = comments;

    }


    public String getName() {  //1
        return name;
    }

    public String getTypeOfUse() {  //2
        return typeOfUse;
    }

    public String getConnectionType() {  //3
        return connectionType;
    }

    public String getBodyComposition() {  //4
        return bodyComposition;
    }

    public String getTypeOfConstruction() {//5
        return typeOfConstruction;
    }

    public int getDN() {  //6
        return DN;
    }

    public int getPN() {  //7
        return PN;
    }

    public String getFig() {  //8
        return fig;
    }

    public int getPrice() {  //9
        return price;
    }

    public String getComments() {  //10
        return comments;
    }


    @Override
    public String toString() {


        return

                name + " " + typeOfUse + " " + connectionType + " соединение" + " " + bodyComposition +
                        " " + typeOfConstruction + " DN " + DN + " PN " + PN + " фиг." + fig +
                        (price == 0 ? "" : (" примерная цена " + price + " EUR")) + "\nПримечание: " + comments + "\n\n";


    }
}

//     Клапан невозвратный межфланцевый,    бронзовый,       проходной          DN100, PN16,  фиг. 262
//     name + typeOfUse  + connectionType + bodyComposition + typeOfConstruction + DN + PN + fig