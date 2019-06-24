package travelssearch;

import org.junit.Ignore;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class MyExecutionListener extends RunListener{
	//Start and End time of the tests
    long startTime;
    long endTime;
 
    @Override
    public void testRunStarted(Description description ) throws Exception {
    	//new txt file the path must be change according de test file path 
    	FileWriter flwriter = new FileWriter ("C:\\Users\\MauricioVidal\\eclipse-workspace\\phptravels\\TestOutput\\RunTimer.txt");
    	BufferedWriter bf = new BufferedWriter(flwriter);
        //Start time of the tests
        startTime = new Date().getTime();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        //Print the number of tests before the all tests execution.
       System.out.println("Tests started! Number of Test case: " + description.testCount() + "\r\n");//console
       //to be written in the txt file:
       bf.write("\r\n PHPTravels Page Run Timer test output result \r\n Executed by 'xxxx' \r\n Date: " + dtf.format(now) );
       bf.write("\r\n Number of Test case: " + description.testCount() + " started at " + startTime/1000 + "seconds");
       bf.close();
    }
 
    @Override
    public void testRunFinished(Result result) throws Exception {
    	FileWriter flWriter=null;
    	try {
			flWriter = new FileWriter("C:\\Users\\MauricioVidal\\eclipse-workspace\\phptravels\\TestOutput\\RunTimer.txt", true);
			BufferedWriter bf = new BufferedWriter(flWriter);			
        //End time of the tests
        endTime = new Date().getTime();
        //Print the below lines when all tests are finished.
        System.out.println("Tests finished! Number of test case: " + result.getRunCount());//console
      //to be written in the txt file:
        bf.write("\r\n Number of test case: " + result.getRunCount()+ " finished at " + endTime/1000 +" seconds");
        long elapsedSeconds = (endTime-startTime)/1000;
        System.out.println("Elapsed time of tests execution: " + elapsedSeconds +" seconds");//console
        bf.write("\r\n Elapsed time of tests execution: " + elapsedSeconds +" seconds");
        bf.close();
    	} catch (IOException e) {
			e.printStackTrace();
		}  	
    }
 
    @Override
    public void testStarted(Description description) throws Exception {
        //Write the test name when it is started.
        System.out.println(description.getMethodName() + " test is starting...\r\n ");
    }
 
    @Override
    public void testFinished(Description description) throws Exception {
        //Write the test name when it is finished.
        System.out.println(description.getMethodName() + " test is finished...\r\n");
    }
 
    @Override
    public void testFailure(Failure failure) throws Exception {
        //Write the test name when it is failed.
    	FileWriter flWriter=null;
    	try {
			flWriter = new FileWriter("C:\\Users\\MauricioVidal\\eclipse-workspace\\phptravels\\TestOutput\\RunTimer.txt", true);
			BufferedWriter bf = new BufferedWriter(flWriter);	
        System.out.println(failure.getDescription().getMethodName() + " test FAILED!!!");//console
      //to be written in the txt file:
        bf.write("\r\n "+failure.getDescription().getMethodName() + " test FAILED!!!");
        bf.close();
        } catch (IOException e) {
			e.printStackTrace();
		} 
    }
 
    //O.B: IntelliJ ignored by default. I did not succeed to run this method.
    //If you know any way to accomplish this, please write a comment.
    @Override
    public void testIgnored(Description description) throws Exception {
        super.testIgnored(description);
        Ignore ignore = description.getAnnotation(Ignore.class);
        String ignoreMessage = String.format(
                "@Ignore test method '%s()': '%s'",
                description.getMethodName(), ignore.value());
        System.out.println(ignoreMessage + "\n");
    }
}
