package me.railrunner16.lib.ui.components.console;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Console extends JPanel implements KeyListener {
    public static final long serialVersionUID = 1L;

    private JList<String> messages;
	private DefaultListModel<String> lModel = new DefaultListModel<>();

	private JTextField textInputField;
	private String text = null;

	public Console(int columns, String welcome) {
		super(new BorderLayout());

		this.textInputField = new JTextField(columns);
		this.textInputField.addKeyListener(this);
		this.textInputField.setVisible(false);
		this.add(this.textInputField, BorderLayout.PAGE_END);

		this.messages = new JList<String>(this.lModel);

		this.messages.setAutoscrolls(true);

		this.add(this.messages, BorderLayout.CENTER);
		this.sendMessage(welcome);
	}

	@Override
	public int getWidth() {
		return this.textInputField.getWidth();
	}

	@Override
	public int getHeight() {
		return this.textInputField.getHeight() + this.messages.getHeight();
	}

	public void sendMessage(String message) {
		this.lModel.addElement("> " + message);
	}

	public String promptString(String prompt) {
		try {
			this.sendMessage(prompt);

			this.textInputField.setVisible(true);

			while (this.text == null) Thread.sleep(500);

			return this.text;
		} catch (InterruptedException exception) {
			return "";
		}
	}
    
    @Override
    public void keyPressed(KeyEvent keyEvent) {}
    @Override
    public void keyTyped(KeyEvent keyEvent) {}

	@Override
	public void keyReleased(KeyEvent keyEvent) {
		switch(keyEvent.getKeyCode()) {
            case KeyEvent.VK_ENTER:
				String text = this.textInputField.getText();
				this.text = text;
				this.lModel.addElement("< " + text);
				this.textInputField.setVisible(false);
				break;
			default:
				break;
		}
	}
}