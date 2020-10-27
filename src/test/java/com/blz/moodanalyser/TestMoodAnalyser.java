package com.blz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class TestMoodAnalyser {

	@Test
	public void testGivenMood_WhenSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyzer = new MoodAnalyser("iam in sad mood");
		String mood = null;
		try {
			mood = moodAnalyzer.analyseMood();
			Assert.assertEquals("sad", mood);
		} catch (MoodAnalyserException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testGivenMood_WhenAny_ShouldReturnHappy() {
		MoodAnalyser moodAnalyzer = new MoodAnalyser("iam in any mood");
		String mood = null;
		try {
			mood = moodAnalyzer.analyseMood();
			Assert.assertEquals("happy", mood);
		} catch (MoodAnalyserException e) {
			e.printStackTrace();
		}

	}

	// repeat TC-1.1
	@Test
	public void testGivenMessage_NoParameter_ShouldReturnSad() {
		MoodAnalyser moodAnalyzer = new MoodAnalyser();
		String mood = null;
		try {
			mood = moodAnalyzer.analyseMood();
			Assert.assertEquals("sad", mood);
		} catch (MoodAnalyserException e) {
			e.printStackTrace();
		}

	}

	// repeat TC-1.2
	@Test
	public void givenMessage_NoParameter_ShouldReturnHappy() {
		MoodAnalyser moodAnalyzer = new MoodAnalyser();
		String mood = null;
		try {
			mood = moodAnalyzer.analyseMood();
			Assert.assertEquals("happy", mood);
		} catch (MoodAnalyserException e) {
			e.printStackTrace();
		}

	}

	// TC-2.1
	@Test
	public void testGivenMessage_WhenNull_ShouldReturnHappy() {
		MoodAnalyser moodAnalyzer = new MoodAnalyser(null);
		String mood = null;
		try {
			mood = moodAnalyzer.analyseMood();
			Assert.assertEquals("happy", mood);
		} catch (MoodAnalyserException e) {
			e.printStackTrace();
		}

	}

	// TC-3.1
	@Test
	public void testGivenMood_NullMood_ShouldThrowException() {
		MoodAnalyser moodAnalyzer = new MoodAnalyser(null);
		try {
			String mood = moodAnalyzer.analyseMood();
		} catch (MoodAnalyserException exception) {
			Assert.assertEquals("invalid mood", exception.getMessage());
		}
	}
	
	 //TC-3.2
    @Test
    public void givenMood_EmptyMood_ShouldThrowException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalyserException exception) {
            Assert.assertEquals("empty mood", exception.getMessage());
        }
    }

}
