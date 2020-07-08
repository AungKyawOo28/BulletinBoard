package scm.bulletinboard.api.model.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;

/**
 * <h2>User.java class</h2>
 * <p>
 * User Entity Class
 * </p>
 * 
 * @author Aung Kyaw Oo
 *
 */
@Entity
@Table(name = "user")
public class User implements Serializable {
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
   * <h2>name</h2>
   * <p>
   * name (data type => String )
   * </p>
   */
  private String name;
  /**
   * <h2>email</h2>
   * <p>
   * email (data type => String )
   * </p>
   */
  private String email;
  /**
   * <h2>password</h2>
   * <p>
   * password (data type => String )
   * </p>
   */
  private String password;
  /**
   * <h2>profile</h2>
   * <p>
   * profile (data type => String )
   * </p>
   */
  private String profile;
  /**
   * <h2>type</h2>
   * <p>
   * type (data type => String )
   * </p>
   */
  private String type;
  /**
   * <h2>phone</h2>
   * <p>
   * phone (data type => String )
   * </p>
   */
  private String phone;
  /**
   * <h2>address</h2>
   * <p>
   * address (data type => String )
   * </p>
   */
  private String address;
  /**
   * <h2>dob</h2>
   * <p>
   * dob (data type => Date )
   * </p>
   */
  private Date dob;
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
   * <h2>User.java</h2>
   * <p>
   * Constractor for User.java
   * </p>
   * 
   */
  public User() {
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
   * <h2>Do getCreate_user_id</h2>
   * <p>
   * TODO getCreate_user_id
   * </p>
   * 
   * @return create_user_id
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

  /**
   * <h2>Do getName</h2>
   * <p>
   * TODO getName
   * </p>
   * 
   * @return name
   */
  @Column(name = "name")
  public String getName() {
    return name;
  }

  /**
   * <h2>setName</h2>
   * <p>
   * TODO setName
   * </p>
   * 
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * <h2>getEmail</h2>
   * <p>
   * TODO getEmail
   * </p>
   * 
   * @return email
   */
  @Email(message = "Invalid Email")
  @Column(name = "email")
  public String getEmail() {
    return email;
  }

  /**
   * <h2>setEmail</h2>
   * <p>
   * TODO setEmail
   * </p>
   * 
   * @param email
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * <h2>getPassword</h2>
   * <p>
   * TODO getPassword
   * </p>
   * 
   * @return password
   */
  @Column(name = "password")
  public String getPassword() {
    return password;
  }

  /**
   * <h2>setPassword</h2>
   * <p>
   * TODO setPassword
   * </p>
   * 
   * @param password
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * <h2>getProfile</h2>
   * <p>
   * TODO getProfile
   * </p>
   * 
   * @return profile
   */
  @Column(name = "profile")
  public String getProfile() {
    return profile;
  }

  /**
   * <h2>setProfile</h2>
   * <p>
   * TODO setProfile
   * </p>
   * 
   * @param profile
   */
  public void setProfile(String profile) {
    this.profile = profile;
  }

  /**
   * <h2>getType</h2>
   * <p>
   * TODO getType
   * </p>
   * 
   * @return type
   */
  @Column(name = "type")
  public String getType() {
    return type;
  }

  /**
   * <h2>setType</h2>
   * <p>
   * TODO setType
   * </p>
   * 
   * @param type
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * <h2>getPhone</h2>
   * <p>
   * TODO getPhone
   * </p>
   * 
   * @return phone
   */
  @Column(name = "phone")
  public String getPhone() {
    return phone;
  }

  /**
   * <h2>setPhone</h2>
   * <p>
   * TODO setPhone
   * </p>
   * 
   * @param phone
   */
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * <h2>getAddress</h2>
   * <p>
   * TODO getAddress
   * </p>
   * 
   * @return address
   */
  @Column(name = "address")
  public String getAddress() {
    return address;
  }

  /**
   * <h2>setAddress</h2>
   * <p>
   * TODO setAddress
   * </p>
   * 
   * @param address
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * <h2>getDob</h2>
   * <p>
   * TODO getDob
   * </p>
   * 
   * @return dob
   */
  @Column(name = "dob")
  public Date getDob() {
    return dob;
  }

  /**
   * <h2>setDob</h2>
   * <p>
   * TODO setDob
   * </p>
   * 
   * @param dob
   */
  public void setDob(Date dob) {
    this.dob = dob;
  }
}
