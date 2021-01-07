package in.hcl.amar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Entity
public class Student {

	@Id
	@GeneratedValue
	private Integer stdId;

	private String stdName;
	
	private Double english;
	private Double sanskrit;
	private Double maths;
	private Double physics;
	private Double chemistry;
	


	

	
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", english=" + english + ", sanskrit=" + sanskrit
				+ ", maths=" + maths + ", physics=" + physics + ", chemistry=" + chemistry + "]";
	}






	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chemistry == null) ? 0 : chemistry.hashCode());
		result = prime * result + ((english == null) ? 0 : english.hashCode());
		result = prime * result + ((maths == null) ? 0 : maths.hashCode());
		result = prime * result + ((physics == null) ? 0 : physics.hashCode());
		result = prime * result + ((sanskrit == null) ? 0 : sanskrit.hashCode());
		result = prime * result + ((stdId == null) ? 0 : stdId.hashCode());
		result = prime * result + ((stdName == null) ? 0 : stdName.hashCode());
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
		if (chemistry == null) {
			if (other.chemistry != null)
				return false;
		} else if (!chemistry.equals(other.chemistry))
			return false;
		if (english == null) {
			if (other.english != null)
				return false;
		} else if (!english.equals(other.english))
			return false;
		if (maths == null) {
			if (other.maths != null)
				return false;
		} else if (!maths.equals(other.maths))
			return false;
		if (physics == null) {
			if (other.physics != null)
				return false;
		} else if (!physics.equals(other.physics))
			return false;
		if (sanskrit == null) {
			if (other.sanskrit != null)
				return false;
		} else if (!sanskrit.equals(other.sanskrit))
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






	public Double getEnglish() {
		return english;
	}






	public void setEnglish(Double english) {
		this.english = english;
	}






	public Double getSanskrit() {
		return sanskrit;
	}






	public void setSanskrit(Double sanskrit) {
		this.sanskrit = sanskrit;
	}






	public Double getMaths() {
		return maths;
	}






	public void setMaths(Double maths) {
		this.maths = maths;
	}






	public Double getPhysics() {
		return physics;
	}






	public void setPhysics(Double physics) {
		this.physics = physics;
	}






	public Double getChemistry() {
		return chemistry;
	}






	public void setChemistry(Double chemistry) {
		this.chemistry = chemistry;
	}






	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}
