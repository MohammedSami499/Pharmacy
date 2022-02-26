package serviceImp;

import java.util.ArrayList;

import models.Bills;
import models.Clients;
import service.ClientService;
import service.PrintingData;

public class ClientServiceImp implements ClientService , PrintingData{

	ArrayList<Clients> clients ;
	
	public ClientServiceImp() {
		clients = new ArrayList<Clients>();
	}
	
	@Override
	public void addClient(Clients client) {

		clients.add(client);
		
	}

	@Override
	public void removeClient(int id) {
		clients.remove(id);
		
	}

	@Override
	public Clients searchClient(int id) {
		return clients.get(id);
	}

	@Override
	public void showAllData() {

		for(Clients cli : clients) {
			System.out.println(cli.getId() + " , " + cli.getName() + " , " + cli.getAge() + " , " + cli.getPhoneNo() + " , " + cli.getLastVisit()  + " , " +cli.getGender());
		}
		
		
	}

	@Override
	public void showItemData(int id) {
		
		Clients cli = clients.get(id);
		System.out.println(cli.getId() + " , " + cli.getName() + " , " + cli.getAge() + " , " + cli.getPhoneNo() + " , " + cli.getLastVisit()  + " , " +cli.getGender());
		
	}

}
