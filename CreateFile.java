import java.io.*;
class CreateFile
{
public static void main(String args[])throws IOException
{
DataInputStream dis=new DataInputStream(System.in);
FileOutputStream fout=new FileOutputStream("Myfile.txt");
System.out.println("enter text (@ at the end):");
char ch;
while((ch=(char)dis.read())!='@')
fout.write(ch);
fout.close();
}
}