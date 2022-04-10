public class Main {
    public static void main(String[] args) {
        Worker.OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;
        Worker worker = new Worker(listener, errorListener);
        worker.start();
    }

    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError(String result);
    }

}
