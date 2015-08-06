/*Programming by zlzsam*/
package com.example.calculatorpro;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class MainActivity extends Activity implements View.OnClickListener {
	private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
	private Button btn_add, btn_reduce, btn_clear, btn_cheng, btn_chu, btn_point, btn_quxiao;
	private Button btn_equal, btn_qufan, btn_kaifang, btn_kaigen, btn_qiudao, btn_qingkong;
	private EditText et;
	private boolean needclear;
	String str;
	double result;
	int point_signal = 0;
	int first_reduce = 0;
	char first_op = 0;
	int count=0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn0 = (Button) findViewById(R.id.btnzero);
		btn1 = (Button) findViewById(R.id.btnone);
		btn2 = (Button) findViewById(R.id.btntwo);
		btn3 = (Button) findViewById(R.id.btnthree);
		btn4 = (Button) findViewById(R.id.btnfour);
		btn5 = (Button) findViewById(R.id.btnfive);
		btn6 = (Button) findViewById(R.id.btnsix);
		btn7 = (Button) findViewById(R.id.btnseven);
		btn8 = (Button) findViewById(R.id.btneight);
		btn9 = (Button) findViewById(R.id.btnnine);
		btn_add = (Button) findViewById(R.id.markadd);
		btn_cheng = (Button) findViewById(R.id.markcheng);
		btn_chu = (Button) findViewById(R.id.markchu);
		btn_clear = (Button) findViewById(R.id.markclear);
		btn_equal = (Button) findViewById(R.id.markequal);
		btn_point = (Button) findViewById(R.id.markpoint);
		btn_reduce = (Button) findViewById(R.id.markreduce);
		btn_kaifang = (Button) findViewById(R.id.markkaifang);
		btn_kaigen = (Button) findViewById(R.id.markkaigen);
		btn_qiudao = (Button) findViewById(R.id.markqiudao);
		btn_quxiao = (Button) findViewById(R.id.markquxiao);
		btn_qufan = (Button) findViewById(R.id.markqufan);
		btn_qingkong = (Button) findViewById(R.id.markqingkong);
		et = (EditText) findViewById(R.id.edittext2_show);
		btn0.setOnClickListener(this);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		btn3.setOnClickListener(this);
		btn4.setOnClickListener(this);
		btn5.setOnClickListener(this);
		btn6.setOnClickListener(this);
		btn7.setOnClickListener(this);
		btn8.setOnClickListener(this);
		btn9.setOnClickListener(this);
		btn_add.setOnClickListener(this);
		btn_reduce.setOnClickListener(this);
		btn_cheng.setOnClickListener(this);
		btn_chu.setOnClickListener(this);
		btn_clear.setOnClickListener(this);
		btn_qingkong.setOnClickListener(this);
		btn_quxiao.setOnClickListener(this);
		btn_qufan.setOnClickListener(this);
		btn_kaigen.setOnClickListener(this);
		btn_kaifang.setOnClickListener(this);
		btn_equal.setOnClickListener(this);
		btn_point.setOnClickListener(this);
		btn_qiudao.setOnClickListener(this);

	}

	@Override
	public void onClick(View view) {
		str = et.getText().toString();
		switch (view.getId()) {
			case R.id.btnzero:
				if (needclear)
					point_signal = 0;
				if (needclear || str.equals(" ") || str.equals("0") || str.equals("infinity")) {
					str = "";

				}
				needclear = false;
				et.setText(str + ((Button) view).getText());

				break;
			case R.id.btnone:
				if (needclear)
					point_signal = 0;
				if (needclear || str.equals(" ")  || str.equals("0")|| str.equals("infinity")) {
					str = "";
				}
				needclear = false;
				et.setText(str + ((Button) view).getText());

				break;
			case R.id.btntwo:
				if (needclear)
					point_signal = 0;
				if (needclear || str.equals(" ") || str.equals("0") || str.equals("infinity")) {
					str = "";
				}
				needclear = false;
				et.setText(str + ((Button) view).getText());

				break;
			case R.id.btnthree:
				if (needclear)
					point_signal = 0;
				if (needclear || str.equals(" ")  || str.equals("0")|| str.equals("infinity")) {
					str = "";
				}
				needclear = false;
				et.setText(str + ((Button) view).getText());

				break;
			case R.id.btnfour:
				if (needclear)
					point_signal = 1;
				if (needclear || str.equals(" ")  || str.equals("0")|| str.equals("infinity")) {
					str = "";
				}
				needclear = false;
				et.setText(str + ((Button) view).getText());

				break;

			case R.id.btnfive:
				if (needclear)
					point_signal = 0;
				if (needclear || str.equals("0")||str.equals(" ") || str.equals("infinity")) {
					str = "";
				}
				needclear = false;
				et.setText(str + ((Button) view).getText());

				break;

			case R.id.btnsix:
				if (needclear)
					point_signal = 0;
				if (needclear || str.equals(" ")  || str.equals("0")|| str.equals("infinity")) {
					str = "";
				}
				needclear = false;
				et.setText(str + ((Button) view).getText());

				break;
			case R.id.btnseven:
				if (needclear)
					point_signal = 0;
				if (needclear || str.equals(" ")  || str.equals("0")|| str.equals("infinity")) {
					str = "";
				}
				needclear = false;
				et.setText(str + ((Button) view).getText());
				break;
			case R.id.btneight:
				if (needclear)
					point_signal = 0;
				if (needclear || str.equals(" ") || str.equals("0") || str.equals("infinity")) {
					str = "";
				}
				needclear = false;
				et.setText(str + ((Button) view).getText());

				break;
			case R.id.btnnine:
				if (needclear)
					point_signal = 0;
				if (needclear || str.equals(" ") || str.equals("0") ) {
					str = "";
				}
				needclear = false;
				et.setText(str + ((Button) view).getText());

				break;
			case R.id.markpoint:
				if(point_signal==0){
					point_signal++;
				}
				if (point_signal == 1)
				{
					et.setText(str + ((Button) view).getText());
					count++;
				}
				else et.setText(str);
				point_signal++;
				needclear = false;
				break;
			case R.id.markadd:
				if (str.equals("infinity") || str.equals("")) {
					et.setText(" ");
					break;
				}
				if (str.charAt(str.length() - 1) == ('+') || str.charAt(str.length() - 1) == ('/')
						|| str.charAt(str.length() - 1) == ('-') || str.charAt(str.length() - 1) == ('x'))
					et.setText(str);
				else
					et.setText(str + "+");
				first_reduce++;
				if (first_reduce == 1)
					first_op = '+';
				needclear = false;
				point_signal = 0;
				break;
			case R.id.markreduce:
				if (str.equals("infinity") || str.equals("")) {
					et.setText(" ");
					break;
				}
				if (str.charAt(str.length() - 1) == ('-'))
					et.setText(str);
				else et.setText(str + "-");
				first_reduce++;
				if (first_reduce == 1)
					first_op = '-';
				needclear = false;
				point_signal = 0;
				break;
			case R.id.markcheng:
				if (str.charAt(str.length() - 1) == ('+') || str.charAt(str.length() - 1) == ('/')
						|| str.charAt(str.length() - 1) == ('x') || str.charAt(str.length() - 1) == ('-'))
					et.setText(str);
				else et.setText(str + "x");
				first_reduce++;
				if (first_reduce == 1)
					first_op = 'x';
				needclear = false;
				point_signal = 0;
				break;
			case R.id.markchu:
				if ( str.equals("")) {
					et.setText(" ");
					break;
				}
				if (str.charAt(str.length() - 1) == ('+') || str.charAt(str.length() - 1) == ('/') ||
						str.charAt(str.length() - 1) == ('x') || str.charAt(str.length() - 1) == ('-'))
					et.setText(str);
				else et.setText(str + "/");
				first_reduce++;
				if (first_reduce == 1)
					first_op = '/';
				needclear = false;
				point_signal = 0;
				break;
			case R.id.markqufan:
				if (str.equals("0")) {
					et.setText("0");
					needclear=true;
					break;
				}
				if (view != btn_point && str != "") {
					char ch = str.charAt(0);
					if (ch == '-')
						str = str.replaceFirst("-", "");
					else str = "-" + str;
					et.setText(str);
				}
				needclear = true;
				break;
			case R.id.markquxiao:
				char delete;
				if (str.equals("0")) {
					et.setText("0");
					break;
				}
				delete = str.charAt(str.length() - 1);
				if (str.length() == 1) {
					et.setText("0");
				} else {
					str = str.substring(0, str.length() - 1);
					et.setText(str);
				}
				needclear = false;
				if (delete == '.') {
					 point_signal=0;
					  count--;
				} else if( (delete=='+'||delete=='-'||delete=='x'||delete=='/'))
				  {   if(str.contains("."))
						  point_signal=2;
					  else point_signal=0;
					  first_reduce=0;
				   }
				else if (count==0){
					point_signal=0;
				}

				break;
			case R.id.markqiudao:
				if(str.equals("0")){
					Toast.makeText(this,"error",Toast.LENGTH_SHORT).show();
					et.setText("0");
					break;
				}
				Double d = Double.parseDouble(str);
				Double s = 1.0 / d;
				str = "" + s.toString();
				et.setText(format(new BigDecimal(str)));
				needclear = true;
				if (str.contains(".")) {
					point_signal = 2;
				} else point_signal = 0;
				break;
			case R.id.markkaigen:
				if (str.equals("0")) {
					et.setText("0");
					break;
				}
				if (str != "") {
					double temp = Double.parseDouble(str);
					str = Math.sqrt(temp) + "";
					et.setText(format(new BigDecimal(str)));

				}
				needclear = true;
				if (str.contains(".")) {
					point_signal = 2;
				} else point_signal = 0;
				break;
			case R.id.markkaifang:
				if (str.equals("0")) {
					et.setText("0");
					break;
				}
				if (str != "") {
					double temp = Double.parseDouble(str);
					str = "" + temp * temp;
					et.setText(format(new BigDecimal(str)));
				}
				needclear = true;
				if (str.contains("."))
					point_signal = 2;
				else point_signal=0;
				break;
			case R.id.markclear:
				et.setText("0");
				point_signal = 0;
				needclear = false;
				first_op=0;
				first_reduce=0;
				break;
			case R.id.markqingkong:
				et.setText("0");
				point_signal = 0;
				needclear = false;
				first_op=0;
				break;
			case R.id.markequal:
				String exp = et.getText().toString();
				if (str.equals("0")) {
					et.setText("0");
					break;
				}
				int a = 0;
				int i = 0;
				if (exp.charAt(0) == '-' && (first_op == '-' && first_reduce == 1)) {
					for (i = 1; i < exp.length(); i++) {
						char e = exp.charAt(i);
						if (e == '-')
							break;

					}
					a = i;
				} else {

					a = exp.indexOf(first_op);
				}
				if (a == exp.length() - 1 || first_op == 0) {
					et.setText(str);
					break;
				}
				String s1 = exp.substring(0, a);
				String s2 = exp.substring(a + 1);
				DecimalFormat formatWithoutFraction = new DecimalFormat("###");
				DecimalFormat formatWithFraction = new DecimalFormat("###.##########");
				double num1 = Double.parseDouble(s1);
				double num2 = Double.parseDouble(s2);
				if(num2==0&&first_op=='/') {
					et.setText("0");
					Toast.makeText(this,"error",Toast.LENGTH_SHORT).show();
					break;
				}
				switch (first_op) {
					case '+':
						result = num1 + num2;
						break;
					case '-':
						result = num1 - num2;
						break;
					case 'x':
						result = num1 * num2;
						break;
					case '/':
						result = num1 / num2;
						break;

				}
				first_op = 0;
				et.setText(format(new BigDecimal(result+"")));
				needclear = true;
				first_reduce = 0;
				if (et.getText().toString().contains(".")) {
					point_signal = 2;
				} else
					point_signal = 0;
		}

	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public String format(BigDecimal var) {

		DecimalFormat formatWithoutFraction = new DecimalFormat("###");
		DecimalFormat formatWithFraction = new DecimalFormat("###.##########");
		if (new BigDecimal(var.intValue()).compareTo(var) == 0) {
			return formatWithoutFraction.format(var);
		}
		return formatWithFraction.format(var);
	}
}








