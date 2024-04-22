import java.util.ArrayList;
public class StepTracker
{
 private int min;
 private int numActiveDays;
 private int totalSteps;
 public StepTracker(int n)
 {
  min = n;
  numActiveDays = 0;
  totalSteps = 0;
 }
 public void addDailySteps(int n)
 {
  if(n>=min)
   numActiveDays++;
  totalSteps+=n;
 }
 public int activeDays()
 {
  return numActiveDays;
 }
 public double averageSteps()
 {
  return (double)totalSteps/numActiveDays;
 }
} 
