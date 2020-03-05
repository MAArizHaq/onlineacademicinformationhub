package ac.daffodil.controller;

import ac.daffodil.dao.RoleDao;
import ac.daffodil.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;



@Controller
public class HomeController {

    @RequestMapping(value = { "/" }, method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("fragments/layout");
        return modelAndView;
    }
    @RequestMapping(value = { "/defaultLogin" }, method = RequestMethod.GET)
    public String defaultLogin(HttpServletRequest request) {
        if(request.isUserInRole("admin")){
            return "redirect:/admin/adminDashPage";
        }
        return "redirect:/user/userDashPage";
    }



}
