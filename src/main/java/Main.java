import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ThreadA extends Thread {
    private Lock lock1, lock2;

    public ThreadA(Lock lock1, Lock lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    public void run() {
        boolean gotLock1 = false;
        boolean gotLock2 = false;

        try {
            gotLock1 = lock1.tryLock();
            gotLock2 = lock2.tryLock();

            if (gotLock1 && gotLock2) {
                // Perform operations
                System.out.println("ThreadA acquired both locks");
            }
        } finally {
            if (gotLock1) {
                lock1.unlock();
            }
            if (gotLock2) {
                lock2.unlock();
            }
        }
    }
}

class ThreadB extends Thread {
    private Lock lock1, lock2;

    public ThreadB(Lock lock1, Lock lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    public void run() {
        boolean gotLock1 = false;
        boolean gotLock2 = false;

        try {
            gotLock1 = lock1.tryLock();
            gotLock2 = lock2.tryLock();

            if (gotLock1 && gotLock2) {
                // Perform operations
                System.out.println("ThreadB acquired both locks");
            }
        } finally {
            if (gotLock1) {
                lock1.unlock();
            }
            if (gotLock2) {
                lock2.unlock();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        ThreadA threadA = new ThreadA(lock1, lock2);
        ThreadB threadB = new ThreadB(lock1, lock2);

        threadA.start();
        threadB.start();
    }
}
