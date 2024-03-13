package com.tictactoe;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TicCode extends Frame implements ActionListener
{
	Button b[]=new Button[9];
	int k=0,x=8,y=258,a=0;
	String player1;
	String player2;
	Button b1,b2,b3;
	int z=0,z1=0,z2=0,z3=0,z4=0,z5=0,z6=0,z7=0,z8=0;
	int l = 70;
	public TicCode()
	{
		setLayout(null);
		setVisible(true);
		setSize(800, 600);
		setBackground(Color.black);
		setForeground(Color.white);
		setLocation(400,100);

		Label area=new Label("Select One");
		area.setSize(150,40);
		area.setLocation(8,28);
		area.setFont(new Font("",Font.BOLD,20));
		area.setForeground(Color.white);
		add(area);

		b1= new Button("O");
		b1.setSize(150,40);
		b1.setLocation(8,100);
		b1.setFont(new Font("",Font.BOLD,20));
		b1.setForeground(Color.white);

		b2= new Button("X");
		b2.setSize(150,40);
		b2.setLocation(208,100);
		b2.setFont(new Font("",Font.BOLD,20));
		b2.setForeground(Color.white);

		add(b1);
		b1.addActionListener(this);
		add(b2);
		b2.addActionListener(this);


		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++) 
			{
				b[k]=new Button();
				b[k].setSize(100,100);
				b[k].setLocation(x,y);
				b[k].setFont(new Font("",Font.BOLD,40));
				add(b[k]);

				b[k].addActionListener(this);
				b[k].setBackground(new Color(255,141,28)); // ORANGE
				k++;
				x=x+100;
			}
			x=8;
			y=y+100;
		}
		b3 = new Button("New Game");
		b3.setSize(150,40);
		b3.setLocation(500,300);
		b3.setFont(new Font("",Font.BOLD,20));
		b3.setForeground(Color.white);

		add(b3);
		b3.addActionListener(this);

	}
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==b1)
		{
			if(player1==null)
			{

				player1="O";
				player2="X";
			}
		}
		if(e.getSource()==b2)
		{
			if(player1==null)
			{
				player2="O";
				player1="X";
			}
		}

		if(e.getSource()==b3)
		{
			for(int i=0;i<=8;i++)
			{
				b[i].setLabel("");
				z=0;z1=0;z2=0;z3=0;z4=0;z5=0;z6=0;z7=0;z8=0;
			}
			player1="";
			player2="";
		}
		if(e.getSource()==b[0] && z==0)
		{
			if(a%2==0)
			{
				b[0].setLabel(player1);
				a++;
				z++;
			}
			else {
				b[0].setLabel(player2);
				a++;
				z++;
			}
		}
		if(e.getSource()==b[1] && z1==0)
		{
			if(a%2==0)
			{
				b[1].setLabel(player1);
				a++;
				z++;
			}
			else {
				b[1].setLabel(player2);
				a++;
				z++;
			}
		}
		if(e.getSource()==b[2] && z2==0)
		{
			if(a%2==0)
			{
				b[2].setLabel(player1);
				a++;
				z++;
			}
			else {
				b[2].setLabel(player2);
				a++;
				z++;
			}
		}
		if(e.getSource()==b[3] && z3==0)
		{
			if(a%2==0)
			{
				b[3].setLabel(player1);
				a++;
				z++;
			}
			else {
				b[3].setLabel(player2);
				a++;
				z++;
			}
		}
		if(e.getSource()==b[4] && z4==0)
		{
			if(a%2==0)
			{
				b[4].setLabel(player1);
				a++;
				z++;
			}
			else {
				b[4].setLabel(player2);
				a++;
				z++;
			}
		}
		if(e.getSource()==b[5] && z5==0)
		{
			if(a%2==0)
			{
				b[5].setLabel(player1);
				a++;
				z++;
			}
			else {
				b[5].setLabel(player2);
				a++;
				z++;
			}
		}
		if(e.getSource()==b[6] && z6==0)
		{
			if(a%2==0)
			{
				b[6].setLabel(player1);
				a++;
				z++;
			}
			else {
				b[6].setLabel(player2);
				a++;
				z++;
			}
		}
		if(e.getSource()==b[7] && z7==0)
		{
			if(a%2==0)
			{
				b[7].setLabel(player1);
				a++;
				z++;
			}
			else {
				b[7].setLabel(player2);
				a++;
				z++;
			}
		}
		if(e.getSource()==b[8] && z8==0)
		{
			if(a%2==0)
			{
				b[8].setLabel(player1);
				a++;
				z++;
			}
			else {
				b[8].setLabel(player2);
				a++;
				z++;
			}
		}
		Font f = new Font("",Font.BOLD,20);
		if((b[0].getLabel()==b[1].getLabel() && b[0].getLabel()==b[2].getLabel()&& b[2].getLabel()==b[1].getLabel()))
		{
			if(b[0].getLabel()==player1)
			{

				Label p1 = new Label("Player 1 wins");
				p1.setSize(150,50);
				p1.setLocation(320,l);
				p1.setFont(f);
				add(p1);
				l+=50;

			}
			if(b[0].getLabel()==player2)
			{
				Label p1 = new Label("Player 2 wins");
				p1.setSize(150,50);
				p1.setLocation(320,l);
				p1.setFont(f);
				add(p1);
				l+=50;
			}
		}
		else if(b[3].getLabel()==b[4].getLabel() && b[3].getLabel()==b[5].getLabel()&& b[4].getLabel()==b[5].getLabel())
		{
			if(b[3].getLabel()==player1)
			{

				Label p1 = new Label("Player 1 wins");
				p1.setSize(150,50);
				p1.setLocation(420,l);
				p1.setFont(f);
				add(p1);
				l+=50;

			}
			if(b[3].getLabel()==player2)
			{
				Label p1 = new Label("Player 2 wins");
				p1.setSize(150,50);
				p1.setLocation(320,l);
				p1.setFont(f);
				add(p1);
				l+=50;
			}
		}
		else if(b[0].getLabel()==b[3].getLabel() && b[0].getLabel()==b[6].getLabel()&& b[3].getLabel()==b[6].getLabel())

		{

			if(b[3].getLabel()==player1)
			{

				Label p1 = new Label("Player 1 wins");
				p1.setSize(150,50);
				p1.setLocation(320,l);
				p1.setFont(f);
				add(p1);
				l+=50;

			}
			if(b[3].getLabel()==player2)
			{
				Label p1 = new Label("Player 2 wins");
				p1.setSize(150,50);
				p1.setLocation(320,l);
				p1.setFont(f);
				add(p1);
				l+=50;
				
			}
		}
		else if(b[6].getLabel()==b[7].getLabel() && b[6].getLabel()==b[8].getLabel()&& b[7].getLabel()==b[8].getLabel())
		{

			if(b[6].getLabel()==player1)
			{

				Label p1 = new Label("Player 1 wins");
				p1.setSize(150,50);
				p1.setLocation(320,l);
				p1.setFont(f);
				add(p1);
				l+=50;

			}
			if(b[6].getLabel()==player2)
			{
				Label p1 = new Label("Player 2 wins");
				p1.setSize(150,50);
				p1.setLocation(320,l);
				p1.setFont(f);
				add(p1);
				l+=50;
			}
		}
		else if(b[7].getLabel()==b[1].getLabel() && b[7].getLabel()==b[4].getLabel()&& b[4].getLabel()==b[1].getLabel())
		{
			if(b[1].getLabel()==player1)
			{

				Label p1 = new Label("Player 1 wins");
				p1.setSize(150,50);
				p1.setLocation(320,l);
				p1.setFont(f);
				add(p1);
				l+=50;

			}
			if(b[7].getLabel()==player2)
			{
				Label p1 = new Label("Player 2 wins");
				p1.setSize(150,50);
				p1.setLocation(320,l);
				p1.setFont(f);
				add(p1);
				l+=50;
			}
		}
		else if(b[2].getLabel()==b[5].getLabel() && b[2].getLabel()==b[8].getLabel()&& b[5].getLabel()==b[8].getLabel())
		{
			if(b[2].getLabel()==player1)
			{

				Label p1 = new Label("Player 1 wins");
				p1.setSize(150,50);
				p1.setLocation(320,l);
				p1.setFont(f);
				add(p1);
				l+=50;

			}
			if(b[2].getLabel()==player2)
			{
				Label p1 = new Label("Player 2 wins");
				p1.setSize(150,50);
				p1.setLocation(320,l);
				p1.setFont(f);
				add(p1);
				l+=50;
			}
		}
		else if(b[0].getLabel()==b[4].getLabel() && b[0].getLabel()==b[8].getLabel()&& b[4].getLabel()==b[8].getLabel())
		{
			if(b[4].getLabel()==player1)
			{

				Label p1 = new Label("Player 1 wins");
				p1.setSize(150,50);
				p1.setLocation(320,l);
				p1.setFont(f);
				add(p1);
				l+=50;

			}
			if(b[0].getLabel()==player2)
			{
				Label p1 = new Label("Player 2 wins");
				p1.setSize(150,50);
				p1.setLocation(320,l);
				p1.setFont(f);
				add(p1);
				l+=50;
			}
		}
		else if(b[2].getLabel()==b[6].getLabel() && b[4].getLabel()==b[2].getLabel()&& b[4].getLabel()==b[6].getLabel())
		{
			if(b[2].getLabel()==player1)
			{

				Label p1 = new Label("Player 1 wins");
				p1.setSize(150,50);
				p1.setLocation(320,l);
				p1.setFont(f);
				add(p1);
				l+=50;

			}
			if(b[6].getLabel()==player2)
			{
				Label p1 = new Label("Player 2 wins");
				p1.setSize(150,50);
				p1.setLocation(320,l);
				p1.setFont(f);
				add(p1);
				l+=50;
			}
		}
	}
} 

public class TicTacToe {
	public static void main(String[] args) {
		TicCode code=new TicCode();
	}
}
