public class Mark {
	// Class Mark Properties.
	private Double quizMarks;
	private Double midMarks;
	private Double finalMarks;

	// Setter for Quiz-Mark.
	public Double getQuizMarks() {
		return quizMarks;
	}

	// Getter for Quiz-Mark.
	public void setQuizMarks(Double quizMarks) {
		if (quizMarks <= 15) {
			setQuizMarks(quizMarks);
		} else {
			
		}
		this.quizMarks = quizMarks;
	}


	// Getter for Mid-Mark.
	public Double getMidMarks() {
		return midMarks;
	}

	// Setter for Mid-Mark.
	public void setMidMarks(Double midMarks) {
		if (midMarks <= 35) {
			setMidMarks(midMarks);
		} else {
			
		}
		this.midMarks = midMarks;
	}

	// Getter for Final-Mark.
	public Double getFinalMarks() {
		return finalMarks;
	}

	// Setter for Final-Mark.
	public void setFinalMarks(Double finalMarks) {
		if (finalMarks <= 55) {
			setFinalMarks(finalMarks);
		} else {
			
		}
		this.finalMarks = finalMarks;
	}

}
