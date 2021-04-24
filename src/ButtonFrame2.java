package src;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonFrame2 extends JFrame{

	private JButton botaoPrata;
	private JButton botaoOuro;

	//BUTTONFRAME ADICIONA JBUTTONS AO JFRAME
	public ButtonFrame2()
	{
		super("Testando Botões");
		setLayout(new FlowLayout()); //CONFIGURA O LAYOUT DE FRAME

		botaoPrata = new JButton("Prata"); //BOTÃO COM TEXTO
		add(botaoPrata); //ADICIONA botaoPrata AO JFRAME

		botaoOuro = new JButton("Ouro");
		add(botaoOuro); //ADICIONA botaoOuro AO JFRAME

		//CRIA NOVO BUTTON HANDLER PARA TRATAMENTO DE EVENTO DE BOTÃO
		ButtonHandler handler = new ButtonHandler();
		botaoOuro.addActionListener(handler);
		botaoPrata.addActionListener(handler);

	}

	//CLASSE INTERNA PARA TRATAMENTO DO BOTÃO
	public class ButtonHandler implements ActionListener
	{
		//TRATA EVENTO DO BOTÃO
		public void actionPerformed(ActionEvent event)
		{

			ProdutoDAO pdao = new ProdutoDAO();

			for (Produto p : pdao.read()) {

			JOptionPane.showMessageDialog(ButtonFrame2.this, String.format("Você pressionou: %s", p.getId()));

	
				// modelo.addRow(new Object[]{
				// 	p.getId(),
				// 	p.getDescricao(),
				// 	p.getQtd(),
				// 	p.getPreco()
				// });
	
			}

		}
	}
}