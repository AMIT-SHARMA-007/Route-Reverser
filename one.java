import java.util.*;
import java.util.Arrays;

public class one{
	
	private static int tot,tot2;
	private static String a[][],b[][];
    private static StringBuilder temp;
	public static void main(String args[]){
			
			Scanner in = new Scanner(System.in);
			Scanner in2 = new Scanner(System.in);
			tot = in.nextInt();
			a = new String[tot][];
        	b = new String[tot][];
            for(int i=0;i<tot;i++){
				
				tot2 = in.nextInt();
				a[i] = new String[tot2];
				b[i] = new String[tot2];
				
                for(int j=0;j<tot2;j++){
						
						a[i][j] = in2.nextLine();
					
					}
				}
		System.out.println();
        for(int i=0;i<tot;i++){
				
				
                for(int j=0;j<a[i].length;j++){
						
                        b[i][j] = a[i][j];
					
					}
				}
            for(int i=tot-1;i>=0;i--){
				
				
				for(int j=a[i].length-1;j>=0;j--){
					   
                    if(j==a[i].length-1 && a[i][j].charAt(0)=='R')
                        b[i][j] = a[i][j].replaceAll("Right","Begin");
                    else if(j==a[i].length-1 && a[i][j].charAt(0)=='L')
                        b[i][j] = a[i][j].replaceAll("Left","Begin");
                    else{
                        
                        if(j==0){
                            if(a[i][1].charAt(0)=='R')
                                b[i][j] = a[i][j].replaceAll("Begin","Left");
                            else
                                b[i][j] = a[i][j].replaceAll("Begin","Right");
                                
                        }
                        else{
                      
                        if(a[i][j+1].charAt(0)=='L'){
                            
                            b[i][j] = a[i][j].replaceAll("Left","Right");
                        }
                        else if(a[i][j+1].charAt(0)=='R'){
                            b[i][j] = a[i][j].replaceAll("Right","Left");
                        }
                          
                    }
                    }
				
                        
                        System.out.println(b[i][j]);
                    
					}
                System.out.println();
				
            }
			
            
}
	
	
}