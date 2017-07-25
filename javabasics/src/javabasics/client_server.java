package javabasics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class client_server {
public static void main(String[] args)
{
	
	new Thread(new SimpleServer()).start();
	new Thread(new SimpleClient()).start();
	
}
static class SimpleServer implements Runnable{
	@Override
	public void run(){
		ServerSocket serversocket = null;
		while(true)
		{
			try{
				serversocket = new ServerSocket(3333);
				Socket clientsocket =serversocket.accept();
				BufferedReader inputreader = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
				System.out.print("client said :"+inputreader.readLine());
				
			}catch(IOException e){
				e.printStackTrace();
			}finally{
				try{
					serversocket.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}
}
static class SimpleClient implements Runnable{
	@Override
	public void run()
	{
		Socket socket = null;
		try{
			Thread.sleep(6000);
			socket = new Socket("localhost",3333);
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
			out.println("Mr.Server");
			
		}catch(InterruptedException e){
			e.printStackTrace();		
			}catch(UnknownHostException e){
				e.printStackTrace();
			}catch(IOException e){
				e.printStackTrace();
			}finally{
				try{
					socket.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
	}
}
}
