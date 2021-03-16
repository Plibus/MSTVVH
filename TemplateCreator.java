
public class TemplateCreator extends javax.swing.JFrame implements Runnable {

	private static final long serialVersionUID = 1L;

	public TemplateCreator() {
    	templateCompleted = false;
        initComponents();
    }
	
    public TemplateCreator(Object lock) {
    	this.lock = lock;
    	templateCompleted = false;
        initComponents();
    }
    
    public TemplateCreator(Object lock, int[] selectedIndex, int start) {
    	this.lock = lock;
    	templateCompleted = false;
    	indexData = selectedIndex;
    	firstEntry = start;
        initComponents();
    }

	public synchronized void run() {
    	new TemplateCreator(lock).setVisible(true);
    	notifyAll();
        return;
    }
                    
    private void initComponents() {
    	
    	setTitle("Template Editor"); 

    	jPanel1 = new javax.swing.JPanel();
        contentOwnerLabel = new javax.swing.JLabel();
        countryLabel = new javax.swing.JLabel();
        eidrLabel = new javax.swing.JLabel();
        endDateLabel = new javax.swing.JLabel();
        episodeNameLabel = new javax.swing.JLabel();
        eid1Label = new javax.swing.JLabel();
        eid2Label = new javax.swing.JLabel();
        isanLabel = new javax.swing.JLabel();
        licensorLabel = new javax.swing.JLabel();
        pidLabel = new javax.swing.JLabel();
        numberOfEpisodesLabel = new javax.swing.JLabel();
        priorityLabel = new javax.swing.JLabel();
        productTypeLabel = new javax.swing.JLabel();
        releaseDateLabel = new javax.swing.JLabel();
        retailLabel = new javax.swing.JLabel();
        rightsLabel = new javax.swing.JLabel();
        licenseTypeLabel = new javax.swing.JLabel();
        formatProfileLabel = new javax.swing.JLabel();
        seasonNumberLabel = new javax.swing.JLabel();
        seriesNameLabel = new javax.swing.JLabel();
        startDateLabel = new javax.swing.JLabel();
        streetDateLabel = new javax.swing.JLabel();
        studioLabel = new javax.swing.JLabel();
        tierNameLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        versionTitleLabel = new javax.swing.JLabel();
        wholesaleLabel = new javax.swing.JLabel();
        priceTypeLabel = new javax.swing.JLabel();
        contentOwner = new javax.swing.JComboBox<>();
        licensor = new javax.swing.JComboBox<>();
        liscensorType = new javax.swing.JComboBox<>();
        productType = new javax.swing.JComboBox<>();
        seasonNumber = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        instructions = new javax.swing.JTextArea();
        format = new javax.swing.JComboBox<>();
        rights = new javax.swing.JComboBox<>();
        country = new javax.swing.JComboBox<>();
        pid = new javax.swing.JComboBox<>();
        eidr = new javax.swing.JComboBox<>();
        isan = new javax.swing.JComboBox<>();
        eid2 = new javax.swing.JComboBox<>();
        seriesName = new javax.swing.JComboBox<>();
        episodeName = new javax.swing.JComboBox<>();
        start = new javax.swing.JComboBox<>();
        release = new javax.swing.JComboBox<>();
        end = new javax.swing.JComboBox<>();
        street = new javax.swing.JComboBox<>();
        numberOfEpisodes = new javax.swing.JComboBox<>();
        eid1 = new javax.swing.JComboBox<>();
        versionTitle = new javax.swing.JComboBox<>();
        studio = new javax.swing.JComboBox<>();
        priority = new javax.swing.JComboBox<>();
        priceType = new javax.swing.JComboBox<>();
        tierName = new javax.swing.JComboBox<>();
        sdWholesale = new javax.swing.JComboBox<>();
        hdWholesale = new javax.swing.JComboBox<>();
        CreateTemplate = new javax.swing.JButton();
        firstAvail = new javax.swing.JComboBox<>();
        firstAvailLabel = new javax.swing.JLabel();
        seasonName = new javax.swing.JComboBox<>();
        episodeNumber = new javax.swing.JComboBox<>();
        episodeNumberLabel = new javax.swing.JLabel();
        seasonNameLabel = new javax.swing.JLabel();
        hdRetail = new javax.swing.JComboBox<>();
        wholesale = new javax.swing.JComboBox<>();
        sdRetail = new javax.swing.JComboBox<>();
        retail = new javax.swing.JComboBox<>();
        hdWholesaleLabel = new javax.swing.JLabel();
        sdWholesaleLabel = new javax.swing.JLabel();
        sdRetailLabel = new javax.swing.JLabel();
        hdRetailLabel = new javax.swing.JLabel();
        title = new javax.swing.JComboBox<>();
        network = new javax.swing.JComboBox<>();
        networkLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentOwnerLabel.setText("Content Owner");

        countryLabel.setText("Country");

        eidrLabel.setText("EIDR");

        endDateLabel.setText("End Date");

        episodeNameLabel.setText("Episode Name");

        eid1Label.setText("External Id 1");

        eid2Label.setText("External Id 2");

        isanLabel.setText("ISAN");

        licensorLabel.setText("Licensor");

        pidLabel.setText("PID");

        numberOfEpisodesLabel.setText("numberOfEpisodes");

        priorityLabel.setText("Priority");

        productTypeLabel.setText("Product Type");

        releaseDateLabel.setText("Release Date");

        retailLabel.setText("Retail Price");

        rightsLabel.setText("Rights");

        licenseTypeLabel.setText("License Type (DTO/PPT)");

        formatProfileLabel.setText("Format Profile (UHD/HD/SD)");

        seasonNumberLabel.setText("Season Number");

        seriesNameLabel.setText("Series Name");

        startDateLabel.setText("Start Date");

        streetDateLabel.setText("Street Date");

        studioLabel.setText("Studio");

        tierNameLabel.setText("Tier Name");

        titleLabel.setText("Title");

        versionTitleLabel.setText("VersionTitle");

        wholesaleLabel.setText("Wholesale Price");

        priceTypeLabel.setText("Price Type");

        contentOwner.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        contentOwner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentOwnerActionPerformed(evt);
            }
        });

        licensor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        licensor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licensorActionPerformed(evt);
            }
        });

        liscensorType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        liscensorType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liscensorTypeActionPerformed(evt);
            }
        });

        productType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        productType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productTypeActionPerformed(evt);
            }
        });

        seasonNumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        seasonNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seasonNumberActionPerformed(evt);
            }
        });

        instructions.setEditable(false);
        instructions.setColumns(20);
        instructions.setLineWrap(true);
        instructions.setRows(5);
        instructions.setText("To create a template first select the first row that contains an avail.\nThen fill out the form below by listing the columns that contain the indicated data\n\nYou may not be able to fill out all the columns.\nPlease leave any columns that you cannot blank.");
        jScrollPane1.setViewportView(instructions);

        format.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        format.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formatActionPerformed(evt);
            }
        });

        rights.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        rights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightsActionPerformed(evt);
            }
        });

        country.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryActionPerformed(evt);
            }
        });

        pid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        pid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidActionPerformed(evt);
            }
        });

        eidr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        eidr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eidrActionPerformed(evt);
            }
        });

        isan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        isan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isanActionPerformed(evt);
            }
        });

        eid2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        eid2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eid2ActionPerformed(evt);
            }
        });

        seriesName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        seriesName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seriesNameActionPerformed(evt);
            }
        });

        episodeName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        episodeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                episodeNameActionPerformed(evt);
            }
        });

        start.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        release.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        release.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                releaseActionPerformed(evt);
            }
        });

        end.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        end.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endActionPerformed(evt);
            }
        });

        street.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        street.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetActionPerformed(evt);
            }
        });

        numberOfEpisodes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        numberOfEpisodes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberOfEpisodesActionPerformed(evt);
            }
        });

        eid1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        eid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eid1ActionPerformed(evt);
            }
        });

        versionTitle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        versionTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                versionTitleActionPerformed(evt);
            }
        });

        studio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        studio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studioActionPerformed(evt);
            }
        });

        priority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        priority.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priorityActionPerformed(evt);
            }
        });

        priceType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        priceType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTypeActionPerformed(evt);
            }
        });

        tierName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        tierName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tierNameActionPerformed(evt);
            }
        });

        sdWholesale.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        sdWholesale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdWholesaleActionPerformed(evt);
            }
        });

        hdWholesale.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        hdWholesale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hdWholesaleActionPerformed(evt);
            }
        });

        CreateTemplate.setText("Create Template");
        CreateTemplate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateTemplateActionPerformed(evt);
            }
        });

        firstAvail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        firstAvail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstAvailActionPerformed(evt);
            }
        });

        firstAvailLabel.setText("First Avail is on line:");

        seasonName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        seasonName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seasonNameActionPerformed(evt);
            }
        });

        episodeNumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        episodeNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                episodeNumberActionPerformed(evt);
            }
        });

        episodeNumberLabel.setText("Episode Number");

        seasonNameLabel.setText("Season Name");

        hdRetail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        hdRetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hdRetailActionPerformed(evt);
            }
        });

        wholesale.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        wholesale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wholesaleActionPerformed(evt);
            }
        });

        sdRetail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        sdRetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdRetailActionPerformed(evt);
            }
        });

        retail.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        retail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retailActionPerformed(evt);
            }
        });

        hdWholesaleLabel.setText("HD Wholesale Price");

        sdWholesaleLabel.setText("SD Wholesale Price");

        sdRetailLabel.setText("SD Retail Price");

        hdRetailLabel.setText("HD Retail Price");

        title.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleActionPerformed(evt);
            }
        });

        network.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", "AQ", "AX", "AY", "AZ" }));
        network.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkActionPerformed(evt);
            }
        });

        networkLabel.setText("Network");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CreateTemplate))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(productType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(productTypeLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(format, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(formatProfileLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rights, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rightsLabel))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(versionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(countryLabel))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(versionTitleLabel))))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(titleLabel)
                                                            .addGap(149, 149, 149))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(priceType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(173, 173, 173))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                    .addComponent(priority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(priorityLabel))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                    .addComponent(studio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(studioLabel))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                    .addComponent(network, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                    .addComponent(networkLabel)))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(eidr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(isan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(eid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(eid2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(sdWholesale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(hdWholesale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(hdRetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(wholesale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(sdRetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(retail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(liscensorType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(licenseTypeLabel))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(licensor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(contentOwner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(contentOwnerLabel)
                                                                .addComponent(licensorLabel))))
                                                    .addGap(90, 90, 90)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(eidrLabel)
                                                .addComponent(isanLabel)
                                                .addComponent(hdWholesaleLabel)
                                                .addComponent(sdWholesaleLabel)
                                                .addComponent(wholesaleLabel)
                                                .addComponent(retailLabel)
                                                .addComponent(sdRetailLabel)
                                                .addComponent(hdRetailLabel)
                                                .addComponent(pidLabel)
                                                .addComponent(eid1Label)
                                                .addComponent(eid2Label)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(firstAvailLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(firstAvail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(numberOfEpisodes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(numberOfEpisodesLabel))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(episodeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(episodeNameLabel))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(seasonNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(seasonNumberLabel))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(seriesName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(seriesNameLabel))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(seasonName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(seasonNameLabel))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(street, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(streetDateLabel))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(release, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(end, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(startDateLabel)
                                            .addComponent(releaseDateLabel)
                                            .addComponent(endDateLabel)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(episodeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(episodeNumberLabel))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(priceTypeLabel)
                                    .addComponent(tierNameLabel))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contentOwner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contentOwnerLabel)
                    .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pidLabel)
                    .addComponent(seriesName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seriesNameLabel))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(licensor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(licensorLabel)
                    .addComponent(eidr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eidrLabel)
                    .addComponent(seasonName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seasonNameLabel))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(liscensorType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(licenseTypeLabel)
                    .addComponent(isan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seasonNumberLabel)
                    .addComponent(seasonNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isanLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productTypeLabel)
                    .addComponent(episodeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(episodeNameLabel)
                    .addComponent(eid1Label)
                    .addComponent(eid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(format, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(formatProfileLabel))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(eid2Label)
                        .addComponent(eid2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(episodeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(episodeNumberLabel)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rights, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rightsLabel))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(numberOfEpisodes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(numberOfEpisodesLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(countryLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(retail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(retailLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(wholesale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wholesaleLabel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titleLabel)
                            .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startDateLabel)
                            .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(endDateLabel)
                                .addComponent(end, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(versionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(versionTitleLabel)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(release, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(releaseDateLabel)
                        .addComponent(sdRetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sdRetailLabel))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(network, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(networkLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(street, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(streetDateLabel)
                    .addComponent(sdWholesale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sdWholesaleLabel)
                    .addComponent(studio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studioLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hdRetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hdRetailLabel)
                    .addComponent(priority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priorityLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hdWholesale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hdWholesaleLabel)
                    .addComponent(priceTypeLabel)
                    .addComponent(priceType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tierNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateTemplate)
                    .addComponent(firstAvailLabel)
                    .addComponent(firstAvail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        
       
    private void titleActionPerformed(java.awt.event.ActionEvent evt) {                                      
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[0] = i - 1;
                break;
            }
    	}
    } 
    
    private void versionTitleActionPerformed(java.awt.event.ActionEvent evt) {                                             
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[1] = i - 1;
                break;
            }
    	}
    }
    
    private void seriesNameActionPerformed(java.awt.event.ActionEvent evt) {                                           
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[2] = i - 1;
                break;
            }
    	}
    }
    
    private void seasonNameActionPerformed(java.awt.event.ActionEvent evt) {                                           
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[3] = i - 1;
                break;
            }
    	}
    }
    
    private void seasonNumberActionPerformed(java.awt.event.ActionEvent evt) {                                             
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[4] = i - 1;
                break;
            }
    	}
    }                                                                                   

    private void episodeNameActionPerformed(java.awt.event.ActionEvent evt) {                                            
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[5] = i - 1;
                break;
            }
    	}
    }
    
    private void episodeNumberActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[6] = i - 1;
                break;
            }
    	}
    }
    
    private void numberOfEpisodesActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[7] = i - 1;
                break;
            }
    	}
    }
    
    private void contentOwnerActionPerformed(java.awt.event.ActionEvent evt) {                                             
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[8] = i - 1;
                break;
            }
    	}
    }
    
    private void licensorActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[9] = i - 1;
                break;
            }
    	}
    } 
    
    private void countryActionPerformed(java.awt.event.ActionEvent evt) {                                        
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[10] = i - 1;
                break;
            }
    	}
    }
    
    private void productTypeActionPerformed(java.awt.event.ActionEvent evt) {                                            
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[11] = i - 1;
                break;
            }
    	}
    }
    
    private void studioActionPerformed(java.awt.event.ActionEvent evt) {                                       
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[12] = i - 1;
                break;
            }
    	}
    }
    
    private void networkActionPerformed(java.awt.event.ActionEvent evt) {                                        
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[13] = i - 1;
                break;
            }
    	}
    }
    
    private void pidActionPerformed(java.awt.event.ActionEvent evt) {                                    
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[14] = i - 1;
                break;
            }
    	}
    }
    
    private void eidrActionPerformed(java.awt.event.ActionEvent evt) {                                     
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[15] = i - 1;
                break;
            }
    	}
    } 
    
    private void eid1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[16] = i - 1;
                break;
            }
    	}
    }
    
    private void eid2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[17] = i - 1;
                break;
            }
    	}
    }

    private void isanActionPerformed(java.awt.event.ActionEvent evt) {                                     
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[18] = i - 1;
                break;
            }
    	}
    }                                    

    private void priorityActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[19] = i - 1;
                break;
            }
    	}
    }
    
    private void rightsActionPerformed(java.awt.event.ActionEvent evt) {                                       
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[20] = i - 1;
                break;
            }
    	}
    }
    
    private void liscensorTypeActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[21] = i - 1;
                break;
            }
    	}
    }                                             
    
    private void formatActionPerformed(java.awt.event.ActionEvent evt) {                                       
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[22] = i - 1;
                break;
            }
    	}
    }                                      

    private void startActionPerformed(java.awt.event.ActionEvent evt) {                                      
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[23] = i - 1;
                break;
            }
    	}
    }                                     
    
    private void streetActionPerformed(java.awt.event.ActionEvent evt) {                                       
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[24] = i - 1;
                break;
            }
    	}
    }
    
    private void releaseActionPerformed(java.awt.event.ActionEvent evt) {                                        
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[25] = i - 1;
                break;
            } 
    	}
    }                                       

    private void endActionPerformed(java.awt.event.ActionEvent evt) {                                    
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[26] = i - 1;
                break;
            }
    	}
    }                 
    
    private void tierNameActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[27] = i - 1;
                break;
            }
    	}
    }
    
    private void priceTypeActionPerformed(java.awt.event.ActionEvent evt) {                                          
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[28] = i - 1;
                break;
            }
    	}
    }                                         

    private void wholesaleActionPerformed(java.awt.event.ActionEvent evt) {                                          
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[29] = i - 1;
                break;
            }
    	}
    }
    
    private void retailActionPerformed(java.awt.event.ActionEvent evt) {                                       
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[30] = i - 1;
                break;
            }
    	}	
    } 

    private void sdWholesaleActionPerformed(java.awt.event.ActionEvent evt) {                                            
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[31] = i - 1;
                break;
            }
    	}
    }

    private void sdRetailActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[32] = i - 1;
                break;
            }
    	}
    }
    
    private void hdWholesaleActionPerformed(java.awt.event.ActionEvent evt) {                                            
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[33] = i - 1;
                break;
            }
    	}
    }      
    
    private void hdRetailActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	for (int i = 0; i < templateSearchData.length; i++) {
            if (templateSearchData[i].equals((String)productType.getSelectedItem())) {
                indexData[34] = i - 1;
                break;
            }
    	}
    } 

    private void firstAvailActionPerformed(java.awt.event.ActionEvent evt) {                                           
        firstEntry = firstAvail.getSelectedIndex();
            
    }                                          

    private void CreateTemplateActionPerformed(java.awt.event.ActionEvent evt) {                                               
    	templateCompleted = true;
    	synchronized (lock) {
    		lock.notify();
    	}
    	this.dispose();
    }                                              

    public int[] getIndexes() {
        return indexData;
    }
    
    public int getFirstData() {
    	return firstEntry;
    }
    
    public boolean isTemplateCompleted() {
		return templateCompleted;
	}
    
    private javax.swing.JButton CreateTemplate;
    private javax.swing.JComboBox<String> contentOwner;
    private javax.swing.JLabel contentOwnerLabel;
    private javax.swing.JComboBox<String> country;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JComboBox<String> eid1;
    private javax.swing.JLabel eid1Label;
    private javax.swing.JComboBox<String> eid2;
    private javax.swing.JLabel eid2Label;
    private javax.swing.JComboBox<String> eidr;
    private javax.swing.JLabel eidrLabel;
    private javax.swing.JComboBox<String> end;
    private javax.swing.JLabel endDateLabel;
    private javax.swing.JComboBox<String> episodeName;
    private javax.swing.JComboBox<String> episodeNumber;
    private javax.swing.JLabel episodeNumberLabel;
    private javax.swing.JComboBox<String> firstAvail;
    private javax.swing.JLabel firstAvailLabel;
    private javax.swing.JComboBox<String> format;
    private javax.swing.JLabel formatProfileLabel;
    private javax.swing.JComboBox<String> hdRetail;
    private javax.swing.JLabel hdRetailLabel;
    private javax.swing.JComboBox<String> hdWholesale;
    private javax.swing.JLabel hdWholesaleLabel;
    private javax.swing.JTextArea instructions;
    private javax.swing.JComboBox<String> isan;
    private javax.swing.JLabel isanLabel;
    private javax.swing.JLabel episodeNameLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel licenseTypeLabel;
    private javax.swing.JComboBox<String> licensor;
    private javax.swing.JLabel licensorLabel;
    private javax.swing.JComboBox<String> liscensorType;
    private javax.swing.JComboBox<String> network;
    private javax.swing.JLabel networkLabel;
    private javax.swing.JComboBox<String> pid;
    private javax.swing.JLabel pidLabel;
    private javax.swing.JComboBox<String> numberOfEpisodes;
    private javax.swing.JLabel numberOfEpisodesLabel;
    private javax.swing.JComboBox<String> priceType;
    private javax.swing.JLabel priceTypeLabel;
    private javax.swing.JComboBox<String> priority;
    private javax.swing.JLabel priorityLabel;
    private javax.swing.JComboBox<String> productType;
    private javax.swing.JLabel productTypeLabel;
    private javax.swing.JComboBox<String> release;
    private javax.swing.JLabel releaseDateLabel;
    private javax.swing.JComboBox<String> retail;
    private javax.swing.JLabel retailLabel;
    private javax.swing.JComboBox<String> rights;
    private javax.swing.JLabel rightsLabel;
    private javax.swing.JComboBox<String> sdRetail;
    private javax.swing.JLabel sdRetailLabel;
    private javax.swing.JComboBox<String> sdWholesale;
    private javax.swing.JLabel sdWholesaleLabel;
    private javax.swing.JComboBox<String> seasonName;
    private javax.swing.JLabel seasonNameLabel;
    private javax.swing.JComboBox<String> seasonNumber;
    private javax.swing.JLabel seasonNumberLabel;
    private javax.swing.JComboBox<String> seriesName;
    private javax.swing.JLabel seriesNameLabel;
    private javax.swing.JComboBox<String> start;
    private javax.swing.JLabel startDateLabel;
    private javax.swing.JComboBox<String> street;
    private javax.swing.JLabel streetDateLabel;
    private javax.swing.JComboBox<String> studio;
    private javax.swing.JLabel studioLabel;
    private javax.swing.JComboBox<String> tierName;
    private javax.swing.JLabel tierNameLabel;
    private javax.swing.JComboBox<String> title;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JComboBox<String> versionTitle;
    private javax.swing.JLabel versionTitleLabel;
    private javax.swing.JComboBox<String> wholesale;
    private javax.swing.JLabel wholesaleLabel;
    
    private String[] templateSearchData = new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", 
                                                         "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", 
                                                         "AA", "AB", "AC", "AD", "AE", "AF", "AG", "AH", "AI", "AJ", "AK", 
                                                         "AL", "AM", "AN", "AO", "AP", "AQ", "AR", "AS", "AT", "AU", "AV", 
                                                         "AQ", "AX", "AY", "AZ", "BA", "BB", "BC", "BD", "BE", "BF", "BG", 
                                                         "BH", "BI", "BJ", "BK", "BL", "BM", "BN", "BO", "BP", "BQ", "BR", 
                                                         "BS", "BT", "BU", "BV", "BW", "BX", "BY", "BZ" };
    private static int[] indexData = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                                         		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                                         		-1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                                         		-1, -1, -1, -1, -1};
    private static int firstEntry = 0;
    private boolean templateCompleted;
    Object lock;
}
