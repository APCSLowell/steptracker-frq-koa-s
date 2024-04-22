import java.util.ArrayList;
public class StepTracker
{
 private int min;
 private int steps;
 private int numDays;
 public StepTracker(int n)
 {
  min = n;
  steps=0;
  numDays = 0;
 }
 public void addDailySteps(int n)
 {
  steps+=n;
  if(n>=min)
   numDays++;
 }
 public int activeDays()
 {
  return numDays;
 }
 public double averageSteps()
 {
  return (double)steps/numDays;
 }
} 
