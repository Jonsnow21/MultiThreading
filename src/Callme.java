class Callme {
    synchronized void call(String msg){
        System.out.print("[" + msg );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.print("Interrupted");
        }
        System.out.println("]");
    }
}
