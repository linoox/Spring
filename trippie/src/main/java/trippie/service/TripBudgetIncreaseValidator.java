package trippie.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class TripBudgetIncreaseValidator implements Validator{

	private int DEFAULT_MIN_PERCENTAGE=0;
	private int DEFAULT_MAX_PERCENTAGE=50;
	private int minPercentage=DEFAULT_MIN_PERCENTAGE;
	private int maxPercentage=DEFAULT_MAX_PERCENTAGE;
	
	/* Logger for this class and subclasses */
	protected final Log logger = LogFactory.getLog(getClass());
	
    public boolean supports(Class clazz) {
        return TripBudgetIncrease.class.equals(clazz);
    }
	
	public void validate(Object obj, Errors errors) {
		TripBudgetIncrease tbi = (TripBudgetIncrease) obj;
		if (tbi == null) {
			errors.rejectValue("percentage", "error.not-specified", null, "Value required.");
		} else {
			logger.info("Validating with " + tbi + ": " + tbi.getPercentage());
			if (tbi.getPercentage() > maxPercentage) {
				 errors.rejectValue("percentage", "error.too-high",
		                    new Object[] {new Integer(maxPercentage)}, "Value too high.");
			}
			if (tbi.getPercentage() <= minPercentage) {
                errors.rejectValue("percentage", "error.too-low",
                    new Object[] {new Integer(minPercentage)}, "Value too low.");
            }
		}
	}
	
    public void setMinPercentage(int i) {
        minPercentage = i;
    }

    public int getMinPercentage() {
        return minPercentage;
    }

    public void setMaxPercentage(int i) {
        maxPercentage = i;
    }

    public int getMaxPercentage() {
        return maxPercentage;
    }
	
	
}
