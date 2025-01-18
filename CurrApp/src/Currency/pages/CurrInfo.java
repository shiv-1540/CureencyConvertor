
package Currency.pages;

public class CurrInfo {
    private String code;
    private String name;
    private String country;
    private String symbol;
     
    public CurrInfo(String code, String name,String country,String symbol) {
        this.code = code;
        this.name = name;
        this.country=country;
        this.symbol=symbol;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
     public String getCountry() {
        return country;
    }
     public String getSymbol() {
        return symbol;
    }
}
