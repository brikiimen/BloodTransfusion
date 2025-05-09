package transfusionsanguine;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class pretransf extends javax.swing.JFrame {

    Connection conn ;
    PreparedStatement pst,pstsel;
    ResultSet rs,rssel;
  
    public pretransf() {
        initComponents();
        conn = Transfusion.conn();
        jMenu7.setText(login1.username);
        afficher(declaration.idpatient.getText(),declaration.episode.getText());
         pa.setText(declaration.idpatient.getText());
        ep.setText(declaration.episode.getText());
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        fcontrole = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        gpe = new javax.swing.JTextField();
        pheno = new javax.swing.JComboBox<>();
        raioui = new javax.swing.JCheckBox();
        rainon = new javax.swing.JCheckBox();
        daterai = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        agnon = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        agoui = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        dateag = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        hcvnon = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        hcvoui = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        datehcv = new com.toedter.calendar.JDateChooser();
        jLabel20 = new javax.swing.JLabel();
        hivnon = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();
        hivoui = new javax.swing.JCheckBox();
        jLabel22 = new javax.swing.JLabel();
        datehiv = new com.toedter.calendar.JDateChooser();
        jLabel23 = new javax.swing.JLabel();
        compnon = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        compoui = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        datecomp = new com.toedter.calendar.JDateChooser();
        jLabel26 = new javax.swing.JLabel();
        ultimenon = new javax.swing.JCheckBox();
        jLabel27 = new javax.swing.JLabel();
        ultimeoui = new javax.swing.JCheckBox();
        jLabel28 = new javax.swing.JLabel();
        dateultime = new com.toedter.calendar.JDateChooser();
        jLabel32 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        pa = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        ep = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        fcontrole.setBackground(new java.awt.Color(204, 228, 232));
        fcontrole.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Groupe sanguin ABO et RH :");
        fcontrole.add(jLabel3);
        jLabel3.setBounds(90, 150, 230, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Phénotype :");
        fcontrole.add(jLabel4);
        jLabel4.setBounds(90, 200, 110, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Oui :");
        fcontrole.add(jLabel5);
        jLabel5.setBounds(530, 260, 40, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Ag HBs :");
        fcontrole.add(jLabel6);
        jLabel6.setBounds(90, 290, 100, 19);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Anti-HCV :");
        fcontrole.add(jLabel7);
        jLabel7.setBounds(90, 320, 100, 19);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Anti-HIV : ");
        fcontrole.add(jLabel8);
        jLabel8.setBounds(90, 350, 100, 19);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Epreuve de comptabilité au laboratoire :");
        fcontrole.add(jLabel9);
        jLabel9.setBounds(90, 380, 310, 19);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("contrôle ultime au lit du malade :");
        fcontrole.add(jLabel10);
        jLabel10.setBounds(90, 410, 300, 19);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("RAI :");
        fcontrole.add(jLabel11);
        jLabel11.setBounds(90, 260, 70, 19);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Date :");
        fcontrole.add(jLabel12);
        jLabel12.setBounds(610, 260, 50, 19);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Non :");
        fcontrole.add(jLabel13);
        jLabel13.setBounds(450, 260, 40, 19);

        gpe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpeActionPerformed(evt);
            }
        });
        fcontrole.add(gpe);
        gpe.setBounds(300, 150, 150, 30);

        pheno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C", "c", "E", "e ", "Kell" }));
        fcontrole.add(pheno);
        pheno.setBounds(190, 200, 90, 30);

        buttonGroup1.add(raioui);
        fcontrole.add(raioui);
        raioui.setBounds(570, 260, 20, 25);

        buttonGroup1.add(rainon);
        rainon.setSelected(true);
        fcontrole.add(rainon);
        rainon.setBounds(490, 260, 20, 25);
        fcontrole.add(daterai);
        daterai.setBounds(670, 260, 130, 29);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Non :");
        fcontrole.add(jLabel14);
        jLabel14.setBounds(450, 290, 40, 19);

        buttonGroup2.add(agnon);
        agnon.setSelected(true);
        fcontrole.add(agnon);
        agnon.setBounds(490, 290, 20, 25);

        jLabel15.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Oui :");
        fcontrole.add(jLabel15);
        jLabel15.setBounds(530, 290, 40, 20);

        buttonGroup2.add(agoui);
        fcontrole.add(agoui);
        agoui.setBounds(570, 290, 20, 25);

        jLabel16.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Date :");
        fcontrole.add(jLabel16);
        jLabel16.setBounds(610, 290, 50, 19);
        fcontrole.add(dateag);
        dateag.setBounds(670, 290, 130, 29);

        jLabel17.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Non :");
        fcontrole.add(jLabel17);
        jLabel17.setBounds(450, 320, 40, 19);

        buttonGroup3.add(hcvnon);
        hcvnon.setSelected(true);
        fcontrole.add(hcvnon);
        hcvnon.setBounds(490, 320, 20, 25);

        jLabel18.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Oui :");
        fcontrole.add(jLabel18);
        jLabel18.setBounds(530, 320, 40, 20);

        buttonGroup3.add(hcvoui);
        fcontrole.add(hcvoui);
        hcvoui.setBounds(570, 320, 20, 25);

        jLabel19.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Date :");
        fcontrole.add(jLabel19);
        jLabel19.setBounds(610, 320, 50, 19);
        fcontrole.add(datehcv);
        datehcv.setBounds(670, 320, 130, 29);

        jLabel20.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Non :");
        fcontrole.add(jLabel20);
        jLabel20.setBounds(450, 350, 40, 19);

        buttonGroup4.add(hivnon);
        hivnon.setSelected(true);
        fcontrole.add(hivnon);
        hivnon.setBounds(490, 350, 20, 25);

        jLabel21.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Oui :");
        fcontrole.add(jLabel21);
        jLabel21.setBounds(530, 350, 40, 20);

        buttonGroup4.add(hivoui);
        fcontrole.add(hivoui);
        hivoui.setBounds(570, 350, 20, 25);

        jLabel22.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Date :");
        fcontrole.add(jLabel22);
        jLabel22.setBounds(610, 350, 50, 19);
        fcontrole.add(datehiv);
        datehiv.setBounds(670, 350, 130, 29);

        jLabel23.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Non :");
        fcontrole.add(jLabel23);
        jLabel23.setBounds(450, 380, 40, 19);

        buttonGroup6.add(compnon);
        compnon.setSelected(true);
        fcontrole.add(compnon);
        compnon.setBounds(490, 380, 20, 25);

        jLabel24.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Oui :");
        fcontrole.add(jLabel24);
        jLabel24.setBounds(530, 380, 40, 20);

        buttonGroup6.add(compoui);
        fcontrole.add(compoui);
        compoui.setBounds(570, 380, 20, 25);

        jLabel25.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setText("Date :");
        fcontrole.add(jLabel25);
        jLabel25.setBounds(610, 380, 50, 19);
        fcontrole.add(datecomp);
        datecomp.setBounds(670, 380, 130, 29);

        jLabel26.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel26.setText("Non :");
        fcontrole.add(jLabel26);
        jLabel26.setBounds(450, 410, 40, 19);

        buttonGroup5.add(ultimenon);
        ultimenon.setSelected(true);
        fcontrole.add(ultimenon);
        ultimenon.setBounds(490, 410, 20, 25);

        jLabel27.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel27.setText("Oui :");
        fcontrole.add(jLabel27);
        jLabel27.setBounds(530, 410, 40, 20);

        buttonGroup5.add(ultimeoui);
        fcontrole.add(ultimeoui);
        ultimeoui.setBounds(570, 410, 20, 25);

        jLabel28.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("Date :");
        fcontrole.add(jLabel28);
        jLabel28.setBounds(610, 410, 50, 19);
        fcontrole.add(dateultime);
        dateultime.setBounds(670, 410, 130, 29);

        jLabel32.setFont(new java.awt.Font("Microsoft Himalaya", 1, 33)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setText("Contrôle pré transfusionnels :");
        fcontrole.add(jLabel32);
        jLabel32.setBounds(40, 40, 600, 34);

        jToggleButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jToggleButton2.setText("Enregistrer");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        fcontrole.add(jToggleButton2);
        jToggleButton2.setBounds(1020, 490, 170, 60);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setText("Patient:");
        fcontrole.add(jLabel2);
        jLabel2.setBounds(1180, 60, 60, 21);

        pa.setText("jLabel4");
        fcontrole.add(pa);
        pa.setBounds(1250, 60, 90, 20);

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel30.setText("Episode:");
        fcontrole.add(jLabel30);
        jLabel30.setBounds(1360, 60, 60, 21);

        ep.setText("jLabel5");
        fcontrole.add(ep);
        ep.setBounds(1430, 60, 90, 21);

        jMenu5.setText("Quitter");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenu5.setMargin(new java.awt.Insets(5, 6, 5, 10));
        jMenu5.setMaximumSize(new java.awt.Dimension(600, 32767));
        jMenu5.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu5MenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu8.setText("Utilisateur :");
        jMenu8.setEnabled(false);
        jMenu8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenuBar1.add(jMenu8);

        jMenu7.setText("jMenu7");
        jMenu7.setEnabled(false);
        jMenu7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jMenu7.setMargin(new java.awt.Insets(3, 6, 3, 5));
        jMenu7.setMaximumSize(new java.awt.Dimension(500, 32767));
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fcontrole, javax.swing.GroupLayout.DEFAULT_SIZE, 1536, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fcontrole, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void afficher(String id,String ep){
           try {
          String sqlsel = "select * from Controlepree where idpatient=? and episode=? ";
         pstsel = conn.prepareStatement(sqlsel);
         pstsel.setString(1, id);
        pstsel.setString(2, ep);
        rssel = pstsel.executeQuery();
        if (rssel.next()) {
            gpe.setText(rssel.getString("Groupesanguin"));
            pheno.setSelectedItem(rssel.getString("Phenotype"));
            if ("Non".equals(rssel.getString("RAI"))) {
           rainon.setSelected(true);
            }
            else if("Oui".equals(rssel.getString("RAI"))) {
           raioui.setSelected(true);
           String dateStr = rssel.getString("DateRAI");
           DateFormat datef = new SimpleDateFormat("dd/MM/yyyy");
           Date d = datef.parse(dateStr);
           daterai.setDate(d);       
            }
            
           if ("Non".equals(rssel.getString("Ag"))) {
           agnon.setSelected(true);
            }
            else if("Oui".equals(rssel.getString("Ag"))) {
           agoui.setSelected(true);
           String dateStr = rssel.getString("DateAg");
           DateFormat datef = new SimpleDateFormat("dd/MM/yyyy");
           Date d = datef.parse(dateStr);
           dateag.setDate(d);       
            }
           
           if ("Non".equals(rssel.getString("AntiHCV"))) {
           hcvnon.setSelected(true);
            }
            else if("Oui".equals(rssel.getString("AntiHCV"))) {
           hcvoui.setSelected(true);
           String dateStr = rssel.getString("DateHCV");
           DateFormat datef = new SimpleDateFormat("dd/MM/yyyy");
           Date d = datef.parse(dateStr);
           datehcv.setDate(d);       
            }
           
           if ("Non".equals(rssel.getString("AntiHIV"))) {
           hivnon.setSelected(true);
            }
            else if("Oui".equals(rssel.getString("AntiHIV"))) {
           hivoui.setSelected(true);
           String dateStr = rssel.getString("DateHIV");
           DateFormat datef = new SimpleDateFormat("dd/MM/yyyy");
           Date d = datef.parse(dateStr);
           datehiv.setDate(d);       
            }
           
          if ("Non".equals(rssel.getString("Comptabilite"))) {
           compnon.setSelected(true);
            }
            else if("Oui".equals(rssel.getString("Comptabilite"))) {
           compoui.setSelected(true);
           String dateStr = rssel.getString("Datecomp");
           DateFormat datef = new SimpleDateFormat("dd/MM/yyyy");
           Date d = datef.parse(dateStr);
           datecomp.setDate(d);       
            }
          
           if ("Non".equals(rssel.getString("Utime"))) {
           ultimenon.setSelected(true);
            }
            else if("Oui".equals(rssel.getString("Utime"))) {
           ultimeoui.setSelected(true);
           String dateStr = rssel.getString("Dateultime");
           DateFormat datef = new SimpleDateFormat("dd/MM/yyyy");
           Date d = datef.parse(dateStr);
           dateultime.setDate(d);       
            }
            
        
        
    }
       } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, e);
     } catch (ParseException ex) {
    Logger.getLogger(episode.class.getName()).log(Level.SEVERE, null, ex);
     }
    
    
    
    }
    
    
    
    
    public void insert(String id,String ep){
       String groupe=gpe.getText();
       String phenoty=(String) pheno.getSelectedItem();
       String rai=null;
       String date1=null;
       String ag=null;
       String date2=null;
       String hcv=null;
       String date3=null;
       String hiv=null;
       String date4=null;
       String comp=null;
       String date5=null;
       String ultime=null;
       String date6=null;
       if(rainon.isSelected()){
           rai="Non";
       }
      if(raioui.isSelected()){
           rai="Oui";
           Date date=daterai.getDate();
           SimpleDateFormat f =new SimpleDateFormat("dd/MM/yyyy");
           date1=f.format(date);
       }
       if(agnon.isSelected()){
           ag="Non";
       }
      else if(agoui.isSelected()){
          ag="Oui";
           Date date=dateag.getDate();
           SimpleDateFormat f =new SimpleDateFormat("dd/MM/yyyy");
           date2=f.format(date);
       }
       if(hcvnon.isSelected()){
          hcv="Non";
       }
       if(hcvoui.isSelected()){
           hcv="Oui";
          Date date=datehcv.getDate();
           SimpleDateFormat f =new SimpleDateFormat("dd/MM/yyyy");
           date3=f.format(date);
       }
       if(hivnon.isSelected()){
           hiv="Non";
       }
        if(hivoui.isSelected()){
           hiv="Oui";
           Date date=datehiv.getDate();
           SimpleDateFormat f =new SimpleDateFormat("dd/MM/yyyy");
           date4=f.format(date);
       }
       if(compnon.isSelected()){
           comp="Non";
       }
        if(compoui.isSelected()){
           comp="Oui";
           Date date=datecomp.getDate();
           SimpleDateFormat f =new SimpleDateFormat("dd/MM/yyyy");
           date5=f.format(date);
       }
       if(ultimenon.isSelected()){
           ultime="Non";
       }
        if(ultimeoui.isSelected()){
           ultime="Oui";
           Date date=dateultime.getDate();
           SimpleDateFormat f =new SimpleDateFormat("dd/MM/yyyy");
           date6=f.format(date);
       }
       try{
          String sql ="insert into Controlepree (Groupesanguin,Phenotype,RAI,DateRAI,Ag,DateAg,AntiHCV,DateHCV,AntiHIV,DateHIV,Comptabilite,Datecomp,Utime,Dateultime,idpatient,episode) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
          pst = conn.prepareStatement(sql);
          pst.setString(1,groupe);
          pst.setString(2,phenoty);
          pst.setString(3, rai);
          pst.setString(4, date1);
          pst.setString(5, ag);
          pst.setString(6, date2);
          pst.setString(7, hcv);
          pst.setString(8, date3);
          pst.setString(9, hiv);
          pst.setString(10, date4);
          pst.setString(11,comp);
          pst.setString(12, date5);
          pst.setString(13,ultime);
          pst.setString(14, date6);
          pst.setString(15,id);
          pst.setString(16,ep);
          pst.execute();
         
          
              JOptionPane.showMessageDialog(null,"enregistrement effectué avec succés");
         
              
            
             
          
       }     
       catch(SQLException e){
               JOptionPane.showMessageDialog(null,e);
                  }
    
    }
    
    
    
    public void update(String id,String ep){
       String groupe=gpe.getText();
       String phenoty=(String) pheno.getSelectedItem();
       String rai=null;
       String date1=null;
       String ag=null;
       String date2=null;
       String hcv=null;
       String date3=null;
       String hiv=null;
       String date4=null;
       String comp=null;
       String date5=null;
       String ultime=null;
       String date6=null;
       if(rainon.isSelected()){
           rai="Non";
       }
        if(raioui.isSelected()){
           rai="Oui";
           Date date=daterai.getDate();
           SimpleDateFormat f =new SimpleDateFormat("dd/MM/yyyy");
           date1=f.format(date);
       }
       if(agnon.isSelected()){
           ag="Non";
       }
       if(agoui.isSelected()){
           ag="Oui";
           Date date=dateag.getDate();
           SimpleDateFormat f =new SimpleDateFormat("dd/MM/yyyy");
           date2=f.format(date);
       }
       if(hcvnon.isSelected()){
          hcv="Non";
       }
        if(hcvoui.isSelected()){
           hcv="Oui";
           Date date=datehcv.getDate();
           SimpleDateFormat f =new SimpleDateFormat("dd/MM/yyyy");
           date3=f.format(date);
       }
       if(hivnon.isSelected()){
           hiv="Non";
       }
       if(hivoui.isSelected()){
           hiv="Oui";
           Date date=datehiv.getDate();
           SimpleDateFormat f =new SimpleDateFormat("dd/MM/yyyy");
           date4=f.format(date);
       }
       if(compnon.isSelected()){
           comp="Non";
       }
       if(compoui.isSelected()){
           comp="Oui";
           Date date=datecomp.getDate();
           SimpleDateFormat f =new SimpleDateFormat("dd/MM/yyyy");
           date5=f.format(date);
       }
       if(ultimenon.isSelected()){
           ultime="Non";
       }
       if(ultimeoui.isSelected()){
           ultime="Oui";
           Date date=dateultime.getDate();
           SimpleDateFormat f =new SimpleDateFormat("dd/MM/yyyy");
           date6=f.format(date);
       }
       try{
          String sql ="update  Controlepree set Groupesanguin=?,Phenotype=?,RAI=?,DateRAI=?,Ag=?,DateAg=?,AntiHCV=?,DateHCV=?,AntiHIV=?,DateHIV=?,Comptabilite=?,Datecomp=?,Utime=?,Dateultime=? where idpatient=? and episode=? ";
          pst = conn.prepareStatement(sql);
          pst.setString(1,groupe);
          pst.setString(2,phenoty);
          pst.setString(3, rai);
          pst.setString(4, date1);
          pst.setString(5, ag);
          pst.setString(6, date2);
          pst.setString(7, hcv);
          pst.setString(8, date3);
          pst.setString(9, hiv);
          pst.setString(10, date4);
          pst.setString(11,comp);
          pst.setString(12, date5);
          pst.setString(13,ultime);
          pst.setString(14, date6);
          pst.setString(15,id);
          pst.setString(16,ep);
      
          pst.execute();
         
          
              JOptionPane.showMessageDialog(null,"enregistrement effectué avec succés");
         
              
            
             
          
       }     
       catch(SQLException e){
               JOptionPane.showMessageDialog(null,e);
                  }
     
       
    
    
    
      
    }
    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
       if(gpe.getText().trim().isEmpty()){JOptionPane.showMessageDialog(null,"Groupe sanguin ABO et RH non rempli !!!");}
       else if(raioui.isSelected()){
         if(daterai.getDate()==null){JOptionPane.showMessageDialog(null,"Date RAI non rempli !!!");}
          }
    
        try{
          String sqlsel ="select * from Controlepree where idpatient = ? and episode=? ";
          pstsel = conn.prepareStatement(sqlsel);
          pstsel.setString(1,declaration.idpatient.getText());
          pstsel.setString(2,declaration.episode.getText());
          rs=pstsel.executeQuery();
         
          if(!rs.next()){insert(declaration.idpatient.getText(),declaration.episode.getText());}
          else{update(declaration.idpatient.getText(),declaration.episode.getText());}
          
          
          
          
         }
        catch(SQLException e){
               JOptionPane.showMessageDialog(null,e);
                  }
         
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void gpeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gpeActionPerformed

    private void jMenu5MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu5MenuSelected
        declaration d=new declaration();
        d.setVisible(true);
        this.hide();  
    }//GEN-LAST:event_jMenu5MenuSelected

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(controle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(controle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(controle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(controle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pretransf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox agnon;
    private javax.swing.JCheckBox agoui;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JCheckBox compnon;
    private javax.swing.JCheckBox compoui;
    private com.toedter.calendar.JDateChooser dateag;
    private com.toedter.calendar.JDateChooser datecomp;
    private com.toedter.calendar.JDateChooser datehcv;
    private com.toedter.calendar.JDateChooser datehiv;
    private com.toedter.calendar.JDateChooser daterai;
    private com.toedter.calendar.JDateChooser dateultime;
    private javax.swing.JLabel ep;
    private javax.swing.JPanel fcontrole;
    private javax.swing.JTextField gpe;
    private javax.swing.JCheckBox hcvnon;
    private javax.swing.JCheckBox hcvoui;
    private javax.swing.JCheckBox hivnon;
    private javax.swing.JCheckBox hivoui;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu5;
    public static javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel pa;
    private javax.swing.JComboBox<String> pheno;
    private javax.swing.JCheckBox rainon;
    private javax.swing.JCheckBox raioui;
    private javax.swing.JCheckBox ultimenon;
    private javax.swing.JCheckBox ultimeoui;
    // End of variables declaration//GEN-END:variables
}
