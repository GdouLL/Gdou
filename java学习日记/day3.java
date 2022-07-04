/*
        时间：2022/7/3
        作者：Gdou
                        */
package day;

import java.util.Random;
import java.util.Scanner;

public class day3 {
    //购买飞机票类 lx:选择类型，jg：价格，tong：头等舱折扣，jj：经济舱折扣
/*    public static int jg(int lx,int jg,double tong,double jj){
        if(lx == 0){
            jg = (int)(jg*tong);
        }else if(lx ==1) {
            jg = (int)(jg*jj);
        }else{
            System.out.println("请输入正确的");
        }
        return jg;
    }*/
    //求平均数
/*    public static double pj() {
        int b[] =new int[6];
        Scanner a = new Scanner(System.in);
        System.out.println("请输入6位评委的分数");
        for (int i = 0; i < b.length; ) {
            int num = a.nextInt();
            if(num >=0 && num <= 100){
                b[i] = num;
                i++;
            }else {
                System.out.println("请输入正确的分数");
            }
        }
        int max = b[0],min = b[0],sum=0;
        for (int i = 0; i < b.length; i++) {
                if(max < b[i]){
                    max = b[i];
                }else if (min > b[i]){
                    min = b[i];
                }
                sum += b[i];
            }
            return (sum-max-min)/(b.length-2);
        }*/
//
    public static void main(String[] args) {
        //买飞机票：输入月份、飞机票原价（头等舱、经济舱）,并且按照旺季（5-10月），头等舱9折，经济舱8.5折；淡季（11月到4月）头等舱7折，经济舱6.5折
/*        Scanner yu = new Scanner(System.in);
        System.out.println("请输入你购买的月份");
        int yu_num = yu.nextInt();
        System.out.println("请输入飞机票原价");
        int to_num = yu.nextInt();
        System.out.println("请输入购买什么票：0为头等舱，1为经济舱");
        int xz_num = yu.nextInt(),jg=0;
        if(yu_num > 0 & yu_num <= 12){
            if(yu_num >= 5 & yu_num <= 10){
                jg=jg(xz_num,to_num,0.9,0.85);
                System.out.println("你的票价格为："+jg);
            }else {
                jg=jg(xz_num,to_num,0.7,0.65);
                System.out.println("你的票价格为："+jg);
            }
        }else {
            System.out.println("请输入正确的月份");
        }*/
        //求平均分：在一个数组里面（键盘输入6个数字），去掉最大值和最小值，然后求剩下4个的平均数；
/*        double pjf=pj();
        System.out.println("平均分是："+pjf);*/
        //简单的加密，把一个数字（不为0）的进行加密，每位数加5，再对10求余，最后再把数字反转（数字要添加到数组里面）
/*        int a = 68956;
        int lx=a; //定义一个临时变量给他（因为第一个循环a会变成0）
        int count=0; //记录数字位数
        while(a !=0){
            a=a/10;
            count++;
        }
        int[] b =new int[count];
        int jlu = count-1;
        while (lx !=0){  //循环写入数组里面
            b[jlu] = lx%10;
            lx=lx/10;
            jlu--;
        }
        //加密过程
        for (int i = 0; i < b.length; i++) {
            b[i] = (b[i]+5) % 10;
//            System.out.println(b[i]);
        }
        //数组反转
        for (int i = 0,j=b.length-1; i < j; i++,j--) {
            int cc = b[i];
            b[i] = b[j];
            b[j] = cc;
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }*/
        //解密 a=10431
        //先转换回去
/*        int a=10431;
        int temp = 10431;
        int count=0; //临时变量
        while (a != 0){ //计算位数
            a/=10;
            count++;
        }
        int[] b = new int[count];
        int l=count-1;
//        System.out.println(count);
        while (temp !=0){
            b[l] = temp%10;
            temp/=10;
            l--;
        }
        for (int i = 0,j= b.length-1; i < j; i++,j--) {
            int lx = b[i];
            b[i] = b[j];
            b[j] = lx;
        }
        for (int i = 0; i < b.length; i++) {
            if(b[i] >=0 && b[i] <=4){
                b[i] += 10;
            }
            b[i] -= 5;
        }
        int jm = 0; //解码结果
        for (int i = 0; i < b.length; i++) {
            jm = jm*10+b[i];
        }
        System.out.println(jm);*/
        //抽奖（高效率的方法，直接打乱数组，然后遍历）
/*        int[] jchi={100,200,333,666,555};
        Random s = new Random();
        for (int i = 0; i < jchi.length; i++) {
            int lx = s.nextInt(jchi.length);
            int sl = jchi[i];
            jchi[i] = jchi[lx];
            jchi[lx] = jchi[i];
        }
        for (int i = 0; i < jchi.length; i++) {
            System.out.print(jchi[i]+" ");
        }*/
        //双色球抽奖
        //随机生成红球，蓝球数字：sj
        //判断数字是否存在数组里面：pd
        //用户输入购买的号码：gm
        int[] qu = sj();  //中奖号码
        for (int i = 0; i < qu.length; i++) {
            System.out.print(qu[i]+" ");
        }
        int[] input = gm(); //输入抽奖号码
        int h_count = 0; //记录红球中奖次数
        int l_count = 0; //记录蓝球中奖次数
        for (int i = 0; i < input.length-1; i++) {
            for (int j = 0; j < qu.length-1; j++) {
                if (input[i] == qu[j]){
                    h_count+=1;
                    break; //退出去提高效率
                }
            }
        }
        if(input[input.length-1] == qu[qu.length-1]){
            l_count++;
        }
//        System.out.print(l_count+"="+h_count);
        if(h_count == 6 && l_count ==1){
            System.out.println("恭喜你中奖1000万");
        }else if (h_count == 6 && l_count == 0){
            System.out.println("恭喜你中奖500万");
        }else if ( h_count == 5 && l_count == 1){
            System.out.println("恭喜你中奖2000");
        }else if ( (h_count == 5 && l_count == 0) || (h_count == 4 && l_count == 1)){
            System.out.println("恭喜你中奖1000");
        }else if ( (h_count == 4 && l_count == 0) || (h_count == 4 && l_count == 1)){
            System.out.println("恭喜你中奖200");
        }
    }
    public static int[] sj(){
        Random s = new Random();
        int[] qu = new int[7]; //6个红球，1个蓝球；
        for (int i = 0; i < qu.length-1;) {
            int sl = s.nextInt(33)+1; //红球范围是1到33
            if( !pd(qu,sl) ){
                qu[i] = sl;
                i++;
            }
        }
        qu[qu.length-1] = s.nextInt(16)+1;
        return qu;
    }
    public static boolean pd(int[] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return true;
            }
        }
        return false;
    }
    public static int[] gm(){
        Scanner s = new Scanner(System.in);
        int[] gm =new int[7];
        for (int i = 0; i < 6; ) {
            System.out.print("请输入第"+(i+1)+"个红球");
            int h_num = s.nextInt();
            if(h_num >= 1 && h_num <= 33){
                if ( !pd(gm,h_num) ){
                    gm[i] = h_num;
                    i++;
                }else {
                    System.out.print("当前红球号码已经存在，请重新输入");
                }
            }else {
                System.out.print("请输入正确的号码");
            }
        }
        System.out.print("请输入篮球号码：");
        while (true){
                int l_num = s.nextInt();
                if (l_num >=0 && l_num <= 16){
                    gm[gm.length-1] = l_num;
                    break;
                }else {
                    System.out.print("请输入正确的范围");
                }
            }
            return gm;
        }

    }

