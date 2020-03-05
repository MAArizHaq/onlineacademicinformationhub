package ac.daffodil;

import ac.daffodil.dao.ExamDao;
import ac.daffodil.model.Exam;
import ac.daffodil.repository.ExamRepository;
import ac.daffodil.repository.FileRepository;
import org.junit.Test;
import org.junit.internal.Classes;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OnlineacademicinformationhubApplicationTests {

	private Logger logger= LoggerFactory.getLogger(this.getClass());

	@Autowired
	ExamDao examDao;

	@Test
	public void contextLoads() {

	}



}
