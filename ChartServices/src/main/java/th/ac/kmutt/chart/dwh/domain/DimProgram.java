package th.ac.kmutt.chart.dwh.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.swing.Spring;
@Entity
@Table(name="DimProgram")
public class DimProgram implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PROGRAM_KEY")
	private Integer programKey;
	
	@Column(name="PROGRAM_CODE")
	private String programCode;
	
	@Column(name="PROGRAM_NAME")
	private String programName;
	
	@Column(name="PROGRAM_NAME_TH")
	private String programNameTh;
	
	@Column(name="PROGRAM_NAME_ENG")
	private String programNameEng;
	
	@Column(name="PROGRAM_PROJECT_CODE")
	private String programProjectCode;
	
	

	@Column(name="ARRANGE_TYPE")
	private String arrangeType;
	
	public DimProgram() {
		
	}
	
	
	public Integer getProgramKey() {
		return programKey;
	}
	public void setProgramKey(Integer programKey) {
		this.programKey = programKey;
	}
	
	
	public String getProgramCode() {
		return programCode;
	}
	public void setProgramCode(String programCode) {
		this.programCode = programCode;
	}
	
	
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	
	
	public String getProgramNameTh() {
		return programNameTh;
	}
	public void setProgramNameTh(String programNameTh) {
		this.programNameTh = programNameTh;
	}
	
	
	public String getProgramNameEng() {
		return programNameEng;
	}
	public void setProgramNameEng(String programNameEng) {
		this.programNameEng = programNameEng;
	}
	
	
	public String getProgramProjectCode() {
		return programProjectCode;
	}
	public void setProgramProjectCode(String programProjectCode) {
		this.programProjectCode = programProjectCode;
	}
	
	
	public String getArrangeType() {
		return arrangeType;
	}
	public void setArrangeType(String arrangeType) {
		this.arrangeType = arrangeType;
		}
}