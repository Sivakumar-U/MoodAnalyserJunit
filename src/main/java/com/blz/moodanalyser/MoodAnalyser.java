package com.blz.moodanalyser;

public class MoodAnalyser {
	private final String message;

	MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() {
		if (message.contains("sad")) {
			return "sad";
		} else {
			return "happy";
		}
	}

}
