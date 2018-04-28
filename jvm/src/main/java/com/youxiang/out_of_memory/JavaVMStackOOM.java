package com.youxiang.out_of_memory;

/**
 * @author: Rivers
 * @date: 2018/4/28
 */
public class JavaVMStackOOM {

    /**
     * VM args:-Xss2M
     * @param args
     */
    public static void main(String[] args) {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
    }

    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(() -> dontStop());
            thread.start();
        }
    }

    private void dontStop() {
        while (true) {
        }
    }
}
