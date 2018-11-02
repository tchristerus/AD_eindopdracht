package utils;

import models.Lego;

import java.util.ArrayList;

public class ArrayGrabber {

    public static ArrayList<Integer> getItemNumbers(ArrayList<Lego> array) {
        ArrayList<Integer> tmp = new ArrayList<>();
        for (Lego lego : array) {
            if (lego.getItemNumber() != null)
                tmp.add(lego.getItemNumber());
        }
        return tmp;
    }

    public static ArrayList<String> getItemNames(ArrayList<Lego> array) {
        ArrayList<String> tmp = new ArrayList<>();
        for (Lego lego : array) {
            if (lego.getName() != null)
                tmp.add(lego.getName());
        }
        return tmp;
    }

    public static ArrayList<Integer> getItemYears(ArrayList<Lego> array) {
        ArrayList<Integer> tmp = new ArrayList<>();
        for (Lego lego : array) {
            if (lego.getName() != null)
                tmp.add(lego.getYear());
        }
        return tmp;
    }

    public static ArrayList<String> getItemThemes(ArrayList<Lego> array) {
        ArrayList<String> tmp = new ArrayList<>();
        for (Lego lego : array) {
            if (lego.getName() != null)
                tmp.add(lego.getTheme());
        }
        return tmp;
    }

    public static ArrayList<String> getItemSubThemes(ArrayList<Lego> array) {
        ArrayList<String> tmp = new ArrayList<>();
        for (Lego lego : array) {
            if (lego.getName() != null)
                tmp.add(lego.getSubtheme());
        }
        return tmp;
    }

    public static ArrayList<Integer> getItemPieces(ArrayList<Lego> array) {
        ArrayList<Integer> tmp = new ArrayList<>();
        for (Lego lego : array) {
            if (lego.getName() != null)
                tmp.add(lego.getPieces());
        }
        return tmp;
    }

    public static ArrayList<Integer> getItemMiniFigures(ArrayList<Lego> array) {
        ArrayList<Integer> tmp = new ArrayList<>();
        for (Lego lego : array) {
            if (lego.getName() != null)
                tmp.add(lego.getMiniFigures());
        }
        return tmp;
    }

    public static ArrayList<String> getItemImageUrls(ArrayList<Lego> array) {
        ArrayList<String> tmp = new ArrayList<>();
        for (Lego lego : array) {
            if (lego.getName() != null)
                tmp.add(lego.getImageURL());
        }
        return tmp;
    }

    public static ArrayList<Double> getItemGBPs(ArrayList<Lego> array) {
        ArrayList<Double> tmp = new ArrayList<>();
        for (Lego lego : array) {
            if (lego.getName() != null)
                tmp.add(lego.getGBP_MSRP());
        }
        return tmp;
    }

    public static ArrayList<Double> getItemsUSDs(ArrayList<Lego> array) {
        ArrayList<Double> tmp = new ArrayList<>();
        for (Lego lego : array) {
            if (lego.getName() != null)
                tmp.add(lego.getUSD_MSRP());
        }
        return tmp;
    }

    public static ArrayList<Double> getItemCADs(ArrayList<Lego> array) {
        ArrayList<Double> tmp = new ArrayList<>();
        for (Lego lego : array) {
            if (lego.getName() != null)
                tmp.add(lego.getCAD_MSRP());
        }
        return tmp;
    }

    public static ArrayList<Double> getItemEurs(ArrayList<Lego> array) {
        ArrayList<Double> tmp = new ArrayList<>();
        for (Lego lego : array) {
            if (lego.getName() != null)
                tmp.add(lego.getEUR_MSRP());
        }
        return tmp;
    }

    public static ArrayList<String> getItemPackagings(ArrayList<Lego> array) {
        ArrayList<String> tmp = new ArrayList<>();
        for (Lego lego : array) {
            if (lego.getName() != null)
                tmp.add(lego.getPackaging());
        }
        return tmp;
    }

    public static ArrayList<String> getItemAvailabilities(ArrayList<Lego> array) {
        ArrayList<String> tmp = new ArrayList<>();
        for (Lego lego : array) {
            if (lego.getName() != null)
                tmp.add(lego.getAvailability());
        }
        return tmp;
    }
}
