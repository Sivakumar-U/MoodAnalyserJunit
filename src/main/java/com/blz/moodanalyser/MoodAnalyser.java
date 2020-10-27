package com.blz.moodanalyser;

public class MoodAnalyser {
	private String message;

	public MoodAnalyser() {
		message = "This is sad message";
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood(String message) {
		try {
			if (message.contains("sad")) {
				return "sad";
			} else {
				return "happy";
			}
		} catch (NullPointerException ex) {
			ex.printStackTrace();
			return "happy";
		}
	}

	public String analyseMood() {
		this.message = message;
		return analyseMood(this.message);
	}

}
