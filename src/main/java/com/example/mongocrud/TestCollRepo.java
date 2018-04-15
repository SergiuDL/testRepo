package com.example.mongocrud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestCollRepo extends CrudRepository<TestColl,String>, TestCollRepoCustom{

}
