package ac.daffodil;

import ac.daffodil.dao.ExamDao;
import ac.daffodil.model.Exam;
import ac.daffodil.repository.ExamRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineacademicinformationhubApplication  {
	public static void main(String[] args) {
		SpringApplication.run(OnlineacademicinformationhubApplication.class, args);
	}
}
