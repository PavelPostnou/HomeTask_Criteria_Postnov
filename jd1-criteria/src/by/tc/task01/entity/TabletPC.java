package by.tc.task01.entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TabletPC extends Appliance{
    private double BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY;
    private String COLOR;

    @Override
    public void setFields(String fieldsLine) {
        Pattern search = Pattern.compile("BATTERY_CAPACITY");
        Matcher mat = search.matcher(fieldsLine);
        mat.find();
        int temp = mat.end();
        search = Pattern.compile("\\d+\\.?(\\d?)+[,;]");
        mat = search.matcher(fieldsLine);
        mat.find(temp);
        BATTERY_CAPACITY = Double.parseDouble(fieldsLine.substring(mat.start(), mat.end()-1));
        search = Pattern.compile("MEMORY_ROM");
        mat = search.matcher(fieldsLine);
        mat.find();
        temp = mat.end();
        search = Pattern.compile("\\d+\\.?(\\d?)+[,;]");
        mat = search.matcher(fieldsLine);
        mat.find(temp);
        MEMORY_ROM = Double.parseDouble(fieldsLine.substring(mat.start(), mat.end()-1));
        search = Pattern.compile("FLASH_MEMORY_CAPACITY");
        mat = search.matcher(fieldsLine);
        mat.find();
        temp = mat.end();
        search = Pattern.compile("\\d+\\.?(\\d?)+[,;]");
        mat = search.matcher(fieldsLine);
        mat.find(temp);
        FLASH_MEMORY_CAPACITY = Double.parseDouble(fieldsLine.substring(mat.start(), mat.end()-1));
        search = Pattern.compile("DISPLAY_INCHES");
        mat = search.matcher(fieldsLine);
        mat.find();
        temp = mat.end();
        search = Pattern.compile("\\d+\\.?(\\d?)+[,;]");
        mat = search.matcher(fieldsLine);
        mat.find(temp);
        DISPLAY_INCHES = Double.parseDouble(fieldsLine.substring(mat.start(), mat.end()-1));
        search = Pattern.compile("COLOR");
        mat = search.matcher(fieldsLine);
        mat.find();
        temp = mat.end();
        search = Pattern.compile("=.+[,;]");
        mat = search.matcher(fieldsLine);
        mat.find(temp);
        COLOR = fieldsLine.substring(mat.start()+1, mat.end()-1);
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "BATTERY_CAPACITY=" + BATTERY_CAPACITY +
                ", DISPLAY_INCHES=" + DISPLAY_INCHES +
                ", MEMORY_ROM=" + MEMORY_ROM +
                ", FLASH_MEMORY_CAPACITY=" + FLASH_MEMORY_CAPACITY +
                ", COLOR='" + COLOR + '\'' +
                '}';
    }
}