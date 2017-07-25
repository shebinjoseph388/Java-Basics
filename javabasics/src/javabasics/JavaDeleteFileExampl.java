package javabasics;
import java.io.File;
public class JavaDeleteFileExampl {
	private static final String File_Path = "H:\\eg\\eg.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
if(JavaDeleteFileExampl.deleteFile(File_Path)){
	System.out.println("file deleted");;
}else{
	System.out.println("not deleted");
}
	}
	public static boolean deleteFile(String File_Path){
		File file = new File(File_Path);
		return file.delete();
	}

}
