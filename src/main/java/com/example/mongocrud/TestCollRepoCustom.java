package com.example.mongocrud;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface TestCollRepoCustom {
	
	List<TestColl> tst();

}
