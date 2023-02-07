public class Made {
    private String NameOfCountry;
    private String NameOFCompany;
    private int ProductionYear;

    public Made(String nameOfCountry, String nameOFCompany, int productionYear) {
        NameOfCountry = nameOfCountry;
        NameOFCompany = nameOFCompany;
        ProductionYear = productionYear;
    }

    public String getNameOfCountry() {
        return NameOfCountry;
    }

    public String getNameOFCompany() {
        return NameOFCompany;
    }

    public int getProductionYear() {
        return ProductionYear;
    }
}
