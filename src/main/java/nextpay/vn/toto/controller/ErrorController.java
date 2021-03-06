package nextpay.vn.toto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller("error")
public class ErrorController {

    @ExceptionHandler(Exception.class)
    public ModelAndView handleException
            (HttpServletRequest request, Exception ex){
        ModelAndView mav = new ModelAndView();

        mav.addObject("exception", ex.getLocalizedMessage());
        mav.addObject("url", request.getRequestURL());

        mav.setViewName("error");
        return mav;
    }

}