package ac.daffodil.controller;

import ac.daffodil.dao.SchoolDao;
import ac.daffodil.model.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;


@Controller
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    private SchoolDao schoolDao;

    @RequestMapping(value = { "/schoolPage" }, method = RequestMethod.GET)
    public ModelAndView index(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("schools", schoolDao.getAll());
        modelAndView.addObject("message",  request.getParameter("message"));
        modelAndView.addObject("newschool", new School());
        modelAndView.setViewName("admin/adminSchool");
        return modelAndView;
    }

    @RequestMapping(value="/saveschool", method = RequestMethod.POST)
    public String saveschool(School newschool) {
        ModelAndView modelAndView = new ModelAndView();
        /*try {
            newschool.setImage(file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        schoolDao.save(newschool);
        modelAndView.addObject("message", " Data Has Been Saved...");
        return "redirect:/school/schoolPage";
    }

    @RequestMapping(value={"/findForEditschool/{id}"}, method = RequestMethod.GET)
    public ModelAndView findForEditschool(@PathVariable(required = true, name = "id") Long id) {
        ModelAndView modelAndView = new ModelAndView();
        Optional<School> school= schoolDao.find(id);
        modelAndView.addObject("newschool", school.get());
        modelAndView.addObject("school", schoolDao.getAll());
        modelAndView.setViewName("admin/adminSchool");
        return modelAndView;
    }

    @RequestMapping(value="/deleteschool/{id}", method = RequestMethod.GET)
    public String deleteschool(@PathVariable(required = true, name = "id") Long id) {
        ModelAndView modelAndView = new ModelAndView();
        Optional<School> school= schoolDao.find(id);
        schoolDao.delete(school.get());
        modelAndView.addObject("message", " Data Has Been Deleted...");
        return "redirect:/school/schoolPage";
    }
}
