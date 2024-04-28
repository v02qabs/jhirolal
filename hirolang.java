import java.io.*;
import java.util.*;

class hirolang{
	public static void main(String[] args){
		System.out.println("Hello hirolang");
		String compileTo_file = args[0];
		System.out.println("fname = " + compileTo_file);
		new hirolang().open(compileTo_file);
		new hirolang().plus_words_read();
	}
	private int count = 0;
	private String print0;
	private void open(String fname){
		System.out.println("fname open");
		try{
			File f = new File(fname);
			
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line = br.readLine();
<<<<<<< HEAD
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
=======
			while(line != null){
				//System.out.println(line + "\n");
				try{
					String[] koubun = { "print", String.valueOf('+')};
					for(String s : koubun){
					String[] print_split = line.split(s);
					
					//System.out.println("s2" + print_split[1]);
						String print_words = print_split[1];
							String words_s[] = print_words.split("\"");
							String words_cack = words_s[1];
							System.out.println("words_s[1] :" + words_cack);
					}
			
				}
				catch(Exception error)
				{
					//System.out.println("null");
				}
				//System.out.println(line);
>>>>>>> d9b444ebbf7b822ff6847cc2f376f547befe1767
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
				write_plus_words(plus_words);
			}

	}
	private String Aplha(){
		return null;		
	}

    public boolean isAlpha(String s) {
        return s != null && s.chars().allMatch(Character::isLetter);
    }
    private int inIn = 0;
    private int Plus = 0;

	private void equal(String str){
		try{
			String intStr = str.replaceAll("[^0-9]", "");
			//print3 = str = 数値
			System.out.println("見つかった数値：" + Integer.valueOf(intStr));
			write_plus_words(intStr);
		}catch(Exception error){}

	}
	private void plus_words_read(){
		try{
			BufferedReader br = new BufferedReader(new FileReader("./data.txt"));
	
			String line = br.readLine();
			while(line != null){
				boolean t = line.matches("^[0-9]");
				if(!t){
y					break;}
				else{
					System.out.println("t: " + t);
				}



			}
		}
		catch(Exception error){
				}

	
	}
	private void set_num_posistion(int i){
			System.out.println("i : " + i);
	}

	private void write_plus_words(String plus_words){
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter("./data.txt", true));
			bw.write(plus_words);
			bw.close();
		}
		catch(Exception error)
		{
			System.out.println("");
		}
	}

}
