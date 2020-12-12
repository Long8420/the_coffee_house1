package baitap.ute.th_the_coffee_house.Category;

import java.util.List;

public class Category {
    private String nameCategory_126;
    private List<uudai> uudais_126;
    public Category(String nameCategory, List<uudai> uudais_126){
        this.nameCategory_126 = nameCategory;
        this.uudais_126 = uudais_126;
    }

    public String getNameCategory() {
        return nameCategory_126;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory_126 = nameCategory;
    }

    public List<uudai> getUudais() {
        return uudais_126;
    }

    public void setUudais(List<uudai> uudais) {
        this.uudais_126 = uudais;
    }
}
