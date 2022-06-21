package entities.ex03;

import java.util.Objects;

public class VoteCounter {
	
	private String name;
	private Integer numberVote;
	
	public VoteCounter(String name, Integer numberVote) {
		this.name = name;
		this.numberVote = numberVote;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumberVote() {
		return numberVote;
	}

	public void setNumberVote(Integer numberVote) {
		this.numberVote = numberVote;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VoteCounter other = (VoteCounter) obj;
		return Objects.equals(name, other.name);
	}

}
