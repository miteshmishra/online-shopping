package com.app.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.shoppingbackend.dao.CategoryDAO;
import com.app.shoppingbackend.dto.Category;
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	
	private static List<Category> categories=new ArrayList<Category>();
	
	
	static {
		
		// adding first category....
		Category category=new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("this is some description for television !");
		category.setImageURL("Cat_1.png");
		
		categories.add(category);
		
		// adding second category....
		 category=new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("this is some description for Mobile !");
		category.setImageURL("Cat_2.png");
		categories.add(category);
		
		// adding third category....
		        category=new Category();
				
		        category.setId(3);
				category.setName("Laptop");
				category.setDescription("this is some description for Laptop !");
				category.setImageURL("Cat_3.png");
				categories.add(category);
	}
	
	public List<Category> list() {
		return categories;
	}

	@Override
	public Category get(int id) {
		//  for each loop
		for (Category category : categories) {
			
			if(category.getId()==id) return category;
		}
		return null;
	}
}
