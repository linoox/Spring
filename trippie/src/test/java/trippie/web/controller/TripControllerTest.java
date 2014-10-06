package trippie.web.controller;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;
import trippie.service.TripManagerImpl;
import java.util.Map;

public class TripControllerTest extends TestCase{

    public void testHandleRequestView() throws Exception{		
        TripController controller = new TripController();
        controller.setTripManager(new TripManagerImpl());
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        Map modelMap = (Map) modelAndView.getModel().get("model");
        String nowValue = (String) modelMap.get("now");
        assertNotNull(nowValue);
    }

}
