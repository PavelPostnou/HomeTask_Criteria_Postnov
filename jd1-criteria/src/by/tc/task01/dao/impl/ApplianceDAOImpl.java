package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import java.io.File;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplianceDAOImpl implements ApplianceDAO{

	private final String FileNameAndPath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "resources" + File.separator + "appliances_db.txt";

	@Override
	public <E> Appliance find(Criteria<E> criteria) {
		boolean WasFound = false;
		Appliance appliance = null;
		Object[] keyArray = criteria.getCriteria().keySet().toArray();
		File appliances_db = new File(FileNameAndPath);
		try {
			BufferedReader fin = new BufferedReader(new FileReader(appliances_db));
			String line;
			while((line = fin.readLine()) != null){
				if(line.startsWith(criteria.getApplianceType())){
					for (Object key: keyArray) {
						String search = (key + "=" + criteria.getValue(key)).toLowerCase() + "[,;]";
						Pattern searchRequest = Pattern.compile(search);
						Matcher matcher = searchRequest.matcher(line.toLowerCase());
						if(!matcher.find()){
							WasFound = false;
							break;
						} else {WasFound = true;}
					}
					if(WasFound){
						Class cl = Class.forName("by.tc.task01.entity." + criteria.getApplianceType());
						appliance = (Appliance)cl.newInstance();
						appliance.setFields(line);
					}
				}
			}
			fin.close();
			return appliance;
		} catch (java.io.FileNotFoundException e) {
			System.out.println("File not found");
		} catch (java.io.IOException | ClassNotFoundException | IllegalAccessException | InstantiationException e) {
			e.printStackTrace();
		}

		return null;
	}
}


//you may add your own new classes