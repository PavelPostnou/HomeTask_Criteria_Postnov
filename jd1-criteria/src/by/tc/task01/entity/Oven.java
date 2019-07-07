package by.tc.task01.entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Oven extends Appliance{
	private double POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH;

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
		search = Pattern.compile("CAPACITY");
		mat = search.matcher(fieldsLine);
		mat.find();
		temp = mat.end();
		search = Pattern.compile("\\d+\\.?(\\d?)+[,;]");
		mat = search.matcher(fieldsLine);
		mat.find(temp);
		CAPACITY = Double.parseDouble(fieldsLine.substring(mat.start(), mat.end()-1));
		search = Pattern.compile("DEPTH");
		mat = search.matcher(fieldsLine);
		mat.find();
		temp = mat.end();
		search = Pattern.compile("\\d+\\.?(\\d?)+[,;]");
		mat = search.matcher(fieldsLine);
		mat.find(temp);
		DEPTH = Double.parseDouble(fieldsLine.substring(mat.start(), mat.end()-1));
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
		return "Oven{" +
				"POWER_CONSUMPTION=" + POWER_CONSUMPTION +
				", WEIGHT=" + WEIGHT +
				", CAPACITY=" + CAPACITY +
				", DEPTH=" + DEPTH +
				", HEIGHT=" + HEIGHT +
				", WIDTH=" + WIDTH +
				'}';
	}
}