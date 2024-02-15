
public class secondPage extends javax.swing.JFrame {

	static int cDateCollection[] = new int[3]; //current day [0]=day, [1]=month, [2]=year
	static int seDateCollection[] = new int[3]; //current day [0]=day, [1]=month, [2]=year
		
	static String seDateQuery;
	static int[] cDateNozzleSaleCollection = new int[17];

	static int user_rec_submit;
	static int user_rem_submit;

	
    public secondPage() {
       
    	initComponents();
        
    	
        JFrame obj = new JFrame();
        int []temp = obj.send_cDate_info();
        
        cDateCollection[0] = temp[0];
        cDateCollection[1] = temp[1];
        cDateCollection[2] = temp[2];

        date_day.setText(String.valueOf(cDateCollection[0]));
        date_month.setText(String.valueOf(cDateCollection[1]));
        date_year.setText(String.valueOf(cDateCollection[2]));
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        date_day = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        n7 = new javax.swing.JTextField();
        n8 = new javax.swing.JTextField();
        n9 = new javax.swing.JTextField();
        n10 = new javax.swing.JTextField();
        n11 = new javax.swing.JTextField();
        n12 = new javax.swing.JTextField();
        n13 = new javax.swing.JTextField();
        n14 = new javax.swing.JTextField();
        n3 = new javax.swing.JTextField();
        n4 = new javax.swing.JTextField();
        n5 = new javax.swing.JTextField();
        n6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        n2 = new javax.swing.JTextField();
        n15 = new javax.swing.JTextField();
        n16 = new javax.swing.JTextField();
        n1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        change_date = new javax.swing.JButton();
        date_year = new javax.swing.JTextField();
        date_month = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        rec_submit = new javax.swing.JTextField();
        remaining_submit = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        rec = new javax.swing.JTextField();
        exp_rec = new javax.swing.JTextField();
        sarak = new javax.swing.JTextField();
        rec_day = new javax.swing.JTextField();
        rec_total = new javax.swing.JTextField();
        _sale = new javax.swing.JTextField();
        exp_sale = new javax.swing.JTextField();
        kasri = new javax.swing.JTextField();
        sale_day_total = new javax.swing.JTextField();
        total_sale = new javax.swing.JTextField();
        remaining = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(50, 50));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        date_day.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("B Nazanin", 0, 14)); // NOI18N
        jLabel2.setText("نازل شماره دو");

        jLabel3.setFont(new java.awt.Font("B Nazanin", 0, 14)); // NOI18N
        jLabel3.setText("نازل شماره سیزده");

        jLabel4.setFont(new java.awt.Font("B Nazanin", 0, 14)); // NOI18N
        jLabel4.setText("نازل شماره سه");

        jLabel5.setFont(new java.awt.Font("B Nazanin", 0, 14)); // NOI18N
        jLabel5.setText("نازل شماره چهار");

        jLabel6.setFont(new java.awt.Font("B Nazanin", 0, 14)); // NOI18N
        jLabel6.setText("نازل شماره پنج");

        jLabel7.setFont(new java.awt.Font("B Nazanin", 0, 14)); // NOI18N
        jLabel7.setText("نازل شماره شش");

        jLabel8.setFont(new java.awt.Font("B Nazanin", 0, 14)); // NOI18N
        jLabel8.setText("نازل شماره هفت");

        n7.setFont(new java.awt.Font("B Nazanin", 0, 11)); // NOI18N
        n7.setForeground(new java.awt.Color(0, 153, 0));
        n7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        n7.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        n7.setEnabled(false);

        n8.setFont(new java.awt.Font("B Nazanin", 0, 11)); // NOI18N
        n8.setForeground(new java.awt.Color(0, 153, 0));
        n8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        n8.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        n8.setEnabled(false);

        n9.setFont(new java.awt.Font("B Nazanin", 0, 11)); // NOI18N
        n9.setForeground(new java.awt.Color(0, 153, 0));
        n9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        n9.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        n9.setEnabled(false);

        n10.setFont(new java.awt.Font("B Nazanin", 0, 11)); // NOI18N
        n10.setForeground(new java.awt.Color(0, 153, 0));
        n10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        n10.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        n10.setEnabled(false);

        n11.setFont(new java.awt.Font("B Nazanin", 0, 11)); // NOI18N
        n11.setForeground(new java.awt.Color(0, 153, 0));
        n11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        n11.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        n11.setEnabled(false);

        n12.setFont(new java.awt.Font("B Nazanin", 0, 11)); // NOI18N
        n12.setForeground(new java.awt.Color(0, 153, 0));
        n12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        n12.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        n12.setEnabled(false);

        n13.setFont(new java.awt.Font("B Nazanin", 0, 11)); // NOI18N
        n13.setForeground(new java.awt.Color(0, 153, 0));
        n13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        n13.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        n13.setEnabled(false);

        n14.setFont(new java.awt.Font("B Nazanin", 0, 11)); // NOI18N
        n14.setForeground(new java.awt.Color(0, 153, 0));
        n14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        n14.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        n14.setEnabled(false);

        n3.setFont(new java.awt.Font("B Nazanin", 0, 11)); // NOI18N
        n3.setForeground(new java.awt.Color(0, 153, 0));
        n3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        n3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        n3.setEnabled(false);

        n4.setFont(new java.awt.Font("B Nazanin", 0, 11)); // NOI18N
        n4.setForeground(new java.awt.Color(0, 153, 0));
        n4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        n4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        n4.setEnabled(false);

        n5.setFont(new java.awt.Font("B Nazanin", 0, 11)); // NOI18N
        n5.setForeground(new java.awt.Color(0, 153, 0));
        n5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        n5.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        n5.setEnabled(false);

        n6.setFont(new java.awt.Font("B Nazanin", 0, 11)); // NOI18N
        n6.setForeground(new java.awt.Color(0, 153, 0));
        n6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        n6.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        n6.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("B Nazanin", 0, 14)); // NOI18N
        jLabel9.setText("نازل شماره هشت");

        jLabel10.setFont(new java.awt.Font("B Nazanin", 0, 14)); // NOI18N
        jLabel10.setText("نازل شماره نه");

        jLabel11.setFont(new java.awt.Font("B Nazanin", 0, 14)); // NOI18N
        jLabel11.setText("نازل شماره ده");

        jLabel12.setFont(new java.awt.Font("B Nazanin", 0, 14)); // NOI18N
        jLabel12.setText("نازل شماره یازده");

        jLabel13.setFont(new java.awt.Font("B Nazanin", 0, 14)); // NOI18N
        jLabel13.setText("نازل شماره دوازده");

        jLabel14.setFont(new java.awt.Font("B Nazanin", 0, 14)); // NOI18N
        jLabel14.setText("نازل شماره چهارده");

        n2.setFont(new java.awt.Font("B Nazanin", 0, 11)); // NOI18N
        n2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        n2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        n2.setEnabled(false);

        n15.setFont(new java.awt.Font("B Nazanin", 0, 11)); // NOI18N
        n15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        n15.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        n15.setEnabled(false);

        n16.setFont(new java.awt.Font("B Nazanin", 0, 11)); // NOI18N
        n16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        n16.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        n16.setEnabled(false);

        n1.setFont(new java.awt.Font("B Nazanin", 0, 11)); // NOI18N
        n1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        n1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        n1.setEnabled(false);

        jLabel15.setFont(new java.awt.Font("B Nazanin", 0, 14)); // NOI18N
        jLabel15.setText("نازل شماره پانزده");

        jLabel16.setFont(new java.awt.Font("B Nazanin", 0, 14)); // NOI18N
        jLabel16.setText("نازل شماره شانزده");

        jLabel17.setFont(new java.awt.Font("B Nazanin", 0, 14)); // NOI18N
        jLabel17.setText("نازل شماره یک");

        change_date.setFont(new java.awt.Font("B Nazanin", 0, 14)); // NOI18N
        change_date.setText("تغییر تاریخ");
        change_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_dateActionPerformed(evt);
            }
        });

        date_year.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        date_month.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel31.setFont(new java.awt.Font("B Roya", 0, 24)); // NOI18N
        jLabel31.setText("روز");

        jLabel34.setFont(new java.awt.Font("B Roya", 0, 24)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("ماه");

        jLabel35.setFont(new java.awt.Font("B Roya", 0, 24)); // NOI18N
        jLabel35.setText("سال");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(n12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel12)
                        .addComponent(jLabel13))
                    .addComponent(jLabel3)
                    .addComponent(jLabel14))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(n9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(n10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(n16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(n1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(n2)
                                    .addComponent(n15))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(change_date)
                                        .addGap(96, 96, 96))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel35)
                                                .addGap(41, 41, 41)
                                                .addComponent(jLabel34)
                                                .addGap(29, 29, 29))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(date_year, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(date_month, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(date_day, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel31))
                                        .addGap(47, 47, 47))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(n7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(n12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(n13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(n14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel14)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(n15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(n16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(date_day, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date_year, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date_month, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(change_date)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(230, 230, 230));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel18.setFont(new java.awt.Font("B Roya", 0, 24)); // NOI18N
        jLabel18.setText("مجموع ورودی روز");

        jLabel19.setFont(new java.awt.Font("B Roya", 0, 24)); // NOI18N
        jLabel19.setText("موجودی پایان روز");

        submit.setFont(new java.awt.Font("B Nazanin", 0, 24)); // NOI18N
        submit.setText("ثبت");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        rec_submit.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        remaining_submit.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(remaining_submit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(rec_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(210, 210, 210))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(525, 525, 525)
                .addComponent(submit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rec_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remaining_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submit)
                .addGap(19, 19, 19))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel20.setFont(new java.awt.Font("B Nazanin", 0, 24)); // NOI18N
        jLabel20.setText(" ورودی");

        jLabel21.setFont(new java.awt.Font("B Nazanin", 0, 24)); // NOI18N
        jLabel21.setText("سرک");

        jLabel22.setFont(new java.awt.Font("B Nazanin", 0, 24)); // NOI18N
        jLabel22.setText("آزمایش");

        jLabel23.setFont(new java.awt.Font("B Nazanin", 0, 24)); // NOI18N
        jLabel23.setText("آزمایش");

        jLabel24.setFont(new java.awt.Font("B Nazanin", 0, 24)); // NOI18N
        jLabel24.setText("رسیده روزانه");

        jLabel25.setFont(new java.awt.Font("B Nazanin", 0, 24)); // NOI18N
        jLabel25.setText("مجموع رسیده");

        jLabel26.setFont(new java.awt.Font("B Nazanin", 0, 24)); // NOI18N
        jLabel26.setText("فروش");

        jLabel27.setFont(new java.awt.Font("B Nazanin", 0, 24)); // NOI18N
        jLabel27.setText("کسری");

        jLabel28.setFont(new java.awt.Font("B Nazanin", 0, 24)); // NOI18N
        jLabel28.setText("خروجی روزانه");

        jLabel29.setFont(new java.awt.Font("B Nazanin", 0, 24)); // NOI18N
        jLabel29.setText("مجموع خروجی");

        jLabel30.setFont(new java.awt.Font("B Nazanin", 0, 24)); // NOI18N
        jLabel30.setText("موجودی");

        rec.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rec.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rec.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        rec.setEnabled(false);

        exp_rec.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exp_rec.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        exp_rec.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        exp_rec.setEnabled(false);

        sarak.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sarak.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sarak.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        sarak.setEnabled(false);

        rec_day.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rec_day.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rec_day.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        rec_day.setEnabled(false);

        rec_total.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rec_total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rec_total.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        rec_total.setEnabled(false);

        _sale.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        _sale.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        _sale.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        _sale.setEnabled(false);

        exp_sale.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exp_sale.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        exp_sale.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        exp_sale.setEnabled(false);

        kasri.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kasri.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kasri.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        kasri.setEnabled(false);

        sale_day_total.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sale_day_total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sale_day_total.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        sale_day_total.setEnabled(false);

        total_sale.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        total_sale.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total_sale.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        total_sale.setEnabled(false);

        remaining.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        remaining.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        remaining.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        remaining.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(remaining, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel30)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(total_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sale_day_total, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(kasri, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23)
                    .addComponent(exp_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rec_total, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel25)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rec_day, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sarak, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel20))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(exp_rec, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rec, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel23)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rec, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exp_rec, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sarak, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rec_day, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rec_total, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exp_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kasri, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sale_day_total, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total_sale, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remaining, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        setSize(new java.awt.Dimension(1166, 689));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {                                       

    	collect_submit_info();//H1
    	
    	DBConnect obj = new DBConnect();
    	obj.H_queue();//H4
    }                                      

    private void change_dateActionPerformed(java.awt.event.ActionEvent evt) {                                            
    	
    	seDateCollection();
    	
    	DBConnect obj = new DBConnect();
    	obj.cDate_sale_collect_nozzles();
    	
    	cDate_nozzle_sale_info_collect();
    	set_n_texts();
    	
    }                                           

    
    
    private void collect_submit_info(){
    	
    	user_rec_submit  = Integer.parseInt(this.rec_submit.getText());//H2
    	user_rem_submit = Integer.parseInt(this.remaining_submit.getText());//H3
    	
    }
    
    public int send_user_rec_submit_info(){
    	
    	return user_rec_submit;
    	
    }

    public int send_user_rem_submit_info(){
    	
    	return user_rem_submit;
    	
    }

    public String send_seDate_query_style(){
    	
    	seDateQuery = String.valueOf("year="+seDateCollection[2]+" and month="+seDateCollection[1]+" and day="+seDateCollection[0]);
    	System.out.println(seDateQuery);

    	return seDateQuery;
    	
    }
    
    public void cDate_nozzle_sale_info_collect(){
    	
    	DBConnect obj = new DBConnect();
    	int[] temp = obj.send_cDate_sale_collect_nozzles();
    	cDateNozzleSaleCollection[1] = temp[1];
    	cDateNozzleSaleCollection[2] = temp[2];
    	cDateNozzleSaleCollection[3] = temp[3];
    	cDateNozzleSaleCollection[4] = temp[4];
    	cDateNozzleSaleCollection[5] = temp[5];
    	cDateNozzleSaleCollection[6] = temp[6];
    	cDateNozzleSaleCollection[7] = temp[7];
    	cDateNozzleSaleCollection[8] = temp[8];
    	cDateNozzleSaleCollection[9] = temp[9];
    	cDateNozzleSaleCollection[10] = temp[10];
    	cDateNozzleSaleCollection[11] = temp[11];
    	cDateNozzleSaleCollection[12] = temp[12];
    	cDateNozzleSaleCollection[13] = temp[13];
    	cDateNozzleSaleCollection[14] = temp[14];    	
    	cDateNozzleSaleCollection[15] = temp[15];
    	cDateNozzleSaleCollection[16] = temp[16];
    	
    }
    
    public void seDateCollection(){
    	
    	seDateCollection[0] = Integer.parseInt(this.date_day.getText());
    	seDateCollection[1] = Integer.parseInt(this.date_month.getText());
    	seDateCollection[2] = Integer.parseInt(this.date_year.getText());

    }

    public int [] send_seDateCollection(){
    	
    	return seDateCollection;
    }
   
    public void set_n_texts(){
    	
    	n1.setText(String.valueOf(cDateNozzleSaleCollection[1]));
    	n2.setText(String.valueOf(cDateNozzleSaleCollection[2]));
    	n3.setText(String.valueOf(cDateNozzleSaleCollection[3]));
    	n4.setText(String.valueOf(cDateNozzleSaleCollection[4]));
    	n5.setText(String.valueOf(cDateNozzleSaleCollection[5]));
    	n6.setText(String.valueOf(cDateNozzleSaleCollection[6]));
    	n7.setText(String.valueOf(cDateNozzleSaleCollection[7]));
    	n8.setText(String.valueOf(cDateNozzleSaleCollection[8]));
    	n9.setText(String.valueOf(cDateNozzleSaleCollection[9]));
    	n10.setText(String.valueOf(cDateNozzleSaleCollection[10]));
    	n11.setText(String.valueOf(cDateNozzleSaleCollection[11]));
    	n12.setText(String.valueOf(cDateNozzleSaleCollection[12]));
    	n13.setText(String.valueOf(cDateNozzleSaleCollection[13]));
    	n14.setText(String.valueOf(cDateNozzleSaleCollection[14]));
    	n15.setText(String.valueOf(cDateNozzleSaleCollection[15]));
    	n16.setText(String.valueOf(cDateNozzleSaleCollection[16]));
    	
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
            java.util.logging.Logger.getLogger(secondPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(secondPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(secondPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(secondPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new secondPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField _sale;
    private javax.swing.JButton change_date;
    private javax.swing.JTextField date_day;
    private javax.swing.JTextField date_month;
    private javax.swing.JTextField date_year;
    private javax.swing.JTextField exp_rec;
    private javax.swing.JTextField exp_sale;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField kasri;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n10;
    private javax.swing.JTextField n11;
    private javax.swing.JTextField n12;
    private javax.swing.JTextField n13;
    private javax.swing.JTextField n14;
    private javax.swing.JTextField n15;
    private javax.swing.JTextField n16;
    private javax.swing.JTextField n2;
    private javax.swing.JTextField n3;
    private javax.swing.JTextField n4;
    private javax.swing.JTextField n5;
    private javax.swing.JTextField n6;
    private javax.swing.JTextField n7;
    private javax.swing.JTextField n8;
    private javax.swing.JTextField n9;
    private javax.swing.JTextField rec;
    private javax.swing.JTextField rec_day;
    private javax.swing.JTextField rec_submit;
    private javax.swing.JTextField rec_total;
    private javax.swing.JTextField remaining;
    private javax.swing.JTextField remaining_submit;
    private javax.swing.JTextField sale_day_total;
    private javax.swing.JTextField sarak;
    private javax.swing.JButton submit;
    private javax.swing.JTextField total_sale;
    // End of variables declaration                   
}
