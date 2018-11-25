package com.ensa.chat.rmi.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.ensa.chat.rmi.serveur.ChatServerIF;

public class ChatClientMain{

	public static void main(String[] args)
			 throws MalformedURLException, RemoteException,NotBoundException{
		String chatServerURL="rmi://localhost/RMIChatServer";
		ChatServerIF chatServer=(ChatServerIF) Naming.lookup(chatServerURL);
		new Thread(new ChatClient(args[0],chatServer)).start();
	}
}
