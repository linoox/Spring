package trippie.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import trippie.service.TripBudgetIncrease;
import trippie.service.TripManager;

@Controller
public class TripBudgetIncreaseFormController{
	
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	private TripManager tripManager;
	
	public ModelAndView onSubmit(Object command) throws ServletException {
		int increase = ((TripBudgetIncrease) command).getPercentage();
		logger.info("increasing prices by:" +increase+ "%");
		
		tripManager.increaseBudget(increase);
	    
		Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("increase", increase);
        
        return new ModelAndView("increaseResult","model",myModel);
	}
	
    protected Object formBackingObject(HttpServletRequest request) throws ServletException {
        TripBudgetIncrease budgetIncrease = new TripBudgetIncrease();
        budgetIncrease.setPercentage(20);
        return budgetIncrease;
    }

    public void setProductManager(TripManager tripManager) {
        this.tripManager = tripManager;
    }

    public TripManager getTripManager() {
        return tripManager;
    }
   
}
