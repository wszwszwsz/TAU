public class RecordService 
{
    Database database;
    Network network;
     
    
 
    public Database getDatabase() {
		return database;
	}



	public void setDatabase(Database database) {
		this.database = database;
	}



	public Network getNetwork() {
		return network;
	}



	public void setNetwork(Network network) {
		this.network = network;
	}



	public boolean save(String fileName) 
    {
        database.save(fileName);
        System.out.println("Saved in database in Main class");
         
        network.save(fileName);
        System.out.println("Saved in network in Main class");
         
        return true;
    }
}