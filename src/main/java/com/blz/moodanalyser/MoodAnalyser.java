package com.blz.moodanalyser;

public class MoodAnalyser {
	private final String message;

	public MoodAnalyser() {
		message = "This is happy message";
	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood()throws MoodAnalyserException {
		try {
			if(message.length()==0) {
				throw new MoodAnalyserException(MoodAnalyserException.exceptionType.ENTERED_EMPTY,"empty mood");
			}
			if (message.contains("sad")) {
				return "sad";
			} else {
				return "happy";
			}
		} catch (NullPointerException ex) {
			throw new MoodAnalyserException(MoodAnalyserException.exceptionType.ENTERED_NULL,"invalid mood");
		}
	}

	

}
