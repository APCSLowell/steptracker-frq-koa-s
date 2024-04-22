import java.util.ArrayList;
public class StepTracker
{
 private int min;
 private int numActiveDays;
 private int totalSteps;
 public StepTracker(int n)
 {
  min = n;
  numDays = 0;
  totalSteps = 0;
 }
 public void addDailySteps(int n)
 {
  if(n>=min)
   numDays++;
  totalSteps+=n;
 }
 public int activeDays()
 {
  return numActiveDays;
 }
 public double averageSteps()
 {
  return (double)totalSteps/numDays;
 }
} 
