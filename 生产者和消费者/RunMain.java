package runmain;
/**
 * 运行main方法
 * @author xq
 *
 */
public class RunMain {
	public static void main(String[] args) {
		Storage storage = new Storage();
		Consumer consumer = new Consumer(storage);
		Producer producer = new Producer(storage);
		new Thread(consumer).start();
		new Thread(producer).start();
	}
}
