package com.example.mongocrud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aa")
public class TestCollController {
	
	@Autowired
	private TestCollRepo repo;
	
	 @RequestMapping(value = "/allColl/", method = RequestMethod.GET)
	public ResponseEntity<List<TestColl>> listAllTestColl(){
		 List<TestColl> colls = (List<TestColl>) repo.findAll();
	        if (colls.isEmpty()) {
	            return new ResponseEntity(HttpStatus.NO_CONTENT);
	            // You many decide to return HttpStatus.NOT_FOUND
	        }
	        return new ResponseEntity<List<TestColl>>(colls, HttpStatus.OK);
	}
	 
	 @RequestMapping(value = "/customColl/", method = RequestMethod.GET)
		public ResponseEntity<List<TestColl>> listCustomTestColl(){
			 List<TestColl> colls = (List<TestColl>) repo.tst();
		        if (colls.isEmpty()) {
		            return new ResponseEntity(HttpStatus.NO_CONTENT);
		            // You many decide to return HttpStatus.NOT_FOUND
		        }
		        return new ResponseEntity<List<TestColl>>(colls, HttpStatus.OK);
		}

}
