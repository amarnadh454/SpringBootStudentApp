package in.hcl.amar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


import lombok.Data;
@Data
@Entity
public class Student {

	@Id
	@GeneratedValue
	private Integer stdId;

	private String stdName;
	
	private Double subject_1;
	private Double subject_2;
	private Double subject_3;
	private Double subject_4;
	private Double subject_5;
	
	private String passpercentage;
    private boolean active;

    
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", subject_1=" + subject_1 + ", subject_2="
				+ subject_2 + ", subject_3=" + subject_3 + ", subject_4=" + subject_4 + ", subject_5=" + subject_5
				+ ", passpercentage=" + passpercentage + ", active=" + active + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (active ? 1231 : 1237);
		result = prime * result + ((passpercentage == null) ? 0 : passpercentage.hashCode());
		result = prime * result + ((stdId == null) ? 0 : stdId.hashCode());
		result = prime * result + ((stdName == null) ? 0 : stdName.hashCode());
		result = prime * result + ((subject_1 == null) ? 0 : subject_1.hashCode());
		result = prime * result + ((subject_2 == null) ? 0 : subject_2.hashCode());
		result = prime * result + ((subject_3 == null) ? 0 : subject_3.hashCode());
		result = prime * result + ((subject_4 == null) ? 0 : subject_4.hashCode());
		result = prime * result + ((subject_5 == null) ? 0 : subject_5.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (active != other.active)
			return false;
		if (passpercentage == null) {
			if (other.passpercentage != null)
				return false;
		} else if (!passpercentage.equals(other.passpercentage))
			return false;
		if (stdId == null) {
			if (other.stdId != null)
				return false;
		} else if (!stdId.equals(other.stdId))
			return false;
		if (stdName == null) {
			if (other.stdName != null)
				return false;
		} else if (!stdName.equals(other.stdName))
			return false;
		if (subject_1 == null) {
			if (other.subject_1 != null)
				return false;
		} else if (!subject_1.equals(other.subject_1))
			return false;
		if (subject_2 == null) {
			if (other.subject_2 != null)
				return false;
		} else if (!subject_2.equals(other.subject_2))
			return false;
		if (subject_3 == null) {
			if (other.subject_3 != null)
				return false;
		} else if (!subject_3.equals(other.subject_3))
			return false;
		if (subject_4 == null) {
			if (other.subject_4 != null)
				return false;
		} else if (!subject_4.equals(other.subject_4))
			return false;
		if (subject_5 == null) {
			if (other.subject_5 != null)
				return false;
		} else if (!subject_5.equals(other.subject_5))
			return false;
		return true;
	}


	public Integer getStdId() {
		return stdId;
	}


	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}


	public String getStdName() {
		return stdName;
	}


	public void setStdName(String stdName) {
		this.stdName = stdName;
	}


	public Double getSubject_1() {
		return subject_1;
	}


	public void setSubject_1(Double subject_1) {
		this.subject_1 = subject_1;
	}


	public Double getSubject_2() {
		return subject_2;
	}


	public void setSubject_2(Double subject_2) {
		this.subject_2 = subject_2;
	}


	public Double getSubject_3() {
		return subject_3;
	}


	public void setSubject_3(Double subject_3) {
		this.subject_3 = subject_3;
	}


	public Double getSubject_4() {
		return subject_4;
	}


	public void setSubject_4(Double subject_4) {
		this.subject_4 = subject_4;
	}


	public Double getSubject_5() {
		return subject_5;
	}


	public void setSubject_5(Double subject_5) {
		this.subject_5 = subject_5;
	}


	public String getPasspercentage() {
		return passpercentage;
	}


	public void setPasspercentage(String passpercentage) {
		this.passpercentage = passpercentage;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	public Student() {
		// TODO Auto-generated constructor stub
	}
	

	
	
}
