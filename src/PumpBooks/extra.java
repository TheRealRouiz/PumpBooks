/*import java.sql.SQLException;

//start of updating storages row

		 JFrame obj_day_start = new JFrame();
	     new_day_start_value= obj_day_start.ret_day_end();
		 String update_day_start_storage_query = "update storages set day_end = "+new_day_start_value+" where nozzle_id="+nozzle_id+" and date_id="+date_id;;
		 st.executeUpdate(update_day_start_storage_query);
		  //end of creating storages row
	        
	    }catch(Exception ex){
	        System.out.println("Error  "+ex);
	    }
	 
 }

    public void add_day_sale(){
	
    	try{
	    	
	      //start of inserting day_sale

		
    		JFrame obj_day_sale = new JFrame();
	     
    		new_day_sale_value= obj_day_sale.ret_day_sale();
		 
    		String update_day_sale_storage_query = "update storages set day_sale = "+new_day_sale_value+" where nozzle_id="+nozzle_id+" and date_id="+date_id;;

    		st.executeUpdate(update_day_sale_storage_query);
		 
		 //end of inserting day_sale
	        
	    }catch(Exception ex){
	        System.out.println("Error  "+ex);
	    }
	 
 }
 
 

    public static int query_result_method (){
	
    	int query_result = 0;
    	return query_result;     

 }

 
public void DB_add_day_end(){
	 
	 add_day_start();
	 
	 add_day_sale();
	 
	 total_sale();
	 
		 try {
			// start of checking to see if date already exists	
			 
			 String date_check_query = "select date_id from dates where year="+entered_year+" and month="+entered_month+" and day="+entered_day;;
			 st.executeQuery(date_check_query);
		
			 while(rs.next()){
				 date_check= rs.getString("date_id");
				 date_check_id= rs.getInt("date_id");
			 }
		 
		 } catch (SQLException e) {
			System.out.println("error"+e);
		}
		 
		 if (date_check != null){
			 
		 create_new_date();

		 } else 
			 {new_date_id =date_check_id;
		 System.out.println("date exicts");}
		 
		 
	try{	 
		 
	     ret_new_date_id();
	     	     	     
	     //start of creating a new row in storages
		 JFrame add_new_storagesRrecord = new JFrame();
		 date_query_format = add_new_storagesRrecord.new_day_queryFormat();
		 
	     String add_day_end_storage_query = "insert into storages(nozzle_id,date_id) values("+nozzle_id+","+new_date_id+");";
	     st.executeUpdate(add_day_end_storage_query);

	     //end of creating a new row in storages

	     //start of updating storages row
	     JFrame obj_day_start = new JFrame();
	     new_day_start_value= obj_day_start.ret_day_end();
	     String update_day_end_storage_query = "update storages set day_start = "+new_day_start_value+" where nozzle_id="+nozzle_id+" and date_id="+new_date_id;;
	     st.executeUpdate(update_day_end_storage_query);
	    	        
	     //end of creating storages row
	     
	    }catch(Exception ex){
	        System.out.println("Error  "+ex);
	    }
	    
	 } 
 
 public int ret_new_date_id(){
	 

	 try{
		 
		 JFrame new_date_id_obj = new JFrame();	 
		 String get_new_date_id = new_date_id_obj.new_day_queryFormat();

	     String get_new_date_id_query = "select date_id from dates where year=1397 and month=7 and day=18";
	     rs = st.executeQuery(get_new_date_id_query);
	     
	        while (rs.next()){
	        	new_date_id= rs.getInt("date_id");
	          }
	        
	    }catch(Exception ex){
	        System.out.println("Error  "+ex);
	    }
	    return new_date_id;     
 }
 
 public int total_sale(){
	 
	 //start of getting yesterday_id

	  try{
		  JFrame add_new_storagesRrecord = new JFrame();
		  date_query_format = add_new_storagesRrecord.yesterday_day_id_queryFormat();
		  
		  String get_date_id_yesterday_query = "select date_id from dates where "+date_query_format;;
		  rs = st.executeQuery(get_date_id_yesterday_query);

       while (rs.next()){
       	yesterday_date_id= rs.getInt("date_id");

         }
       
   
	  }catch(Exception ex){
       System.out.println("Error  "+ex);
       }
	  //end of getting yesterday_id
	 
	  
	  //start of getting yesterday's total_sale
	  
	   yesterday_total_sale = get_yesterday_sale();
      
	   //end of getting yesterday's total_sale
        
        try{
        	
        	today_total_sale = yesterday_total_sale + new_day_sale_value;

        	String today_total_sale_query = "update storages set total_sale="+today_total_sale +" where nozzle_id= "+ nozzle_id +" and date_id= "+date_id;;		  
        	st.executeUpdate(today_total_sale_query);
        	
        }catch(Exception ex2){
            System.out.println("Error  "+ex2);
        }
	return today_total_sale;
 }
 
 public int get_yesterday_sale(){
	 int query_result=0;
	 
	 try{
		 
		 String query = "select total_sale from storages where nozzle_id = "+ nozzle_id+" and date_id="+yesterday_date_id;;
		 rs = st.executeQuery(query);

     while (rs.next()){
     	query_result= rs.getInt("total_sale");

       }
 
 }catch(Exception ex){
     System.out.println("Error  "+ex);
 }    	    
	 return query_result;     

}

 public void create_new_date(){
	
	//start of creating new day in date (next day) 
	 JFrame new_day_obj = new JFrame();	 
	 new_day_date = new_day_obj.add_day_end();
	 
    try {    
    	
    	String add_new_day_query = "insert into dates(year,month,day) values "+new_day_date;;
		st.executeUpdate(add_new_day_query);
	} catch (SQLException e) {
		e.printStackTrace();
	}
    //end of creating new day in date (next day)
	
}*/




















/*   
        
	    public int ret_day_sale(){

	    	return day_sale;
	    }
	    
	    public static int ret_day_end(){
	    	return day_end;
	    	
	    }

	    public String add_day_end(){
	    	
	    
	    	if (new_day<=30){
	    
	    	new_day = day1+1 ; 
	    	add_new_date = String.valueOf("("+year1+","+month1+","+new_day+")");
	    	}
	    	return add_new_date;
	    }
        
	    
	    public String new_day_queryFormat(){
		    
	    	 add_new_date_convert = String.valueOf("year="+year1+" and month="+month1+" and day="+new_day);
	    	
	    	return add_new_date_convert;
	    			}
	   
	    public String yesterday_day_id_queryFormat(){
		    
	    	yesterday = day1-1;
	    	String yesterday_id_query = String.valueOf("year="+year1+" and month="+month1+" and day="+yesterday);
	    	
	    	return yesterday_id_query;
	    			}
*/
