class Caller implements Runnable {
    private String msg;
    private Callme target;
    Thread t;

    Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }
    public void run() {
        target.call(msg);
    }
}

