public class GarbageCollectionExample {
    static  int a = 1;
    public static void main(String[] args) {

        // 创建大量对象
        for (int i = 0; i < 10; i++) {
            new GarbageObject();
        }

        // 手动触发垃圾回收
        System.gc();

        // 延迟一段时间
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}

class GarbageObject {
    // 构造方法
    public GarbageObject() {
        // 输出对象创建信息
        System.out.println("Creating new GarbageObject");
    }

    // finalize方法，在对象被垃圾回收前调用
    @Override
    protected void finalize() throws Throwable {
        // 输出对象被回收信息
        System.out.println("GarbageObject is being collected");
    }
}
