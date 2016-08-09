package AA102.g5.Case.model;
import java.sql.Blob;
import java.sql.Date;

public class CaseVO implements java.io.Serializable{
	private Integer case_no;
	private Integer mem_no;
	private String case_name;
	private Integer case_status;
	
	private String case_type;
	
	private String case_info;
	private Integer budget;
	private String case_loc;
	private Integer pg_needed;
	private Integer md_needed;
	private Date case_date;
	
	
	public Integer getCase_no() {
		return case_no;
	}
	public void setCase_no(Integer case_no) {
		this.case_no = case_no;
	}
	public String getCase_name() {
		return case_name;
	}
	public void setCase_name(String case_name) {
		this.case_name = case_name;
	}
	public Integer getCase_status() {
		return case_status;
	}
	public void setCase_status(Integer case_status) {
		this.case_status = case_status;
	}
	public Integer getMem_no() {
		return mem_no;
	}
	public void setMem_no(Integer mem_no) {
		this.mem_no = mem_no;
	}
	public String getCase_type() {
		return case_type;
	}
	public void setCase_type(String case_type) {
		this.case_type = case_type;
	}
	
	public String getCase_info() {
		return case_info;
	}
	public void setCase_info(String case_info) {
		this.case_info = case_info;
	}
	public Integer getBudget() {
		return budget;
	}
	public void setBudget(Integer budget) {
		this.budget = budget;
	}
	public String getCase_loc() {
		return case_loc;
	}
	public void setCase_loc(String case_loc) {
		this.case_loc = case_loc;
	}
	public Integer getPg_needed() {
		return pg_needed;
	}
	public void setPg_needed(Integer pg_needed) {
		this.pg_needed = pg_needed;
	}
	public Integer getMd_needed() {
		return md_needed;
	}
	public void setMd_needed(Integer md_needed) {
		this.md_needed = md_needed;
	}
	public Date getCase_date() {
		return case_date;
	}
	public void setCase_date(Date case_date) {
		this.case_date = case_date;
	}
	
	
}
