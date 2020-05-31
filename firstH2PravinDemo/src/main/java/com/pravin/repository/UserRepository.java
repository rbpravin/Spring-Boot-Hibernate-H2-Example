package com.pravin.repository;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pravin.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	
	//public List<User> getUsers();
	User findById(int userid);
	
	List<User> findByName(String uname);
	
	void deleteById(int userid);
	
	

}

/* https://howtodoinjava.com/spring-boot2/h2-database-example/#comment-95139 --- I commented a doubt over here in this website
 * https://www.concretepage.com/spring-5/spring-data-crudrepository-example
 * -----Basic three methods - save(),findAll(),findById(),delete(user obj)----------
a. Create and Update:
Article savedArticle = articleRepository.save(article); 

b. Read:
Article obj = articleRepository.findById(articleId).get();
Iterable<Article> articles = articleRepository.findAll();

c. Delete:
articleRepository.delete(article); 


 ---------- FORMING CUSTOM METHODS----------------------------------------
Custom Repository Methods
CrudRepository provides methods for generic CRUD operation and if we want to add custom methods in our interface that has extended CrudRepository, we can add in following ways.

a. We can start our query method names with find...By, read...By, query...By, count...By, and get...By. Before By we can add expression such as Distinct . After By we need to add property names of our entity.
b. To get data on the basis of more than one property we can concatenate property names using And and Or while creating method names.
c. If we want to use completely custom name for our method, we can use @Query annotation to write query.

Find the code snippet that is using the sample method name for the above scenarios.
public interface ArticleRepository extends CrudRepository<Article, Long>  {
    List<Article> findByTitle(String title);
    List<Article> findDistinctByCategory(String category);
    List<Article> findByTitleAndCategory(String title, String category);

    @Query("SELECT a FROM Article a WHERE a.title=:title and a.category=:category")
    List<Article> fetchArticles(@Param("title") String title, @Param("category") String category);
} 

*/



/*
<S extends T> S save(S entity): Saves and updates the current entity and returns that entity.
Optional<T> findById(ID primaryKey): Returns the entity for the given id.
Iterable<T> findAll(): Returns all entities.
		long count(): Returns the count.
		void delete(T entity): Deletes the given entity.
	boolean existsById(ID primaryKey): Checks if the entity for the given id exists or not.
*/

