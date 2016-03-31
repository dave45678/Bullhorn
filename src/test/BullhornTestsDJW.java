package test;

import static org.junit.Assert.*;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.persistence.EntityManager;

import org.junit.Test;

import customTools.DBBullhorn;
import customTools.DBUtil;
import model.Bullhorn;

public class BullhornTestsDJW {

	@Test
	public void DBBullhornInsertTest() {
		Bullhorn submit = new Bullhorn();
		Date today = new Date();
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try{
			submit.setPostid(22);
			submit.setPdate(today);
			submit.setPost("this is a test3");
			submit.setUserid(1);
			DBBullhorn.insert(submit);
		} catch (Exception e){
			e.printStackTrace();;
		} finally {
			em.close();
		}
		System.out.println(submit.getPostid());
	}

}
