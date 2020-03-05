package ac.daffodil.controller;

import ac.daffodil.dao.DepartmentDao;
import ac.daffodil.dao.SchoolDao;
import ac.daffodil.dao.UniversityDao;
import ac.daffodil.model.Department;
import ac.daffodil.model.School;
import ac.daffodil.model.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("/user")
public class UserDashSchoolController {

    @Autowired
    SchoolDao schoolDao;


    @RequestMapping(value = {"/userDashSchoolPage"}, method = RequestMethod.GET)
    public ModelAndView index(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("schools", schoolDao.getAll());
        System.out.println("======================================="+modelAndView);
        System.out.println("======================="+schoolDao.getAll());

        modelAndView.setViewName("user/userDashSchool");
        return modelAndView;
    }

/*
    @RequestMapping(value={"/findForDepartment/{universityId}"}, method = RequestMethod.GET)
    public ModelAndView findForDepartment(@PathVariable(required = true, name = "schoolId") Long schoolId) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("school", schoolDao.getAll());

        List<Department> departments1 = new LinkedList<>();
        for (Department dept : departmentDao.getAll()) {
            if (dept.getschoolId() == schoolId){
                departments1.add(dept);
            }
        }

        modelAndView.addObject("departmentList", departments1);
        modelAndView.setViewName("user/userDashDepartment");
        return modelAndView;
    }
*/

   /* Optional<University> university= Optional.of(new University());

    @RequestMapping(value={"/findForUniversity/{id}"}, method = RequestMethod.GET)
    public ModelAndView findForUniversity(@PathVariable(required = true, name = "id") Long id) {
        ModelAndView modelAndView = new ModelAndView();
        university= universityDao.find(id);
        modelAndView.addObject("university", university.get());

        List<University> universities = new LinkedList<>();
        for (University uni : universityDao.getAll()) {
            if (uni.getUniversityId() != university.get().getUniversityId()){
                universities.add(uni);
            }
        }
        modelAndView.addObject("universities", universities);
        modelAndView.addObject("compareUni", new University());
        modelAndView.setViewName("user/userDashUniversityDetails");
        return modelAndView;
    }

    @RequestMapping(value="/compareUniversity", method = RequestMethod.POST)
    public ModelAndView compareUniversity(University compareUni) {
        ModelAndView modelAndView = new ModelAndView();
        Optional<University> university1= universityDao.find(university.get().getUniversityId());
        modelAndView.addObject("university1", university1.get());
        Optional<University> university2= universityDao.find(compareUni.getUniversityId());
        modelAndView.addObject("university2", university2.get());

        modelAndView.setViewName("user/userDashUniversityCompare");
        return modelAndView;
    }

    @RequestMapping(value = "/universityImageDisplay/{universityId}", method = RequestMethod.GET)
    public void showImage(@PathVariable(required = true, name = "universityId") Long universityId, HttpServletResponse response)
            throws ServletException, IOException {
        Optional<University> university = universityDao.find(universityId);
        response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
        response.getOutputStream().write(university.get().getImage());
        response.getOutputStream().close();
    }
*/
}