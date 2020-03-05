package ac.daffodil.controller;

import ac.daffodil.dao.CollegeDao;
import ac.daffodil.model.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;


@Controller
@RequestMapping("/college")
public class CollegeController {

    @Autowired
    private CollegeDao collegeDao;

    @RequestMapping(value = { "/collegePage" }, method = RequestMethod.GET)
    public ModelAndView index(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("colleges", collegeDao.getAll());
        modelAndView.addObject("message",  request.getParameter("message"));
        modelAndView.addObject("newCollege", new College());
        modelAndView.setViewName("admin/adminCollege");
        System.out.println(modelAndView);
        return modelAndView;
    }

    @RequestMapping(value="/saveCollege", method = RequestMethod.POST)
    public String savecollege(College newCollege) {
        ModelAndView modelAndView = new ModelAndView();
        /*try {
            newcollege.setImage(file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        collegeDao.save(newCollege);
        modelAndView.addObject("message", " Data Has Been Saved...");
        return "redirect:/college/collegePage";
    }

   /* @RequestMapping(value="/saveCollege", method = RequestMethod.POST)
    public String saveCollege(College newCollege) {
        ModelAndView modelAndView = new ModelAndView();
        collegeDao.save(newCollege);
        modelAndView.addObject("message", " Data Has Been Saved...");
        return "redirect:/college/collegePage";
    }
*/
    @RequestMapping(value={"/findForEditcollege/{id}"}, method = RequestMethod.GET)
    public ModelAndView findForEditcollege(@PathVariable(required = true, name = "id") Long id) {
        ModelAndView modelAndView = new ModelAndView();
        Optional<College> college= collegeDao.find(id);
        modelAndView.addObject("newcollege", college.get());
        modelAndView.addObject("universities", collegeDao.getAll());
        modelAndView.setViewName("admin/admincollege");
        return modelAndView;
    }

    @RequestMapping(value="/deletecollege/{id}", method = RequestMethod.GET)
    public String deletecollege(@PathVariable(required = true, name = "id") Long id) {
        ModelAndView modelAndView = new ModelAndView();
        Optional<College> college= collegeDao.find(id);
        collegeDao.delete(college.get());
        modelAndView.addObject("message", " Data Has Been Deleted...");
        return "redirect:/college/collegePage";
    }
}
