package by.tc.task01.entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Refrigerator extends Appliance{
    private double POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH;

    @Override
    public void setFields(String fieldsLine) {
        Pattern search = Pattern.compile("POWER_CONSUMPTION");
        Matcher mat = search.matcher(fieldsLine);
        mat.find();
        int temp = mat.end();
        search = Pattern.compile("\\d+\\.?(\\d?)+[,;]");
        mat = search.matcher(fieldsLine);
        mat.find(temp);
        POWER_CONSUMPTION = Double.parseDouble(fieldsLine.substring(mat.start(), mat.end()-1));
        search = Pattern.compile("WEIGHT");
        mat = search.matcher(fieldsLine);
        mat.find();
        temp = mat.end();
        search = Pattern.compile("\\d+\\.?(\\d?)+[,;]");
        mat = search.matcher(fieldsLine);
        mat.find(temp);
        WEIGHT = Double.parseDouble(fieldsLine.substring(mat.start(), mat.end()-1));
        search = Pattern.compile("FREEZER_CAPACITY");
        mat = search.matcher(fieldsLine);
        mat.find();
        temp = mat.end();
        search = Pattern.compile("\\d+\\.?(\\d?)+[,;]");
        mat = search.matcher(fieldsLine);
        mat.find(temp);
        FREEZER_CAPACITY = Double.parseDouble(fieldsLine.substring(mat.start(), mat.end()-1));
        search = Pattern.compile("OVERALL_CAPACITY");
        mat = search.matcher(fieldsLine);
        mat.find();
        temp = mat.end();
        search = Pattern.compile("\\d+\\.?(\\d?)+[,;]");
        mat = search.matcher(fieldsLine);
        mat.find(temp);
        OVERALL_CAPACITY = Double.parseDouble(fieldsLine.substring(mat.start(), mat.end()-1));
        search = Pattern.compile("HEIGHT");
        mat = search.matcher(fieldsLine);
        mat.find();
        temp = mat.end();
        search = Pattern.compile("\\d+\\.?(\\d?)+[,;]");
        mat = search.matcher(fieldsLine);
        mat.find(temp);
        HEIGHT = Double.parseDouble(fieldsLine.substring(mat.start(), mat.end()-1));
        search = Pattern.compile("WIDTH");
        mat = search.matcher(fieldsLine);
        mat.find();
        temp = mat.end();
        search = Pattern.compile("\\d+\\.?(\\d?)+[,;]");
        mat = search.matcher(fieldsLine);
        mat.find(temp);
        WIDTH = Double.parseDouble(fieldsLine.substring(mat.start(), mat.end()-1));
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", WEIGHT=" + WEIGHT +
                ", FREEZER_CAPACITY=" + FREEZER_CAPACITY +
                ", OVERALL_CAPACITY=" + OVERALL_CAPACITY +
                ", HEIGHT=" + HEIGHT +
                ", WIDTH=" + WIDTH +
                '}';
    }
}