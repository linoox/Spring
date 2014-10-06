package trippie.web.controller;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import trippie.service.TripManager;


public class TripController implements Controller {

    protected final Log logger = LogFactory.getLog(getClass());
    private TripManager tripManager;
    
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    	String now = (new Date()).toString();
        logger.info("Returning hello view with"+now);

        Map<String, Object> myModel = new HashMap<String, Object>();
        myModel.put("now", now);
        myModel.put("trips", this.tripManager.getTrips());
        
        return new ModelAndView("hello","model",myModel);
    }
    
    public void setTripManager(TripManager tripManager) {
    	this.tripManager=tripManager;
    }

}
