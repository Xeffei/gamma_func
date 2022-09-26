package numeric; // it must be your folder name, write here the folder name





public class gammafunc {
	
	public static double y= 0.57721566490153286; // is the Euler-Mascheroni constant
	
	
	public static double gm(double z) {
		
		double result =1;
		
		for (int n=1;n<10000000;n++) {
			
			double d1 = Math.pow(1+(z/n), -1);
			
			double d2= Math.pow(Math.E,(z/n));
			
			result *= d1*d2;}
		result = result*Math.pow(Math.E,-y*z)/z;
		return result;}
	
	public static void main(String[] args) {
		
		System.out.print(gm(5));
	}

}
