import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class JFrame extends javax.swing.JFrame {

	//System.out.println(dateCollection[0]+"  "+dateCollection[1]+"   "+dateCollection[2]);
   
	static int cDateCollection[] = new int[3]; //current day [0]=day, [1]=month, [2]=year
    static int nDateCollection[] = new int[3]; //next day [0]=day, [1]=month, [2]=year
    static int[] pDateCollection = new int[3];//previous day,  day=0, month=1, year=2

    static String nDateQuery;
	static String cDateQuery;
	static String pDateQuery;

	static int nozzle_num;	
	
    static int cDate_start_shift;//current day shift starting number 
    static int cDate_end_shift;//current day shift ending number
    static int cDate_sale_shift;//current day shift sale
    static int cDate_total_sale;//current day total sale
	
	    
	    public JFrame() {
	        initComponents();
	    }
	                        
	    @SuppressWarnings("unchecked")
	    
	    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        field_nozzle_number = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        field_day = new javax.swing.JTextField();
        field_month = new javax.swing.JTextField();
        field_year = new javax.swing.JTextField();
        button_set = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        field_day_end = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        field_day_start = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        button_add = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        field_day_sale = new javax.swing.JTextField();
        field_total_sale = new javax.swing.JTextField();
        button_nextPage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1150, 650));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        field_nozzle_number.setFont(new java.awt.Font("B Roya", 0, 24)); // NOI18N
        field_nozzle_number.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_nozzle_number.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel1.setFont(new java.awt.Font("B Roya", 0, 30)); // NOI18N
        jLabel1.setText("شماره نازل");

        jLabel2.setFont(new java.awt.Font("B Roya", 0, 30)); // NOI18N
        jLabel2.setText("روز");

        jLabel3.setFont(new java.awt.Font("B Roya", 0, 30)); // NOI18N
        jLabel3.setText("ماه");

        jLabel4.setFont(new java.awt.Font("B Roya", 0, 30)); // NOI18N
        jLabel4.setText("سال");

        field_day.setFont(new java.awt.Font("B Roya", 0, 24)); // NOI18N
        field_day.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_day.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        field_month.setFont(new java.awt.Font("B Roya", 0, 24)); // NOI18N
        field_month.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_month.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        field_year.setFont(new java.awt.Font("B Roya", 0, 24)); // NOI18N
        field_year.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_year.setText("1397");
        field_year.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        button_set.setFont(new java.awt.Font("B Roya", 0, 24)); // NOI18N
        button_set.setText("ثبت");
        button_set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_setActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(464, 464, 464)
                        .addComponent(button_set, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel4)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel3)
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(field_year, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(field_month, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(field_day)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(field_nozzle_number, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(102, 102, 102))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(field_day, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field_month, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field_year, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(button_set, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(field_nozzle_number, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        field_day_end.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        field_day_end.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_day_end.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        

        jLabel5.setFont(new java.awt.Font("B Roya", 0, 36)); // NOI18N
        jLabel5.setText("پایان شیفت");

        field_day_start.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        field_day_start.setForeground(new java.awt.Color(204, 0, 0));
        field_day_start.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_day_start.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        field_day_start.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        field_day_start.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("B Roya", 0, 36)); // NOI18N
        jLabel6.setText("آغاز شیفت");

        button_add.setFont(new java.awt.Font("B Roya", 0, 24)); // NOI18N
        button_add.setText("محاسبه");
        button_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addComponent(field_day_start, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(567, 567, 567)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(button_add, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 303, Short.MAX_VALUE)
                        .addComponent(field_day_end, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(field_day_start, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(field_day_end, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(button_add, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jLabel7.setFont(new java.awt.Font("B Roya", 0, 30)); // NOI18N
        jLabel7.setText("فروش روزانه");

        jLabel8.setFont(new java.awt.Font("B Roya", 0, 30)); // NOI18N
        jLabel8.setText("مجموع فروش نازل");

        field_day_sale.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        field_day_sale.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_day_sale.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        field_day_sale.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        field_day_sale.setEnabled(false);

        field_total_sale.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        field_total_sale.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_total_sale.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        field_total_sale.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        field_total_sale.setEnabled(false);

        button_nextPage.setFont(new java.awt.Font("B Roya", 0, 24)); // NOI18N
        button_nextPage.setText("صفحه بعد");
        button_nextPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_nextPageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(62, 62, 62)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(field_day_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field_total_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(552, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_nextPage, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(field_day_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(field_total_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(button_nextPage, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1222, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>            	    

	    private void collect_date_info(){
	    	
	    	cDateCollection[0] = Integer.parseInt(this.field_day.getText());
	    	cDateCollection[1] = Integer.parseInt(this.field_month.getText());
	    	cDateCollection[2] = Integer.parseInt(this.field_year.getText());
	    	
	    }
	    
	    private void collect_nozzle_info(){
	 	   
	    	nozzle_num = Integer.parseInt(this.field_nozzle_number.getText());

	    }

	    public int[] send_cDate_info(){

	    	return cDateCollection;
	    	
	    }
	
	    public int send_nozzle_info(){
	 	   
	    	return nozzle_num;

	    }

	    public String send_cDate_query_style(){
	    	
	    	cDateQuery = String.valueOf("year="+cDateCollection[2]+" and month="+cDateCollection[1]+" and day="+cDateCollection[0]);

	    	return cDateQuery;
	    	
	    }
	  
	    public int cDate_sale_shift_return(){
	    	
	    	return cDate_sale_shift;//D8
	    }	    

	    public int cDate_end_shift_return(){
	    	
	    	return cDate_end_shift;//D10
	    }
	    
	    public int[] send_nDate_info(){
	    	
	    	return nDateCollection;
	    }
	    
	    public String send_nDate_query_style(){
	    	
	    	nDateQuery = String.valueOf("year="+nDateCollection[2]+" and month="+nDateCollection[1]+" and day="+nDateCollection[0]);

	    	return nDateQuery;
	    	
	    }
	    
	    public void nDate_calculation(){
	    	
	    	nDateCollection[0] = cDateCollection[0]+1;
	    	nDateCollection[1] = cDateCollection[1];
	    	nDateCollection[2] = cDateCollection[2];
	    	

	    }

	    public void pDate_calculation(){
	    	
	    	pDateCollection[0] = cDateCollection[0]-1;
	    	pDateCollection[1] = cDateCollection[1];
	    	pDateCollection[2] = cDateCollection[2];
	    	

	    }

	    public int[] send_pDate_info(){
	    	
	    	pDate_calculation();
	       	return pDateCollection;
	    }
	    
	    public String send_pDate_query_style(){
	    	
	    	pDateQuery = String.valueOf("year="+pDateCollection[2]+" and month="+pDateCollection[1]+" and day="+pDateCollection[0]);

	    	return pDateQuery;
	    	
	    }
	 
	    private void button_setActionPerformed(java.awt.event.ActionEvent evt) {                                           
	    
	    	collect_date_info(); //A1
	    	collect_nozzle_info();//A2
	   	 
	    	DBConnect obj = new DBConnect();//A3
	    	obj.A_queue();//A4
	    	
	    	cDate_start_shift= obj.cDate_start_shift_return(); //C2
		    field_day_start.setText(String.valueOf(cDate_start_shift));//C3
	    }                                          

	    private void button_addActionPerformed(java.awt.event.ActionEvent evt) {                                           
	    	
	    	cDate_end_shift  = Integer.parseInt(this.field_day_end.getText());//D1

	    	cDate_sale_shift =  cDate_end_shift - cDate_start_shift;//D2
	    
	    	field_day_sale.setText(String.valueOf(cDate_sale_shift));//D3
	    	
	    	nDate_calculation();
	    	
	    	DBConnect obj  = new DBConnect();//D4
	    	obj.D_queue();//D5
	    		    		    	
	    	cDate_total_sale = obj.cDate_total_sale_return();

	    	field_total_sale.setText(String.valueOf(cDate_total_sale));	    
	    	
	    }                                          

	    private void button_nextPageActionPerformed(java.awt.event.ActionEvent evt) {                                                

	    	secondPage secondPage_obj = new secondPage ();
	    	secondPage_obj.setVisible(true);
	    	
	    	JFrame jf = new JFrame ();
			jf.setVisible(false);
			
			setVisible(false); 
			dispose(); 

	    }                    
	    
	    
	  
		
		
        public static void main(String args[]) {
            
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

	    // Variables declaration - do not modify                     
	    private javax.swing.JButton button_add;
	    private javax.swing.JButton button_nextPage;
	    private javax.swing.JButton button_set;
	    private javax.swing.JTextField field_day;
	    private javax.swing.JTextField field_day_end;
	    private javax.swing.JTextField field_day_sale;
	    private javax.swing.JTextField field_day_start;
	    private javax.swing.JTextField field_month;
	    private javax.swing.JTextField field_nozzle_number;
	    private javax.swing.JTextField field_total_sale;
	    private javax.swing.JTextField field_year;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JLabel jLabel4;
	    private javax.swing.JLabel jLabel5;
	    private javax.swing.JLabel jLabel6;
	    private javax.swing.JLabel jLabel7;
	    private javax.swing.JLabel jLabel8;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JPanel jPanel2;
	    private javax.swing.JPanel jPanel3;
	    // End of variables declaration                   
	}
