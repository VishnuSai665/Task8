package epam_task.tddjunit;

public class remove2chars {

	public String removal(String s) 
	{
		String resu="";
		
			char fc=s.charAt(0);char sc=s.charAt(1);
			if(fc=='A' && sc=='A')	resu=s.substring(2);
			else if(fc=='A' && sc!='A')	resu=s.substring(1);
			else if(fc!='A' && sc=='A')	resu=fc+s.substring(2);	
			else	resu=s;
			
		return resu;
	}

}
