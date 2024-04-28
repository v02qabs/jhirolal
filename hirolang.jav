import java.io.*;
import java.util.*;

class hirolang{
	public static void main(String[] args){
		System.out.println("Hello hirolang");
		String compileTo_file = args[0];
		System.out.println("fname = " + compileTo_file);
		new hirolang().open(compileTo_file);
	}
	private int count = 0;
	private String print0;
	private void open(String fname){
		System.out.println("fname open");
		try{
			File f = new File(fname);
			
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line = br.readLine();
			while(line!=null){
				String sp[] = line.split("\n");
				//line変数にすべてのファイルデータを格納する。
				//line を sp[]配列に、改行コードを識別＆分割して処理する
				//更に、sp[]配列内部で、print 行を見つけて、("")で、囲まれた
				//配置にある文字を抽出し、画面に出力する。
				for(int i=0;i<sp.length;i++){
					print0 =  sp[i];
					String print2[] = print0.split(" ");
					for(int b=0; b<print2.length; b++){
						String print3 = print2[b];
						if(print3.equals("print")){
								System.out.println("o : " + print2[1]);
						}
						plus(print3);
						//equal(print2[b]);
					}
				}
				line = br.readLine();

			}

		}
		catch(Exception error){
			System.out.println("読み込みエラー" + error.toString());
		}
	}
	private void plus(String plus_words){
			System.out.println("----------------------grep----------------------");
			equal(plus_words);
			System.out.println("print3 : " + plus_words);
			if(plus_words.equals("+")){
				System.out.println("足し算");
				set_position(i);
			}

	}
	private String Aplha(){
		return null;		
	}

    public boolean isAlpha(String s) {
        return s != null && s.chars().allMatch(Character::isLetter);
    }

	private void equal(String str){
		try{
			String intStr = str.replaceAll("[^0-9]", "");
			//print3 = str = 数値
			System.out.println("見つかった数値：" + Integer.valueOf(intStr));
			write_plus_words(intStr);
		}catch(Exception error){}

	}


}
