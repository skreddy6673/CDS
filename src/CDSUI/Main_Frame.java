package CDSUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;

import CDSBusiness.Compnay;
import CDSBusiness.Customer;
import CDSBusiness.DeliveryPerson;
import CDSBusiness.Employee;
import CDSBusiness.Ticket;
import CDSDM.CDSDataManager;
import CDSMapping.Dijkstra;
import CDSMapping.Edge;
import CDSMapping.Graph;
import CDSMapping.Vertex;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import javax.swing.ScrollPaneConstants;


import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class Main_Frame {

	private JFrame frame;
	private JPasswordField passwordField;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_3;
	private static JTextField textField_4;
	private static JTextField textField_5;
	private static JTextField textField_6;
	private static JTextField textField_7;
	private static JTextField textField_8;
	private static JTable table;
	private static JTextField textField_9;
	private static JTextField textField_10;
	private static JTextField textField_12;
	private static JTextField textField_13;
	private static JTextField textField_15;
	private static JTable table_1;
	private static JTextField textField_33;
	private static JComboBox<String> comboBox;
	private static JComboBox<String> comboBox_3;
	private static JComboBox<String> comboBox_4;
	private static JComboBox<String> comboBox_5;
	private static JComboBox<String> comboBox_8;
	private static JComboBox<String> comboBox_9;
	private static JComboBox<String> comboBox_10;
	private static JComboBox<String> comboBox_11;
	private static JComboBox<String> comboBox_13;
	private static JComboBox<String> comboBox_14;
	private static JComboBox<String> comboBox_15;
	private static JComboBox<String> comboBox_16;
	private static JComboBox<String> comboBox_17;
	private static JComboBox<String> comboBox_19;
	private static JComboBox<String> comboBox_18;
	private static JComboBox<String> comboBox_22;
	private JTextField textField_2;
	private JTextField textField_11;
	private String login;
	private JTextField textField_14;
	private JTextField textField_16;
	private JTextField textField_17;
	private static JTable table_2;
	private static Graph graph;
	private static Vertex[] vertices;
	private static Edge[] edges;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private static JTable table_3;
	private JTable table_4;
	private static JTable table_5;
	private static JLabel label_8;
	private static JLabel label_9;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//Creating the map
        graph = new Graph();
        vertices = new Vertex[49];
        for(int i = 0; i < vertices.length; i++){
            vertices[i] = new Vertex("I"+i);
            graph.addVertex(vertices[i], true);
        }
        edges = new Edge[78];
        CDSDataManager dm = new CDSDataManager();
        edges[0] = new Edge(vertices[0], vertices[7], Integer.parseInt(dm.getCustomCompany(4)));
        edges[1] = new Edge(vertices[3], vertices[10], Integer.parseInt(dm.getCustomCompany(4)));
        edges[2] = new Edge(vertices[3], vertices[2], Integer.parseInt(dm.getCustomCompany(4)));
        edges[3] = new Edge(vertices[7], vertices[8], Integer.parseInt(dm.getCustomCompany(4)));
        edges[4] = new Edge(vertices[7], vertices[14], Integer.parseInt(dm.getCustomCompany(4)));
        edges[5] = new Edge(vertices[8], vertices[1], Integer.parseInt(dm.getCustomCompany(4)));
        edges[6] = new Edge(vertices[8], vertices[7], Integer.parseInt(dm.getCustomCompany(4)));
        edges[7] = new Edge(vertices[8], vertices[9], Integer.parseInt(dm.getCustomCompany(4)));
        edges[8] = new Edge(vertices[9], vertices[8], Integer.parseInt(dm.getCustomCompany(4)));
        edges[9] = new Edge(vertices[9], vertices[10], Integer.parseInt(dm.getCustomCompany(4)));
        edges[10] = new Edge(vertices[9], vertices[16], Integer.parseInt(dm.getCustomCompany(4)));
        edges[11] = new Edge(vertices[10], vertices[9], Integer.parseInt(dm.getCustomCompany(4)));
        edges[12] = new Edge(vertices[10], vertices[11], Integer.parseInt(dm.getCustomCompany(4)));
        edges[13] = new Edge(vertices[10], vertices[3], Integer.parseInt(dm.getCustomCompany(4)));
        edges[14] = new Edge(vertices[10], vertices[17], Integer.parseInt(dm.getCustomCompany(4)));
        edges[15] = new Edge(vertices[11], vertices[10], Integer.parseInt(dm.getCustomCompany(4)));
        edges[16] = new Edge(vertices[11], vertices[12], Integer.parseInt(dm.getCustomCompany(4)));
        edges[17] = new Edge(vertices[11], vertices[18], Integer.parseInt(dm.getCustomCompany(4)));
        edges[18] = new Edge(vertices[12], vertices[13], Integer.parseInt(dm.getCustomCompany(4)));
        edges[19] = new Edge(vertices[12], vertices[11], Integer.parseInt(dm.getCustomCompany(4)));
        edges[20] = new Edge(vertices[12], vertices[5], Integer.parseInt(dm.getCustomCompany(4)));
        edges[21] = new Edge(vertices[13], vertices[12], Integer.parseInt(dm.getCustomCompany(4)));
        edges[22] = new Edge(vertices[13], vertices[20], Integer.parseInt(dm.getCustomCompany(4)));
        
        edges[23] = new Edge(vertices[14], vertices[21], Integer.parseInt(dm.getCustomCompany(4)));
        edges[24] = new Edge(vertices[15], vertices[22], Integer.parseInt(dm.getCustomCompany(4)));
        edges[25] = new Edge(vertices[16], vertices[23], Integer.parseInt(dm.getCustomCompany(4)));
        edges[26] = new Edge(vertices[17], vertices[10], Integer.parseInt(dm.getCustomCompany(4)));
        edges[27] = new Edge(vertices[17], vertices[24], Integer.parseInt(dm.getCustomCompany(4)));
        edges[28] = new Edge(vertices[18], vertices[25], Integer.parseInt(dm.getCustomCompany(4)));
        edges[29] = new Edge(vertices[19], vertices[26], Integer.parseInt(dm.getCustomCompany(4)));
        edges[30] = new Edge(vertices[20], vertices[27], Integer.parseInt(dm.getCustomCompany(4)));
        
        edges[31] = new Edge(vertices[21], vertices[28], Integer.parseInt(dm.getCustomCompany(4)));
        edges[32] = new Edge(vertices[21], vertices[22], Integer.parseInt(dm.getCustomCompany(4)));
        edges[33] = new Edge(vertices[22], vertices[23], Integer.parseInt(dm.getCustomCompany(4)));
        edges[34] = new Edge(vertices[23], vertices[24], Integer.parseInt(dm.getCustomCompany(4)));
        edges[35] = new Edge(vertices[23], vertices[30], Integer.parseInt(dm.getCustomCompany(4)));
        edges[36] = new Edge(vertices[24], vertices[25], Integer.parseInt(dm.getCustomCompany(4)));
        edges[37] = new Edge(vertices[24], vertices[31], Integer.parseInt(dm.getCustomCompany(4)));
        edges[38] = new Edge(vertices[24], vertices[17], Integer.parseInt(dm.getCustomCompany(4)));
        edges[39] = new Edge(vertices[25], vertices[26], Integer.parseInt(dm.getCustomCompany(4)));
        edges[40] = new Edge(vertices[25], vertices[32], Integer.parseInt(dm.getCustomCompany(4)));
        edges[41] = new Edge(vertices[26], vertices[27], Integer.parseInt(dm.getCustomCompany(4)));
        edges[42] = new Edge(vertices[27], vertices[34], Integer.parseInt(dm.getCustomCompany(4)));
        
        edges[43] = new Edge(vertices[28], vertices[35], Integer.parseInt(dm.getCustomCompany(4)));
        edges[44] = new Edge(vertices[29], vertices[36], Integer.parseInt(dm.getCustomCompany(4)));
        edges[45] = new Edge(vertices[30], vertices[37], Integer.parseInt(dm.getCustomCompany(4)));
        edges[46] = new Edge(vertices[31], vertices[24], Integer.parseInt(dm.getCustomCompany(4)));
        edges[47] = new Edge(vertices[31], vertices[38], Integer.parseInt(dm.getCustomCompany(4)));
        edges[48] = new Edge(vertices[32], vertices[39], Integer.parseInt(dm.getCustomCompany(4)));
        edges[49] = new Edge(vertices[33], vertices[40], Integer.parseInt(dm.getCustomCompany(4)));
        edges[50] = new Edge(vertices[34], vertices[41], Integer.parseInt(dm.getCustomCompany(4)));
        
        edges[51] = new Edge(vertices[5], vertices[4], Integer.parseInt(dm.getCustomCompany(4)));
        edges[52] = new Edge(vertices[30], vertices[29], Integer.parseInt(dm.getCustomCompany(4)));
        edges[53] = new Edge(vertices[32], vertices[31], Integer.parseInt(dm.getCustomCompany(4)));
        edges[54] = new Edge(vertices[34], vertices[33], Integer.parseInt(dm.getCustomCompany(4)));
        edges[55] = new Edge(vertices[16], vertices[15], Integer.parseInt(dm.getCustomCompany(4)));
        edges[57] = new Edge(vertices[20], vertices[19], Integer.parseInt(dm.getCustomCompany(4)));
        
        edges[58] = new Edge(vertices[35], vertices[42], Integer.parseInt(dm.getCustomCompany(4)));
        edges[56] = new Edge(vertices[35], vertices[36], Integer.parseInt(dm.getCustomCompany(4)));
        edges[59] = new Edge(vertices[36], vertices[35], Integer.parseInt(dm.getCustomCompany(4)));
        edges[60] = new Edge(vertices[36], vertices[37], Integer.parseInt(dm.getCustomCompany(4)));
        edges[61] = new Edge(vertices[37], vertices[38], Integer.parseInt(dm.getCustomCompany(4)));
        edges[62] = new Edge(vertices[37], vertices[36], Integer.parseInt(dm.getCustomCompany(4)));
        edges[63] = new Edge(vertices[37], vertices[44], Integer.parseInt(dm.getCustomCompany(4)));
        edges[64] = new Edge(vertices[38], vertices[31], Integer.parseInt(dm.getCustomCompany(4)));
        edges[65] = new Edge(vertices[38], vertices[45], Integer.parseInt(dm.getCustomCompany(4)));
        edges[66] = new Edge(vertices[38], vertices[37], Integer.parseInt(dm.getCustomCompany(4)));
        edges[67] = new Edge(vertices[38], vertices[39], Integer.parseInt(dm.getCustomCompany(4)));
        edges[68] = new Edge(vertices[39], vertices[40], Integer.parseInt(dm.getCustomCompany(4)));
        edges[69] = new Edge(vertices[39], vertices[38], Integer.parseInt(dm.getCustomCompany(4)));
        edges[70] = new Edge(vertices[39], vertices[46], Integer.parseInt(dm.getCustomCompany(4)));
        edges[71] = new Edge(vertices[40], vertices[41], Integer.parseInt(dm.getCustomCompany(4)));
        edges[72] = new Edge(vertices[40], vertices[39], Integer.parseInt(dm.getCustomCompany(4)));
        edges[73] = new Edge(vertices[41], vertices[40], Integer.parseInt(dm.getCustomCompany(4)));
        edges[74] = new Edge(vertices[41], vertices[48], Integer.parseInt(dm.getCustomCompany(4)));
        
        edges[75] = new Edge(vertices[44], vertices[43], Integer.parseInt(dm.getCustomCompany(4)));
        edges[76] = new Edge(vertices[46], vertices[45], Integer.parseInt(dm.getCustomCompany(4)));
        edges[77] = new Edge(vertices[48], vertices[47], Integer.parseInt(dm.getCustomCompany(4)));
        
        for(Edge e: edges){
            graph.addEdge(e.getOne(), e.getTwo(), e.getWeight());
        }
	//End
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Frame window = new Main_Frame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main_Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel Login = new JPanel();
		Login.setBackground(SystemColor.activeCaption);
		Login.setBounds(0, 11, 784, 650);
		frame.getContentPane().add(Login);
		Login.setLayout(new CardLayout(0, 0));
		
		JPanel Login_Panel = new JPanel();
		Login_Panel.setBackground(SystemColor.activeCaption);
		Login.add(Login_Panel, "login");
		Login_Panel.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(278, 277, 105, 14);
		Login_Panel.add(lblUsername);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(393, 305, 200, 20);
		Login_Panel.add(passwordField);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setBounds(278, 308, 105, 14);
		Login_Panel.add(lblPassword);
		
		comboBox = new JComboBox<String>();
		comboBox.setBounds(393, 274, 200, 20);
		Login_Panel.add(comboBox);
		
		JPanel Admin_Panel = new JPanel();
		Admin_Panel.setBackground(SystemColor.activeCaption);
		Login.add(Admin_Panel, "Admin");
		Admin_Panel.setLayout(null);
		
		JTabbedPane Main_tab = new JTabbedPane(JTabbedPane.TOP);
		Main_tab.setBounds(0, 26, 784, 624);
		Admin_Panel.add(Main_tab);
		
		
		JPanel delivery = new JPanel();
		delivery.setBackground(SystemColor.inactiveCaption);
		Main_tab.addTab("Delivery", null, delivery, null);
		delivery.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 5, 779, 594);
		delivery.add(tabbedPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		tabbedPane.addTab("Generate Ticket", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblCreateTicketHere = new JLabel("Create Ticket here");
		lblCreateTicketHere.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCreateTicketHere.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreateTicketHere.setBounds(10, 11, 754, 30);
		panel_2.add(lblCreateTicketHere);
		
		comboBox_8 = new JComboBox<String>();
		comboBox_8.setBounds(329, 149, 200, 20);
		panel_2.add(comboBox_8);
		
		comboBox_9 = new JComboBox<String>();
		comboBox_9.setBounds(329, 180, 200, 20);
		panel_2.add(comboBox_9);
		
		JLabel lblPickupCustomer = new JLabel("Pickup Customer :");
		lblPickupCustomer.setBounds(179, 152, 140, 14);
		panel_2.add(lblPickupCustomer);
		
		JLabel lblDeliveryCustomer = new JLabel("Delivery Customer :");
		lblDeliveryCustomer.setBounds(179, 183, 140, 14);
		panel_2.add(lblDeliveryCustomer);
		
		textField_2 = new JTextField();
		textField_2.setBounds(329, 211, 200, 20);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPickupTime = new JLabel("Pickup Time :");
		lblPickupTime.setBounds(179, 214, 140, 14);
		panel_2.add(lblPickupTime);
		
		textField_11 = new JTextField();
		textField_11.setBounds(329, 242, 200, 20);
		panel_2.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblDeliveryTime_1 = new JLabel("Delivery Time :");
		lblDeliveryTime_1.setBounds(179, 245, 140, 14);
		panel_2.add(lblDeliveryTime_1);
		
		JLabel lblPackageId_1 = new JLabel("Package :");
		lblPackageId_1.setBounds(179, 276, 140, 14);
		panel_2.add(lblPackageId_1);
		
		comboBox_10 = new JComboBox<String>();
		comboBox_10.setBounds(329, 273, 200, 20);
		panel_2.add(comboBox_10);
		
		comboBox_11 = new JComboBox<String>();
		comboBox_11.setBounds(329, 304, 200, 20);
		panel_2.add(comboBox_11);
		
		JLabel lblBillPayee = new JLabel("Bill Payee :");
		lblBillPayee.setBounds(179, 307, 140, 14);
		panel_2.add(lblBillPayee);
		
		JButton btnGenerateTicket = new JButton("Generate Ticket");
		btnGenerateTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp=null,tid=null,ename=null,status=null,pc=null,dc=null,pt=null,dt=null,pid=null,pay=null;
				Random ran = new Random();
				temp = ran.nextInt(999999)+"";
				CDSDataManager dm = new CDSDataManager();
				while(!(dm.getCustomTicket(temp, 0)==null))
					temp = ran.nextInt(999999)+"";
				if(dm.getCustomTicket(temp, 0)==null){
					tid = temp;
					ename = "";
					status = "Assigned";
					pc = comboBox_8.getSelectedItem().toString();
					dc = comboBox_9.getSelectedItem().toString();
					pt = textField_2.getText();
					dt = textField_11.getText();
					pid = dm.getCustomCourier(comboBox_10.getSelectedItem().toString(),0);
					pay = comboBox_11.getSelectedItem().toString();
					Ticket tkt = new Ticket();
					Dijkstra dijkstra = new Dijkstra(graph, dm.getCustomCompany(3));
					Dijkstra dijkstradp = new Dijkstra(graph, dm.getCustomCustomer(pc, 2));
					tkt.setBillAmount(((dijkstra.getDistanceTo(dm.getCustomCustomer(pc, 2))+dijkstradp.getDistanceTo(dm.getCustomCustomer(dc, 2)))*Integer.parseInt(dm.getCustomCompany(5)))+"");
					
					tkt.setBillPayee(pay);
					tkt.setDeliverCustomer(dc);
					tkt.setDeliverTime(dt);
					tkt.setExecutiveId("N/A");
					tkt.setExecutiveName(ename);
					tkt.setPickupLocation(dm.getCustomCustomer(pc, 2));;
					tkt.setDeliverLocation(dm.getCustomCustomer(dc, 2));;
					tkt.setOrderTaker(login);
					tkt.setPackageId(pid);
					tkt.setPickupCustomer(pc);
					tkt.setPickuptime(pt);
					tkt.setStatus(status);
					tkt.setTicketid(tid);
					dm.setTicketData(tkt);
					JOptionPane.showMessageDialog(null, "Ticket with id "+tid+" Created...");
				}
				ref();
			}
		});
		btnGenerateTicket.setBounds(413, 415, 300, 23);
		panel_2.add(btnGenerateTicket);
		
		JLabel lblEstimatedPrice = new JLabel("Estimated Price :");
		lblEstimatedPrice.setBounds(179, 335, 140, 14);
		panel_2.add(lblEstimatedPrice);
		
		JLabel est_price = new JLabel("");
		est_price.setBounds(329, 335, 200, 14);
		panel_2.add(est_price);
		
		JLabel lblEta = new JLabel("ETA :");
		lblEta.setBounds(179, 360, 140, 14);
		panel_2.add(lblEta);
		
		JLabel eta = new JLabel("");
		eta.setBounds(329, 360, 200, 14);
		panel_2.add(eta);
		
		JButton btnPriceTime = new JButton("Price & Time EST");
		btnPriceTime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sp=null,pc=null,dc=null;
				int cost=0;
				pc = comboBox_8.getSelectedItem().toString();
				dc = comboBox_9.getSelectedItem().toString();
				CDSDataManager dm = new CDSDataManager();
				sp = dm.getCustomCompany(3);
				Dijkstra dijkstra = new Dijkstra(graph, sp);
				Dijkstra dijkstradp = new Dijkstra(graph, dm.getCustomCustomer(pc, 2));
				int distance = dijkstra.getDistanceTo(dm.getCustomCustomer(pc, 2))+dijkstradp.getDistanceTo(dm.getCustomCustomer(dc, 2));
				cost = distance*Integer.parseInt(dm.getCustomCompany(5));
				est_price.setText(cost+"");
				eta.setText(distance +" Min's");
			}
		});
		btnPriceTime.setBounds(103, 415, 300, 23);
		panel_2.add(btnPriceTime);
		
		JPanel Ticket = new JPanel();
		Ticket.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		tabbedPane.addTab("Delivery Ticket", null, Ticket, null);
		Ticket.setLayout(null);
		
		JLabel lblCreateEditTicket = new JLabel("View Ticket Here");
		lblCreateEditTicket.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCreateEditTicket.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreateEditTicket.setBounds(10, 11, 754, 20);
		Ticket.add(lblCreateEditTicket);
		
		JLabel lblDeliveryLocation = new JLabel("Ticket ID");
		lblDeliveryLocation.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeliveryLocation.setBounds(10, 42, 220, 14);
		Ticket.add(lblDeliveryLocation);
		
		comboBox_3 = new JComboBox<String>();
		comboBox_3.setBounds(10, 67, 220, 20);
		Ticket.add(comboBox_3);
		
		
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setBounds(10, 132, 754, 434);
		Ticket.add(scrollPane_2);
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setPreferredSize(new Dimension(734,600));
		scrollPane_2.setViewportView(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblOrderTakerName = new JLabel("Order Taker Name : ");
		lblOrderTakerName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblOrderTakerName.setBounds(10, 11, 125, 14);
		panel_3.add(lblOrderTakerName);
		
		JLabel otn = new JLabel("");
		otn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		otn.setBounds(130, 11, 252, 14);
		panel_3.add(otn);
		
		JLabel lblTicketId = new JLabel("Ticket  ID:");
		lblTicketId.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTicketId.setBounds(10, 36, 70, 14);
		panel_3.add(lblTicketId);
		
		JLabel adm_tid = new JLabel("");
		adm_tid.setFont(new Font("Tahoma", Font.PLAIN, 11));
		adm_tid.setBounds(90, 36, 652, 14);
		panel_3.add(adm_tid);
		
		JLabel lblPickupCustomerInfo = new JLabel("Pickup Customer Info");
		lblPickupCustomerInfo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPickupCustomerInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPickupCustomerInfo.setBounds(10, 61, 360, 14);
		panel_3.add(lblPickupCustomerInfo);
		
		JLabel lblDeliveryCustomerInfo = new JLabel("Delivery Customer Info");
		lblDeliveryCustomerInfo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDeliveryCustomerInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeliveryCustomerInfo.setBounds(380, 61, 362, 14);
		panel_3.add(lblDeliveryCustomerInfo);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(Color.BLACK);
		separator.setBounds(366, 61, 2, 117);
		panel_3.add(separator);
		
		JLabel lblName_3 = new JLabel("Name :");
		lblName_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblName_3.setBounds(20, 86, 100, 14);
		panel_3.add(lblName_3);
		
		JLabel adm_pcn = new JLabel("");
		adm_pcn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		adm_pcn.setBounds(130, 86, 226, 14);
		panel_3.add(adm_pcn);
		
		JLabel lblName_4 = new JLabel("Name :");
		lblName_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblName_4.setBounds(380, 86, 100, 14);
		panel_3.add(lblName_4);
		
		JLabel adm_dcn = new JLabel("");
		adm_dcn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		adm_dcn.setBounds(490, 86, 252, 14);
		panel_3.add(adm_dcn);
		
		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAddress.setBounds(21, 111, 99, 14);
		panel_3.add(lblAddress);
		
		JLabel adm_pca = new JLabel("");
		adm_pca.setFont(new Font("Tahoma", Font.PLAIN, 11));
		adm_pca.setBounds(130, 111, 226, 14);
		panel_3.add(adm_pca);
		
		JLabel lblWhenToPickup = new JLabel("When To Pickup :");
		lblWhenToPickup.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblWhenToPickup.setBounds(21, 136, 99, 14);
		panel_3.add(lblWhenToPickup);
		
		JLabel lblContactDetail = new JLabel("Contact Detail :");
		lblContactDetail.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblContactDetail.setBounds(20, 161, 100, 14);
		panel_3.add(lblContactDetail);
		
		JLabel adm_pcd = new JLabel("");
		adm_pcd.setFont(new Font("Tahoma", Font.PLAIN, 11));
		adm_pcd.setBounds(130, 161, 226, 14);
		panel_3.add(adm_pcd);
		
		JLabel lblAddress_1 = new JLabel("Address:");
		lblAddress_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAddress_1.setBounds(380, 111, 100, 14);
		panel_3.add(lblAddress_1);
		
		JLabel lblContactDetails = new JLabel("Contact Details: ");
		lblContactDetails.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblContactDetails.setBounds(380, 136, 100, 14);
		panel_3.add(lblContactDetails);
		
		JLabel adm_wpt = new JLabel("");
		adm_wpt.setFont(new Font("Tahoma", Font.PLAIN, 11));
		adm_wpt.setBounds(130, 136, 226, 14);
		panel_3.add(adm_wpt);
		
		JLabel adm_dca = new JLabel("");
		adm_dca.setFont(new Font("Tahoma", Font.PLAIN, 11));
		adm_dca.setBounds(490, 111, 252, 14);
		panel_3.add(adm_dca);
		
		JLabel adm_dcd = new JLabel("");
		adm_dcd.setFont(new Font("Tahoma", Font.PLAIN, 11));
		adm_dcd.setBounds(490, 136, 252, 14);
		panel_3.add(adm_dcd);
		
		JLabel lblPackageId = new JLabel("Package ID:");
		lblPackageId.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPackageId.setBounds(100, 186, 160, 14);
		panel_3.add(lblPackageId);
		
		JLabel adm_pkgid = new JLabel("");
		adm_pkgid.setFont(new Font("Tahoma", Font.PLAIN, 11));
		adm_pkgid.setBounds(271, 186, 454, 14);
		panel_3.add(adm_pkgid);
		
		JLabel lblEstimatedDeliveryTime = new JLabel("Estimated Delivery Time");
		lblEstimatedDeliveryTime.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEstimatedDeliveryTime.setBounds(100, 211, 160, 14);
		panel_3.add(lblEstimatedDeliveryTime);
		
		JLabel adm_eta = new JLabel("");
		adm_eta.setFont(new Font("Tahoma", Font.PLAIN, 11));
		adm_eta.setBounds(271, 211, 454, 14);
		panel_3.add(adm_eta);
		
		JLabel lblPrice = new JLabel("Price :");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrice.setBounds(100, 236, 160, 14);
		panel_3.add(lblPrice);
		
		JLabel adm_bill = new JLabel("");
		adm_bill.setFont(new Font("Tahoma", Font.PLAIN, 11));
		adm_bill.setBounds(271, 236, 454, 14);
		panel_3.add(adm_bill);
		
		JLabel lblBillPayedBy = new JLabel("Bill Payed By :");
		lblBillPayedBy.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBillPayedBy.setBounds(100, 261, 161, 14);
		panel_3.add(lblBillPayedBy);
		
		JLabel adm_bpb = new JLabel("");
		adm_bpb.setFont(new Font("Tahoma", Font.PLAIN, 11));
		adm_bpb.setBounds(271, 261, 454, 14);
		panel_3.add(adm_bpb);
		
		JLabel lblPickupDirections = new JLabel("Pickup Directions :");
		lblPickupDirections.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPickupDirections.setBounds(100, 289, 161, 14);
		panel_3.add(lblPickupDirections);
		
		JLabel adm_pd = new JLabel("");
		adm_pd.setFont(new Font("Tahoma", Font.PLAIN, 11));
		adm_pd.setBounds(271, 289, 454, 30);
		panel_3.add(adm_pd);
		
		JLabel adm_dd = new JLabel("");
		adm_dd.setFont(new Font("Tahoma", Font.PLAIN, 11));
		adm_dd.setBounds(271, 330, 454, 30);
		panel_3.add(adm_dd);
		
		JLabel lblPickupDelivery = new JLabel("Pickup - Delivery Directions :");
		lblPickupDelivery.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPickupDelivery.setBounds(100, 330, 161, 14);
		panel_3.add(lblPickupDelivery);
		
		JLabel adm_od = new JLabel("");
		adm_od.setFont(new Font("Tahoma", Font.PLAIN, 11));
		adm_od.setBounds(271, 371, 454, 30);
		panel_3.add(adm_od);
		
		JLabel lblDeliveryOfficeDirections = new JLabel("Delivery Office Directions :");
		lblDeliveryOfficeDirections.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDeliveryOfficeDirections.setBounds(100, 371, 161, 14);
		panel_3.add(lblDeliveryOfficeDirections);
		
		JLabel lblNewLabel = new JLabel("Delivery Person :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(100, 412, 160, 14);
		panel_3.add(lblNewLabel);
		
		JLabel adm_dp = new JLabel("");
		adm_dp.setFont(new Font("Tahoma", Font.PLAIN, 11));
		adm_dp.setBounds(271, 412, 454, 14);
		panel_3.add(adm_dp);
		
		JLabel lblNewLabel_4 = new JLabel("Pickup Time :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(100, 437, 161, 14);
		panel_3.add(lblNewLabel_4);
		
		JLabel adm_lpt = new JLabel("");
		adm_lpt.setFont(new Font("Tahoma", Font.PLAIN, 11));
		adm_lpt.setBounds(271, 437, 454, 14);
		panel_3.add(adm_lpt);
		
		JLabel lblDeliveryTime = new JLabel("Delivery Time");
		lblDeliveryTime.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDeliveryTime.setBounds(100, 462, 161, 14);
		panel_3.add(lblDeliveryTime);
		
		JLabel adm_ldt = new JLabel("");
		adm_ldt.setFont(new Font("Tahoma", Font.PLAIN, 11));
		adm_ldt.setBounds(271, 462, 454, 14);
		panel_3.add(adm_ldt);
		
		JButton btnSavePrint = new JButton("Save & Print");
		btnSavePrint.setBounds(271, 500, 200, 23);
		panel_3.add(btnSavePrint);
		
		JLabel lblStatus_1 = new JLabel("Status");
		lblStatus_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblStatus_1.setBounds(392, 11, 79, 14);
		panel_3.add(lblStatus_1);
		
		JLabel adm_stat = new JLabel("");
		adm_stat.setBounds(481, 11, 226, 14);
		panel_3.add(adm_stat);
		
		JPanel Map = new JPanel();
		Map.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		tabbedPane.addTab("Maps", null, Map, null);
		
		JPanel maintain = new JPanel();
		maintain.setBackground(SystemColor.inactiveCaption);
		Main_tab.addTab("Maintenance", null, maintain, null);
		maintain.setLayout(null);
		
		JTabbedPane maintain_tab = new JTabbedPane(JTabbedPane.TOP);
		maintain_tab.setBounds(0, 0, 779, 596);
		maintain.add(maintain_tab);
		
		JPanel company = new JPanel();
		company.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		maintain_tab.addTab("Company", null, company, null);
		company.setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(157, 125, 130, 14);
		company.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(297, 122, 200, 20);
		company.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(297, 153, 200, 20);
		company.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblContactNo = new JLabel("Contact No:");
		lblContactNo.setBounds(157, 156, 130, 14);
		company.add(lblContactNo);
		
		textField_3 = new JTextField();
		textField_3.setBounds(297, 184, 200, 20);
		company.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblRateblock = new JLabel("Rate/Block");
		lblRateblock.setBounds(157, 187, 130, 14);
		company.add(lblRateblock);
		
		textField_4 = new JTextField();
		textField_4.setBounds(297, 215, 200, 20);
		company.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Block To Miles");
		lblNewLabel_1.setBounds(157, 218, 130, 14);
		company.add(lblNewLabel_1);
		
		JLabel lblEnterYourCompany = new JLabel("Enter Your Company Details Below");
		lblEnterYourCompany.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterYourCompany.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterYourCompany.setBounds(10, 11, 754, 50);
		company.add(lblEnterYourCompany);
		
		JLabel lblWorkingHours = new JLabel("Working Hours");
		lblWorkingHours.setBounds(157, 249, 130, 14);
		company.add(lblWorkingHours);
		
		textField_33 = new JTextField();
		textField_33.setBounds(297, 246, 200, 20);
		company.add(textField_33);
		textField_33.setColumns(10);
		
		JLabel lblClosestIntersection_1 = new JLabel("Closest Intersection");
		lblClosestIntersection_1.setBounds(157, 284, 130, 14);
		company.add(lblClosestIntersection_1);
		
		JComboBox<String> comboBox_7 = new JComboBox<String>();
		comboBox_7.setBounds(297, 281, 200, 20);
		company.add(comboBox_7);
		
		for(int i=0;i<49;i++)
			comboBox_7.addItem("I"+i);
		
		JPanel employee = new JPanel();
		employee.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		maintain_tab.addTab("Employee", null, employee, null);
		employee.setLayout(null);
		
		JLabel lblEntereditEmployeesHere = new JLabel("Enter/Edit Employees Here");
		lblEntereditEmployeesHere.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEntereditEmployeesHere.setHorizontalAlignment(SwingConstants.CENTER);
		lblEntereditEmployeesHere.setBounds(10, 11, 754, 30);
		employee.add(lblEntereditEmployeesHere);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblName_1.setBounds(10, 82, 100, 14);
		employee.add(lblName_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(120, 82, 100, 14);
		employee.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Phone No");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(230, 82, 100, 14);
		employee.add(lblNewLabel_3);
		
		JLabel lblPassword_1 = new JLabel("Password");
		lblPassword_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword_1.setBounds(340, 82, 100, 14);
		employee.add(lblPassword_1);
		
		JLabel lblType = new JLabel("Type");
		lblType.setHorizontalAlignment(SwingConstants.CENTER);
		lblType.setBounds(450, 82, 100, 14);
		employee.add(lblType);
		
		textField_5 = new JTextField();
		textField_5.setBounds(10, 107, 100, 20);
		employee.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(120, 107, 100, 20);
		employee.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(230, 107, 100, 20);
		employee.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(340, 107, 100, 20);
		employee.add(textField_8);
		textField_8.setColumns(10);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(450, 107, 100, 20);
		employee.add(comboBox_1);
		CDSDataManager test = new CDSDataManager();
		test.getCompanyList();
		comboBox_1.addItem("Admin");
		comboBox_1.addItem("Order Taker");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 138, 754, 419);
		employee.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int idx=table.getSelectedRow();
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				textField_5.setText(model.getValueAt(idx, 0).toString());
				textField_6.setText(model.getValueAt(idx, 1).toString());
				textField_7.setText(model.getValueAt(idx, 2).toString());
				textField_8.setText(model.getValueAt(idx, 3).toString());
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Email", "Phone Number", "Password", "Type"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		
		JLabel Errors_empl = new JLabel("");
		Errors_empl.setHorizontalAlignment(SwingConstants.CENTER);
		Errors_empl.setBounds(10, 52, 754, 14);
		employee.add(Errors_empl);
		
		JPanel Customer = new JPanel();
		Customer.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		maintain_tab.addTab("Customer", null, Customer, null);
		Customer.setLayout(null);
		
		JLabel lblEntereditCustomerDetails = new JLabel("Enter/Edit Customer Details Here");
		lblEntereditCustomerDetails.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEntereditCustomerDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblEntereditCustomerDetails.setBounds(10, 11, 754, 30);
		Customer.add(lblEntereditCustomerDetails);
		
		JLabel lblName_2 = new JLabel("Name");
		lblName_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblName_2.setBounds(10, 72, 100, 14);
		Customer.add(lblName_2);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setBounds(120, 72, 100, 14);
		Customer.add(lblEmail);
		
		JLabel lblIntersection = new JLabel("Intersection");
		lblIntersection.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntersection.setBounds(230, 72, 100, 14);
		Customer.add(lblIntersection);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setHorizontalAlignment(SwingConstants.CENTER);
		lblCity.setBounds(340, 72, 160, 14);
		Customer.add(lblCity);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhone.setBounds(510, 72, 150, 14);
		Customer.add(lblPhone);
		
		JLabel lblZip = new JLabel("Zip");
		lblZip.setHorizontalAlignment(SwingConstants.CENTER);
		lblZip.setBounds(670, 72, 94, 14);
		Customer.add(lblZip);
		
		textField_9 = new JTextField();
		textField_9.setBounds(10, 97, 100, 20);
		Customer.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(120, 97, 100, 20);
		Customer.add(textField_10);
		textField_10.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(340, 97, 160, 20);
		Customer.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(510, 97, 150, 20);
		Customer.add(textField_13);
		textField_13.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(670, 97, 94, 20);
		Customer.add(textField_15);
		textField_15.setColumns(10);
		
		JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.setBounds(230, 97, 100, 20);
		Customer.add(comboBox_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 162, 754, 395);
		Customer.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int idx=table_1.getSelectedRow();
				DefaultTableModel model = (DefaultTableModel) table_1.getModel();
				textField_9.setText(model.getValueAt(idx, 0).toString());
				textField_10.setText(model.getValueAt(idx, 1).toString());
				textField_12.setText(model.getValueAt(idx, 3).toString());
				textField_13.setText(model.getValueAt(idx, 4).toString());
				textField_15.setText(model.getValueAt(idx, 5).toString());

				
			}
		});
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Email", "Closest Intersection", "City", "Phone", "Zip"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane_1.setViewportView(table_1);
		
		JLabel error_cust = new JLabel("");
		error_cust.setHorizontalAlignment(SwingConstants.CENTER);
		error_cust.setBounds(10, 52, 754, 14);
		Customer.add(error_cust);
		
		for(int i=0;i<49;i++)
			comboBox_2.addItem("I"+i);
		
		JPanel report = new JPanel();
		report.setBackground(SystemColor.inactiveCaption);
		Main_tab.addTab("Report", null, report, null);
		report.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 779, 585);
		report.add(tabbedPane_1);
		
		JPanel Delivery_Rep = new JPanel();
		Delivery_Rep.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		tabbedPane_1.addTab("Delivery Report", null, Delivery_Rep, null);
		Delivery_Rep.setLayout(null);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(UIManager.getColor("FormattedTextField.selectionForeground"));
		panel_14.setBounds(10, 11, 754, 535);
		Delivery_Rep.add(panel_14);
		
		JPanel Employee_Rep = new JPanel();
		Employee_Rep.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		tabbedPane_1.addTab("Employee Report", null, Employee_Rep, null);
		Employee_Rep.setLayout(null);
		
		JLabel lblViewEmployeeStatistics = new JLabel("View Employee Statistics here");
		lblViewEmployeeStatistics.setHorizontalAlignment(SwingConstants.CENTER);
		lblViewEmployeeStatistics.setBounds(10, 11, 754, 14);
		Employee_Rep.add(lblViewEmployeeStatistics);
		
		JLabel lblSelectAnEmployee = new JLabel("Select an employee");
		lblSelectAnEmployee.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectAnEmployee.setBounds(10, 36, 380, 14);
		Employee_Rep.add(lblSelectAnEmployee);
		
		comboBox_18 = new JComboBox<String>();
		comboBox_18.setBounds(10, 61, 380, 20);
		Employee_Rep.add(comboBox_18);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(10, 92, 754, 454);
		Employee_Rep.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblEmployeeName = new JLabel("Employee Name:");
		lblEmployeeName.setBounds(10, 11, 100, 14);
		panel_9.add(lblEmployeeName);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(120, 11, 624, 14);
		panel_9.add(label_2);
		
		JLabel lblTicketsCreated = new JLabel("Tickets Created: ");
		lblTicketsCreated.setBounds(10, 36, 100, 14);
		panel_9.add(lblTicketsCreated);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(120, 36, 624, 14);
		panel_9.add(label_3);
		
		JLabel lblTicketDetails = new JLabel("Ticket Details");
		lblTicketDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblTicketDetails.setBounds(10, 94, 734, 14);
		panel_9.add(lblTicketDetails);
		
		JLabel lblTotalRevenueWith = new JLabel("Total Revenue with the tickets:");
		lblTotalRevenueWith.setBounds(10, 61, 183, 14);
		panel_9.add(lblTotalRevenueWith);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(10, 119, 734, 270);
		panel_9.add(scrollPane_6);
		
		table_4 = new JTable();
		table_4.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"TicketId", "Bill Amount"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane_6.setViewportView(table_4);
		
		JLabel label_7 = new JLabel("");
		label_7.setBounds(203, 61, 444, 14);
		panel_9.add(label_7);
		
		JButton btnGeneratePdf = new JButton("Generate PDF");
		btnGeneratePdf.setBounds(320, 420, 200, 23);
		panel_9.add(btnGeneratePdf);
		
		JPanel Company_Rep = new JPanel();
		Company_Rep.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		tabbedPane_1.addTab("Company Report", null, Company_Rep, null);
		Company_Rep.setLayout(null);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.WHITE);
		panel_11.setBounds(10, 11, 754, 535);
		Company_Rep.add(panel_11);
		panel_11.setLayout(null);
		
		JLabel lblTotalTickets = new JLabel("Total Tickets");
		lblTotalTickets.setBounds(10, 11, 100, 14);
		panel_11.add(lblTotalTickets);
		
		label_8 = new JLabel("");
		label_8.setBounds(120, 11, 624, 14);
		panel_11.add(label_8);
		
		JLabel lblTotalRevenueGenerated = new JLabel("Total Revenue Generated");
		lblTotalRevenueGenerated.setBounds(10, 36, 150, 14);
		panel_11.add(lblTotalRevenueGenerated);
		
		label_9 = new JLabel("");
		label_9.setBounds(170, 36, 574, 14);
		panel_11.add(label_9);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(10, 61, 734, 420);
		panel_11.add(scrollPane_7);
		
		table_5 = new JTable();
		table_5.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Ticket ID", "Delevered By", "Status", "Order Taker", "Cost"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane_7.setViewportView(table_5);
		
		JButton btnGeneratePdf_1 = new JButton("Generate PDF");
		btnGeneratePdf_1.setBounds(271, 492, 200, 23);
		panel_11.add(btnGeneratePdf_1);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) Login.getLayout();
				cl.show(Login,"login");
				passwordField.setText("");
			}
		});
		btnLogout.setBounds(685, 0, 89, 23);
		Admin_Panel.add(btnLogout);
		
		JPanel Employee_Panel = new JPanel();
		Employee_Panel.setBackground(SystemColor.activeCaption);
		Login.add(Employee_Panel, "Employee");
		Employee_Panel.setLayout(null);
		
		JButton button = new JButton("Logout");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) Login.getLayout();
				cl.show(Login,"login");
				passwordField.setText("");
			}
		});
		button.setBounds(695, 0, 89, 23);
		Employee_Panel.add(button);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(0, 26, 784, 613);
		Employee_Panel.add(tabbedPane_2);
		
		JPanel Delivery = new JPanel();
		Delivery.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		tabbedPane_2.addTab("Delivery", null, Delivery, null);
		Delivery.setLayout(null);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.setBounds(0, 0, 779, 597);
		Delivery.add(tabbedPane_3);
		
		JPanel panel_5 = new JPanel();
		tabbedPane_3.addTab("Generate Ticket", null, panel_5, null);
		panel_5.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(0, 0, 774, 566);
		panel_5.add(panel_6);
		
		JLabel label_64 = new JLabel("Create Ticket here");
		label_64.setHorizontalAlignment(SwingConstants.CENTER);
		label_64.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_64.setBounds(10, 11, 754, 30);
		panel_6.add(label_64);
		
		JLabel label_65 = new JLabel("Select Delivery Boy");
		label_65.setBounds(179, 121, 140, 14);
		panel_6.add(label_65);
		
		comboBox_13 = new JComboBox<String>();
		comboBox_13.setBounds(329, 118, 200, 20);
		panel_6.add(comboBox_13);
		
		comboBox_14 = new JComboBox<String>();
		comboBox_14.setBounds(329, 149, 200, 20);
		panel_6.add(comboBox_14);
		
		comboBox_15 = new JComboBox<String>();
		comboBox_15.setBounds(329, 180, 200, 20);
		panel_6.add(comboBox_15);
		
		JLabel label_66 = new JLabel("Pickup Customer :");
		label_66.setBounds(179, 152, 140, 14);
		panel_6.add(label_66);
		
		JLabel label_67 = new JLabel("Delivery Customer :");
		label_67.setBounds(179, 183, 140, 14);
		panel_6.add(label_67);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(329, 211, 200, 20);
		panel_6.add(textField_14);
		
		JLabel label_68 = new JLabel("Pickup Time :");
		label_68.setBounds(179, 214, 140, 14);
		panel_6.add(label_68);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(329, 242, 200, 20);
		panel_6.add(textField_16);
		
		JLabel label_69 = new JLabel("Delivery Time :");
		label_69.setBounds(179, 245, 140, 14);
		panel_6.add(label_69);
		
		JLabel label_70 = new JLabel("Package :");
		label_70.setBounds(179, 276, 140, 14);
		panel_6.add(label_70);
		
		comboBox_16 = new JComboBox<String>();
		comboBox_16.setBounds(329, 273, 200, 20);
		panel_6.add(comboBox_16);
		
		comboBox_17 = new JComboBox<String>();
		comboBox_17.setBounds(329, 304, 200, 20);
		panel_6.add(comboBox_17);
		
		JLabel label_71 = new JLabel("Bill Payee :");
		label_71.setBounds(179, 307, 140, 14);
		panel_6.add(label_71);
		
		JButton button_6 = new JButton("Generate Ticket");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String temp=null,tid=null,ename=null,status=null,pc=null,dc=null,pt=null,dt=null,pid=null,pay=null;
				Random ran = new Random();
				temp = ran.nextInt(999999)+"";
				CDSDataManager dm = new CDSDataManager();
				while(!(dm.getCustomTicket(temp, 0)==null))
					temp = ran.nextInt(999999)+"";
				if(dm.getCustomTicket(temp, 0)==null){
					tid = temp;
					ename = "";
					status = "Assigned";
					pc = comboBox_14.getSelectedItem().toString();
					dc = comboBox_15.getSelectedItem().toString();
					pt = textField_14.getText();
					dt = textField_16.getText();
					pid = dm.getCustomCourier(comboBox_16.getSelectedItem().toString(),0);
					pay = comboBox_17.getSelectedItem().toString();
					Ticket tkt = new Ticket();
					Dijkstra dijkstra = new Dijkstra(graph, dm.getCustomCompany(3));
					Dijkstra dijkstradp = new Dijkstra(graph, dm.getCustomCustomer(pc, 2));
					tkt.setBillAmount(((dijkstra.getDistanceTo(dm.getCustomCustomer(pc, 2))+dijkstradp.getDistanceTo(dm.getCustomCustomer(dc, 2)))*Integer.parseInt(dm.getCustomCompany(5)))+"");
					tkt.setBillPayee(pay);
					tkt.setDeliverCustomer(dc);
					tkt.setDeliverTime(dt);
					tkt.setExecutiveId("N/A");
					tkt.setExecutiveName(ename);
					tkt.setPickupLocation(dm.getCustomCustomer(pc, 2));;
					tkt.setDeliverLocation(dm.getCustomCustomer(dc, 2));;
					tkt.setOrderTaker(login);
					tkt.setPackageId(pid);
					tkt.setPickupCustomer(pc);
					tkt.setPickuptime(pt);
					tkt.setStatus(status);
					tkt.setTicketid(tid);
					dm.setTicketData(tkt);
					JOptionPane.showMessageDialog(null, "Ticket with id "+tid+" Created...");
				}
				ref();
			}
		});
		button_6.setBounds(413, 415, 300, 23);
		panel_6.add(button_6);
		
		JLabel label_72 = new JLabel("Estimated Price :");
		label_72.setBounds(179, 335, 140, 14);
		panel_6.add(label_72);
		
		JLabel etp = new JLabel("");
		etp.setBounds(329, 335, 200, 14);
		panel_6.add(etp);
		
		JLabel label_74 = new JLabel("ETA :");
		label_74.setBounds(179, 360, 140, 14);
		panel_6.add(label_74);
		
		JLabel ad_eta = new JLabel("");
		ad_eta.setBounds(329, 360, 200, 14);
		panel_6.add(ad_eta);
		
		JButton button_5 = new JButton("Price & Time EST");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sp=null,pc=null,dc=null;
				int cost=0;
				pc = comboBox_14.getSelectedItem().toString();
				dc = comboBox_15.getSelectedItem().toString();
				CDSDataManager dm = new CDSDataManager();
				sp = dm.getCustomCompany(3);
				Dijkstra dijkstra = new Dijkstra(graph, sp);
				Dijkstra dijkstradp = new Dijkstra(graph, dm.getCustomCustomer(pc, 2));
				int distance = dijkstra.getDistanceTo(dm.getCustomCustomer(pc, 2))+dijkstradp.getDistanceTo(dm.getCustomCustomer(dc, 2));
				cost = distance*Integer.parseInt(dm.getCustomCompany(5));
				etp.setText(cost+"");
				ad_eta.setText(distance +" Min's");
			}
		});
		button_5.setBounds(103, 415, 300, 23);
		panel_6.add(button_5);
		
		JPanel panel_1 = new JPanel();
		tabbedPane_3.addTab("View Ticket", null, panel_1, null);
		panel_1.setLayout(null);
		panel_1.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		
		JLabel label_1 = new JLabel("View Ticket Here");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBounds(10, 11, 754, 20);
		panel_1.add(label_1);
		
		JLabel label_20 = new JLabel("Ticket ID");
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setBounds(10, 42, 250, 14);
		panel_1.add(label_20);
		
		comboBox_4 = new JComboBox<String>();
		comboBox_4.setBounds(10, 67, 250, 20);
		panel_1.add(comboBox_4);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_3.setBounds(10, 132, 754, 434);
		panel_1.add(scrollPane_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setPreferredSize(new Dimension(734,600));
		scrollPane_3.setViewportView(panel_4);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(734, 600));
		panel.setBackground(Color.WHITE);
		panel_4.add(panel);
		
		JLabel label_22 = new JLabel("Order Taker Name : ");
		label_22.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_22.setBounds(10, 11, 125, 14);
		panel.add(label_22);
		
		JLabel emp_otn = new JLabel("");
		emp_otn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		emp_otn.setBounds(130, 11, 252, 14);
		panel.add(emp_otn);
		
		JLabel label_24 = new JLabel("Ticket  ID:");
		label_24.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_24.setBounds(10, 36, 70, 14);
		panel.add(label_24);
		
		JLabel emp_tid = new JLabel("");
		emp_tid.setFont(new Font("Tahoma", Font.PLAIN, 11));
		emp_tid.setBounds(90, 36, 652, 14);
		panel.add(emp_tid);
		
		JLabel label_26 = new JLabel("Pickup Customer Info");
		label_26.setHorizontalAlignment(SwingConstants.CENTER);
		label_26.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_26.setBounds(10, 61, 360, 14);
		panel.add(label_26);
		
		JLabel label_27 = new JLabel("Delivery Customer Info");
		label_27.setHorizontalAlignment(SwingConstants.CENTER);
		label_27.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_27.setBounds(380, 61, 362, 14);
		panel.add(label_27);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(366, 61, 2, 117);
		panel.add(separator_1);
		
		JLabel label_28 = new JLabel("Name :");
		label_28.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_28.setBounds(20, 86, 100, 14);
		panel.add(label_28);
		
		JLabel pcn = new JLabel("");
		pcn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pcn.setBounds(130, 86, 226, 14);
		panel.add(pcn);
		
		JLabel label_30 = new JLabel("Name :");
		label_30.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_30.setBounds(380, 86, 100, 14);
		panel.add(label_30);
		
		JLabel dcn = new JLabel("");
		dcn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		dcn.setBounds(490, 86, 252, 14);
		panel.add(dcn);
		
		JLabel label_32 = new JLabel("Address :");
		label_32.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_32.setBounds(21, 111, 99, 14);
		panel.add(label_32);
		
		JLabel pca = new JLabel("");
		pca.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pca.setBounds(130, 111, 226, 14);
		panel.add(pca);
		
		JLabel label_34 = new JLabel("When To Pickup :");
		label_34.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_34.setBounds(21, 136, 99, 14);
		panel.add(label_34);
		
		JLabel label_35 = new JLabel("Contact Detail :");
		label_35.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_35.setBounds(20, 161, 100, 14);
		panel.add(label_35);
		
		JLabel pcd = new JLabel("");
		pcd.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pcd.setBounds(130, 161, 226, 14);
		panel.add(pcd);
		
		JLabel label_37 = new JLabel("Address:");
		label_37.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_37.setBounds(380, 111, 100, 14);
		panel.add(label_37);
		
		JLabel label_38 = new JLabel("Contact Details: ");
		label_38.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_38.setBounds(380, 136, 100, 14);
		panel.add(label_38);
		
		JLabel fpt = new JLabel("");
		fpt.setFont(new Font("Tahoma", Font.PLAIN, 11));
		fpt.setBounds(130, 136, 226, 14);
		panel.add(fpt);
		
		JLabel dca = new JLabel("");
		dca.setFont(new Font("Tahoma", Font.PLAIN, 11));
		dca.setBounds(490, 111, 252, 14);
		panel.add(dca);
		
		JLabel dcd = new JLabel("");
		dcd.setFont(new Font("Tahoma", Font.PLAIN, 11));
		dcd.setBounds(490, 136, 252, 14);
		panel.add(dcd);
		
		JLabel label_42 = new JLabel("Package ID:");
		label_42.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_42.setBounds(100, 186, 160, 14);
		panel.add(label_42);
		
		JLabel emp_pid = new JLabel("");
		emp_pid.setFont(new Font("Tahoma", Font.PLAIN, 11));
		emp_pid.setBounds(271, 186, 454, 14);
		panel.add(emp_pid);
		
		JLabel label_44 = new JLabel("Estimated Delivery Time");
		label_44.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_44.setBounds(100, 211, 160, 14);
		panel.add(label_44);
		
		JLabel edt = new JLabel("");
		edt.setFont(new Font("Tahoma", Font.PLAIN, 11));
		edt.setBounds(271, 211, 454, 14);
		panel.add(edt);
		
		JLabel label_46 = new JLabel("Price :");
		label_46.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_46.setBounds(100, 236, 160, 14);
		panel.add(label_46);
		
		JLabel emp_cst = new JLabel("");
		emp_cst.setFont(new Font("Tahoma", Font.PLAIN, 11));
		emp_cst.setBounds(271, 236, 454, 14);
		panel.add(emp_cst);
		
		JLabel label_48 = new JLabel("Bill Payed By :");
		label_48.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_48.setBounds(100, 261, 161, 14);
		panel.add(label_48);
		
		JLabel bpb = new JLabel("");
		bpb.setFont(new Font("Tahoma", Font.PLAIN, 11));
		bpb.setBounds(271, 261, 454, 14);
		panel.add(bpb);
		
		JLabel label_50 = new JLabel("Pickup Directions :");
		label_50.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_50.setBounds(100, 289, 161, 14);
		panel.add(label_50);
		
		JLabel pd = new JLabel("");
		pd.setFont(new Font("Tahoma", Font.PLAIN, 11));
		pd.setBounds(271, 289, 454, 30);
		panel.add(pd);
		
		JLabel dd = new JLabel("");
		dd.setFont(new Font("Tahoma", Font.PLAIN, 11));
		dd.setBounds(271, 330, 454, 30);
		panel.add(dd);
		
		JLabel label_53 = new JLabel("Pickup - Delivery Directions :");
		label_53.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_53.setBounds(100, 330, 161, 14);
		panel.add(label_53);
		
		JLabel od = new JLabel("");
		od.setFont(new Font("Tahoma", Font.PLAIN, 11));
		od.setBounds(271, 371, 454, 30);
		panel.add(od);
		
		JLabel label_55 = new JLabel("Delivery Office Directions :");
		label_55.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_55.setBounds(100, 371, 161, 14);
		panel.add(label_55);
		
		JLabel label_56 = new JLabel("Delivery Person :");
		label_56.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_56.setBounds(100, 412, 160, 14);
		panel.add(label_56);
		
		JLabel dp = new JLabel("");
		dp.setFont(new Font("Tahoma", Font.PLAIN, 11));
		dp.setBounds(271, 412, 454, 14);
		panel.add(dp);
		
		JLabel label_58 = new JLabel("Pickup Time :");
		label_58.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_58.setBounds(100, 437, 161, 14);
		panel.add(label_58);
		
		JLabel lpt = new JLabel("");
		lpt.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lpt.setBounds(271, 437, 454, 14);
		panel.add(lpt);
		
		JLabel label_60 = new JLabel("Delivery Time");
		label_60.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_60.setBounds(100, 462, 161, 14);
		panel.add(label_60);
		
		JLabel ldt = new JLabel("");
		ldt.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ldt.setBounds(271, 462, 454, 14);
		panel.add(ldt);
		
		JButton button_4 = new JButton("Save & Print");
		button_4.setBounds(271, 500, 200, 23);
		panel.add(button_4);
		
		JLabel label_62 = new JLabel("Status");
		label_62.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_62.setBounds(392, 11, 79, 14);
		panel.add(label_62);
		
		JLabel emp_stat = new JLabel("");
		emp_stat.setBounds(481, 11, 226, 14);
		panel.add(emp_stat);
		
		JButton button_2 = new JButton("View");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id =null;
				id = comboBox_4.getSelectedItem().toString();
				CDSDataManager dm = new CDSDataManager();
				emp_otn.setText(dm.getCustomTicket(id, 6));
				emp_tid.setText(id);
				pcn.setText(dm.getCustomTicket(id, 7));
				dcn.setText(dm.getCustomTicket(id, 8));
				emp_stat.setText(dm.getCustomTicket(id, 5));
				fpt.setText(dm.getCustomTicket(id, 9));
				emp_pid.setText(id);
			    bpb.setText(dm.getCustomTicket(id, 12));
				dp.setText(dm.getCustomTicket(id, 4));
				lpt.setText(dm.getCustomTicket(id, 9));
				ldt.setText(dm.getCustomTicket(id, 10));
				pca.setText(dm.getCustomCustomer(dm.getCustomTicket(id, 7), 2)+", "+dm.getCustomCustomer(dm.getCustomTicket(id, 7), 3));
				dca.setText(dm.getCustomCustomer(dm.getCustomTicket(id, 8), 2)+", "+dm.getCustomCustomer(dm.getCustomTicket(id, 8), 3));
				pcd.setText(dm.getCustomCustomer(dm.getCustomTicket(id, 7), 4));
				dcd.setText(dm.getCustomCustomer(dm.getCustomTicket(id, 8), 4));
				Dijkstra dijkstra = new Dijkstra(graph, dm.getCustomCompany(3));
				Dijkstra dijkstrap = new Dijkstra(graph, dm.getCustomCustomer(dm.getCustomTicket(id, 7), 2));
				Dijkstra dijkstrad = new Dijkstra(graph, dm.getCustomCustomer(dm.getCustomTicket(id, 8), 2));
				pd.setText(dijkstra.getPathTo(dm.getCustomTicket(id, 1)).toString());
				dd.setText(dijkstrap.getPathTo(dm.getCustomTicket(id, 2)).toString());
				od.setText(dijkstrad.getPathTo(dm.getCustomCompany(3)).toString());
				emp_cst.setText("$"+dm.getCustomTicket(id, 13));
				edt.setText(dijkstra.getDistanceTo(dm.getCustomTicket(id, 1))+dijkstrap.getDistanceTo(dm.getCustomTicket(id, 2))+" Min's");
			}
		});
		button_2.setBounds(554, 79, 100, 23);
		panel_1.add(button_2);
		
		JLabel label_21 = new JLabel("Change Status :");
		label_21.setBounds(10, 102, 100, 14);
		panel_1.add(label_21);
		
		JComboBox<String> comboBox_6 = new JComboBox<String>();
		comboBox_6.setBounds(120, 98, 153, 20);
		panel_1.add(comboBox_6);
		comboBox_6.addItem("Assigned");
		comboBox_6.addItem("Picked Up");
		comboBox_6.addItem("Out For Delivery");
		comboBox_6.addItem("Delivered");
		JButton button_3 = new JButton("Edit");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id =null,status=null;
				id = comboBox_4.getSelectedItem().toString();
				CDSDataManager dm = new CDSDataManager();
				Ticket tkt = new Ticket();
				tkt.setExecutiveName(comboBox_19.getSelectedItem().toString());
				tkt.setDeliverTime(textField_19.getText());
				DeliveryPerson dpm = new DeliveryPerson();
				dpm.setStatus("In Delivery");
				dm.editDpStatus(comboBox_19.getSelectedItem().toString(), dpm);;
				dm.editTicketDeliveryTime(id,tkt);
				dm.editTicketDeliveryboy(id, tkt);
				status = comboBox_6.getSelectedItem().toString();
				tkt.setStatus(status);
				dm.editTicketStatus(id, tkt);
				emp_otn.setText(dm.getCustomTicket(id, 6));
				emp_tid.setText(id);
				pcn.setText(dm.getCustomTicket(id, 7));
				dcn.setText(dm.getCustomTicket(id, 8));
				emp_stat.setText(dm.getCustomTicket(id, 5));
				fpt.setText(dm.getCustomTicket(id, 9));
				emp_pid.setText(id);
			    bpb.setText(dm.getCustomTicket(id, 12));
				dp.setText(dm.getCustomTicket(id, 4));
				lpt.setText(dm.getCustomTicket(id, 9));
				ldt.setText(dm.getCustomTicket(id, 10));
				pca.setText(dm.getCustomCustomer(dm.getCustomTicket(id, 7), 2)+", "+dm.getCustomCustomer(dm.getCustomTicket(id, 7), 3));
				dca.setText(dm.getCustomCustomer(dm.getCustomTicket(id, 8), 2)+", "+dm.getCustomCustomer(dm.getCustomTicket(id, 8), 3));
				pcd.setText(dm.getCustomCustomer(dm.getCustomTicket(id, 7), 4));
				dcd.setText(dm.getCustomCustomer(dm.getCustomTicket(id, 8), 4));
				Dijkstra dijkstra = new Dijkstra(graph, dm.getCustomCompany(3));
				Dijkstra dijkstrap = new Dijkstra(graph, dm.getCustomCustomer(dm.getCustomTicket(id, 7), 2));
				Dijkstra dijkstrad = new Dijkstra(graph, dm.getCustomCustomer(dm.getCustomTicket(id, 8), 2));
				pd.setText(dijkstra.getPathTo(dm.getCustomTicket(id, 1)).toString());
				dd.setText(dijkstrap.getPathTo(dm.getCustomTicket(id, 2)).toString());
				od.setText(dijkstrad.getPathTo(dm.getCustomCompany(3)).toString());
				emp_cst.setText("$"+dm.getCustomTicket(id, 13));
				edt.setText(dijkstra.getDistanceTo(dm.getCustomTicket(id, 1))+dijkstrap.getDistanceTo(dm.getCustomTicket(id, 2))+" Min's");
			}
		});
		button_3.setBounds(664, 79, 100, 23);
		panel_1.add(button_3);
		
		JLabel lblDeliveryBoy_1 = new JLabel("Delivery Boy:");
		lblDeliveryBoy_1.setBounds(283, 102, 100, 14);
		panel_1.add(lblDeliveryBoy_1);
		
		comboBox_19 = new JComboBox<String>();
		comboBox_19.setBounds(371, 101, 173, 20);
		panel_1.add(comboBox_19);
		
		JLabel lblDeliveryTime_2 = new JLabel("Delivery Time");
		lblDeliveryTime_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeliveryTime_2.setBounds(270, 42, 250, 14);
		panel_1.add(lblDeliveryTime_2);
		
		textField_19 = new JTextField();
		textField_19.setBounds(270, 67, 250, 20);
		panel_1.add(textField_19);
		textField_19.setColumns(10);
		
		JPanel Bill_emp = new JPanel();
		Bill_emp.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		tabbedPane_3.addTab("Generate Bill", null, Bill_emp, null);
		Bill_emp.setLayout(null);
		
		JPanel map = new JPanel();
		tabbedPane_3.addTab("Map", null, map, null);
		
		JPanel panel_7 = new JPanel();
		tabbedPane_3.addTab("Delivery Boy Status", null, panel_7, null);
		panel_7.setLayout(null);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		panel_10.setBounds(0, 0, 774, 566);
		panel_7.add(panel_10);
		
		JLabel label_4 = new JLabel("Create/edit Delivery Boys here");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(10, 11, 754, 14);
		panel_10.add(label_4);
		
		JLabel label_5 = new JLabel("Name");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(10, 59, 120, 14);
		panel_10.add(label_5);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(10, 84, 120, 20);
		panel_10.add(textField_20);
		
		JButton button_7 = new JButton("Delete");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CDSDataManager dm = new CDSDataManager();
				dm.deldb(textField_20.getText());
				ref();
			}
		});
		button_7.setBounds(605, 71, 89, 23);
		panel_10.add(button_7);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(10, 115, 754, 440);
		panel_10.add(scrollPane_5);
		
		table_3 = new JTable();
		table_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int idx=table_3.getSelectedRow();
				DefaultTableModel model = (DefaultTableModel) table_3.getModel();
				textField_20.setText(model.getValueAt(idx, 0).toString());
			}
		});
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Status"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane_5.setViewportView(table_3);
		
		JLabel label_6 = new JLabel("Status");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(136, 59, 355, 14);
		panel_10.add(label_6);
		
		JComboBox<String> comboBox_21 = new JComboBox<String>();
		comboBox_21.setBounds(140, 84, 356, 20);
		panel_10.add(comboBox_21);
		
		comboBox_21.addItem("Available");
		comboBox_21.addItem("In Delivery");
		comboBox_21.addItem("Off");
		
		JButton button_8 = new JButton("Add");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Name=null,Status=null;
				Name = textField_20.getText();
				Status = comboBox_21.getSelectedItem().toString();
				DeliveryPerson dp = new DeliveryPerson();
				dp.setName(Name);
				dp.setStatus(Status);
				CDSDataManager dm = new CDSDataManager();
				dm.setDbData(dp);
				ref();
			}
		});
		button_8.setBounds(506, 55, 89, 23);
		panel_10.add(button_8);
		
		JButton button_9 = new JButton("Edit");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=null;
				name = textField_20.getText();
				DeliveryPerson dp = new DeliveryPerson();
				dp.setStatus(comboBox_21.getSelectedItem().toString());
				CDSDataManager dm = new CDSDataManager();
				dm.editDpStatus(name, dp);
				ref();
			}
		});
		button_9.setBounds(506, 83, 89, 23);
		panel_10.add(button_9);
		
		JPanel Reports = new JPanel();
		Reports.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		tabbedPane_2.addTab("Reports", null, Reports, null);
		Reports.setLayout(null);
		
		JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_4.setBounds(0, 0, 779, 585);
		Reports.add(tabbedPane_4);
		
		JPanel delivery_emp = new JPanel();
		tabbedPane_4.addTab("Delivery Report", null, delivery_emp, null);
		
		JPanel panel_12 = new JPanel();
		tabbedPane_4.addTab("Customer Report", null, panel_12, null);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(10, 211, 764, 14);
		Login_Panel.add(label);
		
		JLabel label_11 = new JLabel("");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_11.setBounds(10, 399, 754, 40);
		company.add(label_11);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				otn.setText("");
				adm_tid.setText("");
				adm_pcn.setText("");
				adm_dcn.setText("");
				adm_wpt.setText("");
				adm_pkgid.setText("");
				adm_bpb.setText("");
				adm_dp.setText("");
				adm_lpt.setText("");
				adm_ldt.setText("");
				adm_pca.setText("");
				adm_dca.setText("");
				adm_pcd.setText("");
				adm_dcd.setText("");
				String password=null,name=null;
				name = comboBox.getSelectedItem().toString();
				login = name;
				password=passwordField.getText();
				CDSDataManager data = new CDSDataManager();
				if(password.equals(data.getPassword(name)) && data.getType(name).equals("Admin")){
					CardLayout cl = (CardLayout) Login.getLayout();
					cl.show(Login, "Admin");
					}else if(password.equals(data.getPassword(name)) && data.getType(name).equals("Order Taker")){
						CardLayout cl = (CardLayout) Login.getLayout();
						cl.show(Login, "Employee");
					}else{
						label.setForeground(Color.red);
						label.setText("Incorrect Password or User (Order Taker can't login)");
					}
				ref();
				}
		});
		btnLogin.setBounds(301, 370, 200, 23);
		Login_Panel.add(btnLogin);
		
		JLabel lblWelcomeToContent = new JLabel("Welcome To Content Delivery System");
		lblWelcomeToContent.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWelcomeToContent.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToContent.setBounds(10, 11, 764, 50);
		Login_Panel.add(lblWelcomeToContent);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=null,cn=null,rtb=null,btm=null,wh=null,ci=null;
				name=textField.getText();
				cn = textField_1.getText();
				rtb = textField_3.getText();
				btm = textField_4.getText();
				wh = textField_33.getText();
				ci = comboBox_7.getSelectedItem().toString();
				Compnay comp = new Compnay();
				comp.setName(name);
				comp.setContactnumber(cn);
				comp.setCompanyhrs(wh);
				comp.setBlockpermiles(btm);
				comp.setLocation(ci);
				comp.setRateperblock(rtb);
				JOptionPane.showMessageDialog(null, "Company with name "+name+" Registered");
				CDSDataManager create = new CDSDataManager();
				create.setCompanyData(comp);
				ref();
			}
		});
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pattern ptr = Pattern.compile("^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$");
				Pattern nptr = Pattern.compile("\\b\\d{3}[-.]?\\d{3}[-.]?\\d{4}\\b");
				
				String name=null,email=null,phn=null,pw=null,type=null;
				name = textField_5.getText();
				email = textField_6.getText();
				phn = textField_7.getText();
				pw = textField_8.getText();
				type = comboBox_1.getSelectedItem().toString();
				if(ptr.matcher(email).matches()){
					if(nptr.matcher(phn).matches()){
				Employee emp = new Employee();
				emp.setEmail(email);
				emp.setEname(name);
				emp.setEmpType(type);
				emp.setPassword(pw);
				emp.setPhone(phn);
				
				CDSDataManager setemp = new CDSDataManager();
				setemp.setEmployeeData(emp);
				ref();
				Errors_empl.setForeground(Color.green);
				Errors_empl.setText("");
					}else{
						Errors_empl.setForeground(Color.red);
						Errors_empl.setText("Incorrect phone number");
					}
				}else{
					Errors_empl.setForeground(Color.red);
					Errors_empl.setText("Incorrect email id");
				}
			}
		});
		btnAdd.setBounds(560, 78, 89, 23);
		employee.add(btnAdd);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pattern ptr = Pattern.compile("^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$");
				Pattern nptr = Pattern.compile("\\b\\d{3}[-.]?\\d{3}[-.]?\\d{4}\\b");
				
				String name=null,email=null,ci=null,city=null,phn=null,zip=null;
				name = textField_9.getText();
				email = textField_10.getText();
				ci = comboBox_2.getSelectedItem().toString();
				city = textField_12.getText();
				phn = textField_13.getText();
				zip = textField_15.getText();
				if(ptr.matcher(email).matches()){
					if(nptr.matcher(phn).matches()){
				CDSDataManager dm = new CDSDataManager();
				
				Customer cst = new Customer();
				cst.setName(name);
				cst.setMail(email);
				cst.setClosestintersection(ci);
				cst.setCity(city);
				cst.setPhone(phn);
				cst.setZip(zip);
				dm.setCustomerData(cst);
				ref();
				error_cust.setText("");
					}else{
						error_cust.setForeground(Color.red);
						error_cust.setText("Incorrect Phone number");
					}
				}else{
					error_cust.setForeground(Color.red);
					error_cust.setText("Incorrect Email ID");
				}
			}
		});
		btnEnter.setBounds(10, 128, 250, 23);
		Customer.add(btnEnter);
		
		JButton btnDelete_2 = new JButton("Delete");
		btnDelete_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CDSDataManager dm = new CDSDataManager();
				String name = null;
				name=textField_5.getText();
				dm.delEmployee(name);
				ref();
			}
		});
		btnDelete_2.setBounds(659, 93, 89, 23);
		employee.add(btnDelete_2);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CDSDataManager dm = new CDSDataManager();
				Employee emp = new Employee();
				
				String name=null,email=null,phone=null,pass=null,type=null;
				name = textField_5.getText();
				email = textField_6.getText();
				phone = textField_7.getText();
				pass = textField_8.getText();
				type = comboBox_1.getSelectedItem().toString();
				
				emp.setEname(name);
				emp.setEmail(email);
				emp.setPhone(phone);
				emp.setPassword(pass);
				emp.setEmpType(type);
				
				dm.editEmployee(name, emp);
				
				ref();
			}
		});
		btnEdit.setBounds(560, 106, 89, 23);
		employee.add(btnEdit);
		
		JButton btnEdit_1 = new JButton("Edit");
		btnEdit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=null,email=null,ci=null,city=null,phn=null,zip=null;
				name = textField_9.getText();
				email = textField_10.getText();
				ci = comboBox_2.getSelectedItem().toString();
				city = textField_12.getText();
				phn = textField_13.getText();
				zip = textField_15.getText();

				CDSDataManager dm = new CDSDataManager();
				Customer cst = new Customer();
				cst.setName(name);
				cst.setMail(email);
				cst.setClosestintersection(ci);
				cst.setCity(city);
				cst.setPhone(phn);
				cst.setZip(zip);
				
				dm.editCustomer(name, cst);
				
				ref();
			}
		});
		btnEdit_1.setBounds(504, 128, 250, 23);
		Customer.add(btnEdit_1);
		
		JButton btnDelete_3 = new JButton("Delete");
		btnDelete_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CDSDataManager dm = new CDSDataManager();
				dm.delCustomer(textField_9.getText());
				ref();
			}
		});
		btnDelete_3.setBounds(270, 128, 224, 23);
		Customer.add(btnDelete_3);
		
		JButton btnUpdate_2 = new JButton("View");
		btnUpdate_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id =null;
				id = comboBox_3.getSelectedItem().toString();
				CDSDataManager dm = new CDSDataManager();
				otn.setText(dm.getCustomTicket(id, 6));
				adm_tid.setText(id);
				adm_pcn.setText(dm.getCustomTicket(id, 7));
				adm_dcn.setText(dm.getCustomTicket(id, 8));
				adm_stat.setText(dm.getCustomTicket(id, 5));
				adm_wpt.setText(dm.getCustomTicket(id, 9));
				adm_pkgid.setText(id);
				adm_bpb.setText(dm.getCustomTicket(id, 12));
				adm_dp.setText(dm.getCustomTicket(id, 4));
				adm_lpt.setText(dm.getCustomTicket(id, 9));
				adm_ldt.setText(dm.getCustomTicket(id, 10));
				adm_pca.setText(dm.getCustomCustomer(dm.getCustomTicket(id, 7), 2)+", "+dm.getCustomCustomer(dm.getCustomTicket(id, 7), 3));
				adm_dca.setText(dm.getCustomCustomer(dm.getCustomTicket(id, 8), 2)+", "+dm.getCustomCustomer(dm.getCustomTicket(id, 8), 3));
				adm_pcd.setText(dm.getCustomCustomer(dm.getCustomTicket(id, 7), 4));
				adm_dcd.setText(dm.getCustomCustomer(dm.getCustomTicket(id, 8), 4));
				Dijkstra dijkstra = new Dijkstra(graph, dm.getCustomCompany(3));
				Dijkstra dijkstrap = new Dijkstra(graph, dm.getCustomCustomer(dm.getCustomTicket(id, 7), 2));
				Dijkstra dijkstrad = new Dijkstra(graph, dm.getCustomCustomer(dm.getCustomTicket(id, 8), 2));
				adm_pd.setText(dijkstra.getPathTo(dm.getCustomTicket(id, 1)).toString());
				adm_dd.setText(dijkstrap.getPathTo(dm.getCustomTicket(id, 2)).toString());
				adm_od.setText(dijkstrad.getPathTo(dm.getCustomCompany(3)).toString());
				adm_eta.setText(dijkstra.getDistanceTo(dm.getCustomTicket(id, 1))+dijkstrap.getDistanceTo(dm.getCustomTicket(id, 2))+" Min's");
				adm_bill.setText("$"+dm.getCustomTicket(id, 13));
				ref();
			}
		});
		btnUpdate_2.setBounds(494, 79, 160, 23);
		Ticket.add(btnUpdate_2);
		
		JLabel lblChangeStatus = new JLabel("Change Status :");
		lblChangeStatus.setBounds(10, 102, 100, 14);
		Ticket.add(lblChangeStatus);
		
		JComboBox<String> comboBox_12 = new JComboBox<String>();
		comboBox_12.setBounds(120, 98, 141, 20);
		Ticket.add(comboBox_12);
		
		comboBox_12.addItem("Assigned");
		comboBox_12.addItem("Picked Up");
		comboBox_12.addItem("Out For Delivery");
		comboBox_12.addItem("Delivered");
		
		JButton btnEdit_2 = new JButton("Edit");
		btnEdit_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String id =null,status=null;
				id = comboBox_3.getSelectedItem().toString();
				CDSDataManager dm = new CDSDataManager();
				Ticket tkt = new Ticket();
				status = comboBox_12.getSelectedItem().toString();
				tkt.setExecutiveName(comboBox_5.getSelectedItem().toString());
				DeliveryPerson dp = new DeliveryPerson();
				dp.setStatus("In Delivery");
				dm.editDpStatus(comboBox_5.getSelectedItem().toString(), dp);;
				tkt.setDeliverTime(textField_18.getText());
				dm.editTicketDeliveryTime(id,tkt);
				dm.editTicketDeliveryboy(id, tkt);
				tkt.setStatus(status);
				dm.editTicketStatus(id, tkt);
				otn.setText(dm.getCustomTicket(id, 6));
				adm_tid.setText(id);
				adm_pcn.setText(dm.getCustomTicket(id, 7));
				adm_dcn.setText(dm.getCustomTicket(id, 8));
				adm_stat.setText(dm.getCustomTicket(id, 5));
				adm_wpt.setText(dm.getCustomTicket(id, 9));
				adm_pkgid.setText(id);
				adm_bpb.setText(dm.getCustomTicket(id, 12));
				adm_dp.setText(dm.getCustomTicket(id, 4));
				adm_lpt.setText(dm.getCustomTicket(id, 9));
				adm_ldt.setText(dm.getCustomTicket(id, 10));
				adm_pca.setText(dm.getCustomCustomer(dm.getCustomTicket(id, 7), 2)+", "+dm.getCustomCustomer(dm.getCustomTicket(id, 7), 3));
				adm_dca.setText(dm.getCustomCustomer(dm.getCustomTicket(id, 8), 2)+", "+dm.getCustomCustomer(dm.getCustomTicket(id, 8), 3));
				adm_pcd.setText(dm.getCustomCustomer(dm.getCustomTicket(id, 7), 4));
				adm_dcd.setText(dm.getCustomCustomer(dm.getCustomTicket(id, 8), 4));
				Dijkstra dijkstra = new Dijkstra(graph, dm.getCustomCompany(3));
				Dijkstra dijkstrap = new Dijkstra(graph, dm.getCustomCustomer(dm.getCustomTicket(id, 7), 2));
				Dijkstra dijkstrad = new Dijkstra(graph, dm.getCustomCustomer(dm.getCustomTicket(id, 8), 2));
				adm_pd.setText(dijkstra.getPathTo(dm.getCustomTicket(id, 1)).toString());
				adm_dd.setText(dijkstrap.getPathTo(dm.getCustomTicket(id, 2)).toString());
				adm_od.setText(dijkstrad.getPathTo(dm.getCustomCompany(3)).toString());
				adm_eta.setText(dijkstra.getDistanceTo(dm.getCustomTicket(id, 1))+dijkstrap.getDistanceTo(dm.getCustomTicket(id, 2))+" Min's");
				adm_bill.setText("$"+dm.getCustomTicket(id, 13));
				ref();
			}
		});
		btnEdit_2.setBounds(664, 79, 100, 23);
		Ticket.add(btnEdit_2);
		
		JLabel lblDeliveryBoy = new JLabel("Delivery Boy:");
		lblDeliveryBoy.setBounds(271, 102, 100, 14);
		Ticket.add(lblDeliveryBoy);
		
		comboBox_5 = new JComboBox<String>();
		comboBox_5.setBounds(348, 101, 136, 20);
		Ticket.add(comboBox_5);
		
		JLabel lblDeleveryTime = new JLabel("Delevery Time");
		lblDeleveryTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeleveryTime.setBounds(264, 42, 220, 14);
		Ticket.add(lblDeleveryTime);
		
		textField_18 = new JTextField();
		textField_18.setBounds(264, 67, 220, 20);
		Ticket.add(textField_18);
		textField_18.setColumns(10);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		tabbedPane.addTab("Delivery Boy Status", null, panel_8, null);
		panel_8.setLayout(null);
		
		JLabel lblCreatereditDeliveryBoys = new JLabel("Create/edit Delivery Boys here");
		lblCreatereditDeliveryBoys.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreatereditDeliveryBoys.setBounds(10, 11, 754, 14);
		panel_8.add(lblCreatereditDeliveryBoys);
		
		JLabel lblName_5 = new JLabel("Name");
		lblName_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblName_5.setBounds(10, 59, 120, 14);
		panel_8.add(lblName_5);
		
		textField_17 = new JTextField();
		textField_17.setBounds(10, 84, 120, 20);
		panel_8.add(textField_17);
		textField_17.setColumns(10);
		
		JButton btnDelete_1 = new JButton("Delete");
		btnDelete_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CDSDataManager dm = new CDSDataManager();
				dm.deldb(textField_17.getText());
				ref();
			}
		});
		btnDelete_1.setBounds(605, 71, 89, 23);
		panel_8.add(btnDelete_1);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 115, 754, 440);
		panel_8.add(scrollPane_4);
		
		table_2 = new JTable();
		table_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int idx=table_2.getSelectedRow();
				DefaultTableModel model = (DefaultTableModel) table_2.getModel();
				textField_17.setText(model.getValueAt(idx, 0).toString());
			}
		});
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Status"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane_4.setViewportView(table_2);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatus.setBounds(136, 59, 355, 14);
		panel_8.add(lblStatus);
		
		JComboBox<String> comboBox_20 = new JComboBox<String>();
		comboBox_20.setBounds(140, 84, 356, 20);
		panel_8.add(comboBox_20);
		
		comboBox_20.addItem("Available");
		comboBox_20.addItem("In Delivery");
		comboBox_20.addItem("Off");
		
		JButton btnAdd_1 = new JButton("Add");
		btnAdd_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Name=null,Status=null;
				Name = textField_17.getText();
				Status = comboBox_20.getSelectedItem().toString();
				DeliveryPerson dp = new DeliveryPerson();
				dp.setName(Name);
				dp.setStatus(Status);
				CDSDataManager dm = new CDSDataManager();
				dm.setDbData(dp);
				ref();
			}
		});
		btnAdd_1.setBounds(506, 55, 89, 23);
		panel_8.add(btnAdd_1);
		
		JButton btnViewStats = new JButton("View stats");
		btnViewStats.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
				String name=null;
				name = comboBox_18.getSelectedItem().toString();
				CDSDataManager dm = new CDSDataManager();
				label_2.setText(name);
				label_3.setText(dm.getCustomTicketid(name).size()+"");
				label_7.setText(dm.getCustomTicketval(name));
				DefaultTableModel mode6 = (DefaultTableModel) table_4.getModel(); 
				mode6.setRowCount(0);
				for(String ids : dm.getCustomTicketid(name))
					mode6.addRow(new Object[]{ids,dm.getCustomTicket(ids, 13)});
			}
		});
		btnViewStats.setBounds(400, 60, 364, 23);
		Employee_Rep.add(btnViewStats);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		tabbedPane_1.addTab("Customer Report", null, panel_13, null);
		panel_13.setLayout(null);
		
		JButton btnGenerate = new JButton("Generate");
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				  	CDSDataManager dm = new CDSDataManager();
				  	String cname = null,tid=null,price=null;
				  	cname = comboBox_22.getSelectedItem().toString();//change the combobox name
				  	
				  	ArrayList<String> ids = new ArrayList<>();
				  	
				  	
	              OutputStream file = new FileOutputStream(new File("src/PDF_Invoice_"+cname+".pdf"));
		          Document document = new Document();
		          PdfWriter.getInstance(document, file);

				//Inserting Table in PDF
				     PdfPTable table=new PdfPTable(3);

		                     PdfPCell cell = new PdfPCell (new Paragraph ("Invoice"));

					      cell.setColspan (4);
					      cell.setHorizontalAlignment (Element.ALIGN_CENTER);
					      cell.setPadding (10.0f);
					      cell.setBackgroundColor (new BaseColor (140, 221, 8));					               

					      table.addCell(cell);						               

					      table.addCell("Ticket ID");
					      table.addCell("Customer Name");
					      table.addCell("Price");
					      
					      ids = dm.getTicketData().get("Ticket ID");
						  	for(String id : ids)
							  	if(dm.getCustomTicket(id,8).equals(cname)){
							  		tid = id;
							  		price = dm.getCustomTicket(id,13);
							  		table.addCell(tid);
								    table.addCell(cname);
								    table.addCell(price);
							  	}
	                      
					      
					      table.setSpacingBefore(30.0f);       // Space Before table starts, like margin-top in CSS
					      table.setSpacingAfter(30.0f);        // Space After table starts, like margin-Bottom in CSS								          

				


				 //Now Insert Every Thing Into PDF Document
			         document.open();//PDF document opened........			       

						document.add(Chunk.NEWLINE);   //Something like in HTML :-)

	                    document.add(new Paragraph("Content Delivery System"));
		                document.add(new Paragraph("Document Generated On - "+new Date().toString()));	

						document.add(table);

						document.add(Chunk.NEWLINE);   //Something like in HTML :-)							    

	       				document.newPage();            //Opened new page
						
			         document.close();

				             file.close();

	          JOptionPane.showMessageDialog(null, "pdf generated succesfully");

	        } catch (Exception e1) {
	            e1.printStackTrace();
	        }
			}
		});
		btnGenerate.setBounds(311, 206, 89, 23);
		panel_13.add(btnGenerate);
		
		comboBox_22 = new JComboBox<String>();
		comboBox_22.setBounds(109, 67, 115, 20);
		panel_13.add(comboBox_22);
		
		JLabel lblSelecctCustomerName = new JLabel("Selecct Customer Name");
		lblSelecctCustomerName.setBounds(56, 32, 142, 14);
		panel_13.add(lblSelecctCustomerName);
		
		JButton btnEdit_3 = new JButton("Edit");
		btnEdit_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=null;
				name = textField_17.getText();
				DeliveryPerson dp = new DeliveryPerson();
				dp.setStatus(comboBox_20.getSelectedItem().toString());
				CDSDataManager dm = new CDSDataManager();
				dm.editDpStatus(name, dp);
				ref();
			}
		});
		btnEdit_3.setBounds(506, 83, 89, 23);
		panel_8.add(btnEdit_3);
		
		btnSave.setBounds(232, 341, 230, 23);
		company.add(btnSave);
		ref();
	}
	public static void ref(){
		CDSDataManager gets = new CDSDataManager();
		/*
		Ticket tkt = new Ticket();
		tkt.setBillAmount("100");
		tkt.setBillPayee("prajyoth");
		tkt.setDeliverCustomer("Ramesh");
		tkt.setDeliverLocation(gets.getCustomCustomer("Ramesh", 2));
		tkt.setDeliverTime("01:00");
		tkt.setExecutiveId("N/A");
		tkt.setExecutiveName("TestDeliver");
		tkt.setOrderTaker("Admin");
		tkt.setPackageId("PKG101");
		tkt.setPickupCustomer("Test");
		tkt.setPickupLocation(gets.getCustomCustomer("Test", 2));
		tkt.setPickuptime("00:00");
		tkt.setStatus("Assigned");
		tkt.setTicketid("45876");
		gets.setTicketData(tkt);
		*/
		/*
		DeliveryPerson dp = new DeliveryPerson();
		dp.setName("Test");
		dp.setStatus("Available");
		gets.setDbData(dp);
		*/
		textField_9.setText("");
		textField_5.setText("");
		textField_6.setText("");
		textField_7.setText("");
		textField_8.setText("");
		textField_10.setText("");
		textField_12.setText("");
		textField_13.setText("");
		textField_15.setText("");
		ArrayList<String> name=new ArrayList<>();
		name = gets.getEmployeeData().get("Name");
		comboBox_8.removeAllItems();
		comboBox_5.removeAllItems();
		comboBox_9.removeAllItems();
		comboBox_10.removeAllItems();
		comboBox_11.removeAllItems();
		comboBox_13.removeAllItems();
		comboBox_14.removeAllItems();
		comboBox_15.removeAllItems();
		comboBox_16.removeAllItems();
		comboBox_17.removeAllItems();
		comboBox_19.removeAllItems();
		comboBox_22.removeAllItems();
		DefaultTableModel mode1 = (DefaultTableModel) table_5.getModel();
		mode1.setRowCount(0);
		
		ArrayList<String> ids = new ArrayList<>();
		int tt =0,tr=0;
		ids = gets.getTicketData().get("Ticket ID");
		comboBox_3.removeAllItems();
		comboBox_4.removeAllItems();
		for(String id : ids){
			comboBox_3.addItem(id);
			comboBox_4.addItem(id);
			tt++;
			tr+=Integer.parseInt(gets.getCustomTicket(id, 13));
			//TODO
			mode1.addRow(new Object[]{id,gets.getCustomTicket(id, 4),gets.getCustomTicket(id, 5),gets.getCustomTicket(id, 6),gets.getCustomTicket(id, 13)});
		}
		label_8.setText(tt+"");
		label_9.setText(tr+"");
		comboBox.removeAllItems();
		for(String names:name)
			comboBox.addItem(names);
		DefaultTableModel mode3 = (DefaultTableModel) table.getModel(); //Employee table
		DefaultTableModel mode4 = (DefaultTableModel) table_1.getModel(); //customer table
		DefaultTableModel mode5 = (DefaultTableModel) table_2.getModel(); //delivery boy table
		DefaultTableModel mode6 = (DefaultTableModel) table_3.getModel(); //delivery boy table
		
		mode3.setRowCount(0);
		mode4.setRowCount(0);
		mode5.setRowCount(0);
		mode6.setRowCount(0);

		
		ArrayList<String> cname=new ArrayList<>();
		ArrayList<String> cuname=new ArrayList<>();
		
		cname = gets.getCompanyList().get("Name");
		cuname = gets.getCustomerData().get("Name");
		for(String nam : cname){
			textField.setText(nam);
			textField_1.setText(gets.getCustomCompany(1));
			textField_3.setText(gets.getCustomCompany(5));
			textField_4.setText(gets.getCustomCompany(4));
			textField_33.setText(gets.getCustomCompany(2));
		}
		
		for(String nam : cuname ){
			mode4.addRow(new Object[]{gets.getCustomCustomer(nam, 0),gets.getCustomCustomer(nam, 1),gets.getCustomCustomer(nam, 2),gets.getCustomCustomer(nam, 3),gets.getCustomCustomer(nam, 4),gets.getCustomCustomer(nam, 5)});
			comboBox_8.addItem(nam);
			comboBox_9.addItem(nam);
			comboBox_11.addItem(nam);
			comboBox_14.addItem(nam);
			comboBox_15.addItem(nam);
			comboBox_17.addItem(nam);
			comboBox_22.addItem(nam);
			
		}
		comboBox_18.removeAllItems();
		for(String nam : name){
			mode3.addRow(new Object[]{gets.getCustomEmployee(nam, 0),gets.getCustomEmployee(nam, 2),gets.getCustomEmployee(nam, 1),gets.getCustomEmployee(nam, 4),gets.getCustomEmployee(nam, 3)});
			comboBox_18.addItem(nam);
		}
		ArrayList<String> pids = new ArrayList<>();
		pids = gets.getCourierData().get("Name");
		for(String id : pids){
			comboBox_10.addItem(id);
			comboBox_16.addItem(id);
		}
		
		ArrayList<String> dnames = new ArrayList<>();
		dnames = gets.getDpData().get("Name");
		for(String namee : dnames){
			if(!(gets.getDpStatus(namee).equals("Off") || gets.getDpStatus(namee).equals("In Delivery"))){
			comboBox_5.addItem(namee);
			comboBox_13.addItem(namee);
			comboBox_19.addItem(namee);
			}
			mode5.addRow(new Object[]{namee,gets.getDpStatus(namee)});
			mode6.addRow(new Object[]{namee,gets.getDpStatus(namee)});
		}
	}
}

