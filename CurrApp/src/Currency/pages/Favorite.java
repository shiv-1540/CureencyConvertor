
package Currency.pages;

public class Favorite {
    private String fromCurrency;
    private String toCurrency;
    private Double exchangerate;

    public Favorite(String fromCurrency, String toCurrency,Double exchangerate) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.exchangerate=exchangerate;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }
     public Double getExchangeRate() {
        return exchangerate;
    }
}

