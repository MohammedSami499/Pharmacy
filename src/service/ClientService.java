package service;

import models.Clients;

public interface ClientService {

	public void addClient(Clients client);
	
	public void removeClient(int id);
	
	public Clients searchClient(int id);
	
}
