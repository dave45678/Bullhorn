package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the BULLHORN database table.
 * 
 */
@Entity
@NamedQuery(name="Bullhorn.findAll", query="SELECT b FROM Bullhorn b")
public class Bullhorn implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long postid;

	@Temporal(TemporalType.DATE)
	private Date pdate;

	private String post;

	private long userid;

	public Bullhorn() {
	}

	public long getPostid() {
		return this.postid;
	}

	public void setPostid(long postid) {
		this.postid = postid;
	}

	public Date getPdate() {
		return this.pdate;
	}

	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}

	public String getPost() {
		return this.post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public long getUserid() {
		return this.userid;
	}

	public void setUserid(long userid2) {
		this.userid = userid2;
	}

}