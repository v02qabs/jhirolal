import java.io.*;


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
			if(fname.
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line = br.readLine();
			while(line != null){
				System.out.println(line + "\n");
				line = br.readLine();
			}
		}
		catch(Exception error){
			System.out.println("読み込みエラー");
		}
	}

}