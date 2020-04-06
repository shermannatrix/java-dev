package com.packtpub.chapter06;

import java.time.*;
import com.packtpub.steps.*;

public class Main {
	public static void main(String[] args) {
		// Initialize sample data.
		DailyGoal dailyGoal = new DailyGoal ( 10000 );
		
		WeeklySteps weekly = new WeeklySteps ();
		weekly.setDailyGoal ( dailyGoal );
		
		int year = 2021;
		int month = 1;
		int day = 4;
		
		weekly.addDailySteps ( 11543, LocalDate.of(year, month, day) );
		day++;
		weekly.addDailySteps ( 12112, LocalDate.of(year, month, day) );
		day++;
		weekly.addDailySteps ( 10005, LocalDate.of(year, month, day) );
		day++;
		weekly.addDailySteps ( 10011, LocalDate.of(year, month, day) );
		day++;
		weekly.addDailySteps ( 9000, LocalDate.of(year, month, day) );
		day++;
		weekly.addDailySteps ( 20053, LocalDate.of(year, month, day) );
		day++;
		weekly.addDailySteps ( 20048, LocalDate.of(year, month, day) );
		
		System.out.println(weekly.format());
	}
}
