import java.io.*;
import java.util.*;

class hirolang{
	public static void main(String[] args){
		System.out.println("Hello hirolang");
		String compileTo_file = args[0];
		System.out.println("fname = " + compileTo_file);
		new hirolang().open(compileTo_file);
	}
	private void open(String fname){
		System.out.println("fname open");
		try{
			File f = new File(fname);
			
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line = br.readLine();
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
				line = br.readLine();
			}
		}
		catch(Exception error){
			System.out.println("読み込みエラー");
		}
	}

}

