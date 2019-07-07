package by.tc.task01.entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Speakers extends Appliance{
    private double POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, CORD_LENGTH;
    private String FREQUENCY_RANGE;

    @Override
    public String toString() {
        return "Speakers{" +
                "POWER_CONSUMPTION=" + POWER_CONSUMPTION +
                ", NUMBER_OF_SPEAKERS=" + NUMBER_OF_SPEAKERS +
                ", CORD_LENGTH=" + CORD_LENGTH +
                ", FREQUENCY_RANGE='" + FREQUENCY_RANGE + '\'' +
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
            POWER_CONSUMPTION = Double.parseDouble(fieldsLine.substring(mat.start(), mat.end() - 1));
            search = Pattern.compile("NUMBER_OF_SPEAKERS");
            mat = search.matcher(fieldsLine);
            mat.find();
            temp = mat.end();
            search = Pattern.compile("\\d+\\.?(\\d?)+[,;]");
            mat = search.matcher(fieldsLine);
            mat.find(temp);
            NUMBER_OF_SPEAKERS = Double.parseDouble(fieldsLine.substring(mat.start(), mat.end() - 1));
            search = Pattern.compile("CORD_LENGTH");
            mat = search.matcher(fieldsLine);
            mat.find();
            temp = mat.end();
            search = Pattern.compile("\\d+\\.?(\\d?)+[,;]");
            mat = search.matcher(fieldsLine);
            mat.find(temp);
            CORD_LENGTH = Double.parseDouble(fieldsLine.substring(mat.start(), mat.end() - 1));
            search = Pattern.compile("FREQUENCY_RANGE");
            mat = search.matcher(fieldsLine);
            mat.find();
            temp = mat.end();
            search = Pattern.compile("=.+[,;]");
            mat = search.matcher(fieldsLine);
            mat.find(temp);
            FREQUENCY_RANGE = fieldsLine.substring(mat.start()+1, mat.end() - 1);
    }
}