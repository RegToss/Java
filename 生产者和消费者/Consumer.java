package runmain;

public class Consumer implements Runnable{

	private Storage storage;
	
	public Consumer(Storage storage) {
		super();
		this.storage = storage;
	}



	@Override
	public void run() {
		while(true){
			storage.consume();
		}
	}

}
