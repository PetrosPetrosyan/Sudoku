package com.example.pet.sudoku;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView[] text = new TextView[81];
    private int sudoku[][] = {{2, 7, 4, 9, 6, 3, 1, 5, 8}, {3, 5, 1, 4, 8, 2, 6, 7, 9}, {8, 9, 6, 5, 7, 1, 2, 4, 3}, {9, 4, 2, 1, 5, 8, 3, 6, 7}, {6, 1, 7, 3, 2, 9, 5, 8, 4}, {5, 3, 8, 6, 4, 7, 9, 2, 1}, {7, 6, 9, 2, 1, 4, 8, 3, 5}, {1, 8, 5, 7, 3, 6, 4, 9, 2}, {4, 2, 3, 8, 9, 5, 7, 1, 6}};
    public int sudokuex[][] = new int[9][9];
    private int random;
    public int i;
    private TextView verj;
    public ArrayList<Integer> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sudoku = xarnel(sudoku);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        text[0] = findViewById(R.id.text1);
        text[1] = findViewById(R.id.text2);
        text[2] = findViewById(R.id.text3);
        text[3] = findViewById(R.id.text4);
        text[4] = findViewById(R.id.text5);
        text[5] = findViewById(R.id.text6);
        text[6] = findViewById(R.id.text7);
        text[7] = findViewById(R.id.text8);
        text[8] = findViewById(R.id.text9);
        text[9] = findViewById(R.id.text10);
        text[10] = findViewById(R.id.text11);
        text[11] = findViewById(R.id.text12);
        text[12] = findViewById(R.id.text13);
        text[13] = findViewById(R.id.text14);
        text[14] = findViewById(R.id.text15);
        text[15] = findViewById(R.id.text16);
        text[16] = findViewById(R.id.text17);
        text[17] = findViewById(R.id.text18);
        text[18] = findViewById(R.id.text19);
        text[19] = findViewById(R.id.text20);
        text[20] = findViewById(R.id.text21);
        text[21] = findViewById(R.id.text22);
        text[22] = findViewById(R.id.text23);
        text[23] = findViewById(R.id.text24);
        text[24] = findViewById(R.id.text25);
        text[25] = findViewById(R.id.text26);
        text[26] = findViewById(R.id.text27);
        text[27] = findViewById(R.id.text28);
        text[28] = findViewById(R.id.text29);
        text[29] = findViewById(R.id.text30);
        text[30] = findViewById(R.id.text31);
        text[31] = findViewById(R.id.text32);
        text[32] = findViewById(R.id.text33);
        text[33] = findViewById(R.id.text34);
        text[34] = findViewById(R.id.text35);
        text[35] = findViewById(R.id.text36);
        text[36] = findViewById(R.id.text37);
        text[37] = findViewById(R.id.text38);
        text[38] = findViewById(R.id.text39);
        text[39] = findViewById(R.id.text40);
        text[40] = findViewById(R.id.text41);
        text[41] = findViewById(R.id.text42);
        text[42] = findViewById(R.id.text43);
        text[43] = findViewById(R.id.text44);
        text[44] = findViewById(R.id.text45);
        text[45] = findViewById(R.id.text46);
        text[46] = findViewById(R.id.text47);
        text[47] = findViewById(R.id.text48);
        text[48] = findViewById(R.id.text49);
        text[49] = findViewById(R.id.text50);
        text[50] = findViewById(R.id.text51);
        text[51] = findViewById(R.id.text52);
        text[52] = findViewById(R.id.text53);
        text[53] = findViewById(R.id.text54);
        text[54] = findViewById(R.id.text55);
        text[55] = findViewById(R.id.text56);
        text[56] = findViewById(R.id.text57);
        text[57] = findViewById(R.id.text58);
        text[58] = findViewById(R.id.text59);
        text[59] = findViewById(R.id.text60);
        text[60] = findViewById(R.id.text61);
        text[61] = findViewById(R.id.text62);
        text[62] = findViewById(R.id.text63);
        text[63] = findViewById(R.id.text64);
        text[64] = findViewById(R.id.text65);
        text[65] = findViewById(R.id.text66);
        text[66] = findViewById(R.id.text67);
        text[67] = findViewById(R.id.text68);
        text[68] = findViewById(R.id.text69);
        text[69] = findViewById(R.id.text70);
        text[70] = findViewById(R.id.text71);
        text[71] = findViewById(R.id.text72);
        text[72] = findViewById(R.id.text73);
        text[73] = findViewById(R.id.text74);
        text[74] = findViewById(R.id.text75);
        text[75] = findViewById(R.id.text76);
        text[76] = findViewById(R.id.text77);
        text[77] = findViewById(R.id.text78);
        text[78] = findViewById(R.id.text79);
        text[79] = findViewById(R.id.text80);
        text[80] = findViewById(R.id.text81);
        verj = findViewById(R.id.verj);


        for (int j = 0; j < 9; j++) {
            for (int k = 0; k < 9; k++) {
                sudokuex[j][k] = 0;
            }
        }


//        for (i = 0; i < 30; i++) {
//            random = (int) (Math.random() * 80.9);
//            if (list.contains(random) != true) {
//                list.add(random);
//                if (random == 0) {
//                    text[0].setText(String.valueOf(sudoku[0][0]));
//                    sudokuex[0][0] = sudoku[0][0];
//                    text[0].setTextColor(Color.rgb(210, 105, 30));
//                } else {
//                    text[random].setTextColor(Color.rgb(210, 105, 30));
//                    text[random].setText(String.valueOf(sudoku[(int) ((random) / 9)][(int) ((random) % 9)]));
//                    sudokuex[(int) ((random) / 9)][(int) ((random) % 9)] = sudoku[(int) ((random) / 9)][(int) ((random) % 9)];
//                }
//            } else
//                --i;
//        }

        for (int j = 0; j < 3; j++) {
            int randqanak = (int) (Math.random()  + 3);
            for (int k = 0; k < randqanak; k++) {
                int randi, randj;
                randi = (int) (Math.random() * 2.9);
                randj = (int) (Math.random() * 2.9) + 3 * j;
                i = randi * 9 + randj;
                if (list.contains(i) != true) {
                    list.add(i);
                    text[i].setTextColor(Color.rgb(210, 105, 30));
                    text[i].setText(String.valueOf(sudoku[randi][randj]));
                    sudokuex[randi][randj] = sudoku[randi][randj];
                } else {
                    ++randqanak;
                }
            }
        }


        for (int j = 0; j < 3; j++) {
            int randqanak = (int) (Math.random()  + 3);
            for (int k = 0; k < randqanak; k++) {
                int randi, randj;
                randi = (int) (Math.random() * 2.9) + 3;
                randj = (int) (Math.random() * 2.9) + 3 * j;
                i = randi * 9 + randj;
                if (list.contains(i) != true) {
                    list.add(i);
                    text[i].setTextColor(Color.rgb(210, 105, 30));
                    text[i].setText(String.valueOf(sudoku[randi][randj]));
                    sudokuex[randi][randj] = sudoku[randi][randj];
                } else {
                    ++randqanak;
                }
            }
        }


        for (int j = 0; j < 3; j++) {
            int randqanak = (int) (Math.random() + 3);
            for (int k = 0; k < randqanak; k++) {
                int randi, randj;
                randi = (int) (Math.random() * 2.9) + 6;
                randj = (int) (Math.random() * 2.9) + 3 * j;
                i = randi * 9 + randj;
                if (list.contains(i) != true) {
                    list.add(i);
                    text[i].setTextColor(Color.rgb(210, 105, 30));
                    text[i].setText(String.valueOf(sudoku[randi][randj]));
                    sudokuex[randi][randj] = sudoku[randi][randj];
                } else {
                    ++randqanak;
                }
            }
        }


        text[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(0);
            }
        });
        text[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(1);
            }
        });
        text[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(2);
            }
        });
        text[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(3);
            }
        });
        text[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(4);
            }
        });
        text[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(5);
            }
        });
        text[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(6);
            }
        });
        text[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(7);
            }
        });
        text[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(8);
            }
        });
        text[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(9);
            }
        });
        text[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(10);
            }
        });
        text[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(11);
            }
        });
        text[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(12);
            }
        });
        text[13].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(13);
            }
        });
        text[14].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(14);
            }
        });
        text[15].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(15);
            }
        });
        text[16].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(16);
            }
        });
        text[17].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(17);
            }
        });
        text[18].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(18);
            }
        });
        text[19].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(19);
            }
        });
        text[20].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(20);
            }
        });
        text[21].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(21);
            }
        });
        text[22].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(22);
            }
        });
        text[23].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(23);
            }
        });
        text[24].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(24);
            }
        });
        text[25].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(25);
            }
        });
        text[26].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(26);
            }
        });
        text[27].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(27);
            }
        });
        text[28].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(28);
            }
        });
        text[29].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(29);
            }
        });
        text[30].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(30);
            }
        });
        text[31].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(31);
            }
        });
        text[32].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(32);
            }
        });
        text[33].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(33);
            }
        });
        text[34].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(34);
            }
        });
        text[35].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(35);
            }
        });
        text[36].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(36);
            }
        });
        text[37].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(37);
            }
        });
        text[38].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(38);
            }
        });
        text[39].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(39);
            }
        });
        text[40].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(40);
            }
        });
        text[41].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(41);
            }
        });
        text[42].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(42);
            }
        });
        text[43].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(43);
            }
        });
        text[44].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(44);
            }
        });
        text[45].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(45);
            }
        });
        text[46].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(46);
            }
        });
        text[47].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(47);
            }
        });
        text[48].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(48);
            }
        });
        text[49].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(49);
            }
        });
        text[50].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(50);
            }
        });
        text[51].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(51);
            }
        });
        text[52].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(52);
            }
        });
        text[53].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(53);
            }
        });
        text[54].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(54);
            }
        });
        text[55].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(55);
            }
        });
        text[56].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(56);
            }
        });
        text[57].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(57);
            }
        });
        text[58].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(58);
            }
        });
        text[59].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(59);
            }
        });
        text[60].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(60);
            }
        });
        text[61].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(61);
            }
        });
        text[62].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(62);
            }
        });
        text[63].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(63);
            }
        });
        text[64].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(64);
            }
        });
        text[65].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(65);
            }
        });
        text[66].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(66);
            }
        });
        text[67].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(67);
            }
        });
        text[68].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(68);
            }
        });
        text[69].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(69);
            }
        });
        text[70].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(70);
            }
        });
        text[71].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(71);
            }
        });
        text[72].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(72);
            }
        });
        text[73].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(73);
            }
        });
        text[74].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(74);
            }
        });
        text[75].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(75);
            }
        });
        text[76].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(76);
            }
        });
        text[77].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(77);
            }
        });
        text[78].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(78);
            }
        });
        text[79].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(79);
            }
        });
        text[80].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tpel(80);
            }
        });
    }

    public void tpel(int i) {
        int qanak = 0;
            if (list.contains(i) != true) {
                if (sudokuex[(int) ((i) / 9)][(int) ((i) % 9)] == 9) {
                    text[i].setText("");
                    sudokuex[(int) ((i) / 9)][(int) ((i) % 9)] = 0;
                } else {
                    text[i].setText(String.valueOf(sudokuex[(int) ((i) / 9)][(int) ((i) % 9)] + 1));
                    ++sudokuex[(int) ((i) / 9)][(int) ((i) % 9)];
                }
                for (int j = 0; j < 9; j++) {
                    for (int k = 0; k < 9; k++) {
                        if (sudokuex[j][k] == sudoku[j][k]) {
                            qanak++;
                        }
                    }
                }
                if (qanak > 80) {
                    verj.setText("You Win");
                }
            }
            if(stugel(sudokuex)==true){verj.setText("You Win");}
        }

    public int[][] xarnel(int[][] sudoku) {
        for (int d = 0; d < 10; d++) {
            for (int i = 0; i < 9; i += 3) {
                int rand = (int) (Math.random() * 2) + 1;
                int k[] = sudoku[i];
                sudoku[i] = sudoku[i + rand];
                sudoku[i + rand] = k;
            }
            for (int i = 0; i < 9; i += 3) {
                int rand = (int) (Math.random() * 2) + 1;
                for (int j = 0; j < 9; j++) {
                    int k = sudoku[j][i];
                    sudoku[j][i] = sudoku[j][i + rand];
                    sudoku[j][i + rand] = k;
                }
            }
        }
        return sudoku;
    }

    public boolean stugel(int[][] sudokuex) {
        boolean verj=false;
        A:
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(sudokuex[0][i]==sudokuex[0][j]){verj=false;break A;}
                if(sudokuex[1][i]==sudokuex[1][j]){verj=false;break A;}
                if(sudokuex[2][i]==sudokuex[2][j]){verj=false;break A;}
                if(sudokuex[3][i]==sudokuex[3][j]){verj=false;break A;}
                if(sudokuex[4][i]==sudokuex[5][j]){verj=false;break A;}
                if(sudokuex[6][i]==sudokuex[6][j]){verj=false;break A;}
                if(sudokuex[7][i]==sudokuex[7][j]){verj=false;break A;}
                if(sudokuex[8][i]==sudokuex[8][j]){verj=false;break A;}
                if(sudokuex[9][i]==sudokuex[9][j]){verj=false;break A;}
                verj=true;
            }
        }
        B:
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = (i/3)*3; k < (i/3)*3+3; k++) {
                    for (int l=(j/3)*3; l < (j/3)*3+3; l++) {
                        if (sudokuex[i][j]==sudokuex[k][l]){verj=false;break B;}
                        verj=true;
                    }
                }
            }
        }
        if(verj==true){}
        return verj;
    }
}
