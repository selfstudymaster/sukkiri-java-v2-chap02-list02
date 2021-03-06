package main;

// chap02
// list02-01
//public class Main {
//	public static void main(String[] args) {
//		// 型 オペランド
//		int a;
//		int b;
//		// オペランド 演算子 リテラル(オペランドの中でも値はリテラルと呼ぶ)
//		a = 20;
//		b = a + 5;
//		// 整数リテラルの先頭に0xを付けると16進数
//		// 整数リテラルの先頭に0を付けると8進数
//		// 整数リテラルの先頭に0bを付けると2進数
//		// 例 int a = 0x11; と書くと変数aには2進数の17が代入される
//		// long price = 2_000_000; のように、3桁刻みの,のように整数リテラルの任意の場所に_で区切りを入れても数値と見なされる
//		System.out.println(a);
//		System.out.println(b);
//	}
//}

//list02-02
//public class Main {
//	public static void main(String[] args) {
//		// エラーになる
//		System.out.println("私の好きな記号は二重引用符"です");
//	}
//}

//list02-03
//public class Main {
//	public static void main(String[] args) {
//		// エスケープシーケンス \ を入れると解決
//		System.out.println("私の好きな記号は二重引用符\"です");
//		// 演算子
//		System.out.println(9.0 / 2);
//		System.out.println(9 / 2); // 整数同士の除算は商を求めるので注意
//	}
//}

//list02-04
//public class Main {
//	public static void main(String[] args) {
//		int a;
//		a = 100;
//		a++;
//		System.out.println(a);
//
//		// インクリメントとデクリメントは他の演算子と一緒に利用すると++aとa++で微妙な違いが生じる
//		int b =10;
//		int c =10;
//		System.out.println(++b + 50);
//		// 変数cに+50した値が表示されたのち、変数cの値が1増えるので意図した表示結果にならない
//		System.out.println(c++ + 50);
//	}
//}

//list02-05
//public class Main {
//	public static void main(String[] args) {
//		// 型変換
//		// 代入時の自動型変換は byte<short<int<long<float<doubleと小さな型から大きな型に向けての値の代入は自動で型変換されて代入される
//		float f = 3; // float型にint型の値3を代入できる(int型の値3がfloat型に型変換されて代入される)
//		double d = f; // double型にfloat型の値3を代入できる(float型のfがdouble型に変換されて代入される)
//		String s = "ベスト" + 3; // String型とint型を連結できる
//		System.out.println(f);
//		System.out.println(d);
//		System.out.println(s);
//	}
//}

//list02-06
//public class Main {
//	public static void main(String[] args) {
//		// int型にdouble型(int<double)を代入するとエラーになる
//		// int i = 3.2;
//		// int型リテラルをbyte型やshort型の変数に対して(byte<short<int)実害がない範囲で単純代入することは例外的に認められている
//		byte b = 3;
//		System.out.println(b);
//	}
//}

//list02-07
//public class Main {
//	public static void main(String[] args) {
//		// int型にdouble型(int<double)を代入するとエラーになるが、
//		// bouble型の値3.2を明示的に強制的な型変換を指示する(キャス演算子)を用いることでJavaに代入を強行させる
//		int age = (int) 3.2;
//		System.out.println(age); // int型として代入したため、表示結果は 3 となる
//	}
//}

//list02-08
//public class Main {
//	public static void main(String[] args) {
//		// int型の値2をdouble型の2.0に自動変換して計算される
//		double d = 8.5 / 2;
//		//int型5をlong型5Lに自動変換して計算される
//		long l = 5 + 2L;
//		System.out.println(d);
//		System.out.println(l);
//	}
//}

// list02-09
//public class Main {
//	public static void main(String[] args) {
//		// int型 23 がString型 "23" に自動型変換さえて代入される
//		String msg = "私の年齢は" + 23;
//		System.out.println(msg);
//	}
//}

// list02-10 System.out.println();
//public class Main {
//	public static void main(String[] args) {
//		String name = "すがわら";
//		String message;
//		message = name + "さん、こんにちは";
//		System.out.println(message);
//	}
//}

//list02-11 System.out.print();
//public class Main {
//	public static void main(String[] args) {
//		String name = "すがわら";
//		// print() は改行しないので、System.out.print()を連続して呼び出すと表示内容が繋がる
//		System.out.print("私の名前は");
//		System.out.print(name);
//		System.out.print("です");
//	}
//}

//list02-12 Math.max(a, b);
//public class Main {
//	public static void main(String[] args) {
//		int a = 5;
//		int b = 3;
//		// Math.max(変数x, 変数y); は「比較して大きい方を評価する」
//		int m = Math.max(a, b);
//		System.out.print("比較実験：" + a + "と" + b + "とで大きいほうは..." + m);
//	}
//}

// list02-13 Integer.parseInt(変数);
//public class Main {
//	public static void main(String[] args) {
//		String age = "31";
//		// 文字列型 age をint型の整数に型変換してnに代入 Integer.parseInt(変数);
//		int n = Integer.parseInt(age);
//		System.out.println("あなたは来年、" + (n + 1) + "歳になりますね。");
//	}
//}

//list02-14 new java.util.Random().nextInt(整数値);
//public class Main {
//	public static void main(String[] args) {
//		// ランダムな数を生成してrに代入 new java.util.Random().nextInt(整数値);
//		int r = new java.util.Random().nextInt(90); // 0~90のいずれかの整数がランダムに代入される
//		System.out.println("あなたはたぶん、" + r + "歳ですね？");
//	}
//}

//list02-15 new java.util.Scanner(System.in).nextLine(); new java.util.Scanner(System.in).nextInt();
//public class Main {
//	public static void main(String[] args) {
//		System.out.println("あなたの名前を入力してください。");
//		// キーボードから1行の文字列の入力を受け付ける
//		String name = new java.util.Scanner(System.in).nextLine();
//		System.out.println("あなたの年齢を入力してください。");
//		// キーボードから1つの整数値の入力を受け付ける
//		int age = new java.util.Scanner(System.in).nextInt();
//		System.out.println("ようこそ、" + age + "歳の" + name + "さん");
//	}
//}

// practice02-01
//public class Main {
//	public static void main(String[] args) {
//		int x = 5;
//		int y = 10;
//		String ans = "x+yは" + (x + y);
//		System.out.println(ans);
//	}
//}

// practice02-03
public class Main {
	public static void main(String[] args) {
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください。");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(4);
		fortune ++;
		System.out.println("占いの結果が出ました！");
		System.out.println( age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です" );
		System.out.println("1:大吉 2:中吉 3:小吉 4:凶");
	}
}


