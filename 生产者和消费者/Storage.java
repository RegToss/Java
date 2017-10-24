package runmain;

/**
 * 库存
 * @author xq
 *
 */
public class Storage {
	// 最大 库存量
	private static final int MAX_SIZE = 100;
	// 当前库存量
	private int current_size = 0;

	// 加库存
	public void produce() {
		synchronized (this) {
			if (current_size >= MAX_SIZE) {
				try {
					System.out.println("【库存已满】，当前库存：" + current_size);
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("生产者生产商品，当前库存:"+ (++current_size));
			notifyAll();
		}
	}

	// 减库存
	public void consume() {
		synchronized (this) {
			if (current_size <= 0) {
				try {
					System.out.println("【库存不足】，当前库存：" + current_size);
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("消费者消费商品，当前库存:"+ (--current_size));
			notifyAll();
		}
	}
}
