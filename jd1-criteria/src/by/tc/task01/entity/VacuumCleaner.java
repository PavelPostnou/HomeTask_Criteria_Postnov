package by.tc.task01.entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VacuumCleaner extends Appliance{
    private double POWER_CONSUMPTION,  MOTOR_SPEED_REGULATION, CLEANING_WIDTH;
    private String FILTER_TYPE, BAG_TYPE, WAND_TYPE;

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", MOTOR_SPEED_REGULATION=" + MOTOR_SPEED_REGULATION +
                ", CLEANING_WIDTH=" + CLEANING_WIDTH +
                ", FILTER_TYPE='" + FILTER_TYPE + '\'' +
                ", BAG_TYPE='" + BAG_TYPE + '\'' +
                ", WAND_TYPE='" + WAND_TYPE + '\'' +
                '}';
    }

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
        search = Pattern.compile("MOTOR_SPEED_REGULATION");
        mat = search.matcher(fieldsLine);
        mat.find();
        temp = mat.end();
        search = Pattern.compile("\\d+\\.?(\\d?)+[,;]");
        mat = search.matcher(fieldsLine);
        mat.find(temp);
        MOTOR_SPEED_REGULATION = Double.parseDouble(fieldsLine.substring(mat.start(), mat.end()-1));
        search = Pattern.compile("CLEANING_WIDTH");
        mat = search.matcher(fieldsLine);
        mat.find();
        temp = mat.end();
        search = Pattern.compile("\\d+\\.?(\\d?)+[,;]");
        mat = search.matcher(fieldsLine);
        mat.find(temp);
        CLEANING_WIDTH = Double.parseDouble(fieldsLine.substring(mat.start(), mat.end()-1));
        search = Pattern.compile("FILTER_TYPE");
        mat = search.matcher(fieldsLine);
        mat.find();
        temp = mat.end();
        search = Pattern.compile("=.+[,;]");
        mat = search.matcher(fieldsLine);
        mat.find(temp);
        FILTER_TYPE = fieldsLine.substring(mat.start()+1, mat.end()-1);
        search = Pattern.compile("BAG_TYPE");
        mat = search.matcher(fieldsLine);
        mat.find();
        temp = mat.end();
        search = Pattern.compile("=.+[,;]");
        mat = search.matcher(fieldsLine);
        mat.find(temp);
        BAG_TYPE = fieldsLine.substring(mat.start()+1, mat.end()-1);
        search = Pattern.compile("WAND_TYPE");
        mat = search.matcher(fieldsLine);
        mat.find();
        temp = mat.end();
        search = Pattern.compile("=.+[,;]");
        mat = search.matcher(fieldsLine);
        mat.find(temp);
        WAND_TYPE = fieldsLine.substring(mat.start()+1, mat.end()-1);
    }
}