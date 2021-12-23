package View;



/* ANOTAÇÕES PESSOAIS

 * Estou com dificuldades para implementar a classe de operações
 * Estou com dificuldades em fazer com que o valor 1 e 2 possam receber dezena, centena e milhar
 * Estou com dificuldades em implementar a virgula, parenteses e porcentagem
  
 */


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;


public class CalculadoraUser extends JFrame {
	
	Double valor1 = (double) 0, valor2= (double) 0, res = (double)0;
	String op="\u0000";

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraUser frame = new CalculadoraUser();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculadoraUser() {
		
		
		
		
		setTitle("Calculadora");
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 400);
		contentPane = new JPanel();
		contentPane.setAutoscrolls(true);
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[] {50, 50, 50, 50, 50, 50};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		contentPane.setLayout(gbl_contentPane);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Arial Black", Font.PLAIN, 14));
		textField.setBackground(Color.WHITE);
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridwidth = 4;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 0;
		contentPane.add(textField, gbc_textField);
		
		JButton c = new JButton("C");
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				valor1=(double) 0;
				valor2=(double) 0;
				op="\u0000";
				textField.setText("0");
				
				
				
				
			}
			
			
		});
		c.setFont(new Font("Arial Black", Font.PLAIN, 16));
		c.setBackground(Color.LIGHT_GRAY);
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_c = new GridBagConstraints();
		gbc_c.fill = GridBagConstraints.BOTH;
		gbc_c.insets = new Insets(0, 0, 5, 5);
		gbc_c.gridx = 0;
		gbc_c.gridy = 1;
		contentPane.add(c, gbc_c);
		
		JButton porcentagem = new JButton("%");
		porcentagem.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				op="%";
				textField.setText(valor1+op);
				
			}
		});
		porcentagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		porcentagem.setFont(new Font("Arial Black", Font.PLAIN, 16));
		porcentagem.setBackground(Color.LIGHT_GRAY);
		porcentagem.setActionCommand("");
		GridBagConstraints gbc_porcentagem = new GridBagConstraints();
		gbc_porcentagem.fill = GridBagConstraints.BOTH;
		gbc_porcentagem.insets = new Insets(0, 0, 5, 5);
		gbc_porcentagem.gridx = 1;
		gbc_porcentagem.gridy = 1;
		contentPane.add(porcentagem, gbc_porcentagem);
		
		JButton multiplicacao = new JButton("X");
		multiplicacao.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				op="x";
				textField.setText(valor1+op);
				
				
			}
		});
		multiplicacao.setFont(new Font("Arial Black", Font.PLAIN, 16));
		multiplicacao.setBackground(Color.LIGHT_GRAY);
		multiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_multiplicacao = new GridBagConstraints();
		gbc_multiplicacao.fill = GridBagConstraints.BOTH;
		gbc_multiplicacao.insets = new Insets(0, 0, 5, 5);
		gbc_multiplicacao.gridx = 2;
		gbc_multiplicacao.gridy = 1;
		contentPane.add(multiplicacao, gbc_multiplicacao);
		
		JButton divisao = new JButton("/");
		divisao.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				op="/";
				textField.setText(valor1+op);
				
				
			}
		});
		divisao.setFont(new Font("Arial Black", Font.PLAIN, 16));
		divisao.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_divisao = new GridBagConstraints();
		gbc_divisao.fill = GridBagConstraints.BOTH;
		gbc_divisao.insets = new Insets(0, 0, 5, 0);
		gbc_divisao.gridx = 3;
		gbc_divisao.gridy = 1;
		contentPane.add(divisao, gbc_divisao);
		
		JButton sete = new JButton("7");
		sete.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			if (op=="\u0000")
				
			{
					
				valor1=7.0;	
				
				textField.setText("7");
									
			}
			
			else {
				
				valor2=7.0;
				
				textField.setText("7");
				
				}
			
			
			
			
			}
		});
		sete.setFont(new Font("Arial Black", Font.PLAIN, 16));
		sete.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_sete = new GridBagConstraints();
		gbc_sete.fill = GridBagConstraints.BOTH;
		gbc_sete.insets = new Insets(0, 0, 5, 5);
		gbc_sete.gridx = 0;
		gbc_sete.gridy = 2;
		contentPane.add(sete, gbc_sete);
		
		JButton oito = new JButton("8");
		oito.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				if (op=="\u0000")
					
				{
						
					valor1=8.0;	
					
					textField.setText("8");
										
				}
				
				else {
					
					valor2=8.0;
					
					textField.setText("8");
					
					}
				
				
			}
		});
		oito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		oito.setFont(new Font("Arial Black", Font.PLAIN, 16));
		oito.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_oito = new GridBagConstraints();
		gbc_oito.fill = GridBagConstraints.BOTH;
		gbc_oito.insets = new Insets(0, 0, 5, 5);
		gbc_oito.gridx = 1;
		gbc_oito.gridy = 2;
		contentPane.add(oito, gbc_oito);
		
		JButton nove = new JButton("9");
		nove.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				if (op=="\u0000")
					
				{
						
					valor1=9.0;	
					
					textField.setText("9");
										
				}
				
				else {
					
					valor2=9.0;
					
					textField.setText("9");
					
					}
				
			}
		});
		nove.setFont(new Font("Arial Black", Font.PLAIN, 16));
		nove.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_nove = new GridBagConstraints();
		gbc_nove.fill = GridBagConstraints.BOTH;
		gbc_nove.insets = new Insets(0, 0, 5, 5);
		gbc_nove.gridx = 2;
		gbc_nove.gridy = 2;
		contentPane.add(nove, gbc_nove);
		
		JButton mais = new JButton("+");
		mais.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				op="+";
				textField.setText(valor1+op);
				
				
			}
		});
		mais.setFont(new Font("Arial Black", Font.PLAIN, 16));
		mais.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_mais = new GridBagConstraints();
		gbc_mais.fill = GridBagConstraints.BOTH;
		gbc_mais.insets = new Insets(0, 0, 5, 0);
		gbc_mais.gridx = 3;
		gbc_mais.gridy = 2;
		contentPane.add(mais, gbc_mais);
		
		JButton quatro = new JButton("4");
		quatro.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				if (op=="\u0000")
					
				{
						
					valor1=4.0;	
					
					textField.setText("4");
										
				}
				
				else {
					
					valor2=4.0;
					
					textField.setText("4");
					
					}
				
			}
		});
		quatro.setFont(new Font("Arial Black", Font.PLAIN, 16));
		quatro.setBackground(Color.LIGHT_GRAY);
		quatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_quatro = new GridBagConstraints();
		gbc_quatro.fill = GridBagConstraints.BOTH;
		gbc_quatro.insets = new Insets(0, 0, 5, 5);
		gbc_quatro.gridx = 0;
		gbc_quatro.gridy = 3;
		contentPane.add(quatro, gbc_quatro);
		
		JButton cinco = new JButton("5");
		cinco.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				if (op=="\u0000")
					
				{
						
					valor1=5.0;	
					
					textField.setText("5");
										
				}
				
				else {
					
					valor2=5.0;
					
					textField.setText("5");
					
					}
			}
		});
		cinco.setFont(new Font("Arial Black", Font.PLAIN, 16));
		cinco.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_cinco = new GridBagConstraints();
		gbc_cinco.fill = GridBagConstraints.BOTH;
		gbc_cinco.insets = new Insets(0, 0, 5, 5);
		gbc_cinco.gridx = 1;
		gbc_cinco.gridy = 3;
		contentPane.add(cinco, gbc_cinco);
		
		JButton seis = new JButton("6");
		seis.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				if (op=="\u0000")
					
				{
						
					valor1=6.0;	
					
					textField.setText("6");
										
				}
				
				else {
					
					valor2=6.0;
					
					textField.setText("6");
					
					}
				
			}
		});
		seis.setFont(new Font("Arial Black", Font.PLAIN, 16));
		seis.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_seis = new GridBagConstraints();
		gbc_seis.fill = GridBagConstraints.BOTH;
		gbc_seis.insets = new Insets(0, 0, 5, 5);
		gbc_seis.gridx = 2;
		gbc_seis.gridy = 3;
		contentPane.add(seis, gbc_seis);
		
		JButton dois = new JButton("2");
		dois.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (op=="\u0000")
					
				{
						
					valor1=2.0;	
					
					textField.setText("2");
										
				}
				
				else {
					
					valor2=2.0;
					
					textField.setText("2");
					
					}
				
			}
		});
		dois.setFont(new Font("Arial Black", Font.PLAIN, 16));
		dois.setBackground(Color.LIGHT_GRAY);
		dois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton menos = new JButton("-");
		menos.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				op = "-";
				textField.setText(valor1+op);
				
			}
		});
		menos.setFont(new Font("Arial Black", Font.PLAIN, 16));
		menos.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_menos = new GridBagConstraints();
		gbc_menos.fill = GridBagConstraints.BOTH;
		gbc_menos.insets = new Insets(0, 0, 5, 0);
		gbc_menos.gridx = 3;
		gbc_menos.gridy = 3;
		contentPane.add(menos, gbc_menos);
		
		JButton um = new JButton("1");
		um.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (op=="\u0000")
					
				{
						
					valor1=1.0;	
					
					textField.setText("1");
										
				}
				
				else {
					
					valor2=1.0;
					
					textField.setText("1");
					
					}
				
			}
		});
		um.setFont(new Font("Arial Black", Font.PLAIN, 16));
		um.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_um = new GridBagConstraints();
		gbc_um.fill = GridBagConstraints.BOTH;
		gbc_um.insets = new Insets(0, 0, 5, 5);
		gbc_um.gridx = 0;
		gbc_um.gridy = 4;
		contentPane.add(um, gbc_um);
		GridBagConstraints gbc_dois = new GridBagConstraints();
		gbc_dois.fill = GridBagConstraints.BOTH;
		gbc_dois.insets = new Insets(0, 0, 5, 5);
		gbc_dois.gridx = 1;
		gbc_dois.gridy = 4;
		contentPane.add(dois, gbc_dois);
		
		JButton tres = new JButton("3");
		tres.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				if (op=="\u0000")
					
				{
						
					valor1=3.0;	
					
					textField.setText("3");
										
				}
				
				else {
					
					valor2=3.0;
					
					textField.setText("3");
					
					}
				
			}
		});
		tres.setFont(new Font("Arial Black", Font.PLAIN, 16));
		tres.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_tres = new GridBagConstraints();
		gbc_tres.fill = GridBagConstraints.BOTH;
		gbc_tres.insets = new Insets(0, 0, 5, 5);
		gbc_tres.gridx = 2;
		gbc_tres.gridy = 4;
		contentPane.add(tres, gbc_tres);
		
		JButton virgula = new JButton(",");
		virgula.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			}
		});
		virgula.setFont(new Font("Arial Black", Font.PLAIN, 16));
		virgula.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_virgula = new GridBagConstraints();
		gbc_virgula.fill = GridBagConstraints.BOTH;
		gbc_virgula.insets = new Insets(0, 0, 5, 0);
		gbc_virgula.gridx = 3;
		gbc_virgula.gridy = 4;
		contentPane.add(virgula, gbc_virgula);
		
		JButton zero = new JButton("0");
		zero.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				if (op=="\u0000")
					
				{
						
					valor1=0.0;	
					
					textField.setText("0");
										
				}
				
				else {
					
					valor2=0.0;
					
					textField.setText("0");
					
					}
				
			}
		});
		zero.setFont(new Font("Arial Black", Font.PLAIN, 16));
		zero.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_zero = new GridBagConstraints();
		gbc_zero.fill = GridBagConstraints.BOTH;
		gbc_zero.insets = new Insets(0, 0, 0, 5);
		gbc_zero.gridx = 0;
		gbc_zero.gridy = 5;
		contentPane.add(zero, gbc_zero);
		
		JButton abreparenteses = new JButton("(");
		abreparenteses.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			}
		});
		abreparenteses.setFont(new Font("Arial Black", Font.PLAIN, 16));
		abreparenteses.setBackground(Color.LIGHT_GRAY);
		abreparenteses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_abreparenteses = new GridBagConstraints();
		gbc_abreparenteses.fill = GridBagConstraints.BOTH;
		gbc_abreparenteses.insets = new Insets(0, 0, 0, 5);
		gbc_abreparenteses.gridx = 1;
		gbc_abreparenteses.gridy = 5;
		contentPane.add(abreparenteses, gbc_abreparenteses);
		
		JButton fechaparenteses = new JButton(")");
		fechaparenteses.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			}
		});
		fechaparenteses.setFont(new Font("Arial Black", Font.PLAIN, 16));
		fechaparenteses.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_fechaparenteses = new GridBagConstraints();
		gbc_fechaparenteses.fill = GridBagConstraints.BOTH;
		gbc_fechaparenteses.insets = new Insets(0, 0, 0, 5);
		gbc_fechaparenteses.gridx = 2;
		gbc_fechaparenteses.gridy = 5;
		contentPane.add(fechaparenteses, gbc_fechaparenteses);
		
		JButton igualdade = new JButton("=");
		igualdade.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(op=="+") {
					
					res = valor1 + valor2;
					textField.setText(res.toString());
				}
					
				else if(op=="-") {
					
					
					res = valor1 - valor2;
					textField.setText(res.toString());
					
					
					
				}
				
				else if(op=="/") {
					if(valor2!=0) {
					
					res = valor1 / valor2;
					textField.setText(res.toString());
					
					}
					
					else {textField.setText("Não é possível dividir por zero");}
					
				     }
					
					
					else if(op=="x") {
						
						
						res = valor1 * valor2;
						textField.setText(res.toString());	
					
						
							}
					else if(op=="%"){
						
						textField.setText(op);
						
						
						
						
						
					}
				
				
				
					
					
				}
					
					
					
				
				
				
			
		});
		igualdade.setFont(new Font("Arial Black", Font.PLAIN, 16));
		igualdade.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_igualdade = new GridBagConstraints();
		gbc_igualdade.fill = GridBagConstraints.BOTH;
		gbc_igualdade.gridx = 3;
		gbc_igualdade.gridy = 5;
		contentPane.add(igualdade, gbc_igualdade);
		
		
	}
}