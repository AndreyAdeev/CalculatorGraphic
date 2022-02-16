import javax.swing.*;
import java.awt.event.*;   //подключаем нужные классы и пакеты


public class CalculatorGraphic implements ActionListener {
    JFrame frame; // задаем обхект "поле"
    JLabel label, label2; // задаем объекты для подписи текстовых окон
    JTextField text, result;  // задаем объект для текстовых окон
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdiv, bmul, bmin, bplu, bdec, beq, bdel, bclr; // задаем объекты для кнопок

    static double x = 0, y = 0;   // задаем переменные чисел
    static int operator = 0;   // задаем переменнкю для оператора

    CalculatorGraphic()
    {
        frame = new JFrame("Калькулятор");   // присваеваем объекту "поле" название
        label = new JLabel("Ввод данных:");  // присваеваем объекту лейбл название
        label2 = new JLabel("Результат:");   // присваеваем объекту лейбл название
        text = new JTextField();
        result = new JTextField();
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bdiv = new JButton("/");
        bmul = new JButton("*");
        bmin = new JButton("-");
        bplu = new JButton("+");
        bdec = new JButton(".");
        beq = new JButton("=");
        bdel = new JButton("Backspace");
        bclr = new JButton("C");           // присваеваем кнопкам название

        label.setBounds(30,20,200,30);
        label2.setBounds(250,20,100,30);
        text.setBounds(30,50,200,30);
        result.setBounds(250,50,100,30);
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
        bmin.setBounds(250,240,50,40);

        bdec.setBounds(40,310,50,40);
        b0.setBounds(110,310,50,40);
        beq.setBounds(180,310,50,40);
        bplu.setBounds(250,310,50,40);

        bdel.setBounds(60,380,100,40);
        bclr.setBounds(180,380,100,40);     // указываем размер и расположение объектов на "поле"

        frame.add(label);
        frame.add(label2);
        frame.add(text);
        frame.add(result);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(bdiv);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(bmul);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(bmin);
        frame.add(bdec);
        frame.add(b0);
        frame.add(beq);
        frame.add(bplu);
        frame.add(bdel);
        frame.add(bclr);     // размещаем объекты на поле

        frame.setLayout(null);  // ставим для "поля" абсалюное позиционирование
        frame.setVisible(true);  // отображаем окно "поля"
        frame.setSize(400,500);  // устанавливаем размер поля
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // остановка программы при закрытии "поля"
        frame.setResizable(false);     // запрет на изменение размера "поля"

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
        bplu.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        bmin.addActionListener(this);
        bdec.addActionListener(this);
        beq.addActionListener(this);
        bdel.addActionListener(this);
        bclr.addActionListener(this);      // регистрируем кнопки как источник событий(слушатели действия)
    }

    public void actionPerformed(ActionEvent e) {     // метод для работы с объектами событий

        if(e.getSource() == b1)      // ссылка на объект события и т.д.
            text.setText(text.getText().concat("1"));      // присвоение значения событию и т.д.

        if(e.getSource() == b2)
            text.setText(text.getText().concat("2"));

        if(e.getSource() == b3)
            text.setText(text.getText().concat("3"));

        if(e.getSource() == b4)
            text.setText(text.getText().concat("4"));

        if(e.getSource() == b5)
            text.setText(text.getText().concat("5"));

        if(e.getSource() == b6)
            text.setText(text.getText().concat("6"));

        if(e.getSource() == b7)
            text.setText(text.getText().concat("7"));

        if(e.getSource() == b8)
            text.setText(text.getText().concat("8"));

        if(e.getSource() == b9)
            text.setText(text.getText().concat("9"));

        if(e.getSource() == b0)
            text.setText(text.getText().concat("0"));

        if(e.getSource() == bdec)
            text.setText(text.getText().concat("."));

        if(e.getSource() == bplu) {
            x = Double.parseDouble(text.getText());
            operator = 1;
            text.setText("");     // вывод в текстовое поле при выполнении операции
            result.setText("" + x);
        }

        if(e.getSource() == bmin)
        {
            x = Double.parseDouble(text.getText());
            operator=2;
            text.setText("");
            result.setText("" + x);
        }

        if(e.getSource() == bmul)
        {
            x = Double.parseDouble(text.getText());
            operator = 3;
            text.setText("");
            result.setText("" + x);
        }

        if(e.getSource() == bdiv)
        {
            x = Double.parseDouble(text.getText());
            operator = 4;
            text.setText("");
            result.setText("" + x);
        }

        if(e.getSource() == beq) {
            y = Double.parseDouble(text.getText());

            switch(operator)         // сравнение операции сосписком
            {
                case 1: x = x + y;
                    break;

                case 2: x = x - y;
                    break;

                case 3: x = x * y;
                    break;

                case 4: x = x / y;
                    break;

                default: x = 0;
            }

            result.setText("" + x);
            text.setText("" + x);
        }

        if(e.getSource() == bclr) {
            text.setText("");
            result.setText("");
        }
        if(e.getSource() == bdel) {         // удаление введенных зачений в текстовое поле
            String s = text.getText();
            text.setText("");
            for(int i = 0; i < s.length()-1; i++)
                text.setText(text.getText()+s.charAt(i));
        }

    }

    public static void main(String...s)
    {
        new CalculatorGraphic();    // вызов конструктора
    }
}
