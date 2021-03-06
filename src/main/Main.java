package main;

// 侍のコード
public class Main {
	public static void main(String[] args) {
		// 型 オペランド
		int a;
		int b;
		// オペランド 演算子 リテラル(オペランドの中でも値はリテラルと呼ぶ)
		a = 20;
		b = a + 5;
		// 整数リテラルの先頭に0xを付けると16進数
		// 整数リテラルの先頭に0を付けると8進数
		// 整数リテラルの先頭に0bを付けると2進数
		// 例 int a = 0x11; と書くと変数aには2進数の17が代入される
		// long price = 2_000_000; のように、3桁刻みの,のように整数リテラルの任意の場所に_で区切りを入れても数値と見なされる
		System.out.println(a);
		System.out.println(b);
	}
}
