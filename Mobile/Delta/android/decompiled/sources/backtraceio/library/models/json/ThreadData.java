package backtraceio.library.models.json;

import backtraceio.library.models.BacktraceStackFrame;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ThreadData {
    public Map<String, ThreadInformation> threadInformation = new HashMap();
    private String mainThread = "";

    public ThreadData(List<BacktraceStackFrame> list) {
        generateCurrentThreadInformation(list);
        processThreads();
    }

    private void generateCurrentThreadInformation(List<BacktraceStackFrame> list) {
        Thread threadCurrentThread = Thread.currentThread();
        String lowerCase = threadCurrentThread.getName().toLowerCase();
        this.mainThread = lowerCase;
        this.threadInformation.put(lowerCase, new ThreadInformation(threadCurrentThread, list, Boolean.TRUE));
    }

    private void processThreads() {
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            if (entry.getKey() != null) {
                Thread key = entry.getKey();
                StackTraceElement[] value = entry.getValue();
                String lowerCase = key.getName().toLowerCase();
                ArrayList arrayList = new ArrayList();
                if (!getMainThread().equals(lowerCase)) {
                    if (value != null && value.length != 0) {
                        for (StackTraceElement stackTraceElement : value) {
                            arrayList.add(BacktraceStackFrame.fromStackTraceElement(stackTraceElement));
                        }
                    }
                    this.threadInformation.put(lowerCase, new ThreadInformation(key, arrayList, Boolean.FALSE));
                }
            }
        }
    }

    public String getMainThread() {
        return this.mainThread;
    }
}
