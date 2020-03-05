package ac.daffodil.controller;

import ac.daffodil.dao.NationalUniversityDao;
import ac.daffodil.dao.SchoolDao;
import ac.daffodil.model.NationalUniversity;
import ac.daffodil.model.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;


@Controller
@RequestMapping("/nationalUniversity")
public class NationalUniversityController {

    @Autowired
    private NationalUniversityDao nationalUniversityDao;

    @RequestMapping(value = { "/nationalUniversityPage" }, method = RequestMethod.GET)
    public ModelAndView index(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("nationalUniversity", nationalUniversityDao.getAll());
        modelAndView.addObject("message",  request.getParameter("message"));
        modelAndView.addObject("newsnationalUniversity", new NationalUniversity());
        modelAndView.setViewName("admin/adminnationalUniversity");
        return modelAndView;
    }

    @RequestMapping(value="/savenationalUniversity", method = RequestMethod.POST)
    public String savenationalUniversity(NationalUniversity newnationalUniversity) {
        ModelAndView modelAndView = new ModelAndView();
        /*try {
            newschool.setImage(file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        nationalUniversityDao.save(newnationalUniversity);
        modelAndView.addObject("message", " Data Has Been Saved...");
        return "redirect:/nationalUniversity/nationalUniversityPage";
    }

    @RequestMapping(value={"/findForEditnationalUniversity/{id}"}, method = RequestMethod.GET)
    public ModelAndView findForEditschool(@PathVariable(required = true, name = "id") Long id) {
        ModelAndView modelAndView = new ModelAndView();
        Optional<NationalUniversity> nationalUniversity= nationalUniversityDao.find(id);
        modelAndView.addObject("newsnationalUniversity", nationalUniversity.get());
        modelAndView.addObject("nationalUniversity", nationalUniversityDao.getAll());
        modelAndView.setViewName("admin/adminnationalUniversity");
        return modelAndView;
    }

    @RequestMapping(value="/deletenationalUniversity/{id}", method = RequestMethod.GET)
    public String deletenationalUniversity(@PathVariable(required = true, name = "id") Long id) {
        ModelAndView modelAndView = new ModelAndView();
        Optional<NationalUniversity> nationalUniversity= nationalUniversityDao.find(id);
        nationalUniversityDao.delete(nationalUniversity.get());
        modelAndView.addObject("message", " Data Has Been Deleted...");
        return "redirect:/nationalUniversity/nationalUniversityPage";
    }
}
