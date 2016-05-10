import java.util.Scanner;
import java.util.Random;

public class Exam {

	int iDummy = 0;
	char cDummy = 'a';
	boolean bDummy = false;
	double dDummy = 0.0d;
	String sDummy = "";
	int [] iaDummy = new int [0];

	/*
	問1 引数 count を受け取り,0からcountまで1づつ増加して表示する
	メソッド countUp を定義せよ。但しwhileを用いること。
	*/
	
	void countUp(int count) {
		count = 0;
		while (count < 100){
			count++;
			System.out.println(count);
		}
	}

	/*
	問2 引数 count を受け取り,countから0まで1づつ減少して表示する
	メソッド countDown を定義せよ。但しforを用いること。
	*/

	void countDown(int count) {
		for(count = 100; count > 0; count--){
			System.out.println(count);
		}
	}

	/*
	問3 intの引数 x を 受け取り，正のであればtrue,負であればfalseを返す
	メソッド positive を定義せよ。
	*/

	boolean positive(int x) {
		return bDummy;
	}

	/*
	問4 intの引数 x,y を 受け取り数字が大きい方を返す
	メソッド max を定義せよ。
	*/

	int max(int x,int y) {
		return iDummy;
	}

	/*
	問5 intの引数 x,y を 受け取り合計を返す
	メソッド sum を定義せよ。
	*/

	int sum(int x,int y) {
		return iDummy;
	}

	/*
	問6 intの引数 x,y,z を 受け取り doubleで 平均を返す
	メソッド average を定義せよ。
	*/

	double average (int x,int y,int z) {
		return dDummy;
	}

	/*
	問7 intの引数 score を 受け取り 成績を返す メソッド rank を定義せよ。
	成績は 90以上はA 70以上90未満はB 45以上70未満はC その他はDとする。
	*/

	char rank (int score) {
		return cDummy;
	}

	/*
	問8 intの引数 width,height を 受け取り 四角形の面積を返す
	メソッド getRectAreaを定義せよ
	*/

	int getRectArea (int width, int height) {
		return iDummy;
	}

	/*
	問9 三角形の辺の長さ x,y,z を 受け取り 三角形の面積を返す
	メソッド getTriangleAreaを定義せよ
	*/

	double getTriangleArea (int x,int y,int z) {
		return dDummy;
	}

	/*
	問10 height(cm),weight(kg)を受け取り そのBMI値を返す
	メソッド calcBMIを定義せよ
	BMI＝体重（kg）÷（身長（m）×身長（m））
	*/

	double calcBMI (int height, int weight) {
		return dDummy;
	}

	/*
	問11 最小値 min, 最大値 max を受け取りその範囲のランダムな数を返す
	メソッド getRandom を定義せよ。
	*/

	int getRandom (int min,int max) {
		return iDummy;
	}

	/*
	問12 int型の配列arrayを引数でとり，その配列の要素を降順(大きい順)でソートして返す
	メソッド descSortを定義せよ
	*/

	int[] descSort(int[] array) {
		return iaDummy;
	}

	/*
	問13 int型の引数 x を受け取り 
	3 で割り切れるならばFizz
	5 で割り切れるなら Buzz
	3 でも 5 でも割り切れる場合は，FizzBuzz
	それ以外は x をStringに変換して返す
	メソッドFizzBuzzを定義せよ
	*/

	String FizzBuzz(int x) {
		return sDummy;
	}

	/*
	問14 掛け算九九表を出力するメソッドTimesTableを作成せよ
	但し 2次元配列 timestable を用いること。
	*/

	void TimesTable(){
		int[][] timestable = new int[9][9];
	}

	/*
	問15 自由課題
	自由に Java のプログラミングをせよ，但し説明をつけよ
	*/

	void execute() {

	}

}
