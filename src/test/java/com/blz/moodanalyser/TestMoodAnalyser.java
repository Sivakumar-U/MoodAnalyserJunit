package com.blz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class TestMoodAnalyser {

	@Test
	public void testGivenMood_WhenSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyzer = new MoodAnalyser("iam in sad mood");
		String mood = moodAnalyzer.analyseMood();
		Assert.assertEquals("sad", mood);
	}

	@Test
	public void testGivenMood_WhenAny_ShouldReturnHappy() {
		MoodAnalyser moodAnalyzer = new MoodAnalyser("iam in any mood");
		String mood = moodAnalyzer.analyseMood();
		Assert.assertEquals("happy", mood);
	}

}
