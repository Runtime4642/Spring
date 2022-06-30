package study.querydsl;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import com.querydsl.jpa.impl.JPAQueryFactory;

import study.querydsl.entity.Team;

@SpringBootTest
@Commit
class TranscationTest {

	
	@Autowired
	EntityManager em;
	
	JPAQueryFactory query;
	
	@Test
	void test() throws Exception{
		
		insertData1();
		insertData2();
		throw new RuntimeException();
	}
	
	
//	@Transactional
	public void insertData1() {
		
		Team teamA = new Team("teamA");
		Team teamB = new Team("teamB");
		
		em.persist(teamA);
		em.persist(teamB);
	}
	
//	@Transactional
	public void insertData2() throws Exception{
		Team teamC = new Team("teamC");
		Team teamD = new Team("teamD");
		
		em.persist(teamC);
		em.persist(teamD);
//		throw new RuntimeException();
	}
	
	@BeforeEach
	public void before() {
		query = new JPAQueryFactory(em);
	}

}
