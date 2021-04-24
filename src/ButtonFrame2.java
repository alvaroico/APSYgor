import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
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

			CorridaDAO pdao = new CorridaDAO();
			Stack<String> STACK = new Stack<String>();
			for (Corrida p : pdao.read()) {
				STACK.push(p.getDescricao());
			};

			JList list = new JList(STACK);
			
			ListDialog dialog = new ListDialog("Selecione a volta para ver os detalhes: ", list);
			dialog.setOnOk(e -> System.out.println("Chosen item: " + dialog.getSelectedItem()));
			dialog.show();

			JOptionPane.showMessageDialog(ButtonFrame2.this, String.format("Você pressionou: %s", dialog.getSelectedItem()));


		}
	}
}