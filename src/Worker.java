public class Worker {

    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }

    private OnTaskDoneListener callback;
    private Main.OnTaskErrorListener errorListener;


    public Worker(OnTaskDoneListener callback, Main.OnTaskErrorListener errorListener) {
        this.callback = callback;
        this.errorListener = errorListener;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                callback.onDone("Task " + i + " is error");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}
