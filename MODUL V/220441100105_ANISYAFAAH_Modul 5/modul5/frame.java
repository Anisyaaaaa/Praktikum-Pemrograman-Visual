package modul5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frame extends javax.swing.JFrame {
    private boolean isEditMode = false;
    
    public frame() {
        conn = new koneksii();
        initComponents();
        tampilData();
        bersihkan();
        tambahDropdown();
        internal1.setVisible(false);
        tabelHistory();
    }
    
    public void tambahDropdown() {
    try {
        Statement st = conn.getConnection().createStatement();
        ResultSet rs = st.executeQuery("SELECT nama_barang FROM barang");

        while (rs.next()) {
            String namaBarang = rs.getString("nama_barang");
            ComboBarang.addItem(namaBarang);
        }

        st.close();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
    }
    }
    
    public void tampilData(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Nama Barang");
        tbl.addColumn("Kode Barang");
        tbl.addColumn("Harga Barang");
        
        Tabel.setModel(tbl); // tbl_mahasiswa disesuaikan dengan variable jtable
        try {
            Statement st = conn.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM barang");
            while (rs.next()) {
                tbl.addRow( new Object[] {
                    rs.getString("nama_barang"),
                    rs.getString("kode_barang"),
                    rs.getString("harga_barang")
                });
                Tabel.setModel(tbl);
                //Dropdown.addElement(rs.getString("nama_barang"));
            }
        } catch (Exception e) {
        }
    }
      
    private void bersihkan(){
        TextHarga.setText("");
        TextKode.setText("");
        TextBarang.setText("");
    }
      
    public void tabelHistory(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Pembeli");
        tbl.addColumn("Barang");
        tbl.addColumn("Kode");
        tbl.addColumn("Harga");
        tbl.addColumn("Jumlah");
        tbl.addColumn("Harga Total");
        tbl.addColumn("Uang");
        tbl.addColumn("Kembalian");
        
        tblRiwayat.setModel(tbl);
        try{
            Connection c = conn.getConnection();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM datapembeli";
            ResultSet r = s.executeQuery(sql);
            
            while (r.next()){
                tbl.addRow(new Object[]{
                    r.getString("nama_pembeli"),
                    r.getString("nama_barang"),
                    r.getString("kode_barang"),
                    r.getString("harga_barang"),
                    r.getString("jumlah_beli"),
                    r.getString("harga_total"),
                    r.getString("uang_pembeli"),
                    r.getString("kembalian"),
                });
                tblRiwayat.setModel(tbl);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    //Generated Code
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel = new javax.swing.JTable();
        jLabel45 = new javax.swing.JLabel();
        TextHarga = new javax.swing.JTextField();
        Reset = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextBarang = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Simpan = new javax.swing.JButton();
        TextKode = new javax.swing.JTextField();
        Hapus = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Text_Barang = new javax.swing.JTextField();
        Text_Nama = new javax.swing.JTextField();
        Text_Harga = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ComboBarang = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        internal1 = new javax.swing.JInternalFrame();
        jPanel11 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        TextJmlBeli4 = new javax.swing.JTextField();
        TextTotalHarga4 = new javax.swing.JTextField();
        HitungTotal4 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        TextTotalDibayar1 = new javax.swing.JTextField();
        TextTotalKembali1 = new javax.swing.JTextField();
        HitungKembalian1 = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnSimpann = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRiwayat = new javax.swing.JTable();
        jLabel51 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel4.setBackground(new java.awt.Color(163, 142, 94));

        jPanel2.setBackground(new java.awt.Color(163, 142, 94));

        Tabel.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nama Barang", "Kode Barang", "Harga Barang"
            }
        ));
        Tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TabelMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jLabel45.setFont(new java.awt.Font("Baskerville Old Face", 1, 20)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 222, 157));
        jLabel45.setText("Input Data Barang");

        TextHarga.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        TextHarga.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Reset.setBackground(new java.awt.Color(73, 63, 41));
        Reset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Reset.setForeground(new java.awt.Color(255, 222, 157));
        Reset.setIcon(new javax.swing.ImageIcon("C:\\Users\\anisy\\Downloads\\reset.png")); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 222, 157));
        jLabel2.setText("Nama Barang");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 222, 157));
        jLabel3.setText("Kode Barang");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 222, 157));
        jLabel4.setText("Harga Barang");

        TextBarang.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        TextBarang.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 222, 157));
        jLabel1.setText(":");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 222, 157));
        jLabel5.setText(":");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 222, 157));
        jLabel6.setText(":");

        Simpan.setBackground(new java.awt.Color(73, 63, 41));
        Simpan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Simpan.setForeground(new java.awt.Color(255, 222, 157));
        Simpan.setIcon(new javax.swing.ImageIcon("C:\\Users\\anisy\\Downloads\\save.png")); // NOI18N
        Simpan.setText("Simpan");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });

        TextKode.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        TextKode.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Hapus.setBackground(new java.awt.Color(73, 63, 41));
        Hapus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Hapus.setForeground(new java.awt.Color(255, 222, 157));
        Hapus.setIcon(new javax.swing.ImageIcon("C:\\Users\\anisy\\Downloads\\delete-folder.png")); // NOI18N
        Hapus.setText("Hapus");
        Hapus.setVerifyInputWhenFocusTarget(false);
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\anisy\\Downloads\\input.png")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addGap(281, 281, 281))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TextHarga))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TextBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Simpan)
                                        .addGap(18, 18, 18)
                                        .addComponent(Hapus))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TextKode, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(Reset)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TextHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jTabbedPane2.addTab("Input Barang", jPanel4);

        jPanel5.setBackground(new java.awt.Color(112, 96, 63));

        jPanel3.setBackground(new java.awt.Color(163, 142, 94));

        Text_Barang.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Text_Barang.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Text_Nama.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Text_Nama.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Text_Harga.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        Text_Harga.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 222, 157));
        jLabel7.setText("Pilih Barang");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 222, 157));
        jLabel8.setText("Kode Barang");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 222, 157));
        jLabel9.setText("Harga Barang");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 222, 157));
        jLabel10.setText("Nama Pembeli");

        ComboBarang.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        ComboBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBarangActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 222, 157));
        jLabel15.setText(":");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 222, 157));
        jLabel16.setText(":");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 222, 157));
        jLabel17.setText(":");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 222, 157));
        jLabel18.setText(":");

        btnNext.setBackground(new java.awt.Color(112, 96, 63));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 222, 157));
        btnNext.setIcon(new javax.swing.ImageIcon("C:\\Users\\anisy\\Downloads\\next.png")); // NOI18N
        btnNext.setText("Next");
        btnNext.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNext.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 222, 157));
        jLabel43.setText("Data Pembeli");

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\anisy\\Downloads\\satisfaction.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(99, 99, 99))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Text_Nama)
                            .addComponent(ComboBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Text_Barang)
                            .addComponent(Text_Harga, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnNext)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel10)
                    .addComponent(Text_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(ComboBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(Text_Barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(Text_Harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(33, 33, 33)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        internal1.setVisible(true);

        jPanel11.setBackground(new java.awt.Color(163, 142, 94));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 222, 157));
        jLabel35.setText("Jumlah Pembelian");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 222, 157));
        jLabel36.setText("Total Harga");

        TextJmlBeli4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        TextJmlBeli4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TextTotalHarga4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        TextTotalHarga4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextTotalHarga4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextTotalHarga4ActionPerformed(evt);
            }
        });

        HitungTotal4.setBackground(new java.awt.Color(112, 96, 63));
        HitungTotal4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        HitungTotal4.setForeground(new java.awt.Color(255, 222, 157));
        HitungTotal4.setIcon(new javax.swing.ImageIcon("C:\\Users\\anisy\\Downloads\\budget.png")); // NOI18N
        HitungTotal4.setText("Hitung");
        HitungTotal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungTotal4ActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 222, 157));
        jLabel37.setText(":");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 222, 157));
        jLabel38.setText(":");

        jLabel48.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 222, 157));
        jLabel48.setText("Total Harga");

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\anisy\\Downloads\\money-bag.png")); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextTotalHarga4)
                    .addComponent(TextJmlBeli4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(HitungTotal4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(105, 105, 105))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(TextJmlBeli4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addGap(32, 32, 32)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(TextTotalHarga4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addGap(18, 18, 18)
                .addComponent(HitungTotal4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(255, 222, 157));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(163, 142, 94));

        TextTotalDibayar1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        TextTotalDibayar1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        TextTotalKembali1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        TextTotalKembali1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        HitungKembalian1.setBackground(new java.awt.Color(112, 96, 63));
        HitungKembalian1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        HitungKembalian1.setForeground(new java.awt.Color(255, 222, 157));
        HitungKembalian1.setIcon(new javax.swing.ImageIcon("C:\\Users\\anisy\\Downloads\\accounting.png")); // NOI18N
        HitungKembalian1.setText("Hitung");
        HitungKembalian1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungKembalian1ActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 222, 157));
        jLabel39.setText("Total Dibayar");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 222, 157));
        jLabel40.setText("Total Kembalian");

        jLabel41.setForeground(new java.awt.Color(255, 222, 157));
        jLabel41.setText(":");

        jLabel42.setForeground(new java.awt.Color(255, 222, 157));
        jLabel42.setText(":");

        jLabel47.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 222, 157));
        jLabel47.setText("Total Bayar");

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\anisy\\Downloads\\wages (1).png")); // NOI18N

        btnSimpann.setBackground(new java.awt.Color(112, 96, 63));
        btnSimpann.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSimpann.setForeground(new java.awt.Color(255, 222, 157));
        btnSimpann.setIcon(new javax.swing.ImageIcon("C:\\Users\\anisy\\Downloads\\bookmark (1).png")); // NOI18N
        btnSimpann.setText("Simpan");
        btnSimpann.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSimpann.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSimpann.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpannActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel47)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(HitungKembalian1)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel40)
                                .addComponent(jLabel39)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextTotalKembali1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextTotalDibayar1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSimpann))
                        .addGap(20, 20, 20))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(TextTotalDibayar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addGap(33, 33, 33)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(TextTotalKembali1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HitungKembalian1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSimpann, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout internal1Layout = new javax.swing.GroupLayout(internal1.getContentPane());
        internal1.getContentPane().setLayout(internal1Layout);
        internal1Layout.setHorizontalGroup(
            internal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        internal1Layout.setVerticalGroup(
            internal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internal1Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel46.setFont(new java.awt.Font("Baskerville Old Face", 1, 20)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 222, 157));
        jLabel46.setText("Data Pembelian");

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\anisy\\Downloads\\analysis.png")); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(internal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46)
                .addGap(322, 322, 322))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel46)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(internal1))
                .addGap(20, 20, 20))
        );

        jTabbedPane2.addTab("Pembelian", jPanel5);

        jPanel1.setBackground(new java.awt.Color(163, 142, 94));

        tblRiwayat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane2.setViewportView(tblRiwayat);

        jLabel51.setFont(new java.awt.Font("Baskerville Old Face", 1, 20)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 222, 157));
        jLabel51.setText("Daftar Riwayat Pembelian");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel51)
                .addGap(268, 268, 268))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel51)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Riwayat", jPanel1);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 870, 540));

        jLabel44.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(73, 63, 41));
        jLabel44.setText("PROGRAM KASIR SEDERHANA");
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        jLabel50.setIcon(new javax.swing.ImageIcon("C:\\Users\\anisy\\Downloads\\dashboard.png")); // NOI18N
        getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 70, 70));

        jLabel49.setIcon(new javax.swing.ImageIcon("C:\\Users\\anisy\\Downloads\\123456789.jpg")); // NOI18N
        getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -30, 900, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBarangActionPerformed
        String selectedBarang = ComboBarang.getSelectedItem().toString();

        try {
            // Create a statement and execute a query to get the price from the database
            Statement st = conn.getConnection().createStatement();
            String query = "SELECT kode_barang, harga_barang FROM barang WHERE nama_barang = '" + selectedBarang + "'";
            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {
                // mengset harga Harga_Barang text field
                Text_Barang.setText(rs.getString("kode_barang"));
                Text_Harga.setText(rs.getString("harga_barang"));
            } else {
                // Handle the case where the item was not found in the database
                Text_Harga.setText("Item not found");
            }

            rs.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
        }
    }//GEN-LAST:event_ComboBarangActionPerformed

    private void HitungTotal4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungTotal4ActionPerformed
        int jumlahPembelian = Integer.parseInt(TextJmlBeli4.getText());

        // Mendapatkan nilai harga barang dari input atau dari database jika Anda ingin mengambilnya dari database
        int hargaBarang = Integer.parseInt(Text_Harga.getText());

        // Menghitung total harga
        int totalHarga = jumlahPembelian * hargaBarang;

        // Menampilkan total harga pada input total harga
        TextTotalHarga4.setText(String.valueOf(totalHarga));
    }//GEN-LAST:event_HitungTotal4ActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        internal1.setVisible(true);
    }//GEN-LAST:event_btnNextActionPerformed

    private void TextTotalHarga4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextTotalHarga4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextTotalHarga4ActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        TextBarang.setText("");
        TextKode.setText("");
        TextHarga.setText("");
        Text_Nama.setText("");
        TextJmlBeli4.setText("");
        TextTotalHarga4.setText("");
        TextTotalDibayar1.setText("");
        TextTotalKembali1.setText("");
        

        isEditMode = false;
        Simpan.setText("Simpan");
        
        // Menghapus semua data dari tabel dalam database
        
    }//GEN-LAST:event_ResetActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        int selectedRow = Tabel.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus.");
        } else {
            DefaultTableModel model = (DefaultTableModel) Tabel.getModel();

            // Mendapatkan kode barang dari baris yang dipilih
            String kodeBarang = model.getValueAt(selectedRow, 1).toString();

            // Melakukan penghapusan data dari database
            try {
                Statement st = conn.getConnection().createStatement();
                st.executeUpdate("DELETE FROM barang WHERE kode_barang = '" + kodeBarang + "'");
                st.close();
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus.");

                // Menghapus baris dari tabel
                model.removeRow(selectedRow);
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
            }
        }
        isEditMode = false;
        Simpan.setText("Simpan"); 
        
        TextBarang.setText("");
        TextKode.setText("");
        TextHarga.setText("");
    }//GEN-LAST:event_HapusActionPerformed

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        if (isEditMode) {
            // Anda berada dalam mode pengeditan, lakukan perintah pengeditan di sini
            // Misalnya, Anda bisa menggunakan kode SQL UPDATE untuk mengubah data yang ada di database.
            try {
                Statement st = conn.getConnection().createStatement();
                st.executeUpdate("UPDATE barang SET nama_barang='" + TextBarang.getText() + "', kode_barang='"
                    + TextKode.getText() + "', harga_barang='" + TextHarga.getText() + "' WHERE kode_barang='"
                    + TextKode.getText() + "'");
                st.close();
                JOptionPane.showMessageDialog(this, "Data berhasil diubah");
                tampilData();
                bersihkan();
                tambahDropdown();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
            }
            // Set kembali ke mode penambahan data baru
            isEditMode = false;
            Simpan.setText("Simpan");
        } else {
            // Anda berada dalam mode penambahan data baru, lakukan perintah penambahan di sini
            try {
                Statement st = conn.getConnection().createStatement();
                st.executeUpdate("INSERT INTO barang VALUES('" + TextBarang.getText() + "', '"
                    + TextKode.getText() + "', '" + TextHarga.getText() + "')");
                st.close();
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
                tampilData();
                bersihkan();
                tambahDropdown();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_SimpanActionPerformed

    private void TabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelMouseClicked
        DefaultTableModel model = (DefaultTableModel) Tabel.getModel();
        int selectedRow = Tabel.getSelectedRow();

        // Cek apakah ada baris yang dipilih
        if (selectedRow >= 0) {
            TextBarang.setText(model.getValueAt(selectedRow, 0).toString());
            TextKode.setText(model.getValueAt(selectedRow, 1).toString());
            TextHarga.setText(model.getValueAt(selectedRow, 2).toString());
                    isEditMode = true; 
            Simpan.setText("Edit"); // Ubah teks tombol menjadi "Edit"
        }else {
            // Anda berada dalam mode penambahan data baru, lakukan perintah penambahan di sini
            try {
                Statement st = conn.getConnection().createStatement();
                st.executeUpdate("INSERT INTO barang VALUES('" + TextBarang.getText() + "', '"
                    + TextKode.getText() + "', '" + TextHarga.getText() + "')");
                st.close();
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
                tampilData();
                bersihkan();
                tambahDropdown();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_TabelMouseClicked

    private void HitungKembalian1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungKembalian1ActionPerformed
        int totalBayar = Integer.parseInt(TextTotalDibayar1.getText());
        int totalHarga = Integer.parseInt(TextTotalHarga4.getText());
        int kembalian = totalBayar - totalHarga;
        if (kembalian < 0){
            JOptionPane.showMessageDialog(this, "Uang yang anda bayarkan kurang");
        }else {
            TextTotalKembali1.setText(String.valueOf(kembalian));
        }
    }//GEN-LAST:event_HitungKembalian1ActionPerformed

    private void btnSimpannActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpannActionPerformed
        // TODO add your handling code here:
        String barang = ComboBarang.getSelectedItem().toString();
        String kode = Text_Barang.getText();
        String harga = Text_Harga.getText();
        String nama = Text_Nama.getText();
        String jumlah = TextJmlBeli4.getText();
        String total = TextTotalHarga4.getText();
        String bayar = TextTotalDibayar1.getText();
        String kembalian = TextTotalKembali1.getText();
        
        if(barang.isEmpty()||kode.isEmpty()||harga.isEmpty()||nama.isEmpty()||jumlah.isEmpty()||total.isEmpty()||bayar.isEmpty()||kembalian.isEmpty()){
            JOptionPane.showMessageDialog(null, "Tolong Isi Terlebih Dahulu!");
        }else{
            try{
                Connection c = conn.getConnection();
                String sql = "INSERT INTO datapembeli VALUES (?,?,?,?,?,?,?,?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, nama);
                p.setString(2, barang);
                p.setString(3, kode);
                p.setString(4, harga);
                p.setString(5, jumlah);
                p.setString(6, total);
                p.setString(7, bayar);
                p.setString(8, kembalian);
                p.executeUpdate();
                p.close();
                tabelHistory(); 
                JOptionPane.showMessageDialog(null, "Data Telah Ditambahkan");
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnSimpannActionPerformed

    private void TabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelMouseReleased
        // TODO add your handling code here:
        Simpan.setText("Simpan");
        
    }//GEN-LAST:event_TabelMouseReleased

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
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame().setVisible(true);
            }
        });
    }
    
    koneksii conn;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBarang;
    private javax.swing.JButton Hapus;
    private javax.swing.JButton HitungKembalian1;
    private javax.swing.JButton HitungTotal4;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Simpan;
    private javax.swing.JTable Tabel;
    private javax.swing.JTextField TextBarang;
    private javax.swing.JTextField TextHarga;
    private javax.swing.JTextField TextJmlBeli4;
    private javax.swing.JTextField TextKode;
    private javax.swing.JTextField TextTotalDibayar1;
    private javax.swing.JTextField TextTotalHarga4;
    private javax.swing.JTextField TextTotalKembali1;
    private javax.swing.JTextField Text_Barang;
    private javax.swing.JTextField Text_Harga;
    private javax.swing.JTextField Text_Nama;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSimpann;
    private javax.swing.JInternalFrame internal1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tblRiwayat;
    // End of variables declaration//GEN-END:variables
}
