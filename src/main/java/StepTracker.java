public class StepTracker
{
 private int min;
 private int numActiveDays;
 private int totalSteps;
 private int totalDays;
 public StepTracker(int n)
 {
  min = n;
  numActiveDays = 0;
  totalSteps = 0;
  totalDays=0;
 }
 public void addDailySteps(int n)
 {
  if(n>min)
   numActiveDays++;
  totalSteps+=n;
  totalDays++;
 }
 public int activeDays()
 {
  return numActiveDays;
 }
 public double averageSteps()
 {
  return totalSteps/(double)totalDays;
 }
} 
