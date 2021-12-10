import searchArm.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.Locale;

public class Armatura extends JFrame {

//public class Armatura extends JWindow {

    private JPanel contentPane;
    private JButton НАЧАТЬПОИСКАРМАТУРЫButton;
    private JTextField textField1DN;
    private JTextField PNTextField;
    private JRadioButton проходнаяRadioButton;
    private JRadioButton угроловаяRadioButton;
    private JTextArea textAreaResultsSearchArm;
    private JRadioButton межфланцеваяRadioButton;
    private JRadioButton подПриваркуRadioButton;
    private JRadioButton фланцеваяRadioButton;
    private JRadioButton муфтоваяRadioButton;
    private JRadioButton штуцернаяRadioButton;
    private JRadioButton цапковаяRadioButton;
    private JRadioButton бронзаRadioButton;
    private JRadioButton стальRadioButton;
    private JRadioButton нержСтальRadioButton;
    private JRadioButton чугунRadioButton;
    private JRadioButton чугунСШарГрафRadioButton;
    private JRadioButton латуньRadioButton;
    private JRadioButton radioButtonНожеваяЗадвижка;
    private JRadioButton radioButton1Задвижка;
    private JRadioButton radioButton2Бабочка;
    private JRadioButton radioButtonNewozr;
    private JRadioButton radioButton4НевозвратноЗапорная;
    private JRadioButton radioButton5Обратный;
    private JRadioButton radioButton6ЗапорнаяССильфонупл;
    private JRadioButton radioButton7Запорная;
    private JButton памяткаButton;
    private JRadioButton самозапорнаяRadioButton;
    private JRadioButton шароваяRadioButton;
    private JRadioButton фильтрRadioButton;

//
//    private JButton buttonOK;
//    private JButton buttonCancel;

//    List<CreateArmature> searchResult;

    public Armatura() {

        setTitle("Супер поиск арматуры от Zemliakov Incorporated");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// при выходе на кретсик закроется
        this.setBounds(600, 300, 500, 400);
        setContentPane(contentPane);


        НАЧАТЬПОИСКАРМАТУРЫButton.addActionListener(new ButtonEveLists());
        памяткаButton.addActionListener(new ReferencePaneButton());
        textAreaResultsSearchArm.setEditable(false);

    }

    private static String typeOfUse;// тип использования

    private static String connectionType;// тип соединения

    private static String bodyComposition;


    private static String typeOfConstruction;// Конструкция (проход/угл)


    // Cоздать с помощью этих переменных алгоритм где в фильтре ЛИСТА valvesList
    // ЭТИ ПЕРЕМЕННЫЕ будут заменять значения для поиска
    //
    //
    public void selectedCharacteristics() {


        if (бронзаRadioButton.isSelected()) {
            bodyComposition = "Бронза";
        } else if (стальRadioButton.isSelected()) {
            bodyComposition = "Сталь";
        } else if (нержСтальRadioButton.isSelected()) {
            bodyComposition = "Нерж. сталь";
        } else if (чугунRadioButton.isSelected()) {
            bodyComposition = "Чугун";
        } else if (чугунСШарГрафRadioButton.isSelected()) {
            bodyComposition = "Чугун с шар. граф.";
        } else if (латуньRadioButton.isSelected()) {
            bodyComposition = "Латунь";
        }

        if (radioButton7Запорная.isSelected()) {
            typeOfUse = "Запорный";
        } else if (radioButton6ЗапорнаяССильфонупл.isSelected()) {
            typeOfUse = "Запорный с сильфонным уплотнением";
        } else if (radioButton5Обратный.isSelected()) {
            typeOfUse = "Обратный";
        } else if (radioButton4НевозвратноЗапорная.isSelected()) {
            typeOfUse = "Невозвратно-запорный";
        } else if (radioButtonNewozr.isSelected()) {
            typeOfUse = "Невозвратно-приёмный";
        } else if (radioButton2Бабочка.isSelected()) {
            typeOfUse = "Поворотный";
        } else if (radioButton1Задвижка.isSelected()) {
            typeOfUse = "Задвижка";
        } else if (radioButtonНожеваяЗадвижка.isSelected()) {
            typeOfUse = "Ножевая задвижка";
        }

        if (фланцеваяRadioButton.isSelected()) {
            connectionType = "Фланцевое";
        } else if (межфланцеваяRadioButton.isSelected()) {
            connectionType = "Межфланцевое";
        } else if (муфтоваяRadioButton.isSelected()) {
            connectionType = "Муфтовое";
        } else if (штуцернаяRadioButton.isSelected()) {
            connectionType = "Штуцерная";
        } else if (цапковаяRadioButton.isSelected()) {
            connectionType = "Цапковое";
        } else if (подПриваркуRadioButton.isSelected()) {
            connectionType = "Под приварку";
        }

        if (проходнаяRadioButton.isSelected()) {
            typeOfConstruction = "Проходной";
        } else if (угроловаяRadioButton.isSelected()) {
            typeOfConstruction = "Угловой";
        }


    }


    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        contentPane = new JPanel();
        contentPane.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 3, new Insets(10, 10, 10, 10), -1, -1));
        contentPane.setAutoscrolls(false);
        contentPane.setBackground(new Color(-13948117));
        contentPane.setEnabled(false);
        contentPane.setForeground(new Color(-4515545));
        contentPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel1.setBackground(new Color(-13948117));
        panel1.setForeground(new Color(-12828863));
        contentPane.add(panel1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel2.setBackground(new Color(-13948117));
        panel2.setForeground(new Color(-2236190));
        panel1.add(panel2, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel2.setBorder(BorderFactory.createTitledBorder(null, "Тип арматуры", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, new Color(-5262925)));
        НАЧАТЬПОИСКАРМАТУРЫButton = new JButton();
        НАЧАТЬПОИСКАРМАТУРЫButton.setBackground(new Color(-8766131));
        НАЧАТЬПОИСКАРМАТУРЫButton.setEnabled(true);
        Font НАЧАТЬПОИСКАРМАТУРЫButtonFont = this.$$$getFont$$$(null, -1, -1, НАЧАТЬПОИСКАРМАТУРЫButton.getFont());
        if (НАЧАТЬПОИСКАРМАТУРЫButtonFont != null) НАЧАТЬПОИСКАРМАТУРЫButton.setFont(НАЧАТЬПОИСКАРМАТУРЫButtonFont);
        НАЧАТЬПОИСКАРМАТУРЫButton.setForeground(new Color(-328193));
        НАЧАТЬПОИСКАРМАТУРЫButton.setHideActionText(false);
        НАЧАТЬПОИСКАРМАТУРЫButton.setText("НАЧАТЬ ПОИСК АРМАТУРЫ");
        panel2.add(НАЧАТЬПОИСКАРМАТУРЫButton, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 7, new Insets(0, 0, 0, 0), -1, -1));
        panel3.setBackground(new Color(-13948117));
        panel2.add(panel3, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel4.setBackground(new Color(-13948117));
        panel3.add(panel4, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel4.setBorder(BorderFactory.createTitledBorder(null, "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, this.$$$getFont$$$(null, -1, -1, panel4.getFont()), null));
        final JPanel panel5 = new JPanel();
        panel5.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel5.setBackground(new Color(-13948117));
        panel4.add(panel5, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JLabel label1 = new JLabel();
        label1.setBackground(new Color(-2236190));
        label1.setEnabled(true);
        label1.setForeground(new Color(-2236190));
        label1.setText("мин. PN");
        panel5.add(label1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel6 = new JPanel();
        panel6.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel6.setBackground(new Color(-13948117));
        panel6.putClientProperty("html.disable", Boolean.FALSE);
        panel4.add(panel6, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JLabel label2 = new JLabel();
        label2.setBackground(new Color(-2236190));
        label2.setForeground(new Color(-2236190));
        label2.setText("DN");
        panel6.add(label2, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_EAST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel7 = new JPanel();
        panel7.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel7.setBackground(new Color(-13948117));
        panel4.add(panel7, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 2, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        textField1DN = new JTextField();
        panel7.add(textField1DN, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        PNTextField = new JTextField();
        panel7.add(PNTextField, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(50, -1), null, 0, false));
        final JPanel panel8 = new JPanel();
        panel8.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(4, 2, new Insets(0, 0, 0, 0), -1, -1));
        panel8.setBackground(new Color(-13948117));
        panel3.add(panel8, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        final JPanel panel9 = new JPanel();
        panel9.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(6, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel9.setBackground(new Color(-13948117));
        panel9.setForeground(new Color(-12500931));
        panel8.add(panel9, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 4, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel9.setBorder(BorderFactory.createTitledBorder(null, "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        фланцеваяRadioButton = new JRadioButton();
        фланцеваяRadioButton.setBackground(new Color(-13948117));
        фланцеваяRadioButton.setForeground(new Color(-2236190));
        фланцеваяRadioButton.setText("Фланцевая");
        panel9.add(фланцеваяRadioButton, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        подПриваркуRadioButton = new JRadioButton();
        подПриваркуRadioButton.setBackground(new Color(-13948117));
        подПриваркуRadioButton.setForeground(new Color(-2236190));
        подПриваркуRadioButton.setText("Под приварку");
        panel9.add(подПриваркуRadioButton, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        межфланцеваяRadioButton = new JRadioButton();
        межфланцеваяRadioButton.setBackground(new Color(-13948117));
        межфланцеваяRadioButton.setForeground(new Color(-2236190));
        межфланцеваяRadioButton.setText("Межфланцевая");
        panel9.add(межфланцеваяRadioButton, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        муфтоваяRadioButton = new JRadioButton();
        муфтоваяRadioButton.setBackground(new Color(-13948117));
        муфтоваяRadioButton.setForeground(new Color(-2236190));
        муфтоваяRadioButton.setText("Муфтовая");
        panel9.add(муфтоваяRadioButton, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        штуцернаяRadioButton = new JRadioButton();
        штуцернаяRadioButton.setBackground(new Color(-13948117));
        штуцернаяRadioButton.setForeground(new Color(-2236190));
        штуцернаяRadioButton.setText("Штуцерная");
        panel9.add(штуцернаяRadioButton, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        цапковаяRadioButton = new JRadioButton();
        цапковаяRadioButton.setBackground(new Color(-13948117));
        цапковаяRadioButton.setForeground(new Color(-2236190));
        цапковаяRadioButton.setText("Цапковая");
        panel9.add(цапковаяRadioButton, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel10 = new JPanel();
        panel10.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel10.setBackground(new Color(-13948117));
        panel10.setForeground(new Color(-12500931));
        panel3.add(panel10, new com.intellij.uiDesigner.core.GridConstraints(0, 4, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel10.setBorder(BorderFactory.createTitledBorder(null, "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        проходнаяRadioButton = new JRadioButton();
        проходнаяRadioButton.setBackground(new Color(-13948117));
        проходнаяRadioButton.setForeground(new Color(-2236190));
        проходнаяRadioButton.setText("Проходная");
        panel10.add(проходнаяRadioButton, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        угроловаяRadioButton = new JRadioButton();
        угроловаяRadioButton.setBackground(new Color(-13948117));
        угроловаяRadioButton.setForeground(new Color(-2236190));
        угроловаяRadioButton.setText("Угроловая");
        panel10.add(угроловаяRadioButton, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel11 = new JPanel();
        panel11.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel11.setBackground(new Color(-13948117));
        panel3.add(panel11, new com.intellij.uiDesigner.core.GridConstraints(1, 4, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel11.setBorder(BorderFactory.createTitledBorder(null, "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        памяткаButton = new JButton();
        памяткаButton.setText("Справочная панель");
        panel11.add(памяткаButton, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel12 = new JPanel();
        panel12.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(11, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel12.setBackground(new Color(-13948117));
        panel2.add(panel12, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 2, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel12.setBorder(BorderFactory.createTitledBorder(null, "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, this.$$$getFont$$$(null, -1, -1, panel12.getFont()), null));
        radioButton1Задвижка = new JRadioButton();
        radioButton1Задвижка.setBackground(new Color(-13948117));
        radioButton1Задвижка.setForeground(new Color(-2236190));
        radioButton1Задвижка.setText("Задвижка");
        panel12.add(radioButton1Задвижка, new com.intellij.uiDesigner.core.GridConstraints(6, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        radioButton2Бабочка = new JRadioButton();
        radioButton2Бабочка.setBackground(new Color(-13948117));
        radioButton2Бабочка.setForeground(new Color(-2236190));
        radioButton2Бабочка.setText("Повортная");
        panel12.add(radioButton2Бабочка, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        radioButtonNewozr = new JRadioButton();
        radioButtonNewozr.setBackground(new Color(-13948117));
        radioButtonNewozr.setForeground(new Color(-2236190));
        radioButtonNewozr.setText("Невозвратно-приёмная");
        panel12.add(radioButtonNewozr, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        radioButton5Обратный = new JRadioButton();
        radioButton5Обратный.setBackground(new Color(-13948117));
        radioButton5Обратный.setForeground(new Color(-2236190));
        radioButton5Обратный.setText("Невозвратная/обратная");
        panel12.add(radioButton5Обратный, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        radioButton7Запорная = new JRadioButton();
        radioButton7Запорная.setBackground(new Color(-13948117));
        radioButton7Запорная.setForeground(new Color(-2236190));
        radioButton7Запорная.setText("Запорная");
        panel12.add(radioButton7Запорная, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        radioButtonНожеваяЗадвижка = new JRadioButton();
        radioButtonНожеваяЗадвижка.setBackground(new Color(-13948117));
        radioButtonНожеваяЗадвижка.setForeground(new Color(-2236190));
        radioButtonНожеваяЗадвижка.setHideActionText(false);
        radioButtonНожеваяЗадвижка.setText("Ножевая задвижка");
        panel12.add(radioButtonНожеваяЗадвижка, new com.intellij.uiDesigner.core.GridConstraints(7, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        самозапорнаяRadioButton = new JRadioButton();
        самозапорнаяRadioButton.setBackground(new Color(-13948117));
        самозапорнаяRadioButton.setForeground(new Color(-2236190));
        самозапорнаяRadioButton.setText("Самозапорная");
        panel12.add(самозапорнаяRadioButton, new com.intellij.uiDesigner.core.GridConstraints(8, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        шароваяRadioButton = new JRadioButton();
        шароваяRadioButton.setBackground(new Color(-13948117));
        шароваяRadioButton.setForeground(new Color(-2236190));
        шароваяRadioButton.setText("Шаровая");
        panel12.add(шароваяRadioButton, new com.intellij.uiDesigner.core.GridConstraints(9, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        фильтрRadioButton = new JRadioButton();
        фильтрRadioButton.setBackground(new Color(-13948117));
        фильтрRadioButton.setForeground(new Color(-2236190));
        фильтрRadioButton.setText("Фильтр");
        panel12.add(фильтрRadioButton, new com.intellij.uiDesigner.core.GridConstraints(10, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        radioButton6ЗапорнаяССильфонупл = new JRadioButton();
        radioButton6ЗапорнаяССильфонупл.setBackground(new Color(-13948117));
        radioButton6ЗапорнаяССильфонупл.setForeground(new Color(-2236190));
        radioButton6ЗапорнаяССильфонупл.setText("Запорная с сильфонным уплотнением");
        panel12.add(radioButton6ЗапорнаяССильфонупл, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        radioButton4НевозвратноЗапорная = new JRadioButton();
        radioButton4НевозвратноЗапорная.setBackground(new Color(-13948117));
        radioButton4НевозвратноЗапорная.setForeground(new Color(-2236190));
        radioButton4НевозвратноЗапорная.setText("Невозвратно-запорная");
        panel12.add(radioButton4НевозвратноЗапорная, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JPanel panel13 = new JPanel();
        panel13.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(6, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel13.setBackground(new Color(-13948117));
        panel13.setForeground(new Color(-4519414));
        panel1.add(panel13, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel13.setBorder(BorderFactory.createTitledBorder(null, "Материал корпуса", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, new Color(-5262925)));
        бронзаRadioButton = new JRadioButton();
        бронзаRadioButton.setBackground(new Color(-13948117));
        бронзаRadioButton.setForeground(new Color(-2236190));
        бронзаRadioButton.setText("Бронза");
        panel13.add(бронзаRadioButton, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        стальRadioButton = new JRadioButton();
        стальRadioButton.setBackground(new Color(-13948117));
        стальRadioButton.setForeground(new Color(-2236190));
        стальRadioButton.setText("Сталь");
        panel13.add(стальRadioButton, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        чугунRadioButton = new JRadioButton();
        чугунRadioButton.setBackground(new Color(-13948117));
        чугунRadioButton.setForeground(new Color(-2236190));
        чугунRadioButton.setText("Чугун");
        panel13.add(чугунRadioButton, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        чугунСШарГрафRadioButton = new JRadioButton();
        чугунСШарГрафRadioButton.setBackground(new Color(-13948117));
        чугунСШарГрафRadioButton.setForeground(new Color(-2236190));
        чугунСШарГрафRadioButton.setText("Чугун с шар. граф.");
        panel13.add(чугунСШарГрафRadioButton, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        латуньRadioButton = new JRadioButton();
        латуньRadioButton.setBackground(new Color(-13948117));
        латуньRadioButton.setForeground(new Color(-2236190));
        латуньRadioButton.setText("Латунь");
        panel13.add(латуньRadioButton, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        нержСтальRadioButton = new JRadioButton();
        нержСтальRadioButton.setBackground(new Color(-13948117));
        нержСтальRadioButton.setForeground(new Color(-2236190));
        нержСтальRadioButton.setText("Нерж. сталь");
        panel13.add(нержСтальRadioButton, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JScrollPane scrollPane1 = new JScrollPane();
        scrollPane1.setEnabled(false);
        contentPane.add(scrollPane1, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(-1, 100), null, null, 0, false));
        textAreaResultsSearchArm = new JTextArea();
        textAreaResultsSearchArm.setDropMode(DropMode.USE_SELECTION);
        textAreaResultsSearchArm.setEditable(true);
        textAreaResultsSearchArm.setEnabled(true);
        Font textAreaResultsSearchArmFont = this.$$$getFont$$$("Times New Roman", -1, 12, textAreaResultsSearchArm.getFont());
        if (textAreaResultsSearchArmFont != null) textAreaResultsSearchArm.setFont(textAreaResultsSearchArmFont);
        textAreaResultsSearchArm.setText("");
        scrollPane1.setViewportView(textAreaResultsSearchArm);
        ButtonGroup buttonGroup;
        buttonGroup = new ButtonGroup();
        buttonGroup.add(проходнаяRadioButton);
        buttonGroup.add(угроловаяRadioButton);
        buttonGroup.add(угроловаяRadioButton);
        buttonGroup.add(проходнаяRadioButton);
        buttonGroup = new ButtonGroup();
        buttonGroup.add(фланцеваяRadioButton);
        buttonGroup.add(межфланцеваяRadioButton);
        buttonGroup.add(подПриваркуRadioButton);
        buttonGroup.add(фланцеваяRadioButton);
        buttonGroup.add(межфланцеваяRadioButton);
        buttonGroup.add(муфтоваяRadioButton);
        buttonGroup.add(фланцеваяRadioButton);
        buttonGroup.add(штуцернаяRadioButton);
        buttonGroup.add(подПриваркуRadioButton);
        buttonGroup.add(цапковаяRadioButton);
        buttonGroup = new ButtonGroup();
        buttonGroup.add(бронзаRadioButton);
        buttonGroup.add(чугунСШарГрафRadioButton);
        buttonGroup.add(нержСтальRadioButton);
        buttonGroup.add(латуньRadioButton);
        buttonGroup.add(стальRadioButton);
        buttonGroup.add(чугунRadioButton);
        buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton7Запорная);
        buttonGroup.add(radioButton7Запорная);
        buttonGroup.add(radioButton1Задвижка);
        buttonGroup.add(radioButton2Бабочка);
        buttonGroup.add(radioButtonNewozr);
        buttonGroup.add(radioButton4НевозвратноЗапорная);
        buttonGroup.add(radioButton5Обратный);
        buttonGroup.add(radioButton6ЗапорнаяССильфонупл);
        buttonGroup.add(radioButtonНожеваяЗадвижка);
        buttonGroup.add(самозапорнаяRadioButton);
        buttonGroup.add(шароваяRadioButton);
        buttonGroup.add(фильтрRadioButton);
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return contentPane;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    ///////////////////////////////
    /////////////////////////////
    //////////////////////////////


    class ButtonEveLists implements ActionListener {
        List<CreateArmature> searchResult;

        @Override
        public void actionPerformed(ActionEvent e) {
            ArmatureList.setValvesListList();


            if ((проходнаяRadioButton.isSelected() ||
                    угроловаяRadioButton.isSelected())

                    &&

                    (radioButton7Запорная.isSelected() ||
                            radioButton6ЗапорнаяССильфонупл.isSelected() ||
                            radioButton5Обратный.isSelected() ||
                            radioButton4НевозвратноЗапорная.isSelected() ||
                            radioButtonNewozr.isSelected() ||
                            radioButton2Бабочка.isSelected() ||
                            radioButton1Задвижка.isSelected() ||
                            radioButtonНожеваяЗадвижка.isSelected())
                    &&

                    (бронзаRadioButton.isSelected() ||
                            бронзаRadioButton.isSelected() ||
                            стальRadioButton.isSelected() ||
                            нержСтальRadioButton.isSelected() ||
                            чугунRadioButton.isSelected() ||
                            чугунСШарГрафRadioButton.isSelected() ||
                            латуньRadioButton.isSelected())

                    &&

                    (фланцеваяRadioButton.isSelected() ||
                            межфланцеваяRadioButton.isSelected() ||
                            муфтоваяRadioButton.isSelected() ||
                            штуцернаяRadioButton.isSelected() ||
                            цапковаяRadioButton.isSelected() ||
                            подПриваркуRadioButton.isSelected())

                    &&

                    (PNTextField.getText().length() != 0)

                    &&

                    (textField1DN.getText().length() != 0)

            ) {


                selectedCharacteristics();

                int dn = Integer.parseInt(textField1DN.getText());
                int pn = Integer.parseInt(PNTextField.getText());


                searchResult = new ArmatureSearch()
                        .setBodyComposition(bodyComposition)
                        .setTypeOfUse(typeOfUse)
                        .setConnectionType(connectionType)
                        .setTypeOfConstruction(typeOfConstruction)
                        .setDN(dn)
                        .setMinPn(pn)
                        .search(ArmatureList.valvesList);

                String resultSearchValves = searchResult.toString()
                        .replace("[", "")
                        .replace("]", "")
                        .replace(",", "");

                textAreaResultsSearchArm.setText(resultSearchValves);

//                textAreaResultsSearchArm.setText(searchResult.toString().substring(1, searchResult.toString().length() - 1));

                ArmatureList.valvesList.clear();


//                if (searchResult.size() <= 3) {
//                    textAreaResultsSearchArm.setText("не чего не найдено");
//                }

            } else {
                ArmatureList.valvesList.clear();
                textAreaResultsSearchArm.setText("Проверьте выбранные хиарактеристики, возможно " +
                        "вы допустили ошибку или не чего не найдено \n");
            }
        }
    }

    class ReferencePaneButton implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            ReferenceButtonAction dialog = new ReferenceButtonAction();
            dialog.pack();
            dialog.setVisible(true);


        }
    }

}
