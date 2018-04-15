package com.example.mongocrud;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;


@Repository
public class TestCollRepoImpl implements TestCollRepoCustom{
	
	ApplicationContext ctx = new AnnotationConfigApplicationContext(MongoConfig.class);
    MongoOperations mongoOperation = (MongoOperations)ctx.getBean("mongoTemplate");
    
    /**
     * 
     */
    public List<TestColl> tst() {
    	Query query = new Query();
		query.addCriteria(Criteria.where("data").is("lookingForMe"));
		List<TestColl> coll =  mongoOperation.find(query, TestColl.class);
		System.out.println(coll.size());
		return coll;
    }

}
