package show.lu.hu;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JiSuanGui extends Applet implements ActionListener {

	TextField FirstTF;
	TextField SecondTF;
	TextField ResultTF;
	Button addB;
	Button subB;
	Button mulB;
	Button divB;
	Button clearB;

	public void init() {
		
		Panel p = new Panel();
		Panel p1 = new Panel();
		Panel p2 = new Panel();

		Label FirstLabel = new Label("第一个数");
		Label SecondLabel = new Label("第二个数");
		Label ResultLabel = new Label("结       果");

		FirstTF = new TextField(10);
		SecondTF = new TextField(10);
		ResultTF = new TextField(10);

		addB = new Button("+");
		subB = new Button("-");
		mulB = new Button("*");
		divB = new Button("/");
		clearB = new Button("清空");

		p.setLayout(new BorderLayout());
		p1.setLayout(new GridLayout(3, 2));
		p2.setLayout(new GridLayout(1, 5));

		add(p);
		p.add(p1, BorderLayout.NORTH);
		p.add(p2, BorderLayout.SOUTH);

		p1.add(FirstLabel);
		p1.add(FirstTF);
		p1.add(SecondLabel);
		p1.add(SecondTF);
		p1.add(ResultLabel);
		p1.add(ResultTF);

		p2.add(addB);
		p2.add(subB);
		p2.add(mulB);
		p2.add(divB);
		p2.add(clearB);

		addB.addActionListener(this);
		subB.addActionListener(this);
		mulB.addActionListener(this);
		divB.addActionListener(this);
		clearB.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		double First = 0, Second = 0, Result = 0;
		First = Double.parseDouble(FirstTF.getText());
		Second = Double.parseDouble(SecondTF.getText());

		if (e.getSource() == addB)
			Result = First + Second;
		if (e.getSource() == subB)
			Result = First - Second;
		if (e.getSource() == mulB)
			Result = First * Second;

		if (e.getActionCommand().equals("/"))
			Result = First / Second;

		ResultTF.setText(String.valueOf(Result));

		if (e.getSource() == clearB) {
			FirstTF.setText("");
			SecondTF.setText("");
			ResultTF.setText("");
		}
	}
}
