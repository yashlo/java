2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
80
81
82
83
84
85
86
87
88
89
90
91
92
93
94
95
96
97
98
99
100
101
102
103
104
105
106
107
108
109
110
111
112
113
114
115
116
117
118
119
120
121
122
123
124
125
126
127
128
129
130
131
132
133
134
135
136
137
138
139
140
141
142
143
144
145
146
147
148
149
150
151
152
153
154
155
156
157
158
159
160
161
162
163
164
165
166
167
168
169
170
171
172
173
174
175
176
177
178
179
180
181
182
183
184
185
186
187
188
189
190
191
192
193
194
195
196
197
198
199
200
201
202
203
204
205
206
207
208
209
210

import javax.swing.*;
import java.awt.event.*;


class Calc implements ActionListener
{
	JFrame f;
	JTextField t;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr;

	static double a=0,b=0,result=0;
	static int operator=0;

	Calc()
	{
		f=new JFrame("Calculator");
		t=new JTextField();
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		b0=new JButton("0");
		bdiv=new JButton("/");
		bmul=new JButton("*");
		bsub=new JButton("-");
		badd=new JButton("+");
		bdec=new JButton(".");
		beq=new JButton("=");
		bdel=new JButton("Delete");
		bclr=new JButton("Clear");

		t.setBounds(30,40,280,30);
		b7.setBounds(40,100,50,40);
		b8.setBounds(110,100,50,40);
		b9.setBounds(180,100,50,40);
		bdiv.setBounds(250,100,50,40);

		b4.setBounds(40,170,50,40);
		b5.setBounds(110,170,50,40);
		b6.setBounds(180,170,50,40);
		bmul.setBounds(250,170,50,40);

		b1.setBounds(40,240,50,40);
		b2.setBounds(110,240,50,40);
		b3.setBounds(180,240,50,40);
		bsub.setBounds(250,240,50,40);

		bdec.setBounds(40,310,50,40);
		b0.setBounds(110,310,50,40);
		beq.setBounds(180,310,50,40);
		badd.setBounds(250,310,50,40);

		bdel.setBounds(60,380,100,40);
		bclr.setBounds(180,380,100,40);

		f.add(t);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(bdiv);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(bmul);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(bsub);
		f.add(bdec);
		f.add(b0);
		f.add(beq);
		f.add(badd);
		f.add(bdel);
		f.add(bclr);

		f.setLayout(null);
		f.setVisible(true);
		f.setSize(350,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		badd.addActionListener(this);
		bdiv.addActionListener(this);
		bmul.addActionListener(this);
		bsub.addActionListener(this);
		bdec.addActionListener(this);
		beq.addActionListener(this);
		bdel.addActionListener(this);
		bclr.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
			t.setText(t.getText().concat("1"));

		if(e.getSource()==b2)
			t.setText(t.getText().concat("2"));

		if(e.getSource()==b3)
			t.setText(t.getText().concat("3"));

		if(e.getSource()==b4)
			t.setText(t.getText().concat("4"));

		if(e.getSource()==b5)
			t.setText(t.getText().concat("5"));

		if(e.getSource()==b6)
			t.setText(t.getText().concat("6"));

		if(e.getSource()==b7)
			t.setText(t.getText().concat("7"));

		if(e.getSource()==b8)
			t.setText(t.getText().concat("8"));

		if(e.getSource()==b9)
			t.setText(t.getText().concat("9"));

		if(e.getSource()==b0)
			t.setText(t.getText().concat("0"));

		if(e.getSource()==bdec)
			t.setText(t.getText().concat("."));

		if(e.getSource()==badd)
		{
			a=Double.parseDouble(t.getText());
			operator=1;
			t.setText("");
		}

		if(e.getSource()==bsub)
		{
			a=Double.parseDouble(t.getText());
			operator=2;
			t.setText("");
		}

		if(e.getSource()==bmul)
		{
			a=Double.parseDouble(t.getText());
			operator=3;
			t.setText("");
		}

		if(e.getSource()==bdiv)
		{
			a=Double.parseDouble(t.getText());
			operator=4;
			t.setText("");
		}

		if(e.getSource()==beq)
		{
			b=Double.parseDouble(t.getText());

			switch(operator)
			{
				case 1: result=a+b;
					break;

				case 2: result=a-b;
					break;

				case 3: result=a*b;
					break;

				case 4: result=a/b;
					break;

				default: result=0;
			}

			t.setText(""+result);
		}

		if(e.getSource()==bclr)
			t.setText("");

		if(e.getSource()==bdel)
		{
			String s=t.getText();
			t.setText("");
			for(int i=0;i<s.length()-1;i++)
			t.setText(t.getText()+s.charAt(i));
		}
	}

	public static void main(String...s)
	{
		new Calc();
	}
}