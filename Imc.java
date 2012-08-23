public class Imc{
	public static void main(String[] args) {
	
	

	System.out.println(" digite su peso "); 
	double peso =Double.parseDouble(System.console().readLine());
	System.out.println(" digite su estatura"); 
	double estatura =Double.parseDouble(System.console().readLine());

	imc=(peso/(estatura*estatura));
 
	
	
	
	if (imc<16.00) {
		
		System.out.println(" tienes delgadez severa");
      
    }
	if (imc>=16.00&&imc<=16.99) {
        
		System.out.println(" tienes delgadez moderada");
       
    }
	
	if (imc>=17.00&&imc<=18.98) {
		
		System.out.println("tienes delgadez no muy pronunciada");
        
    }
	if (imc>=18.99&&imc<=24.99) {
		
		System.out.println("eres normal");
       
       	
    }
        
    if (imc>=25.00&&imc<=25.01) {
	
		System.out.println("tienes sobrepeso");
     
		
    }
	if (imc>=25.01&&imc<=29.99) {
		
		System.out.println("eres preobeso");
       		
	}
	if (imc>=30.00&&imc<=30.01) {  
		
		System.out.println("eres obeso");
       
	}
	if (imc>=30.01&&imc<=34.99) {
		
		System.out.println("eres obeso tipo I");
		
	}
	if (imc>=35.00&&imc<=39.99) {
		
		System.out.println("eres obeso tipo II");
		
		
	}
	if (imc>=40.00) {
		
		System.out.println("eres obeso tipo III");
		
	}
		
    }
} 
    
	 




