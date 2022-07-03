/*
        时间：2022/7/3
        作者：Gdou
                        */

package day;

public class day1 {
    public static void main(String[] args) {
/*        int sum=0;
        Scanner num1=new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int jg1=num1.nextInt();
        Scanner num2=new Scanner(System.in);
        System.out.println("请输入第二个数字");
        int jg2=num2.nextInt();
        int a=0;
        int b=0;
        if(jg1>jg2){
            a=jg1;
            b=jg2;
        }else{
            a=jg2;
            b=jg1;
        }
        for(int i = b;i<=a;i++){
            if (i%3 == 0 && i%5 == 0) {
                System.out.println(i);
                sum ++;
            }
        }
        System.out.println(sum);*/
/*
        Scanner num = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int nums = num.nextInt();
        int i=0;
        int x=nums;
        while (x != 0){
            int b = x%10;
            x/=10;
            i=i*10+b;
        }
        System.out.println(nums == i);
*/
/*        Scanner num1 = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        Scanner num2 = new Scanner(System.in);
        int zum1 = num1.nextInt();
        System.out.println("请输入第二个数字");
        int zum2 = num2.nextInt();
        int i=0;
        while (zum1>=zum2){
            zum1=zum1-zum2;
            i++;
        }
        System.out.println(zum1);
        System.out.println(i);*/
        //练习逢7进1
/*        for(int i=1;i <= 100;i++){
            if(i%7 != 0){
                System.out.println(i);
            }else
                System.out.println("过");
        }*/
        //求一个数的平方根，保留整数
/*        Scanner a = new Scanner(System.in);
        System.out.println("请输入一个大于2的两位数");
        int num = a.nextInt(),i=1;
        while (true){
            if(num-(i*i) < 0){
                break;
            }
            i++;

        }
        System.out.println(i-1);*/
        //判断一个数是否为质数
/*        Scanner a = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num = a.nextInt();
        boolean flag=true;
        for(int i=2;i < num;i++){
            if(num%i == 0){
                flag=false;
                System.out.println(num+"为合数");
                break;
            }
        }
        if(flag == true){
            System.out.println(num+"为质数");
        }
    }*/
        //断一个数是否为质数提高（优化）
/*        Scanner a = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num = a.nextInt(),um=0;
        boolean flag=true;
        //先求平方根
        while (true) {
            if (num - (um * um) < 0) {
                break;
            }
            um++;
        }
        um-=1;
        System.out.println(um);
        for(int i=2;i < um;i++){
            if(um%i == 0){
                flag=false;
                System.out.println(num+"为合数");
                break;
            }
        }
        if(flag == true){
            System.out.println(num+"为质数");
        }*/
        // （抽奖游戏机制）
/*        Random a = new Random();
        int num = a.nextInt(100)+1;
        int count=0; //记录抽奖次数
        System.out.println(num);
        while(true){
            Scanner b = new Scanner(System.in);
            System.out.println("请输入你猜的数字");
            int jg = b.nextInt();
            count++;
            // 设置抽5次必定中
            if(count == 5){
                System.out.println("恭喜你答对了！！！");
                break;
            }
            if(jg > num){
                System.out.println("大了");
            }else if (jg < num){
                System.out.println("小了");
            }else{
                System.out.println("恭喜你答对了！！！");
                break;
            }
        }*/
        //在一个数组里面，求能被3整除的数
/*        int[] a = {1,2,3,4,5,66,9,8,7,5,55};
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%3 == 0){
                count++;
            }
        }
        System.out.println(count);*/
        //求数组最大值
/*        int[] a={11,55,66,99,123,199};
        int max=a[0];
        for (int i = 1; i < a.length; i++) {
            if(max < a[i]){
                max = a[i];
            }
        }
        System.out.println(max);*/
        //随机10个数1到100存入数组里面，求比平均数小的数字有哪些
/*        int[] a = new int[10];
        int sum = 0;
        Random sz =new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = sz.nextInt(100)+1;
        }
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
//            System.out.println(a[i]);
        }
        double sum2 = sum/a.length;
//        System.out.println(sum2);
        System.out.println("比平均数小的数字是：");
        for (int i = 0; i < a.length; i++) {
            if(sum2 > a[i]){
                System.out.println(a[i]);
            }
        }
    }*/
        //冒泡排序
/*        int[] a = {1,2,3,4,5};
        for (int i = 0,j = a.length-1; i < a.length; i++,j--) {
                int num = a[i];
                a[i] = a[j];
                a[j] = num;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+" ");
        }
        }*/
        //打乱数组
/*        int[] a = {1, 2, 3, 4, 5};
        Random num = new Random();
        for (int i = 0; i < a.length; i++) {
            int sj_num = num.nextInt(a.length);
            int lx_num = a[i];
            a[i] = a[sj_num];
            a[sj_num] = lx_num;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }*/
        //方法的调用：求一个数字最大值，并且返回
/*        int[] a = {1,2,3,6,9,88,126};
        int max =max(a);
        System.out.println("最大值为"+max);*/
        //复制数组
/*        int[] a={1,2,3,4,5,6};
        int[] c=sz(a,2 ,4);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+", ");
        }*/
    }
    //求最大值
/*    public static int max(int [] a){
        int b=a[0];
        for (int i = 1; i < a.length; i++) {
            if (b < a[i]){
                b=a[i];
            }
        }
        return b;
    }*/
    //复制数组
/*    public static int[] sz(int[] a,int b,int c){
        int[] jg =new int[c-b];
        int count=0;
        for (int i = b; i < c; i++) {
            jg[count] = a[i];
            count++;
        }
        return jg;
    }*/
}
