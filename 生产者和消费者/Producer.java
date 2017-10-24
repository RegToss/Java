package runmain;

/**
 * 生产者
 * @author xq
 *
 */
public class Producer implements Runnable{

	private Storage storage;
	
	public Producer(Storage storage) {
		super();
		this.storage = storage;
	}

	@Override
	public void run() {
		while(true){
			storage.produce();
		}
	}
	
}
