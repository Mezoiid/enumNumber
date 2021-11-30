package com.company;

public class Number {
    private NumMus numMus;

    public Number(NumMus numMus) {
        this.numMus = numMus;
    }
}
enum NumMus {

    ONE {
        @Override
        public void printNumber() {
            char[][] num = new char[5][5];
            for (int i = 0; i<num.length;i++){
                num[i][num.length/2]='*';
            }
            num[1][1]='*';
            num[2][0]='*';
            printMas(num);
        }
    },
    TWO {
        @Override
        public void printNumber() {
            char[][] num = new char[5][5];
            for (int i = 1; i<num.length;i++) {
                num[0][i] = '*';
                num[4][i] = '*';
            }
            for (int i = 0; i<num.length-2;i++) {
                num[i][num.length-1]='*';
            }
            num[3][2]='*';
            num[4][1]='*';
            printMas(num);
        }
    },
    THREE {
        @Override
        public void printNumber() {
            char[][] num = new char[5][5];
            for (int i = 0; i<num.length;i++){
                num[0][i]='*';
                num[num.length/2][i]='*';
                num[i][num.length - 1] = '*';
                num[num.length-1][i] = '*';
            }
            printMas(num);
        }
    },
    FOUR {
        @Override
        public void printNumber() {
            char[][] num = new char[5][5];
            for (int i = 0; i<num.length;i++){
                num[num.length/2][i]='*';
                num[i][num.length - 1] = '*';
            }
            for (int i = 0; i<num.length/2;i++){
                num[i][0]='*';
            }
            printMas(num);
        }
    },
    FIVE {
        @Override
        public void printNumber() {
            char[][] num = new char[5][5];
            for (int i = 0; i<num.length;i++){
                num[0][i]='*';
                num[num.length/2][i]='*';
                num[num.length-1][i] = '*';
            }
            for (int i = 0; i<num.length/2;i++){
                num[i][0]='*';

            }
            for (int i = num.length/2; i<num.length;i++)
                num[i][num.length-1]='*';
            printMas(num);
        }
    },
    SIX {
        @Override
        public void printNumber() {
            char[][] num = new char[5][5];
            for (int i = 0; i<num.length;i++){
                num[0][i]='*';
                num[num.length/2][i]='*';
                num[num.length-1][i] = '*';
                num[i][0]='*';
            }

            for (int i = num.length/2; i<num.length;i++)
                num[i][num.length-1]='*';
            printMas(num);
        }
    },
    SEVEN {
        @Override
        public void printNumber() {
            char[][] num = new char[5][5];
            for (int i = 0; i<num.length;i++){
                num[0][i]='*';
                num[i][num[i].length-1-i]='*';
            }
            printMas(num);
        }
    },
    EIGHT {
        @Override
        public void printNumber() {
            char[][] num = new char[5][5];
            for (int i = 0; i<num.length;i++){
                num[0][i]='*';
                num[num.length/2][i]='*';
                num[i][num.length - 1] = '*';
                num[num.length-1][i] = '*';
                num[i][0]='*';
            }
            printMas(num);
        }
    },
    NINE {
        @Override
        public void printNumber() {
            char[][] num = new char[5][5];
            for (int i = 0; i<num.length;i++){
                num[0][i]='*';
                num[num.length/2][i]='*';
                num[num.length-1][i] = '*';
                num[i][num.length-1]='*';
            }
            for (int i = 0; i<num.length/2;i++)
                num[i][0]='*';
            printMas(num);
        }
    };
    public abstract void printNumber();
        public void printMas(char[][] num){
            for (int i = 0; i<num.length;i++){
                for (int j = 0;j<num[i].length;j++)
                    System.out.print(num[i][j]);
                System.out.println();
            }
        }
    }


