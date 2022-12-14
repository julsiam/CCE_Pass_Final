/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sd_205_mongodb;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author User
 */
public class StaffHome extends javax.swing.JFrame {

//    MongoClient mongoClient;
//    DB dbName;
//    DBCollection birthCollection, appointmentCollection, suggestionsCollection;
    BasicDBObject backup;

    public StaffHome() {
        initComponents();
    }

    public void displayBirth() {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DBCursor cursor;
        DB db = mongoClient.getDB("CCE_Pass");
        DBCollection coll = db.getCollection("birth");
        cursor = coll.find();
        String[] columnNames = {"Sex", "First Name", "Middle Name", "Last Name", "Birthdate", "Birthplace(Country)", "Birthplace(Province)", "Birthplace(City)", "Government Issued ID", " Father's First Name", "Father's Middle Name", "Father's Last Name", "Mother's First Name", "Mother's Middle Name", "Mother's Last Name", "Late Registration", "Purpose", "Phone Number", "Status"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        while (cursor.hasNext()) {
            DBObject obj = cursor.next();
            String sex = (String) obj.get("sex");
            String first = (String) obj.get("fname");
            String midd = (String) obj.get("mname");
            String last = (String) obj.get("lname");
            String bdate = (String) obj.get("birthdate");
            String bpCountry = (String) obj.get("birthplace(country)");
            String bpProvince = (String) obj.get("birthplace(province)");
            String bpCity = (String) obj.get("birthplace(city)");
            String govID = (String) obj.get("gov'tId");
            String ffname = (String) obj.get("ffname");
            String fmname = (String) obj.get("fmname");
            String flname = (String) obj.get("flname");
            String mfname = (String) obj.get("mfname");
            String mmname = (String) obj.get("mmname");
            String mlname = (String) obj.get("mlname");
            String lateReg = (String) obj.get("lateRegField");
            String purp = (String) obj.get("purpose");
            String phone = (String) obj.get("phone");
            String status = (String) obj.get("status");

            model.addRow(new Object[]{sex, first, midd, last, bdate, bpCountry, bpProvince, bpCity, govID, ffname, fmname, flname, mfname, mmname, mlname, lateReg, purp, phone, status});
        }
        birthReqTable.setModel(model);

        cursor.close();
        mongoClient.close();
    }

    public void displayMarriage() {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DBCursor cursor;
        DB db = mongoClient.getDB("CCE_Pass");
        DBCollection coll = db.getCollection("marriage");
        cursor = coll.find();
        String[] columnNames = {"Sex", "First Name", "Middle Name", "Last Name", "Birthdate", "Birthplace(Country)", "Birthplace(Province)", "Birthplace(City)", "Government Issued ID", "Spouse's First Name", "Spouse's Middle Name", "Spouse's Last Name", "Marriage Date", "Marriage Place", "Late Registration", "Purpose", "Phone Number", "Status"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        while (cursor.hasNext()) {
            DBObject obj = cursor.next();
            String sex = (String) obj.get("sex");
            String first = (String) obj.get("fname");
            String midd = (String) obj.get("mname");
            String last = (String) obj.get("lname");
            String bdate = (String) obj.get("birthdate");
            String bpCountry = (String) obj.get("birthplace(country)");
            String bpProvince = (String) obj.get("birthplace(province)");
            String bpCity = (String) obj.get("birthplace(city)");
            String govID = (String) obj.get("gov'tId");
            String sfname = (String) obj.get("sfname");
            String smname = (String) obj.get("smname");
            String slname = (String) obj.get("slname");
            String mdate = (String) obj.get("marriage_date");
            String mplace = (String) obj.get("marriageplace");
            String lateReg = (String) obj.get("lateRegField");
            String purp = (String) obj.get("purpose");
            String phone = (String) obj.get("phone");
            String status = (String) obj.get("status");

            model.addRow(new Object[]{sex, first, midd, last, bdate, bpCountry, bpProvince, bpCity, govID, sfname, smname, slname, mdate, mplace, lateReg, purp, phone, status});
        }
        marriageReqTable.setModel(model);

        cursor.close();
        mongoClient.close();
    }

    public void displayCenomar() {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DBCursor cursor;
        DB db = mongoClient.getDB("CCE_Pass");
        DBCollection coll = db.getCollection("cenomar");
        cursor = coll.find();
        String[] columnNames = {"Sex", "First Name", "Middle Name", "Last Name", "Birthdate", "Birthplace(Country)", "Birthplace(Province)", "Birthplace(City)", "Government Issued ID", " Father's First Name", "Father's Middle Name", "Father's Last Name", "Mother's First Name", "Mother's Middle Name", "Mother's Last Name", "Purpose", "Phone Number", "Status"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        while (cursor.hasNext()) {
            DBObject obj = cursor.next();
            String sex = (String) obj.get("sex");
            String first = (String) obj.get("fname");
            String midd = (String) obj.get("mname");
            String last = (String) obj.get("lname");
            String bdate = (String) obj.get("birthdate");
            String bpCountry = (String) obj.get("birthplace(country)");
            String bpProvince = (String) obj.get("birthplace(province)");
            String bpCity = (String) obj.get("birthplace(city)");
            String govID = (String) obj.get("gov'tId");
            String ffname = (String) obj.get("ffname");
            String fmname = (String) obj.get("fmname");
            String flname = (String) obj.get("flname");
            String mfname = (String) obj.get("mfname");
            String mmname = (String) obj.get("mmname");
            String mlname = (String) obj.get("mlname");
            String purp = (String) obj.get("purpose");
            String phone = (String) obj.get("phone");
            String status = (String) obj.get("status");

            model.addRow(new Object[]{sex, first, midd, last, bdate, bpCountry, bpProvince, bpCity, govID, ffname, fmname, flname, mfname, mmname, mlname, purp, phone, status});
        }
        cenomarReqTable.setModel(model);

        cursor.close();
        mongoClient.close();
    }

    public void displayDeath() {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DBCursor cursor;
        DB db = mongoClient.getDB("CCE_Pass");
        DBCollection coll = db.getCollection("death");
        cursor = coll.find();
        String[] columnNames = {"Sex", "First Name", "Middle Name", "Last Name", "Birthdate", "Birthplace(Country)", "Birthplace(Province)", "Birthplace(City)", "Government Issued ID", "Relationship", " Deceased First Name", "Deceased Middle Name", "Deceased Last Name", "Date of Death", "Place of Death", "Late Registration", "Purpose", "Phone Number", "Status"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        while (cursor.hasNext()) {
            DBObject obj = cursor.next();
            String sex = (String) obj.get("sex");
            String first = (String) obj.get("fname");
            String midd = (String) obj.get("mname");
            String last = (String) obj.get("lname");
            String bdate = (String) obj.get("birthdate");
            String bpCountry = (String) obj.get("birthplace(country)");
            String bpProvince = (String) obj.get("birthplace(province)");
            String bpCity = (String) obj.get("birthplace(city)");
            String govID = (String) obj.get("gov'tId");
            String relationsip = (String) obj.get("relation");
            String dfname = (String) obj.get("deceasedfname");
            String dmname = (String) obj.get("deceasedmname");
            String dlname = (String) obj.get("deceasedlname");
            String deathDate = (String) obj.get("dateofdeath");
            String deathPlace = (String) obj.get("placeofdeath");
            String latereg = (String) obj.get("lateReg");
            String purp = (String) obj.get("purpose");
            String phone = (String) obj.get("phone");
            String status = (String) obj.get("status");

            model.addRow(new Object[]{sex, first, midd, last, bdate, bpCountry, bpProvince, bpCity, govID, relationsip, dfname, dmname, dlname, deathDate, deathPlace, latereg, purp, phone, status});
        }
        deathReqTable.setModel(model);

        cursor.close();
        mongoClient.close();
    }

    public void displayVoters() {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DBCursor cursor;
        DB db = mongoClient.getDB("CCE_Pass");
        DBCollection coll = db.getCollection("voters");
        cursor = coll.find();
        String[] columnNames = {"First Name", "Middle Name", "Last Name", "Email Address", "Phone Number", "Birth Place", "Government Issued ID", "Status"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        while (cursor.hasNext()) {
            DBObject obj = cursor.next();
            String first = (String) obj.get("fname");
            String midd = (String) obj.get("mname");
            String last = (String) obj.get("lname");
            String emailadd = (String) obj.get("email");
            String phone_no = (String) obj.get("phone");
            String bplace = (String) obj.get("birthplace");
            String govID = (String) obj.get("gov'tId");
            String status = (String) obj.get("status");

            model.addRow(new Object[]{first, midd, last, emailadd, phone_no, bplace, govID, status});
        }
        votersReqTable.setModel(model);

        cursor.close();
        mongoClient.close();
    }

    public void displayBusiness() {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DBCursor cursor;
        DB db = mongoClient.getDB("CCE_Pass");
        DBCollection coll = db.getCollection("business");
        cursor = coll.find();
        String[] columnNames = {"Business Type", "DTI/SEC/CDA/Reg.No.", "Payment Mode", "Application Date", "TIN", "Ammendment From", "Ammendment To", "First Name", "Middle Name", "Last Name", "Trade Name", "Gov't Tax", "Business Address", "Business Postal Code", "Business Hotline", "Owner's Address", "Owner's Postal Code", ",Mobile Number", "Contact Person", "Phone Number", "Business Area", "Employee Total", "Status"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        while (cursor.hasNext()) {
            DBObject obj = cursor.next();
            String btype = (String) obj.get("businessType");
            String regno = (String) obj.get("regNumber");
            String paymentmode = (String) obj.get("paymentMode");
            String applicationdate = (String) obj.get("applicationDate");
            String tin = (String) obj.get("tinNmber");
            String ammendfrom = (String) obj.get("ammendFrom");
            String ammendto = (String) obj.get("ammendTo");
            String fname = (String) obj.get("fname");
            String mname = (String) obj.get("mname");
            String lname = (String) obj.get("lname");
            String trade = (String) obj.get("tradeName");
            String tax = (String) obj.get("govtTax");
            String businessAdd = (String) obj.get("businessAdd");
            String businessPostal = (String) obj.get("businessPostalCode");
            String businessHotline = (String) obj.get("businessHotline");
            String ownersadd = (String) obj.get("ownersAdd");
            String ownerspostal = (String) obj.get("ownersPostalCode");
            String mobile = (String) obj.get("mobileNumber");
            String contactperson = (String) obj.get("contactPerson");
            String phone = (String) obj.get("phone");
            String businessarea = (String) obj.get("businessArea");
            String employee = (String) obj.get("employeeTotal");
            String status = (String) obj.get("status");

            model.addRow(new Object[]{btype, regno, paymentmode, applicationdate, tin, ammendfrom, ammendto, fname, mname, lname, trade, tax, businessAdd, businessPostal, businessHotline, ownersadd, ownerspostal, mobile, contactperson, phone, businessarea, employee, status});
        }
        businessReqTable.setModel(model);

        cursor.close();
        mongoClient.close();
    }

    public void displayScholarship() {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DBCursor cursor;
        DB db = mongoClient.getDB("CCE_Pass");
        DBCollection coll = db.getCollection("scholarship");
        cursor = coll.find();
        String[] columnNames = {"Sex", "First Name", "Middle Name", "Last Name", "Birth Date", "Birth Place", "Civil Status", "Citizenship", "Phone Number", "Present Address", "ZIP Code", "School Sector", "Previous School", "School Address", "Father's Name", "Address", "Father Phone No.", "Occupation", "Employer", "Educational Attainment", "Mother's Name", "Address", "Phone No.", "Occupation", "Employer", "Educational Attainment", "Total Siblings", "4P's", "Status"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        while (cursor.hasNext()) {
            DBObject obj = cursor.next();
            String sex = (String) obj.get("sex");
            String first = (String) obj.get("fname");
            String midd = (String) obj.get("mname");
            String last = (String) obj.get("lname");
            String bdate = (String) obj.get("birthdate");
            String birth_place = (String) obj.get("birthplace");
            String civil_status = (String) obj.get("civilStatus");
            String citizenship = (String) obj.get("citizenship");
            String phone_no = (String) obj.get("phoneField");
            String present_address = (String) obj.get("presentAdd");
            String zipcode = (String) obj.get("zipCode");
            String school_sector = (String) obj.get("schoolSector");
            String previous_school = (String) obj.get("previousSchool");
            String school_add = (String) obj.get("schoolAdd");
            String fathers_name = (String) obj.get("fathersName");
            String fathers_address = (String) obj.get("address");
            String fathers_phone_no = (String) obj.get("fatherPhone");
            String fathers_occupation = (String) obj.get("occupation");
            String fathers_employer = (String) obj.get("employer");
            String edu_attainment = (String) obj.get("eduAttainment");
            String mothers_name = (String) obj.get("mothersName");
            String mothers_address = (String) obj.get("motherAddress");
            String mothers_phone_no = (String) obj.get("motherPhone");
            String mothers_occupation = (String) obj.get("motherOccupation");
            String mothers_employer = (String) obj.get("motherEmployer");
            String mothers_edu_attainment = (String) obj.get("mEduAttainment");
            String total_siblings = (String) obj.get("totalSiblings");
            String pantawid = (String) obj.get("4P's");
            String status = (String) obj.get("status");

            model.addRow(new Object[]{sex, first, midd, last, bdate, birth_place, civil_status, citizenship, phone_no, present_address, zipcode, school_sector, previous_school, school_add, fathers_name, fathers_address, fathers_phone_no, fathers_occupation, fathers_employer, edu_attainment, mothers_name, mothers_address, mothers_phone_no, mothers_occupation, mothers_employer, mothers_edu_attainment, total_siblings, pantawid, status});
        }
        scholarReqTable.setModel(model);

        cursor.close();
        mongoClient.close();
    }

    public void displayAppointment() {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DBCursor cursor;
        DB db = mongoClient.getDB("CCE_Pass");
        DBCollection coll = db.getCollection("appointment");
        cursor = coll.find();
        String[] columnNames = {"First Name", "Middle Name", "Last Name", "Email Address", "Phone Number", "Address", "Subject", "Date", "Time", "Status"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        while (cursor.hasNext()) {
            DBObject obj = cursor.next();
            String first = (String) obj.get("fname");
            String midd = (String) obj.get("mname");
            String last = (String) obj.get("lname");
            String emailadd = (String) obj.get("email");
            String phone_no = (String) obj.get("phone");
            String address = (String) obj.get("address");
            String subject = (String) obj.get("subject");
            String date = (String) obj.get("date");
            String time = (String) obj.get("time");
            String status = (String) obj.get("status");

            model.addRow(new Object[]{first, midd, last, emailadd, phone_no, address, subject, date, time, status});
        }
        appointReqTable.setModel(model);

        cursor.close();
        mongoClient.close();
    }

    public void displaySuggestions() {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DBCursor cursor;
        DB db = mongoClient.getDB("CCE_Pass");
        DBCollection coll = db.getCollection("suggestions");
        cursor = coll.find();
        String[] columnNames = {"First Name", "Middle Name", "Last Name", "Email Address", "Subject", "Details"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        while (cursor.hasNext()) {
            DBObject obj = cursor.next();
            String first = (String) obj.get("fname");
            String midd = (String) obj.get("mname");
            String last = (String) obj.get("lname");
            String emailadd = (String) obj.get("email");
            String subject = (String) obj.get("subject");
            String details = (String) obj.get("details");

            model.addRow(new Object[]{first, midd, last, emailadd, subject, details});
        }
        suggestionReqTable.setModel(model);

        cursor.close();
        mongoClient.close();
    }

    public void updateBirthStatus() {

        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB dbName = mongoClient.getDB("CCE_Pass");
        DBCollection birthCollection = dbName.getCollection("birth");

        BasicDBObject obj = new BasicDBObject();
        obj.put("sex", this.sexSection.getText());
        obj.put("fname", this.firstnameSection.getText());
        obj.put("mname", this.middlenameSection.getText());
        obj.put("lname", this.lastnameSection.getText());
        obj.put("birthdate", this.birthdateSection.getText());
        obj.put("birthplace(country)", this.countrySection.getText());
        obj.put("birthplace(province)", this.provinceSection.getText());
        obj.put("birthplace(city)", this.citySection.getText());
        obj.put("gov'tId", this.govidSection.getText());
        obj.put("ffname", this.fatherfnSection.getText());
        obj.put("fmname", this.fathermnSection.getText());
        obj.put("flname", this.fatherlnSection.getText());
        obj.put("mfname", this.motherfnSection.getText());
        obj.put("mmname", this.mothermnSection.getText());
        obj.put("mlname", this.motherlnSection.getText());
        obj.put("lateRegField", this.purposeSection.getText());
        obj.put("purpose", this.lateregSection.getText());
        obj.put("phone", this.phoneSection.getText());
        obj.put("status", this.statusSection.getText());

        birthCollection.findAndModify(backup, obj);
    }

    public void updateMarriageStatus() {

        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB dbName = mongoClient.getDB("CCE_Pass");
        DBCollection marriageCollection = dbName.getCollection("marriage");

        BasicDBObject obj = new BasicDBObject();
        obj.put("sex", this.marriagesex.getText());
        obj.put("fname", this.marriagefname.getText());
        obj.put("mname", this.marriagemname.getText());
        obj.put("lname", this.marriagelname.getText());
        obj.put("birthdate", this.marriagebday.getText());
        obj.put("birthplace(country)", this.marriagebirthplaceCounty.getText());
        obj.put("birthplace(province)", this.marriagebirthplaceProvince.getText());
        obj.put("birthplace(city)", this.marriagebirthplaceCity.getText());
        obj.put("gov'tId", this.marriageissuedId.getText());
        obj.put("sfname", this.marriagesfname.getText());
        obj.put("smname", this.marriagesmname.getText());
        obj.put("slname", this.marriageslname.getText());
        obj.put("marriage_date", this.marriagemarriageDate.getText());
        obj.put("marriageplace", this.marriagemarriagePlace.getText());
        obj.put("lateRegField", this.marriagelatereg.getText());
        obj.put("purpose", this.purpose.getText());
        obj.put("phone", this.marriagephone.getText());
        obj.put("status", this.marriagestatus.getText());

        marriageCollection.findAndModify(backup, obj);
    }

    public void deleteBirth() {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB dbName = mongoClient.getDB("CCE_Pass");
        DBCollection birthCollection = dbName.getCollection("birth");

        birthCollection.findAndRemove(backup);
    }

    public void deleteMarriage() {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB dbName = mongoClient.getDB("CCE_Pass");
        DBCollection marriageCollection = dbName.getCollection("marriage");

        marriageCollection.findAndRemove(backup);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        votersPane = new javax.swing.JLabel();
        minimizebtn = new javax.swing.JLabel();
        closebtn = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        panel = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jPanel41 = new javax.swing.JPanel();
        jLabel130 = new javax.swing.JLabel();
        staffNameField = new javax.swing.JTextField();
        staffEmailField = new javax.swing.JTextField();
        jLabel158 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        sexField = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        ageField = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        addressField = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        birthReqTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        fatherlnSection = new javax.swing.JTextField();
        sexSection = new javax.swing.JTextField();
        firstnameSection = new javax.swing.JTextField();
        middlenameSection = new javax.swing.JTextField();
        lastnameSection = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        birthdateSection = new javax.swing.JTextField();
        govidSection = new javax.swing.JTextField();
        provinceSection = new javax.swing.JTextField();
        countrySection = new javax.swing.JTextField();
        citySection = new javax.swing.JTextField();
        lateregSection = new javax.swing.JTextField();
        fathermnSection = new javax.swing.JTextField();
        fatherfnSection = new javax.swing.JTextField();
        statusSection = new javax.swing.JTextField();
        mothermnSection = new javax.swing.JTextField();
        motherlnSection = new javax.swing.JTextField();
        purposeSection = new javax.swing.JTextField();
        motherfnSection = new javax.swing.JTextField();
        phoneSection = new javax.swing.JTextField();
        birthCancelBtn = new javax.swing.JButton();
        birthUpdateBtn = new javax.swing.JButton();
        birthDeleteBtn = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        marriageReqTable = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        marriageslname = new javax.swing.JTextField();
        marriagesex = new javax.swing.JTextField();
        marriagefname = new javax.swing.JTextField();
        marriagemname = new javax.swing.JTextField();
        marriagelname = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        marriagebday = new javax.swing.JTextField();
        marriageissuedId = new javax.swing.JTextField();
        marriagebirthplaceProvince = new javax.swing.JTextField();
        marriagebirthplaceCounty = new javax.swing.JTextField();
        marriagebirthplaceCity = new javax.swing.JTextField();
        marriagelatereg = new javax.swing.JTextField();
        marriagesmname = new javax.swing.JTextField();
        marriagesfname = new javax.swing.JTextField();
        marriagestatus = new javax.swing.JTextField();
        marriagemarriagePlace = new javax.swing.JTextField();
        marriagemarriageDate = new javax.swing.JTextField();
        marriagephone = new javax.swing.JTextField();
        marriageCancelBtn = new javax.swing.JButton();
        marriageUpdateBtn = new javax.swing.JButton();
        marriageDeleteBtn = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        purpose = new javax.swing.JTextField();
        jLabel170 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        cenomarReqTable = new javax.swing.JTable();
        jLabel40 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        cenomarflname = new javax.swing.JTextField();
        cenomarsex = new javax.swing.JTextField();
        cenomarfname = new javax.swing.JTextField();
        cenomarmname = new javax.swing.JTextField();
        cenomarlname = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        cenomarbday = new javax.swing.JTextField();
        cenomarissuedId = new javax.swing.JTextField();
        cenomarbplaceProvince = new javax.swing.JTextField();
        cenomarbplaceCountry = new javax.swing.JTextField();
        cenomarbplaceCity = new javax.swing.JTextField();
        cenomarfmname = new javax.swing.JTextField();
        cenomarffname = new javax.swing.JTextField();
        cenomarstatus = new javax.swing.JTextField();
        cenomarmmname = new javax.swing.JTextField();
        cenomarmlname = new javax.swing.JTextField();
        cenomarPurpose = new javax.swing.JTextField();
        cenomarmfname = new javax.swing.JTextField();
        cenomarphone = new javax.swing.JTextField();
        cenomarCancelBtn = new javax.swing.JButton();
        cenomarUpdateBtn = new javax.swing.JButton();
        cenomarDeleteBtn = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        deathReqTable = new javax.swing.JTable();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        deathsex = new javax.swing.JTextField();
        deathfname = new javax.swing.JTextField();
        deathmname = new javax.swing.JTextField();
        deathlname = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        deathbday = new javax.swing.JTextField();
        deathissuedId = new javax.swing.JTextField();
        deathbplaceprovince = new javax.swing.JTextField();
        deathbplacecountry = new javax.swing.JTextField();
        deathbplacecity = new javax.swing.JTextField();
        deathlatereg = new javax.swing.JTextField();
        deathwhose = new javax.swing.JTextField();
        deathstatus = new javax.swing.JTextField();
        deathdmname = new javax.swing.JTextField();
        deathdlname = new javax.swing.JTextField();
        deathpurpose = new javax.swing.JTextField();
        deathdfname = new javax.swing.JTextField();
        deathphone = new javax.swing.JTextField();
        deathCancelBtn = new javax.swing.JButton();
        deathUpdateBtn = new javax.swing.JButton();
        deathDeleteBtn = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        deathplace = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        deathdate = new javax.swing.JTextField();
        voterspanel = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel122 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        votersReqTable = new javax.swing.JTable();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        votersfname = new javax.swing.JTextField();
        votersmname = new javax.swing.JTextField();
        voterslname = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        votersemail = new javax.swing.JTextField();
        votersId = new javax.swing.JTextField();
        votersphone = new javax.swing.JTextField();
        votersbplace = new javax.swing.JTextField();
        votersstatus = new javax.swing.JTextField();
        votersCancelBtn = new javax.swing.JButton();
        votersUpdateBtn = new javax.swing.JButton();
        votersDeleteBtn = new javax.swing.JButton();
        jPanel34 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        businessReqTable = new javax.swing.JTable();
        jLabel97 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        businesspostal = new javax.swing.JTextField();
        businessType = new javax.swing.JTextField();
        businessreg = new javax.swing.JTextField();
        businesspayment = new javax.swing.JTextField();
        businessdate = new javax.swing.JTextField();
        jLabel116 = new javax.swing.JLabel();
        businesstin = new javax.swing.JTextField();
        businessto = new javax.swing.JTextField();
        businessfrom = new javax.swing.JTextField();
        businesscontact = new javax.swing.JTextField();
        businessadd = new javax.swing.JTextField();
        businesstrade = new javax.swing.JTextField();
        businessstatus = new javax.swing.JTextField();
        businessownersadd = new javax.swing.JTextField();
        businessownerspostal = new javax.swing.JTextField();
        businessmobile = new javax.swing.JTextField();
        businesshotline = new javax.swing.JTextField();
        businessphone = new javax.swing.JTextField();
        businessCancelBtn = new javax.swing.JButton();
        businessUpdateBtn = new javax.swing.JButton();
        businessDeleteBtn = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        businessfname = new javax.swing.JTextField();
        jLabel118 = new javax.swing.JLabel();
        businessmname = new javax.swing.JTextField();
        jLabel119 = new javax.swing.JLabel();
        businesslname = new javax.swing.JTextField();
        jLabel120 = new javax.swing.JLabel();
        businessemployee = new javax.swing.JTextField();
        businessbusinessarea = new javax.swing.JTextField();
        jLabel121 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        govtax = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        scholarReqTable = new javax.swing.JTable();
        jLabel105 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        scholarattended = new javax.swing.JTextField();
        scholarsex = new javax.swing.JTextField();
        scholarfname = new javax.swing.JTextField();
        scholarmname = new javax.swing.JTextField();
        scholarlname = new javax.swing.JTextField();
        jLabel149 = new javax.swing.JLabel();
        scholarbdate = new javax.swing.JTextField();
        scholarpresadd = new javax.swing.JTextField();
        scholarcitizenship = new javax.swing.JTextField();
        scholarcivil = new javax.swing.JTextField();
        scholarphone = new javax.swing.JTextField();
        scholarfemployer = new javax.swing.JTextField();
        scholarsector = new javax.swing.JTextField();
        scholarzipcode = new javax.swing.JTextField();
        scholarstatus = new javax.swing.JTextField();
        scholarfaddress = new javax.swing.JTextField();
        scholarfphone = new javax.swing.JTextField();
        scholarfoccupation = new javax.swing.JTextField();
        scholarffname = new javax.swing.JTextField();
        scholarfedu = new javax.swing.JTextField();
        jPanel37 = new javax.swing.JPanel();
        scholarCancelBtn = new javax.swing.JButton();
        scholarDeleteBtn = new javax.swing.JButton();
        scholarUpdateBtn = new javax.swing.JButton();
        scholarschooladd = new javax.swing.JTextField();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        scholarmemployer = new javax.swing.JTextField();
        scholarmaddress = new javax.swing.JTextField();
        scholarmphone = new javax.swing.JTextField();
        scholarmoccupation = new javax.swing.JTextField();
        scholarmfname = new javax.swing.JTextField();
        scholarmedu = new javax.swing.JTextField();
        scholarsiblings = new javax.swing.JTextField();
        jLabel157 = new javax.swing.JLabel();
        scholarbplace = new javax.swing.JTextField();
        jLabel168 = new javax.swing.JLabel();
        benefeciary = new javax.swing.JTextField();
        jLabel169 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        appointReqTable = new javax.swing.JTable();
        jLabel81 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        appointfname = new javax.swing.JTextField();
        appointmname = new javax.swing.JTextField();
        appointlname = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        appointaddress = new javax.swing.JTextField();
        appointdate = new javax.swing.JTextField();
        appointphone = new javax.swing.JTextField();
        appointsubject = new javax.swing.JTextField();
        appointtime = new javax.swing.JTextField();
        appointstatus = new javax.swing.JTextField();
        appointCancelBtn = new javax.swing.JButton();
        appointUpdateBtn = new javax.swing.JButton();
        appointDeleteBtn = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        appointemail = new javax.swing.JTextField();
        jLabel166 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        suggestionReqTable = new javax.swing.JTable();
        jLabel83 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        suggestionfname = new javax.swing.JTextField();
        suggestionmname = new javax.swing.JTextField();
        suggestionlname = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        suggestionemail = new javax.swing.JTextField();
        suggestiondetails = new javax.swing.JTextField();
        suggestionsubject = new javax.swing.JTextField();
        jPanel28 = new javax.swing.JPanel();
        suggestionDeleteBtn = new javax.swing.JButton();
        profilePane = new javax.swing.JLabel();
        birthPane = new javax.swing.JLabel();
        cenomarPane = new javax.swing.JLabel();
        marriagePane = new javax.swing.JLabel();
        deathPane = new javax.swing.JLabel();
        businessPane = new javax.swing.JLabel();
        scholarshipPane = new javax.swing.JLabel();
        appointmentPane = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        suggestionsPane = new javax.swing.JLabel();
        signout = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        userNameField = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 90));

        votersPane.setBackground(new java.awt.Color(255, 255, 255));
        votersPane.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        votersPane.setText("Voter's Certificate Request         >");
        votersPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        votersPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        votersPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                votersPaneMouseClicked(evt);
            }
        });
        jPanel1.add(votersPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 240, 40));

        minimizebtn.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        minimizebtn.setForeground(new java.awt.Color(102, 102, 102));
        minimizebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizebtn.setText("-");
        minimizebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizebtnMouseClicked(evt);
            }
        });
        jPanel1.add(minimizebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 0, 30, 30));

        closebtn.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        closebtn.setForeground(new java.awt.Color(102, 102, 102));
        closebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closebtn.setText("x");
        closebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebtnMouseClicked(evt);
            }
        });
        jPanel1.add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 0, 30, 30));

        jPanel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1202, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 1210, 60));

        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        panel.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        panel.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel159.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel159.setText("Sign-in");
        jLabel159.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel159MouseClicked(evt);
            }
        });
        jPanel38.add(jLabel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 20, 60, 30));

        jLabel160.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel160.setText("Sign-up");
        jLabel160.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel160MouseClicked(evt);
            }
        });
        jPanel38.add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 20, 80, 30));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel38.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 20, 20, 30));

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));
        jPanel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel130.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/profile.png"))); // NOI18N
        jPanel41.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 200, 190));

        staffNameField.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        staffNameField.setBorder(null);
        jPanel41.add(staffNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 270, 30));

        staffEmailField.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        staffEmailField.setBorder(null);
        jPanel41.add(staffEmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 270, 30));

        jLabel158.setFont(new java.awt.Font("Segoe UI Symbol", 3, 14)); // NOI18N
        jLabel158.setText("Personal Information");
        jPanel41.add(jLabel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 170, 30));

        jLabel161.setFont(new java.awt.Font("Segoe UI Symbol", 3, 14)); // NOI18N
        jLabel161.setText("Sex:");
        jPanel41.add(jLabel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 90, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 204, 0));
        jSeparator3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel41.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 270, 10));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 204, 0));
        jSeparator5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel41.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 570, 270, 10));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 204, 0));
        jSeparator7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel41.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 270, 10));

        jLabel162.setFont(new java.awt.Font("Segoe UI Symbol", 3, 14)); // NOI18N
        jLabel162.setText("Cebu City Easy Passage");
        jPanel41.add(jLabel162, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 540, 170, 30));

        jLabel163.setFont(new java.awt.Font("Segoe UI Symbol", 3, 14)); // NOI18N
        jLabel163.setText("Staff");
        jPanel41.add(jLabel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 60, 30));

        jLabel164.setFont(new java.awt.Font("Segoe UI Symbol", 3, 14)); // NOI18N
        jLabel164.setText("Address: ");
        jPanel41.add(jLabel164, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 90, 30));

        jLabel165.setFont(new java.awt.Font("Segoe UI Symbol", 3, 14)); // NOI18N
        jLabel165.setText("Age:");
        jPanel41.add(jLabel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 90, 30));

        sexField.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        sexField.setBorder(null);
        jPanel41.add(sexField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 270, 30));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 204, 0));
        jSeparator8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel41.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 270, 10));

        ageField.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        ageField.setBorder(null);
        jPanel41.add(ageField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 270, 30));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 204, 0));
        jSeparator9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel41.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 270, 10));

        addressField.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        addressField.setBorder(null);
        jPanel41.add(addressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 270, 30));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setForeground(new java.awt.Color(0, 204, 0));
        jSeparator11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel41.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 270, 10));

        jPanel38.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 760, 580));

        jPanel2.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 640));

        panel.addTab("Profile", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel1.setText("      Birth Certificate Requests");
        jPanel12.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 30));

        jPanel9.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 230, 50));

        birthReqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Sex", "First Name", "Middle Name", "Last Name", "Birthdate", "Birthplace(Country)", "Birthplace(Province)", "Birthplace(City)", "Gov't Issued ID", "Father's First Name", "Father's Middle Name", "Father's Last Name", "Mother's First Name", "Mother's Middle Name", "Mother's Last Name", "Late Registration?", "Purpose", "Phone Number", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        birthReqTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                birthReqTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(birthReqTable);

        jPanel9.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 1180, 240));

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel2.setText("Government Issued ID");
        jPanel9.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 160, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel3.setText("Sex");
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 40, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel4.setText("Mother's Last Name");
        jPanel9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 150, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel6.setText("Middle Name");
        jPanel9.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 110, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel7.setText("Last Name");
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 90, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel10.setText("Birthplace(Country)");
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, 140, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel11.setText("Birthplace(Provice)");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 350, 130, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel12.setText("Birthplace(City)");
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 110, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel13.setText("First Name");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 90, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel14.setText("STATUS");
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 530, 70, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel15.setText("Father's Last Name");
        jPanel9.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 410, 140, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel16.setText("Father's Middle Name");
        jPanel9.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 410, 160, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel18.setText("Mother's Middle Name");
        jPanel9.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 170, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel19.setText("Mother's First Name");
        jPanel9.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 150, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel20.setText("Father's First Name");
        jPanel9.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 140, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel21.setText("Late Registration?");
        jPanel9.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 470, 130, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel22.setText("Purpose");
        jPanel9.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 70, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel23.setText("Phone Number");
        jPanel9.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, 120, -1));

        fatherlnSection.setEditable(false);
        jPanel9.add(fatherlnSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 430, 180, -1));

        sexSection.setEditable(false);
        jPanel9.add(sexSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 130, -1));

        firstnameSection.setEditable(false);
        jPanel9.add(firstnameSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 130, -1));

        middlenameSection.setEditable(false);
        jPanel9.add(middlenameSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 130, -1));

        lastnameSection.setEditable(false);
        jPanel9.add(lastnameSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 130, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel24.setText("Birthdate");
        jPanel9.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 80, -1));

        birthdateSection.setEditable(false);
        jPanel9.add(birthdateSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 130, -1));

        govidSection.setEditable(false);
        jPanel9.add(govidSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 270, -1));

        provinceSection.setEditable(false);
        jPanel9.add(provinceSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 370, 170, -1));

        countrySection.setEditable(false);
        jPanel9.add(countrySection, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, 190, -1));

        citySection.setEditable(false);
        jPanel9.add(citySection, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 190, -1));

        lateregSection.setEditable(false);
        jPanel9.add(lateregSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 490, 180, -1));

        fathermnSection.setEditable(false);
        jPanel9.add(fathermnSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 430, 180, -1));

        fatherfnSection.setEditable(false);
        jPanel9.add(fatherfnSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 180, -1));
        jPanel9.add(statusSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, 180, -1));

        mothermnSection.setEditable(false);
        jPanel9.add(mothermnSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 180, -1));

        motherlnSection.setEditable(false);
        jPanel9.add(motherlnSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 180, -1));

        purposeSection.setEditable(false);
        jPanel9.add(purposeSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, 180, -1));

        motherfnSection.setEditable(false);
        jPanel9.add(motherfnSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 180, -1));

        phoneSection.setEditable(false);
        jPanel9.add(phoneSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, 180, -1));

        birthCancelBtn.setText("Cancel");
        birthCancelBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 3, true));
        birthCancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                birthCancelBtnMouseClicked(evt);
            }
        });
        jPanel9.add(birthCancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 580, 110, 30));

        birthUpdateBtn.setText("UPDATE");
        birthUpdateBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 3, true));
        birthUpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                birthUpdateBtnMouseClicked(evt);
            }
        });
        jPanel9.add(birthUpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 580, 110, 30));

        birthDeleteBtn.setText("Delete");
        birthDeleteBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 3, true));
        birthDeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                birthDeleteBtnMouseClicked(evt);
            }
        });
        jPanel9.add(birthDeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 580, 110, 30));

        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 560, 380, 70));

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 650));

        panel.addTab("Birth Certificate Request ", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel8.setText("      Marriage Certificate Requests");
        jPanel15.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 30));

        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 250, 50));

        marriageReqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Sex", "First Name", "Middle Name", "Last Name", "Birthdate", "Birthplace(Country)", "Birthplace(Province)", "Birthplace(City)", "Gov't Issued ID", "Spouse's First Name", "Spouse's Middle Name", "Spouse's Last Name", "Late Registration?", "Purpose", "Phone Number", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        marriageReqTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                marriageReqTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(marriageReqTable);

        jPanel14.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 1180, 240));

        jLabel17.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel17.setText("Government Issued ID");
        jPanel14.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 160, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel25.setText("Sex");
        jPanel14.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 40, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel27.setText("Middle Name");
        jPanel14.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 110, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel28.setText("Last Name");
        jPanel14.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 90, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel29.setText("Birthplace(Country)");
        jPanel14.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, 140, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel30.setText("Birthplace(Province)");
        jPanel14.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 350, 130, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel31.setText("Birthplace(City)");
        jPanel14.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 110, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel32.setText("First Name");
        jPanel14.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 90, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel33.setText("STATUS");
        jPanel14.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 70, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel34.setText("Spouse's  Last Name");
        jPanel14.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 410, 140, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel35.setText("Spouse's  Middle Name");
        jPanel14.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 410, 160, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel36.setText("Marriage Place");
        jPanel14.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 170, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel37.setText("Marriage Date");
        jPanel14.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 150, -1));

        jLabel38.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel38.setText("Spouse's First Name");
        jPanel14.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 140, -1));

        jLabel39.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel39.setText("Late Registration?");
        jPanel14.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 130, -1));

        jLabel41.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel41.setText("Phone Number");
        jPanel14.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 470, 120, -1));
        jPanel14.add(marriageslname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 430, 180, -1));
        jPanel14.add(marriagesex, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 130, -1));
        jPanel14.add(marriagefname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 130, -1));
        jPanel14.add(marriagemname, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 130, -1));
        jPanel14.add(marriagelname, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 130, -1));

        jLabel42.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel42.setText("Birthdate");
        jPanel14.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 80, -1));
        jPanel14.add(marriagebday, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 130, -1));
        jPanel14.add(marriageissuedId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 270, -1));
        jPanel14.add(marriagebirthplaceProvince, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 370, 170, -1));
        jPanel14.add(marriagebirthplaceCounty, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, 190, -1));
        jPanel14.add(marriagebirthplaceCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 190, -1));
        jPanel14.add(marriagelatereg, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 180, -1));
        jPanel14.add(marriagesmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 430, 180, -1));
        jPanel14.add(marriagesfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 180, -1));
        jPanel14.add(marriagestatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, 180, -1));
        jPanel14.add(marriagemarriagePlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 180, -1));
        jPanel14.add(marriagemarriageDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 180, -1));
        jPanel14.add(marriagephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 490, 180, -1));

        marriageCancelBtn.setText("Cancel");
        marriageCancelBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 3, true));
        marriageCancelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                marriageCancelBtnMouseClicked(evt);
            }
        });
        jPanel14.add(marriageCancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 580, 110, 30));

        marriageUpdateBtn.setText("UPDATE");
        marriageUpdateBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 3, true));
        marriageUpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                marriageUpdateBtnMouseClicked(evt);
            }
        });
        jPanel14.add(marriageUpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 580, 110, 30));

        marriageDeleteBtn.setText("DELETE");
        marriageDeleteBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 3, true));
        marriageDeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                marriageDeleteBtnMouseClicked(evt);
            }
        });
        jPanel14.add(marriageDeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 580, 110, 30));

        jPanel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanel14.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 560, 380, 70));
        jPanel14.add(purpose, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 490, 180, -1));

        jLabel170.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel170.setText("Purpose");
        jPanel14.add(jLabel170, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 470, 130, -1));

        jPanel4.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 650));

        panel.addTab("Marriage Certificate Request", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel26.setText("Certificate of No Marriage Requests");
        jPanel18.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 230, 30));

        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 290, 50));

        cenomarReqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Sex", "First Name", "Middle Name", "Last Name", "Birthdate", "Birthplace(Country)", "Birthplace(Province)", "Birthplace(City)", "Gov't Issued ID", "Father's First Name", "Father's Middle Name", "Father's Last Name", "Mother's First Name", "Mother's Middle Name", "Mother's Last Name", "Purpose", "Phone Number", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cenomarReqTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cenomarReqTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(cenomarReqTable);

        jPanel17.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 1180, 240));

        jLabel40.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel40.setText("Government Issued ID");
        jPanel17.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 160, -1));

        jLabel43.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel43.setText("Sex");
        jPanel17.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 40, -1));

        jLabel44.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel44.setText("Mother's Last Name");
        jPanel17.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 150, -1));

        jLabel45.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel45.setText("Middle Name");
        jPanel17.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 110, -1));

        jLabel46.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel46.setText("Last Name");
        jPanel17.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 90, -1));

        jLabel47.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel47.setText("Birthplace(Country)");
        jPanel17.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, 140, -1));

        jLabel48.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel48.setText("Birthplace(Provice)");
        jPanel17.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 350, 130, -1));

        jLabel49.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel49.setText("Birthplace(City)");
        jPanel17.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 110, -1));

        jLabel50.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel50.setText("First Name");
        jPanel17.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 90, -1));

        jLabel51.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel51.setText("STATUS");
        jPanel17.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 70, -1));

        jLabel52.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel52.setText("Father's Last Name");
        jPanel17.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 410, 140, -1));

        jLabel53.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel53.setText("Father's Middle Name");
        jPanel17.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 410, 160, -1));

        jLabel54.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel54.setText("Mother's Middle Name");
        jPanel17.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 170, -1));

        jLabel55.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel55.setText("Mother's First Name");
        jPanel17.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 150, -1));

        jLabel56.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel56.setText("Father's First Name");
        jPanel17.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 140, -1));

        jLabel58.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel58.setText("Purpose");
        jPanel17.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 70, -1));

        jLabel59.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel59.setText("Phone Number");
        jPanel17.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 470, 120, -1));
        jPanel17.add(cenomarflname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 430, 180, -1));
        jPanel17.add(cenomarsex, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 130, -1));
        jPanel17.add(cenomarfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 130, -1));
        jPanel17.add(cenomarmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 130, -1));
        jPanel17.add(cenomarlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 130, -1));

        jLabel60.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel60.setText("Birthdate");
        jPanel17.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 80, -1));
        jPanel17.add(cenomarbday, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 130, -1));
        jPanel17.add(cenomarissuedId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 270, -1));
        jPanel17.add(cenomarbplaceProvince, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 370, 170, -1));
        jPanel17.add(cenomarbplaceCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, 190, -1));
        jPanel17.add(cenomarbplaceCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 190, -1));
        jPanel17.add(cenomarfmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 430, 180, -1));
        jPanel17.add(cenomarffname, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 180, -1));
        jPanel17.add(cenomarstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, 180, -1));
        jPanel17.add(cenomarmmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 180, -1));
        jPanel17.add(cenomarmlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 180, -1));
        jPanel17.add(cenomarPurpose, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, 180, -1));
        jPanel17.add(cenomarmfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 180, -1));
        jPanel17.add(cenomarphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 490, 180, -1));

        cenomarCancelBtn.setText("Cancel");
        cenomarCancelBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 3, true));
        jPanel17.add(cenomarCancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 580, 110, 30));

        cenomarUpdateBtn.setText("UPDATE");
        cenomarUpdateBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 3, true));
        jPanel17.add(cenomarUpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 580, 110, 30));

        cenomarDeleteBtn.setText("Delete");
        cenomarDeleteBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 3, true));
        jPanel17.add(cenomarDeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 580, 110, 30));

        jPanel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanel17.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 560, 380, 70));

        jPanel5.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 650));

        panel.addTab("CeNoMar Request", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel57.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel57.setText("      Death Certificate Requests");
        jPanel21.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 30));

        jPanel20.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 230, 50));

        deathReqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Sex", "First Name", "Middle Name", "Last Name", "Birthdate", "Birthplace(Country)", "Birthplace(Province)", "Birthplace(City)", "Gov't Issued ID", "Whose Death Certificate?", "First Name", "Middle Name", "Last Name", "Date of Death", "Place of Death", "Late Registration?", "Purpose", "Phone Number", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, false, false, false, true, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        deathReqTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deathReqTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(deathReqTable);

        jPanel20.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 1180, 240));

        jLabel61.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel61.setText("Government Issued ID");
        jPanel20.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 160, -1));

        jLabel62.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel62.setText("Sex");
        jPanel20.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 40, -1));

        jLabel63.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel63.setText("Last Name");
        jPanel20.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 150, -1));

        jLabel64.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel64.setText("Middle Name");
        jPanel20.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 110, -1));

        jLabel65.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel65.setText("Last Name");
        jPanel20.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 90, -1));

        jLabel66.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel66.setText("Birthplace(Country)");
        jPanel20.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, 140, -1));

        jLabel67.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel67.setText("Birthplace(Provice)");
        jPanel20.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 350, 130, -1));

        jLabel68.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel68.setText("Birthplace(City)");
        jPanel20.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 110, -1));

        jLabel69.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel69.setText("First Name");
        jPanel20.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 90, -1));

        jLabel70.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel70.setText("STATUS");
        jPanel20.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 540, 70, -1));

        jLabel73.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel73.setText("Middle Name");
        jPanel20.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 170, -1));

        jLabel74.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel74.setText("First Name");
        jPanel20.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 150, -1));

        jLabel75.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel75.setText("Whose Death Certificate?");
        jPanel20.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 190, -1));

        jLabel76.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel76.setText("Late Registration?");
        jPanel20.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 130, -1));

        jLabel77.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel77.setText("Purpose");
        jPanel20.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 70, -1));

        jLabel78.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel78.setText("Phone Number");
        jPanel20.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 120, -1));
        jPanel20.add(deathsex, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 130, -1));
        jPanel20.add(deathfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 130, -1));
        jPanel20.add(deathmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 130, -1));
        jPanel20.add(deathlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 130, -1));

        jLabel79.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel79.setText("Birthdate");
        jPanel20.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 80, -1));
        jPanel20.add(deathbday, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 130, -1));
        jPanel20.add(deathissuedId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 270, -1));
        jPanel20.add(deathbplaceprovince, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 370, 170, -1));
        jPanel20.add(deathbplacecountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, 190, -1));
        jPanel20.add(deathbplacecity, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 190, -1));
        jPanel20.add(deathlatereg, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 180, -1));
        jPanel20.add(deathwhose, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 350, -1));
        jPanel20.add(deathstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 560, 180, -1));
        jPanel20.add(deathdmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 180, -1));
        jPanel20.add(deathdlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 180, -1));
        jPanel20.add(deathpurpose, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 180, -1));
        jPanel20.add(deathdfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 180, -1));
        jPanel20.add(deathphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 560, 180, -1));

        deathCancelBtn.setText("Cancel");
        deathCancelBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 3, true));
        jPanel20.add(deathCancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 580, 110, 30));

        deathUpdateBtn.setText("UPDATE");
        deathUpdateBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 3, true));
        jPanel20.add(deathUpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 580, 110, 30));

        deathDeleteBtn.setText("Delete");
        deathDeleteBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 3, true));
        jPanel20.add(deathDeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 580, 110, 30));

        jPanel22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanel20.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 560, 380, 70));

        jLabel71.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel71.setText("Place of Death");
        jPanel20.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 470, 180, -1));
        jPanel20.add(deathplace, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 490, 210, -1));

        jLabel80.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel80.setText("Date of Death");
        jPanel20.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 470, 210, -1));
        jPanel20.add(deathdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 490, 220, -1));

        jPanel6.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 650));

        panel.addTab("Death Certificate Request", jPanel6);

        voterspanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel33.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel122.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel122.setText("Voter's Certificate Requests");
        jPanel33.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 180, 30));

        jPanel32.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 230, 50));

        votersReqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Middle Name", "Last Name", "Email Address", "Phone Number", "Birth Place", "Issued ID", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        votersReqTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                votersReqTableMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(votersReqTable);

        jPanel32.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 1180, 240));

        jLabel123.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel123.setText("Issued ID");
        jPanel32.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 160, -1));

        jLabel124.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel124.setText("Middle Name");
        jPanel32.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 110, -1));

        jLabel125.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel125.setText("Last Name");
        jPanel32.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 90, -1));

        jLabel126.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel126.setText("Phone Number");
        jPanel32.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 350, 190, -1));

        jLabel127.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel127.setText("Place of Birth");
        jPanel32.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 150, -1));

        jLabel128.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel128.setText("First Name");
        jPanel32.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 90, -1));

        jLabel129.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel129.setText("STATUS");
        jPanel32.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 430, 70, -1));
        jPanel32.add(votersfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 130, -1));
        jPanel32.add(votersmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 130, -1));
        jPanel32.add(voterslname, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 130, -1));

        jLabel131.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel131.setText("Email Address");
        jPanel32.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 190, -1));
        jPanel32.add(votersemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, 240, -1));
        jPanel32.add(votersId, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 300, -1));
        jPanel32.add(votersphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 370, 250, -1));
        jPanel32.add(votersbplace, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 330, -1));
        jPanel32.add(votersstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 450, 180, -1));

        votersCancelBtn.setText("Cancel");
        votersCancelBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 3, true));
        jPanel32.add(votersCancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 580, 110, 30));

        votersUpdateBtn.setText("UPDATE");
        votersUpdateBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 3, true));
        jPanel32.add(votersUpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 580, 110, 30));

        votersDeleteBtn.setText("Delete");
        votersDeleteBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 3, true));
        jPanel32.add(votersDeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 580, 110, 30));

        jPanel34.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanel32.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 560, 380, 70));

        voterspanel.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 650));

        panel.addTab("Voters Certificate Request", voterspanel);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel92.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel92.setText("Business Permit Requests");
        jPanel30.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 30));

        jPanel29.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 230, 50));

        businessReqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Type of Business", "DTI/SEC/CDA/Reg.No", "Payment Mode", "Application Date", "TIN No.", "Ammendment From", "Ammendmend To", "First Name", "Midd;e Name", "Last Name", "Tade Name/Franchise", "Gov't Tax?", "Business Address", "Business Postal Code", "Business Hotline No. ", "Owners Address ", "Owners Postal Code", "Mobile Number", "Contact Person", "Business Area", "Employee Total", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        businessReqTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                businessReqTableMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(businessReqTable);

        jPanel29.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 1180, 240));

        jLabel97.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel97.setText("Type of Business");
        jPanel29.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 130, -1));

        jLabel100.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel100.setText("Owner's Postal Code");
        jPanel29.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 150, -1));

        jLabel101.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel101.setText("Payment Mode");
        jPanel29.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 110, -1));

        jLabel102.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel102.setText("Application Date");
        jPanel29.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 130, -1));

        jLabel103.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel103.setText("Ammend From");
        jPanel29.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, 140, -1));

        jLabel104.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel104.setText("Ammend To");
        jPanel29.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 350, 130, -1));

        jLabel106.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel106.setText("DTI/SEC/CDA/Reg.No.");
        jPanel29.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 150, -1));

        jLabel107.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel107.setText("STATUS");
        jPanel29.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 70, -1));

        jLabel108.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel108.setText("Business Postal Code");
        jPanel29.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 410, 140, -1));

        jLabel109.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel109.setText("Business Address");
        jPanel29.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 410, 160, -1));

        jLabel110.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel110.setText("Owner's Address");
        jPanel29.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, 170, -1));

        jLabel111.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel111.setText("Business Hotline Number");
        jPanel29.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 180, -1));

        jLabel112.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel112.setText("Trade Name/Franchise");
        jPanel29.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 150, -1));

        jLabel113.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel113.setText("Contact Person");
        jPanel29.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 470, 130, -1));

        jLabel114.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel114.setText("Mobile Number");
        jPanel29.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 150, -1));

        jLabel115.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel115.setText("Phone Number");
        jPanel29.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 120, -1));
        jPanel29.add(businesspostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 430, 150, -1));
        jPanel29.add(businessType, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 130, -1));
        jPanel29.add(businessreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 130, -1));
        jPanel29.add(businesspayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 130, -1));
        jPanel29.add(businessdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 130, -1));

        jLabel116.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel116.setText("TIN No.");
        jPanel29.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 80, -1));
        jPanel29.add(businesstin, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 130, -1));
        jPanel29.add(businessto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 370, 170, -1));
        jPanel29.add(businessfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, 190, -1));
        jPanel29.add(businesscontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 490, 180, -1));
        jPanel29.add(businessadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 430, 180, -1));
        jPanel29.add(businesstrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 170, -1));
        jPanel29.add(businessstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 550, 180, -1));
        jPanel29.add(businessownersadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 180, -1));
        jPanel29.add(businessownerspostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 180, -1));
        jPanel29.add(businessmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, 180, -1));
        jPanel29.add(businesshotline, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 180, -1));
        jPanel29.add(businessphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 180, -1));

        businessCancelBtn.setText("Cancel");
        businessCancelBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 3, true));
        jPanel29.add(businessCancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 580, 110, 30));

        businessUpdateBtn.setText("UPDATE");
        businessUpdateBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 3, true));
        jPanel29.add(businessUpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 580, 110, 30));

        businessDeleteBtn.setText("Delete");
        businessDeleteBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 3, true));
        jPanel29.add(businessDeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 580, 110, 30));

        jPanel31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanel29.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 560, 380, 70));

        jLabel117.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel117.setText("First Name");
        jPanel29.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 90, -1));
        jPanel29.add(businessfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 130, -1));

        jLabel118.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel118.setText("Middle Name");
        jPanel29.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 110, -1));
        jPanel29.add(businessmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 130, -1));

        jLabel119.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel119.setText("Last Name");
        jPanel29.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 90, -1));
        jPanel29.add(businesslname, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 130, -1));

        jLabel120.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel120.setText("Employee Total");
        jPanel29.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 120, -1));
        jPanel29.add(businessemployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, 180, -1));
        jPanel29.add(businessbusinessarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 180, -1));

        jLabel121.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel121.setText("Business Area");
        jPanel29.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 120, -1));

        jLabel167.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel167.setText("Gov't Tax");
        jPanel29.add(jLabel167, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 80, -1));
        jPanel29.add(govtax, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, 100, -1));

        jPanel7.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 650));

        panel.addTab("Business Permit Request", jPanel7);

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel36.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel96.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel96.setText(" Scholarship Requests");
        jPanel36.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 170, 30));

        jPanel35.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 220, 50));

        scholarReqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Sex", "First Name", "Middle Name", "Last Name", "Birthdate", "Birthplace", "Civil Status", "Citizenship", "Phone Number", "Present Address", "ZIP Code", "School Sector", "School Last Attended", "School Address", "Father's Name", "Address", "Phone Number", "Occupation", "Name of Employer", "Educational Attainment", "Mother's Name", "Address", "Phone Number", "Occupation", "Name of Employer", "Educational Attainment", "Number of Siblings", "4P's?", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, true, true, true, true, true, true, true, true, false, false, true, false, false, false, false, false, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scholarReqTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scholarReqTableMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(scholarReqTable);
        if (scholarReqTable.getColumnModel().getColumnCount() > 0) {
            scholarReqTable.getColumnModel().getColumn(4).setResizable(false);
            scholarReqTable.getColumnModel().getColumn(14).setResizable(false);
        }

        jPanel35.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 1180, 240));

        jLabel105.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel105.setText("Present Address");
        jPanel35.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 160, -1));

        jLabel132.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel132.setText("Sex");
        jPanel35.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 40, -1));

        jLabel133.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel133.setText("Phone Number");
        jPanel35.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 150, -1));

        jLabel134.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel134.setText("Middle Name");
        jPanel35.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 110, -1));

        jLabel135.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel135.setText("Last Name");
        jPanel35.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 90, -1));

        jLabel136.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel136.setText("Civil Status");
        jPanel35.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 350, 140, -1));

        jLabel137.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel137.setText("Citizenship");
        jPanel35.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 120, -1));

        jLabel138.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel138.setText("Phone Number");
        jPanel35.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 110, -1));

        jLabel139.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel139.setText("First Name");
        jPanel35.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 90, -1));

        jLabel140.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel140.setText("STATUS");
        jPanel35.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, 70, -1));

        jLabel141.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel141.setText("School Last Attended");
        jPanel35.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 400, 140, -1));

        jLabel142.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel142.setText("School Sector");
        jPanel35.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, 140, -1));

        jLabel143.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel143.setText("Address");
        jPanel35.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 170, -1));

        jLabel144.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel144.setText("Father's  Name");
        jPanel35.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 150, -1));

        jLabel145.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel145.setText("ZIP Code");
        jPanel35.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, 100, -1));

        jLabel146.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel146.setText("Name of Employer");
        jPanel35.add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 460, 130, -1));

        jLabel147.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel147.setText("Occupation");
        jPanel35.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, 100, -1));

        jLabel148.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel148.setText("Educational Attainment");
        jPanel35.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 460, 150, -1));
        jPanel35.add(scholarattended, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, 150, -1));
        jPanel35.add(scholarsex, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 130, -1));
        jPanel35.add(scholarfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 130, -1));
        jPanel35.add(scholarmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 130, -1));
        jPanel35.add(scholarlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, 130, -1));

        jLabel149.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel149.setText("Birth Date");
        jPanel35.add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, 80, -1));
        jPanel35.add(scholarbdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, 130, -1));
        jPanel35.add(scholarpresadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 160, -1));
        jPanel35.add(scholarcitizenship, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 120, -1));
        jPanel35.add(scholarcivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 370, 140, -1));
        jPanel35.add(scholarphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 120, -1));
        jPanel35.add(scholarfemployer, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 480, 180, -1));
        jPanel35.add(scholarsector, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 140, -1));
        jPanel35.add(scholarzipcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 100, -1));
        jPanel35.add(scholarstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 600, 180, -1));
        jPanel35.add(scholarfaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 180, -1));
        jPanel35.add(scholarfphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 180, -1));
        jPanel35.add(scholarfoccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, 180, -1));
        jPanel35.add(scholarffname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 180, -1));
        jPanel35.add(scholarfedu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 480, 180, -1));

        jPanel37.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));

        scholarCancelBtn.setText("Cancel");
        scholarCancelBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 3, true));

        scholarDeleteBtn.setText("Delete");
        scholarDeleteBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 3, true));

        scholarUpdateBtn.setText("UPDATE");
        scholarUpdateBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 3, true));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(scholarUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scholarDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scholarCancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scholarCancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scholarDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scholarUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel35.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 570, 380, 60));
        jPanel35.add(scholarschooladd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 420, 170, -1));

        jLabel150.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel150.setText("School Address");
        jPanel35.add(jLabel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 400, 140, -1));

        jLabel151.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel151.setText("Phone Number");
        jPanel35.add(jLabel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, 150, -1));

        jLabel152.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel152.setText("Address");
        jPanel35.add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 170, -1));

        jLabel153.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel153.setText("Mother's  Name");
        jPanel35.add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 150, -1));

        jLabel154.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel154.setText("Name of Employer");
        jPanel35.add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 520, 130, -1));

        jLabel155.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel155.setText("Occupation");
        jPanel35.add(jLabel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, 100, -1));

        jLabel156.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel156.setText("Educational Attainment");
        jPanel35.add(jLabel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 520, 150, -1));
        jPanel35.add(scholarmemployer, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 540, 180, -1));
        jPanel35.add(scholarmaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 180, -1));
        jPanel35.add(scholarmphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 180, -1));
        jPanel35.add(scholarmoccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 540, 180, -1));
        jPanel35.add(scholarmfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 180, -1));
        jPanel35.add(scholarmedu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 540, 180, -1));
        jPanel35.add(scholarsiblings, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, 180, -1));

        jLabel157.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel157.setText("Number of Siblings");
        jPanel35.add(jLabel157, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, 160, -1));
        jPanel35.add(scholarbplace, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 370, 130, -1));

        jLabel168.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel168.setText("Birth Place");
        jPanel35.add(jLabel168, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 350, 80, -1));
        jPanel35.add(benefeciary, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 600, 180, -1));

        jLabel169.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel169.setText("4P's Benefesiaries?");
        jPanel35.add(jLabel169, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 580, 160, -1));

        jPanel8.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 670));

        panel.addTab("Scholarship Application", jPanel8);

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel72.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel72.setText("Appointment Requests");
        jPanel24.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 150, 30));

        jPanel23.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 210, 50));

        appointReqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Middle Name", "Last Name", "Email Address", "Phone Number", "Address", "Appointment Subject", "Appointment Date", "Appointment Time", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        appointReqTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointReqTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(appointReqTable);

        jPanel23.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 1180, 240));

        jLabel81.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel81.setText("Appointment Date");
        jPanel23.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 160, -1));

        jLabel84.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel84.setText("Middle Name");
        jPanel23.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 110, -1));

        jLabel85.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel85.setText("Last Name");
        jPanel23.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 90, -1));

        jLabel86.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel86.setText("Phone Number");
        jPanel23.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 350, 190, -1));

        jLabel88.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel88.setText("Appoinment Subject");
        jPanel23.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 150, -1));

        jLabel89.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel89.setText("First Name");
        jPanel23.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 90, -1));

        jLabel90.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel90.setText("STATUS");
        jPanel23.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 430, 70, -1));

        jLabel95.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel95.setText("Appoinment Time");
        jPanel23.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, 140, -1));
        jPanel23.add(appointfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 130, -1));
        jPanel23.add(appointmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 130, -1));
        jPanel23.add(appointlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 130, -1));

        jLabel98.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel98.setText("Address");
        jPanel23.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 350, 180, -1));
        jPanel23.add(appointaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, 180, -1));
        jPanel23.add(appointdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 180, -1));
        jPanel23.add(appointphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 370, 220, -1));
        jPanel23.add(appointsubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 330, -1));
        jPanel23.add(appointtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, 180, -1));
        jPanel23.add(appointstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 450, 180, -1));

        appointCancelBtn.setText("Cancel");
        appointCancelBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 3, true));
        jPanel23.add(appointCancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 580, 110, 30));

        appointUpdateBtn.setText("UPDATE");
        appointUpdateBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 3, true));
        jPanel23.add(appointUpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 580, 110, 30));

        appointDeleteBtn.setText("Delete");
        appointDeleteBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 3, true));
        jPanel23.add(appointDeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 580, 110, 30));

        jPanel25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        jPanel23.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 560, 380, 70));
        jPanel23.add(appointemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 180, -1));

        jLabel166.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel166.setText("Email Address");
        jPanel23.add(jLabel166, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 190, -1));

        jPanel10.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 650));

        panel.addTab("Appointment", jPanel10);

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel82.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel82.setText("Suggestions/Opinions");
        jPanel27.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 150, 30));

        jPanel26.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 210, 50));

        suggestionReqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Middle Name", "Last Name", "Email Address", "Subject", "Details"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        suggestionReqTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suggestionReqTableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(suggestionReqTable);

        jPanel26.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 1180, 240));

        jLabel83.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel83.setText("Details");
        jPanel26.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 160, -1));

        jLabel87.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel87.setText("Middle Name");
        jPanel26.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 110, -1));

        jLabel91.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel91.setText("Last Name");
        jPanel26.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 90, -1));

        jLabel93.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel93.setText("Subject");
        jPanel26.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 150, -1));

        jLabel94.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel94.setText("First Name");
        jPanel26.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 90, -1));

        suggestionfname.setEditable(false);
        jPanel26.add(suggestionfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 220, -1));

        suggestionmname.setEditable(false);
        jPanel26.add(suggestionmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 220, -1));

        suggestionlname.setEditable(false);
        jPanel26.add(suggestionlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 220, -1));

        jLabel99.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel99.setText("Email Address");
        jPanel26.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 360, 190, -1));

        suggestionemail.setEditable(false);
        jPanel26.add(suggestionemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 380, 280, -1));

        suggestiondetails.setEditable(false);
        jPanel26.add(suggestiondetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 760, -1));

        suggestionsubject.setEditable(false);
        jPanel26.add(suggestionsubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 330, -1));

        jPanel28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));

        suggestionDeleteBtn.setText("Delete");
        suggestionDeleteBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 102), 3, true));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(suggestionDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(suggestionDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jPanel26.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 560, 180, 70));

        jPanel11.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 650));

        panel.addTab("Suggestions", jPanel11);

        jPanel1.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 1210, 670));

        profilePane.setBackground(new java.awt.Color(255, 255, 255));
        profilePane.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        profilePane.setText("Profile");
        profilePane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        profilePane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        profilePane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profilePaneMouseClicked(evt);
            }
        });
        jPanel1.add(profilePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 240, 40));

        birthPane.setBackground(new java.awt.Color(255, 255, 255));
        birthPane.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        birthPane.setText("Birth Certificate Request             >");
        birthPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        birthPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        birthPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                birthPaneMouseClicked(evt);
            }
        });
        jPanel1.add(birthPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 240, 40));

        cenomarPane.setBackground(new java.awt.Color(255, 255, 255));
        cenomarPane.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        cenomarPane.setText("CENOMAR Request                     >");
        cenomarPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        cenomarPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cenomarPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cenomarPaneMouseClicked(evt);
            }
        });
        jPanel1.add(cenomarPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 240, 40));

        marriagePane.setBackground(new java.awt.Color(255, 255, 255));
        marriagePane.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        marriagePane.setText("Marriage Certificate Request     >");
        marriagePane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        marriagePane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        marriagePane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                marriagePaneMouseClicked(evt);
            }
        });
        jPanel1.add(marriagePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 240, 40));

        deathPane.setBackground(new java.awt.Color(255, 255, 255));
        deathPane.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        deathPane.setText("Death Certificate Request           >");
        deathPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        deathPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        deathPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deathPaneMouseClicked(evt);
            }
        });
        jPanel1.add(deathPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 240, 40));

        businessPane.setBackground(new java.awt.Color(255, 255, 255));
        businessPane.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        businessPane.setText("Business Permit Request             >");
        businessPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        businessPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        businessPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                businessPaneMouseClicked(evt);
            }
        });
        jPanel1.add(businessPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 240, 40));

        scholarshipPane.setBackground(new java.awt.Color(255, 255, 255));
        scholarshipPane.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        scholarshipPane.setText("Scholarship                                   >");
        scholarshipPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        scholarshipPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scholarshipPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scholarshipPaneMouseClicked(evt);
            }
        });
        jPanel1.add(scholarshipPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 240, 40));

        appointmentPane.setBackground(new java.awt.Color(255, 255, 255));
        appointmentPane.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        appointmentPane.setText("Appointment                                 >");
        appointmentPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        appointmentPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        appointmentPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointmentPaneMouseClicked(evt);
            }
        });
        jPanel1.add(appointmentPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, 240, 40));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 10, 40));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel9.setText("Manage Requests");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 350, 40));

        suggestionsPane.setBackground(new java.awt.Color(255, 255, 255));
        suggestionsPane.setFont(new java.awt.Font("Segoe UI Light", 1, 16)); // NOI18N
        suggestionsPane.setText("Suggestions                                  >");
        suggestionsPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        suggestionsPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        suggestionsPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suggestionsPaneMouseClicked(evt);
            }
        });
        jPanel1.add(suggestionsPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 750, 240, 40));

        signout.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        signout.setText("Sign out");
        signout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signoutMouseClicked(evt);
            }
        });
        jPanel1.add(signout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 40, 70, 30));

        jPanel40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel40.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 10, 40));

        userNameField.setEditable(false);
        userNameField.setFont(new java.awt.Font("Segoe UI Light", 3, 14)); // NOI18N
        jPanel40.add(userNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 230, 30));

        jPanel1.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 20, 250, 50));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 204, 0));
        jSeparator4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 1130, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void votersPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_votersPaneMouseClicked
        panel.setSelectedIndex(5);
        displayVoters();

    }//GEN-LAST:event_votersPaneMouseClicked

    private void minimizebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizebtnMouseClicked
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizebtnMouseClicked

    private void closebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseClicked
        this.dispose();
    }//GEN-LAST:event_closebtnMouseClicked

    private void profilePaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilePaneMouseClicked
        panel.setSelectedIndex(0);

        MongoClient mongoClient = null;
        DBCursor cursor = null;
        mongoClient = new MongoClient("localhost", 27017);
        DB db = mongoClient.getDB("CCE_Pass");
        DBCollection coll = db.getCollection("staff");
        cursor = coll.find();

        while (cursor.hasNext()) {
            DBObject obj = cursor.next();
            String staffName = (String) obj.get("name");
            String email = (String) obj.get("email");
            String sex = (String) obj.get("sex");
            String age = (String) obj.get("age");
            String address = (String) obj.get("address");

            this.staffNameField.setText(staffName);
            this.staffEmailField.setText(email);
            this.sexField.setText(sex);
            this.ageField.setText(age);
            this.addressField.setText(address);

        }


    }//GEN-LAST:event_profilePaneMouseClicked

    private void birthPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_birthPaneMouseClicked
        panel.setSelectedIndex(1);
        displayBirth();
    }//GEN-LAST:event_birthPaneMouseClicked

    private void cenomarPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cenomarPaneMouseClicked
        panel.setSelectedIndex(3);
        displayCenomar();
    }//GEN-LAST:event_cenomarPaneMouseClicked

    private void marriagePaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marriagePaneMouseClicked
        panel.setSelectedIndex(2);
        displayMarriage();
    }//GEN-LAST:event_marriagePaneMouseClicked

    private void deathPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deathPaneMouseClicked
        panel.setSelectedIndex(4);
        displayDeath();
    }//GEN-LAST:event_deathPaneMouseClicked

    private void businessPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_businessPaneMouseClicked
        panel.setSelectedIndex(6);
        displayBusiness();
    }//GEN-LAST:event_businessPaneMouseClicked

    private void scholarshipPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scholarshipPaneMouseClicked
        panel.setSelectedIndex(7);
        displayScholarship();
    }//GEN-LAST:event_scholarshipPaneMouseClicked

    private void appointmentPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentPaneMouseClicked
        panel.setSelectedIndex(8);
        displayAppointment();

    }//GEN-LAST:event_appointmentPaneMouseClicked

    private void jLabel159MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel159MouseClicked

    }//GEN-LAST:event_jLabel159MouseClicked

    private void jLabel160MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel160MouseClicked

    }//GEN-LAST:event_jLabel160MouseClicked

    private void suggestionsPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suggestionsPaneMouseClicked
        panel.setSelectedIndex(9);
        displaySuggestions();

    }//GEN-LAST:event_suggestionsPaneMouseClicked

    private void signoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signoutMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Are you sure to logout?", "Warning", JOptionPane.YES_NO_OPTION);
        if (a == JOptionPane.YES_OPTION) {
            new Home().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.getRootFrame().dispose();
        }
    }//GEN-LAST:event_signoutMouseClicked

    private void birthReqTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_birthReqTableMouseClicked
        // TODO add your handling code here:
        int i = birthReqTable.getSelectedRow();
        TableModel model = birthReqTable.getModel();
        sexSection.setText(model.getValueAt(i, 0).toString());
        firstnameSection.setText(model.getValueAt(i, 1).toString());
        middlenameSection.setText(model.getValueAt(i, 2).toString());
        lastnameSection.setText(model.getValueAt(i, 3).toString());
        birthdateSection.setText(model.getValueAt(i, 4).toString());
        countrySection.setText(model.getValueAt(i, 5).toString());
        provinceSection.setText(model.getValueAt(i, 6).toString());
        citySection.setText(model.getValueAt(i, 7).toString());
        govidSection.setText(model.getValueAt(i, 8).toString());
        fatherfnSection.setText(model.getValueAt(i, 9).toString());
        fathermnSection.setText(model.getValueAt(i, 10).toString());
        fatherlnSection.setText(model.getValueAt(i, 11).toString());
        motherfnSection.setText(model.getValueAt(i, 12).toString());
        mothermnSection.setText(model.getValueAt(i, 13).toString());
        motherlnSection.setText(model.getValueAt(i, 14).toString());
        lateregSection.setText(model.getValueAt(i, 15).toString());
        purposeSection.setText(model.getValueAt(i, 16).toString());
        phoneSection.setText(model.getValueAt(i, 17).toString());
        statusSection.setText(model.getValueAt(i, 18).toString());
    }//GEN-LAST:event_birthReqTableMouseClicked

    private void marriageReqTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marriageReqTableMouseClicked
        int i = marriageReqTable.getSelectedRow();
        TableModel model = marriageReqTable.getModel();
        marriagesex.setText(model.getValueAt(i, 0).toString());
        marriagefname.setText(model.getValueAt(i, 1).toString());
        marriagemname.setText(model.getValueAt(i, 2).toString());
        marriagelname.setText(model.getValueAt(i, 3).toString());
        marriagebday.setText(model.getValueAt(i, 4).toString());
        marriagebirthplaceCounty.setText(model.getValueAt(i, 5).toString());
        marriagebirthplaceProvince.setText(model.getValueAt(i, 6).toString());
        marriagebirthplaceCity.setText(model.getValueAt(i, 7).toString());
        marriageissuedId.setText(model.getValueAt(i, 8).toString());
        marriagesfname.setText(model.getValueAt(i, 9).toString());
        marriagesmname.setText(model.getValueAt(i, 10).toString());
        marriageslname.setText(model.getValueAt(i, 11).toString());
        marriagemarriageDate.setText(model.getValueAt(i, 12).toString());
        marriagemarriagePlace.setText(model.getValueAt(i, 13).toString());
        marriagelatereg.setText(model.getValueAt(i, 14).toString());
        purpose.setText(model.getValueAt(i, 15).toString());
        marriagephone.setText(model.getValueAt(i, 16).toString());
        marriagestatus.setText(model.getValueAt(i, 17).toString());
    }//GEN-LAST:event_marriageReqTableMouseClicked

    private void votersReqTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_votersReqTableMouseClicked
        int i = votersReqTable.getSelectedRow();
        TableModel model = votersReqTable.getModel();
        votersfname.setText(model.getValueAt(i, 0).toString());
        votersmname.setText(model.getValueAt(i, 1).toString());
        voterslname.setText(model.getValueAt(i, 2).toString());
        votersemail.setText(model.getValueAt(i, 3).toString());
        votersphone.setText(model.getValueAt(i, 4).toString());
        votersbplace.setText(model.getValueAt(i, 5).toString());
        votersId.setText(model.getValueAt(i, 6).toString());
        votersstatus.setText(model.getValueAt(i, 7).toString());
    }//GEN-LAST:event_votersReqTableMouseClicked

    private void deathReqTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deathReqTableMouseClicked
        int i = deathReqTable.getSelectedRow();
        TableModel model = deathReqTable.getModel();
        deathsex.setText(model.getValueAt(i, 0).toString());
        deathfname.setText(model.getValueAt(i, 1).toString());
        deathmname.setText(model.getValueAt(i, 2).toString());
        deathlname.setText(model.getValueAt(i, 3).toString());
        deathbday.setText(model.getValueAt(i, 4).toString());
        deathbplacecountry.setText(model.getValueAt(i, 5).toString());
        deathbplaceprovince.setText(model.getValueAt(i, 6).toString());
        deathbplacecity.setText(model.getValueAt(i, 7).toString());
        deathissuedId.setText(model.getValueAt(i, 8).toString());
        deathwhose.setText(model.getValueAt(i, 9).toString());
        deathdfname.setText(model.getValueAt(i, 10).toString());
        deathdmname.setText(model.getValueAt(i, 11).toString());
        deathdlname.setText(model.getValueAt(i, 12).toString());
        deathdate.setText(model.getValueAt(i, 13).toString());
        deathplace.setText(model.getValueAt(i, 14).toString());
        deathpurpose.setText(model.getValueAt(i, 15).toString());
        deathlatereg.setText(model.getValueAt(i, 16).toString());
        deathphone.setText(model.getValueAt(i, 17).toString());
        deathstatus.setText(model.getValueAt(i, 18).toString());
    }//GEN-LAST:event_deathReqTableMouseClicked

    private void appointReqTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointReqTableMouseClicked
        int i = appointReqTable.getSelectedRow();
        TableModel model = appointReqTable.getModel();
        appointfname.setText(model.getValueAt(i, 0).toString());
        appointmname.setText(model.getValueAt(i, 1).toString());
        appointlname.setText(model.getValueAt(i, 2).toString());
        appointemail.setText(model.getValueAt(i, 3).toString());
        appointaddress.setText(model.getValueAt(i, 5).toString());
        appointphone.setText(model.getValueAt(i, 4).toString());
        appointsubject.setText(model.getValueAt(i, 6).toString());
        appointdate.setText(model.getValueAt(i, 7).toString());
        appointtime.setText(model.getValueAt(i, 8).toString());
        appointstatus.setText(model.getValueAt(i, 9).toString());
        deathwhose.setText(model.getValueAt(i, 10).toString());
    }//GEN-LAST:event_appointReqTableMouseClicked

    private void scholarReqTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scholarReqTableMouseClicked
        int i = scholarReqTable.getSelectedRow();
        TableModel model = scholarReqTable.getModel();
        scholarsex.setText(model.getValueAt(i, 0).toString());
        scholarfname.setText(model.getValueAt(i, 1).toString());
        scholarmname.setText(model.getValueAt(i, 2).toString());
        scholarlname.setText(model.getValueAt(i, 3).toString());
        scholarbdate.setText(model.getValueAt(i, 4).toString());
        scholarbplace.setText(model.getValueAt(i, 5).toString());
        scholarcivil.setText(model.getValueAt(i, 6).toString());
        scholarcitizenship.setText(model.getValueAt(i, 7).toString());
        scholarphone.setText(model.getValueAt(i, 8).toString());
        scholarpresadd.setText(model.getValueAt(i, 9).toString());
        scholarzipcode.setText(model.getValueAt(i, 10).toString());
        scholarsector.setText(model.getValueAt(i, 11).toString());
        scholarattended.setText(model.getValueAt(i, 12).toString());
        scholarschooladd.setText(model.getValueAt(i, 13).toString());
        scholarffname.setText(model.getValueAt(i, 14).toString());
        scholarfaddress.setText(model.getValueAt(i, 15).toString());
        scholarfphone.setText(model.getValueAt(i, 16).toString());
        scholarfoccupation.setText(model.getValueAt(i, 17).toString());
        scholarfemployer.setText(model.getValueAt(i, 18).toString());
        scholarfedu.setText(model.getValueAt(i, 19).toString());
        scholarmfname.setText(model.getValueAt(i, 20).toString());
        scholarmaddress.setText(model.getValueAt(i, 21).toString());
        scholarmphone.setText(model.getValueAt(i, 22).toString());
        scholarmoccupation.setText(model.getValueAt(i, 23).toString());
        scholarmemployer.setText(model.getValueAt(i, 24).toString());
        scholarmedu.setText(model.getValueAt(i, 25).toString());
        scholarsiblings.setText(model.getValueAt(i, 26).toString());
        benefeciary.setText(model.getValueAt(i, 27).toString());
        scholarstatus.setText(model.getValueAt(i, 28).toString());
    }//GEN-LAST:event_scholarReqTableMouseClicked

    private void suggestionReqTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suggestionReqTableMouseClicked
        int i = suggestionReqTable.getSelectedRow();
        TableModel model = suggestionReqTable.getModel();
        suggestionfname.setText(model.getValueAt(i, 0).toString());
        suggestionmname.setText(model.getValueAt(i, 1).toString());
        suggestionlname.setText(model.getValueAt(i, 2).toString());
        suggestionemail.setText(model.getValueAt(i, 3).toString());
        suggestionsubject.setText(model.getValueAt(i, 4).toString());
        suggestiondetails.setText(model.getValueAt(i, 5).toString());
    }//GEN-LAST:event_suggestionReqTableMouseClicked

    private void businessReqTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_businessReqTableMouseClicked
        int i = businessReqTable.getSelectedRow();
        TableModel model = businessReqTable.getModel();
        businessType.setText(model.getValueAt(i, 0).toString());
        businessreg.setText(model.getValueAt(i, 1).toString());
        businesspayment.setText(model.getValueAt(i, 2).toString());
        businessdate.setText(model.getValueAt(i, 3).toString());
        businesstin.setText(model.getValueAt(i, 4).toString());
        businessfrom.setText(model.getValueAt(i, 5).toString());
        businessto.setText(model.getValueAt(i, 6).toString());
        businessfname.setText(model.getValueAt(i, 7).toString());
        businessmname.setText(model.getValueAt(i, 8).toString());
        businesslname.setText(model.getValueAt(i, 9).toString());
        businesstrade.setText(model.getValueAt(i, 10).toString());
        govtax.setText(model.getValueAt(i, 11).toString());
        businessadd.setText(model.getValueAt(i, 12).toString());
        businesspostal.setText(model.getValueAt(i, 13).toString());
        businesshotline.setText(model.getValueAt(i, 14).toString());
        businessownersadd.setText(model.getValueAt(i, 15).toString());
        businessownerspostal.setText(model.getValueAt(i, 16).toString());
        businessmobile.setText(model.getValueAt(i, 17).toString());
        businesscontact.setText(model.getValueAt(i, 18).toString());
        businessphone.setText(model.getValueAt(i, 19).toString());
        businessbusinessarea.setText(model.getValueAt(i, 20).toString());
        businessemployee.setText(model.getValueAt(i, 21).toString());
        businessstatus.setText(model.getValueAt(i, 22).toString());
    }//GEN-LAST:event_businessReqTableMouseClicked

    private void cenomarReqTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cenomarReqTableMouseClicked
        int i = cenomarReqTable.getSelectedRow();
        TableModel model = cenomarReqTable.getModel();
        cenomarsex.setText(model.getValueAt(i, 0).toString());
        cenomarfname.setText(model.getValueAt(i, 1).toString());
        cenomarmname.setText(model.getValueAt(i, 2).toString());
        cenomarlname.setText(model.getValueAt(i, 3).toString());
        cenomarbday.setText(model.getValueAt(i, 4).toString());
        cenomarbplaceCountry.setText(model.getValueAt(i, 5).toString());
        cenomarbplaceProvince.setText(model.getValueAt(i, 6).toString());
        cenomarbplaceCity.setText(model.getValueAt(i, 7).toString());
        cenomarissuedId.setText(model.getValueAt(i, 8).toString());
        cenomarffname.setText(model.getValueAt(i, 9).toString());
        cenomarfmname.setText(model.getValueAt(i, 10).toString());
        cenomarflname.setText(model.getValueAt(i, 11).toString());
        cenomarmfname.setText(model.getValueAt(i, 12).toString());
        cenomarmmname.setText(model.getValueAt(i, 13).toString());
        cenomarmlname.setText(model.getValueAt(i, 14).toString());
        cenomarPurpose.setText(model.getValueAt(i, 15).toString());
        cenomarphone.setText(model.getValueAt(i, 16).toString());
        cenomarstatus.setText(model.getValueAt(i, 17).toString());
    }//GEN-LAST:event_cenomarReqTableMouseClicked

    private void birthUpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_birthUpdateBtnMouseClicked

        if ("".equals(firstnameSection.getText())) {
            JOptionPane.showMessageDialog(null, "No Selected Data!", "Alert", JOptionPane.ERROR_MESSAGE);

        } else if ("".equals(this.statusSection.getText())) {
            JOptionPane.showMessageDialog(null, "NO status added, please provide!", "Alert", JOptionPane.ERROR_MESSAGE);
        } else {
            updateBirthStatus();
            JOptionPane.showMessageDialog(null, "Successfully Updated.", "Alert", JOptionPane.INFORMATION_MESSAGE);
            displayBirth();
        }
    }//GEN-LAST:event_birthUpdateBtnMouseClicked

    private void birthDeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_birthDeleteBtnMouseClicked
        DefaultTableModel birthTblModel = (DefaultTableModel) birthReqTable.getModel();

        if (birthReqTable.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "No Selected Data!!", "Alert", JOptionPane.ERROR_MESSAGE);
        } else {
            int a = JOptionPane.showConfirmDialog(null, "Are you sure to delete data?", "Warning", JOptionPane.YES_NO_OPTION);
            if (a == JOptionPane.YES_OPTION) {
                birthTblModel.removeRow(birthReqTable.getSelectedRow());
                deleteBirth();
                JOptionPane.showMessageDialog(null, "Successfully Deleted.", "Alert", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.getRootFrame().dispose();
            }

        }
        sexSection.setText("");
        firstnameSection.setText("");
        middlenameSection.setText("");
        lastnameSection.setText("");
        birthdateSection.setText("");
        countrySection.setText("");
        provinceSection.setText("");
        citySection.setText("");
        govidSection.setText("");
        fatherfnSection.setText("");
        fathermnSection.setText("");
        fatherlnSection.setText("");
        motherfnSection.setText("");
        mothermnSection.setText("");
        motherlnSection.setText("");
        lateregSection.setText("");
        purposeSection.setText("");
        phoneSection.setText("");
        statusSection.setText("");

    }//GEN-LAST:event_birthDeleteBtnMouseClicked

    private void birthCancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_birthCancelBtnMouseClicked
        sexSection.setText("");
        firstnameSection.setText("");
        middlenameSection.setText("");
        lastnameSection.setText("");
        birthdateSection.setText("");
        countrySection.setText("");
        provinceSection.setText("");
        citySection.setText("");
        govidSection.setText("");
        fatherfnSection.setText("");
        fathermnSection.setText("");
        fatherlnSection.setText("");
        motherfnSection.setText("");
        mothermnSection.setText("");
        motherlnSection.setText("");
        lateregSection.setText("");
        purposeSection.setText("");
        phoneSection.setText("");
        statusSection.setText("");

    }//GEN-LAST:event_birthCancelBtnMouseClicked

    private void marriageUpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marriageUpdateBtnMouseClicked

        if ("".equals(marriagefname.getText())) {
            JOptionPane.showMessageDialog(null, "No Selected Data!", "Alert", JOptionPane.ERROR_MESSAGE);

        } else if ("".equals(this.marriagestatus.getText())) {
            JOptionPane.showMessageDialog(null, "No status added, please provide!", "Alert", JOptionPane.ERROR_MESSAGE);

        } else {
            updateMarriageStatus();
            JOptionPane.showMessageDialog(null, "Successfully Updated.", "Alert", JOptionPane.INFORMATION_MESSAGE);
            displayMarriage();
        }
    }//GEN-LAST:event_marriageUpdateBtnMouseClicked

    private void marriageDeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marriageDeleteBtnMouseClicked
        DefaultTableModel marriageTblModel = (DefaultTableModel) marriageReqTable.getModel();

        if (marriageReqTable.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "No Selected Data!!", "Alert", JOptionPane.ERROR_MESSAGE);
        } else {
            int a = JOptionPane.showConfirmDialog(null, "Are you sure to delete data?", "Warning", JOptionPane.YES_NO_OPTION);
            if (a == JOptionPane.YES_OPTION) {
                marriageTblModel.removeRow(marriageReqTable.getSelectedRow());
                deleteMarriage();
                JOptionPane.showMessageDialog(null, "Successfully Deleted.", "Alert", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.getRootFrame().dispose();
            }

        }
        marriagesex.setText("");
        marriagefname.setText("");
        marriagemname.setText("");
        marriagelname.setText("");
        marriagebday.setText("");
        marriagebirthplaceCounty.setText("");
        marriagebirthplaceProvince.setText("");
        marriagebirthplaceCity.setText("");
        marriageissuedId.setText("");
        marriagesfname.setText("");
        marriagesmname.setText("");
        marriageslname.setText("");
        marriagemarriageDate.setText("");
        marriagemarriagePlace.setText("");
        marriagelatereg.setText("");
        purpose.setText("");
        marriagephone.setText("");
        marriagestatus.setText("");
    }//GEN-LAST:event_marriageDeleteBtnMouseClicked

    private void marriageCancelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marriageCancelBtnMouseClicked
        marriagesex.setText("");
        marriagefname.setText("");
        marriagemname.setText("");
        marriagelname.setText("");
        marriagebday.setText("");
        marriagebirthplaceCounty.setText("");
        marriagebirthplaceProvince.setText("");
        marriagebirthplaceCity.setText("");
        marriageissuedId.setText("");
        marriagesfname.setText("");
        marriagesmname.setText("");
        marriageslname.setText("");
        marriagemarriageDate.setText("");
        marriagemarriagePlace.setText("");
        marriagelatereg.setText("");
        purpose.setText("");
        marriagephone.setText("");
        marriagestatus.setText("");
    }//GEN-LAST:event_marriageCancelBtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JTextField ageField;
    private javax.swing.JButton appointCancelBtn;
    private javax.swing.JButton appointDeleteBtn;
    private javax.swing.JTable appointReqTable;
    private javax.swing.JButton appointUpdateBtn;
    private javax.swing.JTextField appointaddress;
    private javax.swing.JTextField appointdate;
    private javax.swing.JTextField appointemail;
    private javax.swing.JTextField appointfname;
    private javax.swing.JTextField appointlname;
    private javax.swing.JLabel appointmentPane;
    private javax.swing.JTextField appointmname;
    private javax.swing.JTextField appointphone;
    private javax.swing.JTextField appointstatus;
    private javax.swing.JTextField appointsubject;
    private javax.swing.JTextField appointtime;
    private javax.swing.JTextField benefeciary;
    private javax.swing.JButton birthCancelBtn;
    private javax.swing.JButton birthDeleteBtn;
    private javax.swing.JLabel birthPane;
    private javax.swing.JTable birthReqTable;
    private javax.swing.JButton birthUpdateBtn;
    private javax.swing.JTextField birthdateSection;
    private javax.swing.JButton businessCancelBtn;
    private javax.swing.JButton businessDeleteBtn;
    private javax.swing.JLabel businessPane;
    private javax.swing.JTable businessReqTable;
    private javax.swing.JTextField businessType;
    private javax.swing.JButton businessUpdateBtn;
    private javax.swing.JTextField businessadd;
    private javax.swing.JTextField businessbusinessarea;
    private javax.swing.JTextField businesscontact;
    private javax.swing.JTextField businessdate;
    private javax.swing.JTextField businessemployee;
    private javax.swing.JTextField businessfname;
    private javax.swing.JTextField businessfrom;
    private javax.swing.JTextField businesshotline;
    private javax.swing.JTextField businesslname;
    private javax.swing.JTextField businessmname;
    private javax.swing.JTextField businessmobile;
    private javax.swing.JTextField businessownersadd;
    private javax.swing.JTextField businessownerspostal;
    private javax.swing.JTextField businesspayment;
    private javax.swing.JTextField businessphone;
    private javax.swing.JTextField businesspostal;
    private javax.swing.JTextField businessreg;
    private javax.swing.JTextField businessstatus;
    private javax.swing.JTextField businesstin;
    private javax.swing.JTextField businessto;
    private javax.swing.JTextField businesstrade;
    private javax.swing.JButton cenomarCancelBtn;
    private javax.swing.JButton cenomarDeleteBtn;
    private javax.swing.JLabel cenomarPane;
    private javax.swing.JTextField cenomarPurpose;
    private javax.swing.JTable cenomarReqTable;
    private javax.swing.JButton cenomarUpdateBtn;
    private javax.swing.JTextField cenomarbday;
    private javax.swing.JTextField cenomarbplaceCity;
    private javax.swing.JTextField cenomarbplaceCountry;
    private javax.swing.JTextField cenomarbplaceProvince;
    private javax.swing.JTextField cenomarffname;
    private javax.swing.JTextField cenomarflname;
    private javax.swing.JTextField cenomarfmname;
    private javax.swing.JTextField cenomarfname;
    private javax.swing.JTextField cenomarissuedId;
    private javax.swing.JTextField cenomarlname;
    private javax.swing.JTextField cenomarmfname;
    private javax.swing.JTextField cenomarmlname;
    private javax.swing.JTextField cenomarmmname;
    private javax.swing.JTextField cenomarmname;
    private javax.swing.JTextField cenomarphone;
    private javax.swing.JTextField cenomarsex;
    private javax.swing.JTextField cenomarstatus;
    private javax.swing.JTextField citySection;
    private javax.swing.JLabel closebtn;
    private javax.swing.JTextField countrySection;
    private javax.swing.JButton deathCancelBtn;
    private javax.swing.JButton deathDeleteBtn;
    private javax.swing.JLabel deathPane;
    private javax.swing.JTable deathReqTable;
    private javax.swing.JButton deathUpdateBtn;
    private javax.swing.JTextField deathbday;
    private javax.swing.JTextField deathbplacecity;
    private javax.swing.JTextField deathbplacecountry;
    private javax.swing.JTextField deathbplaceprovince;
    private javax.swing.JTextField deathdate;
    private javax.swing.JTextField deathdfname;
    private javax.swing.JTextField deathdlname;
    private javax.swing.JTextField deathdmname;
    private javax.swing.JTextField deathfname;
    private javax.swing.JTextField deathissuedId;
    private javax.swing.JTextField deathlatereg;
    private javax.swing.JTextField deathlname;
    private javax.swing.JTextField deathmname;
    private javax.swing.JTextField deathphone;
    private javax.swing.JTextField deathplace;
    private javax.swing.JTextField deathpurpose;
    private javax.swing.JTextField deathsex;
    private javax.swing.JTextField deathstatus;
    private javax.swing.JTextField deathwhose;
    private javax.swing.JTextField fatherfnSection;
    private javax.swing.JTextField fatherlnSection;
    private javax.swing.JTextField fathermnSection;
    private javax.swing.JTextField firstnameSection;
    private javax.swing.JTextField govidSection;
    private javax.swing.JTextField govtax;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
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
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
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
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField lastnameSection;
    private javax.swing.JTextField lateregSection;
    private javax.swing.JButton marriageCancelBtn;
    private javax.swing.JButton marriageDeleteBtn;
    private javax.swing.JLabel marriagePane;
    private javax.swing.JTable marriageReqTable;
    private javax.swing.JButton marriageUpdateBtn;
    private javax.swing.JTextField marriagebday;
    private javax.swing.JTextField marriagebirthplaceCity;
    private javax.swing.JTextField marriagebirthplaceCounty;
    private javax.swing.JTextField marriagebirthplaceProvince;
    private javax.swing.JTextField marriagefname;
    private javax.swing.JTextField marriageissuedId;
    private javax.swing.JTextField marriagelatereg;
    private javax.swing.JTextField marriagelname;
    private javax.swing.JTextField marriagemarriageDate;
    private javax.swing.JTextField marriagemarriagePlace;
    private javax.swing.JTextField marriagemname;
    private javax.swing.JTextField marriagephone;
    private javax.swing.JTextField marriagesex;
    private javax.swing.JTextField marriagesfname;
    private javax.swing.JTextField marriageslname;
    private javax.swing.JTextField marriagesmname;
    private javax.swing.JTextField marriagestatus;
    private javax.swing.JTextField middlenameSection;
    private javax.swing.JLabel minimizebtn;
    private javax.swing.JTextField motherfnSection;
    private javax.swing.JTextField motherlnSection;
    private javax.swing.JTextField mothermnSection;
    private javax.swing.JTabbedPane panel;
    private javax.swing.JTextField phoneSection;
    private javax.swing.JLabel profilePane;
    private javax.swing.JTextField provinceSection;
    private javax.swing.JTextField purpose;
    private javax.swing.JTextField purposeSection;
    private javax.swing.JButton scholarCancelBtn;
    private javax.swing.JButton scholarDeleteBtn;
    private javax.swing.JTable scholarReqTable;
    private javax.swing.JButton scholarUpdateBtn;
    private javax.swing.JTextField scholarattended;
    private javax.swing.JTextField scholarbdate;
    private javax.swing.JTextField scholarbplace;
    private javax.swing.JTextField scholarcitizenship;
    private javax.swing.JTextField scholarcivil;
    private javax.swing.JTextField scholarfaddress;
    private javax.swing.JTextField scholarfedu;
    private javax.swing.JTextField scholarfemployer;
    private javax.swing.JTextField scholarffname;
    private javax.swing.JTextField scholarfname;
    private javax.swing.JTextField scholarfoccupation;
    private javax.swing.JTextField scholarfphone;
    private javax.swing.JTextField scholarlname;
    private javax.swing.JTextField scholarmaddress;
    private javax.swing.JTextField scholarmedu;
    private javax.swing.JTextField scholarmemployer;
    private javax.swing.JTextField scholarmfname;
    private javax.swing.JTextField scholarmname;
    private javax.swing.JTextField scholarmoccupation;
    private javax.swing.JTextField scholarmphone;
    private javax.swing.JTextField scholarphone;
    private javax.swing.JTextField scholarpresadd;
    private javax.swing.JTextField scholarschooladd;
    private javax.swing.JTextField scholarsector;
    private javax.swing.JTextField scholarsex;
    private javax.swing.JLabel scholarshipPane;
    private javax.swing.JTextField scholarsiblings;
    private javax.swing.JTextField scholarstatus;
    private javax.swing.JTextField scholarzipcode;
    private javax.swing.JTextField sexField;
    private javax.swing.JTextField sexSection;
    private javax.swing.JLabel signout;
    private javax.swing.JTextField staffEmailField;
    private javax.swing.JTextField staffNameField;
    private javax.swing.JTextField statusSection;
    private javax.swing.JButton suggestionDeleteBtn;
    private javax.swing.JTable suggestionReqTable;
    private javax.swing.JTextField suggestiondetails;
    private javax.swing.JTextField suggestionemail;
    private javax.swing.JTextField suggestionfname;
    private javax.swing.JTextField suggestionlname;
    private javax.swing.JTextField suggestionmname;
    private javax.swing.JLabel suggestionsPane;
    private javax.swing.JTextField suggestionsubject;
    public javax.swing.JTextField userNameField;
    private javax.swing.JButton votersCancelBtn;
    private javax.swing.JButton votersDeleteBtn;
    private javax.swing.JTextField votersId;
    private javax.swing.JLabel votersPane;
    private javax.swing.JTable votersReqTable;
    private javax.swing.JButton votersUpdateBtn;
    private javax.swing.JTextField votersbplace;
    private javax.swing.JTextField votersemail;
    private javax.swing.JTextField votersfname;
    private javax.swing.JTextField voterslname;
    private javax.swing.JTextField votersmname;
    private javax.swing.JPanel voterspanel;
    private javax.swing.JTextField votersphone;
    private javax.swing.JTextField votersstatus;
    // End of variables declaration//GEN-END:variables
}
