package eu.senla.task;

public class Cat {
       String NameCat = "Bars";
    int AgeCat = 5;
    public Cat (){

    };
    public Cat (String NameCat, int AgeCat){
        this.NameCat = NameCat;
        this.AgeCat = AgeCat;
    }


     public String getNameCat() {
        return NameCat;
    }

    public int getAgeCat() {
        return AgeCat;
    }

    public void setAgeCat(int ageCat) {
        AgeCat = ageCat;
    }

    public void setNameCat(String nameCat) {
        NameCat = nameCat;
    }


}
