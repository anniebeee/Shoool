package edu.calpoly.csc349.Schedule;

/**
 * Given a time range to cover in "toCover", and an array of time ranges when 
 * each employee is available, pick from the employee time ranges a 
 * minimal-sized set of time ranges that completely cover "toCover", and
 * return these as an array, or return null if no solution is possible.
 *
 * Preconditions:  
 * 1. "employees" is not guaranteed to be sorted, and it
 * may even be empty, but it will not be null.  
 * 2. All time ranges are well-formed (start < end), and all start/end 
 * values are nonnegative.
 * 3. All elements of employees will be non-null.
 *
 * Postconditions: 
 * 1. The returned array must be sorted by increasing starting time.  It
 * may be null.
 * 2. Time ranges within it may overlap, but there may be no
 * gaps within the toCover time range (at least one returned time range
 * must cover all times within toCover).
 * 3. The employees array passed in must not be altered.
 * 4. TimeRanges in the returned array must be from the original TimeRanges
 * given in the employees array, not newly created TimeRanges.
 * @author asbeug@gmail.com
**/
public interface Scheduler 
{
  public TimeRange[] makeSchedule(TimeRange toCover, TimeRange[] employees); 
}