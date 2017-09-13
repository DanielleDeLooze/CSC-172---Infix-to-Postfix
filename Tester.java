import java.io.*;
import java.util.Scanner;



public class Tester {
	public static void main(String[] args) throws IOException {
	File infile = null;
	File outfile = null;
	
	if (0 < args.length){
		infile = new File(args[0]);
		outfile = new File(args[1]);
	}
	
	
	Scanner fromFile = new Scanner(infile);
	
	
	FileOutputStream outstream = new FileOutputStream(outfile);
	PrintWriter outtext = new PrintWriter(outstream);
	
	while(fromFile.hasNextLine()){
		InfixtoPostfix infixer = new InfixtoPostfix();
		PostFixEval evaluator = new PostFixEval(infixer.postFix(fromFile.nextLine()));
		outtext.println((evaluator.postfixEval())+"0");
		
	}
	
	fromFile.close();
	outtext.close();
		
	}//end main
}//end class
