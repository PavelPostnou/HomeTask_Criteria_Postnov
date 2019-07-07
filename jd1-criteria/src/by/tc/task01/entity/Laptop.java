package by.tc.task01.entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Laptop extends Appliance {

    private double BATTERY_CAPACITY, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_INCHS;
    private String OS;

    @Override
    public String toString() {
        return "Laptop{" +
                "BATTERY_CAPACITY=" + BATTERY_CAPACITY +
                ", CPU=" + CPU +
                ", OS='" + OS + '\'' +
                ", DISPLAY_INCHS=" + DISPLAY_INCHS +
                ", MEMORY_ROM=" + MEMORY_ROM +
                ", SYSTEM_MEMORY=" + SYSTEM_MEMORY +
                '}';
    }

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
        search = Pattern.compile("SYSTEM_MEMORY");
        mat = search.matcher(fieldsLine);
        mat.find();
        temp = mat.end();
        search = Pattern.compile("\\d+\\.?(\\d?)+[,;]");
        mat = search.matcher(fieldsLine);
        mat.find(temp);
        SYSTEM_MEMORY = Double.parseDouble(fieldsLine.substring(mat.start(), mat.end()-1));
        search = Pattern.compile("CPU");
        mat = search.matcher(fieldsLine);
        mat.find();
        temp = mat.end();
        search = Pattern.compile("\\d+\\.?(\\d?)+[,;]");
        mat = search.matcher(fieldsLine);
        mat.find(temp);
        CPU = Double.parseDouble(fieldsLine.substring(mat.start(), mat.end()-1));
        search = Pattern.compile("DISPLAY_INCHS");
        mat = search.matcher(fieldsLine);
        mat.find();
        temp = mat.end();
        search = Pattern.compile("\\d+\\.?(\\d?)+[,;]");
        mat = search.matcher(fieldsLine);
        mat.find(temp);
        DISPLAY_INCHS = Double.parseDouble(fieldsLine.substring(mat.start(), mat.end()-1));
        search = Pattern.compile("OS");
        mat = search.matcher(fieldsLine);
        mat.find();
        temp = mat.end();
        search = Pattern.compile("=.+[,;]");
        mat = search.matcher(fieldsLine);
        mat.find(temp);
        OS = fieldsLine.substring(mat.start()+1, mat.end()-1);
    }
}