package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Validator {
	
	public static <E> boolean criteriaValidator(Criteria<E> criteria) {
        if(criteria.getCriteria().isEmpty()){return false;}
        Validate validator = new Validate();

		return validator.validate(criteria);
	}

}

class Validate {

    private Criteria criteria;

    <E> boolean validate (Criteria<E> criteria)  {

        this.criteria = criteria;

        Class thisClass = this.getClass();
        Method requiredValidator;
        try {
            requiredValidator = thisClass.getMethod(criteria.getApplianceType() + "Validator");
            return (boolean)requiredValidator.invoke(this);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean LaptopValidator(){
        Object[] keyArray = criteria.getCriteria().keySet().toArray();
        for(Object key : keyArray){
            if(key.getClass() != SearchCriteria.Laptop.class){return false;}
            switch (String.valueOf(key)){
                case "BATTERY_CAPACITY" :
                    if(criteria.getValue(key) == null){return false;}
                    if (Double.parseDouble(String.valueOf(criteria.getValue(key)))<0 || Double.parseDouble(String.valueOf(criteria.getValue(key))) > 100){return false;}
                    break;
                case  "OS" :
                    if(criteria.getValue(key) == null){return false;}
                    if(String.valueOf(criteria.getValue(key)).length() >20){return false;}
                    break;
                case "MEMORY_ROM" :
                    if(criteria.getValue(key) == null){return false;}
                    if (Double.parseDouble(String.valueOf(criteria.getValue(key)))<0 ||Double.parseDouble(String.valueOf(criteria.getValue(key))) > 100000){return false;}
                    break;
                case "SYSTEM_MEMORY" :
                    if(criteria.getValue(key) == null){return false;}
                    if (Double.parseDouble(String.valueOf(criteria.getValue(key)))<0 || Double.parseDouble(String.valueOf(criteria.getValue(key))) > 100000){return false;}
                    break;
                case "CPU" :
                    if(criteria.getValue(key) == null){return false;}
                    if (Double.parseDouble(String.valueOf(criteria.getValue(key)))<0 || Double.parseDouble(String.valueOf(criteria.getValue(key))) > 100){return false;}
                    break;
                case "DISPLAY_INCHS" :
                    if(criteria.getValue(key) == null){return false;}
                    if (Double.parseDouble(String.valueOf(criteria.getValue(key)))<0 || Double.parseDouble(String.valueOf(criteria.getValue(key))) > 100){return false;}
                    break;
                default: return false;
            }
        }
       return true;
    }

    public boolean OvenValidator(){
        Object[] keyArray = criteria.getCriteria().keySet().toArray();
        for(Object key : keyArray){
            switch (String.valueOf(key)){
                case "POWER_CONSUMPTION" :
                    if(criteria.getValue(key) == null){return false;}
                    if (Double.parseDouble(String.valueOf(criteria.getValue(key)))<0 || Double.parseDouble(String.valueOf(criteria.getValue(key))) > 10000){return false;}
                    break;
                case "WEIGHT" :
                    if(criteria.getValue(key) == null){return false;}
                    if (Double.parseDouble(String.valueOf(criteria.getValue(key)))<0 || Double.parseDouble(String.valueOf(criteria.getValue(key))) > 100){return false;}
                    break;
                case "CAPACITY" :
                    if(criteria.getValue(key) == null){return false;}
                    if (Double.parseDouble(String.valueOf(criteria.getValue(key)))<0 || Double.parseDouble(String.valueOf(criteria.getValue(key))) > 100){return false;}
                    break;
                case "DEPTH" :
                    if(criteria.getValue(key) == null){return false;}
                    if (Double.parseDouble(String.valueOf(criteria.getValue(key)))<0 || Double.parseDouble(String.valueOf(criteria.getValue(key))) > 1000){return false;}
                    break;
                case "HEIGHT" :
                    if(criteria.getValue(key) == null){return false;}
                    if (Double.parseDouble(String.valueOf(criteria.getValue(key)))<0 || Double.parseDouble(String.valueOf(criteria.getValue(key))) > 1000){return false;}
                    break;
                case "WIDTH" :
                    if(criteria.getValue(key) == null){return false;}
                    if (Double.parseDouble(String.valueOf(criteria.getValue(key)))<0 || Double.parseDouble(String.valueOf(criteria.getValue(key))) > 1000){return false;}
                    break;
                default: return false;
            }
        }
        return true;
    }

    public boolean RefrigeratorValidator(){
        Object[] keyArray = criteria.getCriteria().keySet().toArray();
        for(Object key : keyArray){
            switch (String.valueOf(key)){
                case "POWER_CONSUMPTION" :
                    if(criteria.getValue(key) == null){return false;}
                    if (Double.parseDouble(String.valueOf(criteria.getValue(key)))<0 || Double.parseDouble(String.valueOf(criteria.getValue(key))) > 10000){return false;}
                    break;
                case "WEIGHT" :
                    if(criteria.getValue(key) == null){return false;}
                    if (Double.parseDouble(String.valueOf(criteria.getValue(key)))<0 || Double.parseDouble(String.valueOf(criteria.getValue(key))) > 1000){return false;}
                    break;
                case "FREEZER_CAPACITY" :
                    if(criteria.getValue(key) == null){return false;}
                    if (Double.parseDouble(String.valueOf(criteria.getValue(key)))<0 || Double.parseDouble(String.valueOf(criteria.getValue(key))) > 100){return false;}
                    break;
                case "OVERALL_CAPACITY" :
                    if(criteria.getValue(key) == null){return false;}
                    if (Double.parseDouble(String.valueOf(criteria.getValue(key)))<0 || Double.parseDouble(String.valueOf(criteria.getValue(key))) > 10000){return false;}
                    break;
                case "HEIGHT" :
                    if(criteria.getValue(key) == null){return false;}
                    if (Double.parseDouble(String.valueOf(criteria.getValue(key)))<0 || Double.parseDouble(String.valueOf(criteria.getValue(key))) > 1000){return false;}
                    break;
                case "WIDTH" :
                    if(criteria.getValue(key) == null){return false;}
                    if (Double.parseDouble(String.valueOf(criteria.getValue(key)))<0 || Double.parseDouble(String.valueOf(criteria.getValue(key))) > 1000){return false;}
                    break;
                default: return false;
            }
        }
        return true;
    }

    public boolean SpeakersValidator(){
        Object[] keyArray = criteria.getCriteria().keySet().toArray();
        for(Object key : keyArray){
            switch (String.valueOf(key)){
                case "POWER_CONSUMPTION" :
                    if(criteria.getValue(key) == null){return false;}
                    if (Double.parseDouble(String.valueOf(criteria.getValue(key)))<0 || Double.parseDouble(String.valueOf(criteria.getValue(key))) > 100){return false;}
                    break;
                case "NUMBER_OF_SPEAKERS" :
                    if(criteria.getValue(key) == null){return false;}
                    if (Double.parseDouble(String.valueOf(criteria.getValue(key)))<0 || Double.parseDouble(String.valueOf(criteria.getValue(key))) > 100){return false;}
                    break;
                case  "FREQUENCY_RANGE" :
                    if(criteria.getValue(key) == null){return false;}
                    if(((String)criteria.getValue(key)).length() >20){return false;}
                    break;
                case "CORD_LENGTH" :
                    if(criteria.getValue(key) == null){return false;}
                    if (Double.parseDouble(String.valueOf(criteria.getValue(key)))<0 || Double.parseDouble(String.valueOf(criteria.getValue(key))) > 50){return false;}
                    break;
                default: return false;
            }
        }
        return true;
    }

    public boolean TabletPCValidator(){
        Object[] keyArray = criteria.getCriteria().keySet().toArray();
        for(Object key : keyArray){
            switch (String.valueOf(key)){
                case "BATTERY_CAPACITY" :
                    if(criteria.getValue(key) == null){return false;}
                    if (Double.parseDouble(String.valueOf(criteria.getValue(key)))<0 || Double.parseDouble(String.valueOf(criteria.getValue(key))) > 100){return false;}
                    break;
                case  "COLOR" :
                    if(criteria.getValue(key) == null){return false;}
                    if(((String)criteria.getValue(key)).length() >20){return false;}
                    break;
                case "MEMORY_ROM" :
                    if(criteria.getValue(key) == null){return false;}
                    if (Double.parseDouble(String.valueOf(criteria.getValue(key)))<0 || Double.parseDouble(String.valueOf(criteria.getValue(key))) > 100000){return false;}
                    break;
                case "FLASH_MEMORY_CAPACITY" :
                    if(criteria.getValue(key) == null){return false;}
                    if (Double.parseDouble(String.valueOf(criteria.getValue(key)))<0 || Double.parseDouble(String.valueOf(criteria.getValue(key))) > 100){return false;}
                    break;
                case "DISPLAY_INCHES" :
                    if(criteria.getValue(key) == null){return false;}
                    if (Double.parseDouble(String.valueOf(criteria.getValue(key)))<0 || Double.parseDouble(String.valueOf(criteria.getValue(key))) > 100){return false;}
                    break;
                default: return false;
            }
        }
        return true;
    }

    public boolean VacuumCleanerValidator(){
        Object[] keyArray = criteria.getCriteria().keySet().toArray();
        for(Object key : keyArray){
            switch (String.valueOf(key)){
                case "POWER_CONSUMPTION" :
                    if(criteria.getValue(key) == null){return false;}
                    if (Double.parseDouble(String.valueOf(criteria.getValue(key)))<0 || Double.parseDouble(String.valueOf(criteria.getValue(key))) > 1000){return false;}
                    break;
                case  "FILTER_TYPE" :
                    if(criteria.getValue(key) == null){return false;}
                    if(((String)criteria.getValue(key)).length() >10){return false;}
                    break;
                case  "BAG_TYPE" :
                    if(criteria.getValue(key) == null){return false;}
                    if(((String)criteria.getValue(key)).length() >20){return false;}
                    break;
                case  "WAND_TYPE" :
                    if(criteria.getValue(key) == null){return false;}
                    if(((String)criteria.getValue(key)).length() >50){return false;}
                    break;
                case "MOTOR_SPEED_REGULATION" :
                    if(criteria.getValue(key) == null){return false;}
                    if (Double.parseDouble(String.valueOf(criteria.getValue(key)))<0 || Double.parseDouble(String.valueOf(criteria.getValue(key))) > 10000){return false;}
                    break;
                case "CLEANING_WIDTH" :
                    if(criteria.getValue(key) == null){return false;}
                    if (Double.parseDouble(String.valueOf(criteria.getValue(key)))<0 ||Double.parseDouble(String.valueOf(criteria.getValue(key))) > 100){return false;}
                    break;
                default: return false;
            }
        }
        return true;
    }

}

//you may add your own new classes