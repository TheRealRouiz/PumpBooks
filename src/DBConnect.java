import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;


public class DBConnect {
    

	//System.out.println();

	
    private Connection con;
    private  Statement st;
    private  ResultSet rs;

    static int[] cDateCollection = new int[3];//current day,  day=0, month=1, year=2
    static int[] nDateCollection = new int[3];//next day,  day=0, month=1, year=2
    static int[] pDateCollection = new int[3];//previous day,  day=0, month=1, year=2
    
    static String cDateQueryStyle;//current day
    static String nDateQueryStyle;//next day
    static String pDateQueryStyle;//next day
    
    static int[] seDateCollection = new int[317];//current day,  day=0, month=1, year=2
    static int[] pSeDateCollection = new int[317];//current day,  day=0, month=1, year=2
    static int[] nSeDateCollection = new int[317];//current day,  day=0, month=1, year=2
    
    static String seDateQueryStyle;//second page retrieved date
    static String pSeDateQueryStyle;//second page retrieved date
    static String nSeDateQueryStyle;//second page retrieved date

    
    static int nDate_id; //next day id
    static int pDate_id; //previous day id
    static int seDate_id; //second page retrieved date
    static int pSeDate_id; //second page retrieved date
    static int nSeDate_id; //second page retrieved date

    static int checkElement;
    static int nozzle_num ;

    static int cRecord_id ;//current day
    static int cDate_id ;//current day
    static int cDate_start_shift;//current day shift starting number 
    static int cDate_end_shift;//current day shift ending number
    static int cDate_sale_shift;//current day shift sale
    static int cDate_total_sale;//current day total sale
    static int pDate_total_sale;//previous day total sale
    static int nDate_start_shift;
 
    static int[] cDateNozzleSaleCollection = new int[17];
    
    static int seDate_received;
	static int seDate_remaining;
	static int pSeDate_remaining;
    

	public DBConnect(){ 

    try{
        Class.forName("com.mysql.jdbc.Driver");
        
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/gas","root","");
        st = con.createStatement();
        
        
      	
    }catch(Exception ex){
        System.out.println("Error  "+ex);
    }
 }
   
  
    public void A_queue(){
	 
	 JFrame obj = new JFrame();//A5
	 
	 nozzle_num =obj.send_nozzle_info();//A6
	 int[] temp =obj.send_cDate_info();//A7
	
	 cDateCollection[0] = temp[0];//A8
	 cDateCollection[1] = temp[1];//A8
	 cDateCollection[2] = temp[2];//A8
	 
	 cDateQueryStyle = obj.send_cDate_query_style(); //A9


	 B_queue();//A10
 } 

    public void B_queue(){

	 try{
    	    	    	
      	String query = "select date_id from dates  where "+cDateQueryStyle;
      	rs = st.executeQuery(query);
        
      	while (rs.next()){
      		cDate_id= rs.getInt("date_id");
      	}//B1
    }catch(Exception ex){
        System.out.println("Error B "+ex);
        
    }

	 C_queue();//B2
 } 
 
    public void C_queue(){
    	
    	try{
    		
    		String query = "select start_shift from n"+nozzle_num+" where date_id="+cDate_id;;
    		rs = st.executeQuery(query);
    		     
    		while (rs.next()){
    			cDate_start_shift = rs.getInt("start_shift");
    		}
    		     
    		 }catch(Exception ex){
    		        System.out.println("Error C "+ex);
    		    }
    	 }//C1
 
    public int cDate_start_shift_return(){
	 
	 return cDate_start_shift;
	 
 } 
  
    public void D_queue(){
    	
    	E_queue(); //D13
    	
    	JFrame obj = new JFrame(); //D6
    	cDate_sale_shift = obj.cDate_sale_shift_return(); //D7
    	cDate_end_shift = obj.cDate_end_shift_return();//D9
    	
    	try{
          	String query = "select record_id from n"+nozzle_num+ " where date_id= "+cDate_id;
          	rs = st.executeQuery(query);
            
          	while (rs.next()){
          		cRecord_id= rs.getInt("record_id");
          	}
        }catch(Exception ex){
            System.out.println("Error B "+ex);
        }//D10
    	
    	try{
	    	
          	String query = "select end_shift from n"+nozzle_num+ " where record_id= "+cRecord_id;
          	rs = st.executeQuery(query);
            
          	while (rs.next()){
          		checkElement= rs.getInt("end_shift");
          	}
        }catch(Exception ex){
            System.out.println("Error B "+ex);
        }//D11
    	    	
    	if (checkElement == 0){
    	
    		try { 
    		
    			String query = "update n"+nozzle_num+" set end_shift="+cDate_end_shift +" where record_id= "+ cRecord_id;
    			st.executeUpdate(query);
			
    			String query1 = "update n"+nozzle_num+" set sale_shift="+cDate_sale_shift +" where record_id= "+ cRecord_id;
    			st.executeUpdate(query1);
			
    		} catch (SQLException e) {
    			e.printStackTrace();
		
    		}
    		
    		F_queue();
    	}
    		else{ 
    			JOptionPane.showMessageDialog(null," اطلاعات این نازل برای این روز قبلا ثبت شده است", "خطا", JOptionPane.PLAIN_MESSAGE );
    	}//D12
    	
    	

    }
  
    public void nDate_info(){
    	
    	JFrame obj = new JFrame();
    	int[] temp = obj.send_nDate_info();

    	nDateCollection[0] = temp[0];
    	nDateCollection[1] = temp[1];
    	nDateCollection[2] = temp[2];
    	
    	nDateQueryStyle = obj.send_nDate_query_style();

    }
    
    public void create_new_day_in_date_table(){
    	
    	String query = "insert into dates(year,month,day) values ("+nDateCollection[2]+" , "+nDateCollection[1]+" , "+nDateCollection[0]+")";;
		try {
			st.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		
		}	
    }
    
    public void nDate_id_collect(){
    	
    	 try{
    	      	String query = "select date_id from dates where "+nDateQueryStyle;
    	      	rs = st.executeQuery(query);
    	        
    	      	while (rs.next()){
    	      		nDate_id= rs.getInt("date_id");
    	      	}//B1
    	    }catch(Exception ex){
    	        System.out.println("Error B "+ex);
    	       
    	    };
    	     
    }

    public void seDate_id_collect(){
    	
   	 try{
   	      	String query = "select date_id from dates where "+seDateQueryStyle;
   	      	rs = st.executeQuery(query);
   	      	while (rs.next()){
   	      		seDate_id= rs.getInt("date_id");
   	      	}
   	      	
   	    }catch(Exception ex){
   	        System.out.println("Error B "+ex);
   	       
   	    }   
   }
    
    public void E_queue(){
    	
    	nDate_info(); //E1
    	nDate_id_collect(); //E2
    	
    	if (nDate_id == 0){
    	
    		create_new_day_in_date_table();  
    		System.out.println("I created the new day in the table");
    
    	}
    	else System.out.println("next day already exicts in date table and cDate_id is "+cDate_id +" nDate_id is "+nDate_id);
    
    } //E3

    public void F_queue(){
    	add_nDate_start_shift();
    	G_queue();
    }	
    
    public void add_nDate_start_shift(){
    	
    	nDate_start_shift =cDate_end_shift;
    	
    	try{
    	String query = "insert into n"+nozzle_num+"(date_id,start_shift) values ("+nDate_id+" , "+nDate_start_shift+")";
    	st.executeUpdate(query);

    	}catch(Exception ex){
        System.out.println("Error B "+ex);
    	}
    }   
    
    public void pDate_info(){
    	
    	JFrame obj = new JFrame();
    	int[] temp = obj.send_pDate_info();

    	pDateCollection[0] = temp[0];
    	pDateCollection[1] = temp[1];
    	pDateCollection[2] = temp[2];
    	
    	pDateQueryStyle = obj.send_pDate_query_style();

    }
    
    public void G_queue(){
      		
    	pDate_info();
    	pDate_id_collect();
    	
    	try {    	
    		
    		String query = "select total_sale from n"+nozzle_num+" where date_id="+pDate_id;
			rs= st.executeQuery(query);

			while(rs.next()){
				pDate_total_sale=rs.getInt("total_sale");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	

    	cDate_total_sale = pDate_total_sale + cDate_sale_shift;
    	
    	try {    	
    		
    		String query = "update n"+nozzle_num+" set total_sale="+cDate_total_sale+" where date_id="+cDate_id;
    		st.executeUpdate(query);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    }	

    public int cDate_total_sale_return(){
    	
    	return cDate_total_sale;
    }

    public void seDate_info_collect(){
    	
    	secondPage obj= new secondPage();
    	int [] temp = obj.send_seDateCollection();
    	
    	seDateCollection[0]= temp[0]; 
    	seDateCollection[1]= temp[1]; 
    	seDateCollection[2]= temp[2]; 

    	seDateQueryStyle = obj.send_seDate_query_style();
    	
    	System.out.println(seDateQueryStyle);

    }
    
    public void pDate_id_collect(){
    	
      	 try{
      	      	String query = "select date_id from dates where "+pSeDateQueryStyle;
      	      	rs = st.executeQuery(query);
      	      	while (rs.next()){
      	      		pSeDate_id= rs.getInt("date_id");
      	      	}
      	      	
      	    }catch(Exception ex){
      	        System.out.println("Error B "+ex);
      	       
      	    }   
      }
    
    public void cDate_sale_collect_nozzles(){
    	
    	seDate_info_collect();
    	seDate_id_collect();
    	try {    	
    		
    		String query="select sale_shift from n1 where date_id="+seDate_id;
			rs=st.executeQuery(query);

			while(rs.next()){
				cDateNozzleSaleCollection[1]=rs.getInt("sale_shift");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	

    	try {    	
    		
    		String query="select sale_shift from n2 where date_id="+seDate_id;
			rs=st.executeQuery(query);

			while(rs.next()){
				cDateNozzleSaleCollection[2]=rs.getInt("sale_shift");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    	try {    	
    		
    		String query="select sale_shift from n3 where date_id="+seDate_id;
			rs=st.executeQuery(query);

			while(rs.next()){
				cDateNozzleSaleCollection[3]=rs.getInt("sale_shift");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	

    	try {    	
    		
    		String query="select sale_shift from n4 where date_id="+seDate_id;
			rs=st.executeQuery(query);

			while(rs.next()){
				cDateNozzleSaleCollection[4]=rs.getInt("sale_shift");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    
    

    	try {    	
    		
    		String query="select sale_shift from n5 where date_id="+seDate_id;
			rs=st.executeQuery(query);

			while(rs.next()){
				cDateNozzleSaleCollection[5]=rs.getInt("sale_shift");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    

    	try {    	
    		
    		String query="select sale_shift from n6 where date_id="+seDate_id;
			rs=st.executeQuery(query);

			while(rs.next()){
				cDateNozzleSaleCollection[6]=rs.getInt("sale_shift");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    
    	

    	try {    	
    		
    		String query="select sale_shift from n7 where date_id="+seDate_id;
			rs=st.executeQuery(query);

			while(rs.next()){
				cDateNozzleSaleCollection[7]=rs.getInt("sale_shift");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    	

    	try {    	
    		
    		String query="select sale_shift from n8 where date_id="+seDate_id;
			rs=st.executeQuery(query);

			while(rs.next()){
				cDateNozzleSaleCollection[8]=rs.getInt("sale_shift");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	

    	try {    	
    		
    		String query="select sale_shift from n9 where date_id="+seDate_id;
			rs=st.executeQuery(query);

			while(rs.next()){
				cDateNozzleSaleCollection[9]=rs.getInt("sale_shift");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	

    	try {    	
    		
    		String query="select sale_shift from n10 where date_id="+seDate_id;
			rs=st.executeQuery(query);

			while(rs.next()){
				cDateNozzleSaleCollection[10]=rs.getInt("sale_shift");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	

    	try {    	
    		
    		String query="select sale_shift from n11 where date_id="+seDate_id;
			rs=st.executeQuery(query);

			while(rs.next()){
				cDateNozzleSaleCollection[11]=rs.getInt("sale_shift");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	

    	try {    	
    		
    		String query="select sale_shift from n12 where date_id="+seDate_id;
			rs=st.executeQuery(query);
	    	System.out.println(query);

			while(rs.next()){
				cDateNozzleSaleCollection[12]=rs.getInt("sale_shift");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	

    	try {    	
    		
    		String query="select sale_shift from n13 where date_id="+seDate_id;
			rs=st.executeQuery(query);
	    	System.out.println(query);

			while(rs.next()){
				cDateNozzleSaleCollection[13]=rs.getInt("sale_shift");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	


    	try {    	
    		
    		String query="select sale_shift from n14 where date_id="+seDate_id;
			rs=st.executeQuery(query);
	    	System.out.println(query);

			while(rs.next()){
				cDateNozzleSaleCollection[14]=rs.getInt("sale_shift");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	



       try {    	
    		String query="select sale_shift from n15 where date_id="+seDate_id;
			rs=st.executeQuery(query);

			while(rs.next()){
				cDateNozzleSaleCollection[15]=rs.getInt("sale_shift");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	

       try {    	
    		
    		String query="select sale_shift from n16 where date_id="+seDate_id;
			rs=st.executeQuery(query);

			while(rs.next()){
				cDateNozzleSaleCollection[16]=rs.getInt("sale_shift");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	

    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }   

    public int[] send_cDate_sale_collect_nozzles(){
    	
    		return cDateNozzleSaleCollection;
    		
    }
    	
    public void rem_rec_secondpage_collect(){
    	
    	secondPage obj = new secondPage();
    	seDate_received = obj.send_user_rec_submit_info();
    	seDate_remaining= obj.send_user_rem_submit_info();
    	
    }

    public void pSeDate_remaining_collect(){
    	
    	pDate_id_collect();
    	
    	try {
    		
    		String query= ("select remaining from majorcalculations where date_id ="+pSeDate_id);
			rs=st.executeQuery(query);
	    	System.out.println(query);

			while(rs.next()){
				pSeDate_remaining = rs.getInt("remaining");
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	System.out.println(pSeDate_remaining);
    	
    }
    
    public void pSeDate_calculation(){
    	
    	pSeDateCollection[0]= seDateCollection[0]-1;
    	pSeDateCollection[1]= seDateCollection[1];
    	pSeDateCollection[2]= seDateCollection[2];

    	pSeDateQueryStyle = String.valueOf("year="+pSeDateCollection[2]+" and month="+pSeDateCollection[1]+" and day="+pSeDateCollection[0]);
    }

    public void nSedate_calculation(){
    	
    	nSeDateCollection[0]= seDateCollection[0]+1;
    	nSeDateCollection[1]= seDateCollection[1];
    	nSeDateCollection[2]= seDateCollection[2];

    	nSeDateQueryStyle = String.valueOf("year="+nSeDateCollection[2]+" and month="+nSeDateCollection[1]+" and day="+nSeDateCollection[0]);
    }
    
    public void H_queue(){
    	
    	rem_rec_secondpage_collect();
    	
    	pSeDate_calculation();
    	
    	pSeDate_remaining_collect();
    	
    	
    }
}
    
    
    
    
    
    
    



 