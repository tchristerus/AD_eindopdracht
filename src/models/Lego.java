package models;

public class Lego {
    private Integer itemNumber;
    private String name;
    private Integer year;
    private String theme;
    private String Subtheme;
    private Integer pieces;
    private Integer miniFigures;
    private String ImageURL;
    private Double GBP_MSRP;
    private Double USD_MSRP;
    private Double CAD_MSRP;
    private Double EUR_MSRP;
    private String packaging;
    private String availability;

    public Lego(String[] elements) {

        this.itemNumber = tryParseInt(elements[0]);
        this.name = elements[1];
        this.year = tryParseInt(elements[2]);
        this.theme = elements[3];
        this.Subtheme = elements[4];
        this.pieces = tryParseInt(elements[5]);
        this.miniFigures = tryParseInt(elements[6]);
        this.ImageURL = elements[7];
        this.GBP_MSRP = tryParseDouble(elements[8]);
        this.USD_MSRP = tryParseDouble(elements[9]);
        this.CAD_MSRP = tryParseDouble(elements[10]);
        this.EUR_MSRP = tryParseDouble(elements[11]);
        this.packaging = elements[12];
        this.availability = elements[13];
    }

    private Integer tryParseInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException nfe) {
            return null;
        }
    }

    private Double tryParseDouble(String value) {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException nfe) {
            return null;
        }
    }

    public Integer getItemNumber() {
        return itemNumber;
    }

    public String getName() {
        return name;
    }

    public Integer getYear() {
        return year;
    }

    public String getTheme() {
        return theme;
    }

    public String getSubtheme() {
        return Subtheme;
    }

    public Integer getPieces() {
        return pieces;
    }

    public Integer getMiniFigures() {
        return miniFigures;
    }

    public String getImageURL() {
        return ImageURL;
    }

    public Double getGBP_MSRP() {
        return GBP_MSRP;
    }

    public Double getUSD_MSRP() {
        return USD_MSRP;
    }

    public Double getCAD_MSRP() {
        return CAD_MSRP;
    }

    public Double getEUR_MSRP() {
        return EUR_MSRP;
    }

    public String getPackaging() {
        return packaging;
    }

    public String getAvailability() {
        return availability;
    }
}
