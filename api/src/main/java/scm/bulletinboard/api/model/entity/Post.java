package scm.bulletinboard.api.model.entity;

import static javax.persistence.GenerationType.IDENTITY;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <h2>Post.java class</h2>
 * <p>
 * Post Entity Class
 * 
 * @author Aung Kyaw Oo
 *
 */
@Entity
@Table(name = "post")
public class Post implements Serializable {
	/**
	 * <h2>serialVersionUID</h2>
	 * <p>
	 * serialVersionUID (data type => long )
	 * </p>
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * <h2>id</h2>
	 * <p>
	 * id (data type => int )
	 * </p>
	 */
	private int id;
	/**
	 * <h2>title</h2>
	 * <p>
	 * title (data type => String )
	 * </p>
	 */
	private String title;
	/**
	 * <h2>description</h2>
	 * <p>
	 * description (data type => String )
	 * </p>
	 */
	private String description;
	/**
	 * <h2>status</h2>
	 * <p>
	 * status (data type => int )
	 * </p>
	 */
	private int status;
	/**
	 * <h2>create_user_id</h2>
	 * <p>
	 * create_user_id (data type => int )
	 * </p>
	 */
	private int create_user_id;
	/**
	 * <h2>updated_user_id</h2>
	 * <p>
	 * updated_user_id (data type => int )
	 * </p>
	 */
	private int updated_user_id;
	/**
	 * <h2>deleted_user_id</h2>
	 * <p>
	 * deleted_user_id (data type => int )
	 * </p>
	 */
	private int deleted_user_id;
	/**
	 * <h2>created_at</h2>
	 * <p>
	 * created_at (data type => Date )
	 * </p>
	 */
	private Date created_at;
	/**
	 * <h2>updated_at</h2>
	 * <p>
	 * updated_at (data type => Date )
	 * </p>
	 */
	private Date updated_at;
	/**
	 * <h2>deleted_at</h2>
	 * <p>
	 * deleted_at (data type => Date )
	 * </p>
	 */
	private Date deleted_at;

	/**
	 * <h2>Post.java</h2>
	 * <p>
	 * Constractor for Post.java
	 * </p>
	 * 
	 */
	public Post() {
		super();
	}

	/**
	 * <h2>Do getId</h2>
	 * <p>
	 * TODO getId
	 * </p>
	 * 
	 * @return id
	 */
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id")
	public int getId() {
		return id;
	}

	/**
	 * <h2>Do setId</h2>
	 * <p>
	 * TODO setId
	 * </p>
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * <h2>Do getTitle</h2>
	 * <p>
	 * TODO getTitle
	 * </p>
	 * 
	 * @return title
	 */
	@Column(name = "title")
	public String getTitle() {
		return title;
	}

	/**
	 * <h2>Do setTitle</h2>
	 * <p>
	 * TODO setTitle
	 * </p>
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * <h2>Do getDescription</h2>
	 * <p>
	 * TODO getDescription
	 * </p>
	 * 
	 * @return description
	 */
	@Column(name = "description")
	public String getDescription() {
		return description;
	}

	/**
	 * <h2>Do setDescription</h2>
	 * <p>
	 * TODO setDescription
	 * </p>
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * <h2>Do getStatus</h2>
	 * <p>
	 * TODO getStatus
	 * </p>
	 * 
	 * @return status
	 */
	@Column(name = "status")
	public int getStatus() {
		return status;
	}

	/**
	 * <h2>Do setStatus</h2>
	 * <p>
	 * TODO setStatus
	 * </p>
	 * 
	 * @param status
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * <h2>Do getCreate_user_id</h2>
	 * <p>
	 * TODO getCreate_user_id
	 * </p>
	 * 
	 * @return create_user_id
	 */
	/**
	 * <h2>Do getCreate_user_id</h2>
	 * <p>
	 * TODO getCreate_user_id
	 * </p>
	 * 
	 * @return
	 */
	@Column(name = "create_user_id")
	public int getCreate_user_id() {
		return create_user_id;
	}

	/**
	 * <h2>Do setCreate_user_id</h2>
	 * <p>
	 * TODO setCreate_user_id
	 * </p>
	 * 
	 * @param create_user_id
	 */
	public void setCreate_user_id(int create_user_id) {
		this.create_user_id = create_user_id;
	}

	/**
	 * <h2>Do getUpdated_user_id</h2>
	 * <p>
	 * TODO getUpdated_user_id
	 * </p>
	 * 
	 * @return updated_user_id
	 */
	@Column(name = "updated_user_id")
	public int getUpdated_user_id() {
		return updated_user_id;
	}

	/**
	 * <h2>Do setUpdated_user_id</h2>
	 * <p>
	 * TODO setUpdated_user_id
	 * </p>
	 * 
	 * @param updated_user_id
	 */
	public void setUpdated_user_id(int updated_user_id) {
		this.updated_user_id = updated_user_id;
	}

	/**
	 * <h2>Do getDeleted_user_id</h2>
	 * <p>
	 * TODO getDeleted_user_id
	 * </p>
	 * 
	 * @return deleted_user_id
	 */
	@Column(name = "deleted_user_id")
	public int getDeleted_user_id() {
		return deleted_user_id;
	}

	/**
	 * <h2>Do setDeleted_user_id</h2>
	 * <p>
	 * TODO setDeleted_user_id
	 * </p>
	 * 
	 * @param deleted_user_id
	 */
	public void setDeleted_user_id(int deleted_user_id) {
		this.deleted_user_id = deleted_user_id;
	}

	/**
	 * <h2>Do getCreated_at</h2>
	 * <p>
	 * TODO getCreated_at
	 * </p>
	 * 
	 * @return created_at
	 */
	@Column(name = "created_at")
	public Date getCreated_at() {
		return created_at;
	}

	/**
	 * <h2>Do setCreated_at</h2>
	 * <p>
	 * TODO setCreated_at
	 * </p>
	 * 
	 * @param created_at
	 */
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	/**
	 * <h2>Do getUpdated_at</h2>
	 * <p>
	 * TODO getUpdated_at
	 * </p>
	 * 
	 * @return updated_at
	 */
	@Column(name = "updated_at")
	public Date getUpdated_at() {
		return updated_at;
	}

	/**
	 * <h2>Do setUpdated_at</h2>
	 * <p>
	 * TODO setUpdated_at
	 * </p>
	 * 
	 * @param updated_at
	 */
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	/**
	 * <h2>Do getDeleted_at</h2>
	 * <p>
	 * TODO getDeleted_at
	 * </p>
	 * 
	 * @return deleted_at
	 */
	@Column(name = "deleted_at")
	public Date getDeleted_at() {
		return deleted_at;
	}

	/**
	 * <h2>Do setDeleted_at</h2>
	 * <p>
	 * TODO setDeleted_at
	 * </p>
	 * 
	 * @param deleted_at
	 */
	public void setDeleted_at(Date deleted_at) {
		this.deleted_at = deleted_at;
	}
}
