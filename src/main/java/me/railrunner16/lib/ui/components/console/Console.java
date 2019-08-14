package me.railrunner16.lib.ui.components.console;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Console extends JPanel {
    public static final long serialVersionUID = 1L;

    private JList<String> messages;
    private DefaultListModel<String> lModel = new DefaultListModel<>();
	
	public JTextField textInput = new JTextField(10);
	private TextInputListener textInputListener;
	private JPanel textInputPanel = new JPanel(new FlowLayout());
	
	public ConsoleListener listener = null;

    public Console(String welcomeMessage) {
		super(new BorderLayout());

		this.textInputListener = new TextInputListener(this);
		
		this.sendMessage(welcomeMessage);
        this.messages = new JList<>(this.lModel);

		this.add(this.messages, BorderLayout.CENTER);
    }

	public void sendMessage(String message) {
		this.lModel.addElement("> " + message);
	}

	public void sendIn(String message) {
		this.lModel.addElement("< " + message);
	}

	public void promptString(String prompt, String label) {
		this.textInput.addActionListener(this.textInputListener);
		this.textInput.setActionCommand(label);

		this.textInputPanel.add(new JLabel(prompt));
		this.textInputPanel.add(this.textInput);
		this.add(this.textInputPanel, BorderLayout.PAGE_END);
	}

	public void setConsoleListener(ConsoleListener listener) {
		this.listener = listener;
	}

	private class TextInputListener implements ActionListener {
		private Console vc;

		public TextInputListener(Console vc) {
			this.vc = vc;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (this.vc.listener != null) {
				String text = this.vc.textInput.getText();

				String label = e.getActionCommand();

				this.vc.listener.textInputGiven(text, label);

				this.vc.sendIn(text);
			}

			this.vc.textInputPanel.setVisible(false);
		}
	}
}