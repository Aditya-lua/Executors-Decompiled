package backtraceio.library.models.json;

import backtraceio.library.models.BacktraceStackFrame;
import java.util.ArrayList;
import java.util.List;
import mg.c;

/* JADX INFO: loaded from: classes.dex */
public class ThreadInformation {

    @c("fault")
    private final Boolean fault;

    @c("name")
    public String name;

    @c("stack")
    private final List<BacktraceStackFrame> stack;

    public ThreadInformation(String str, Boolean bool, List<BacktraceStackFrame> list) {
        this.stack = list == null ? new ArrayList<>() : list;
        this.name = str;
        this.fault = bool;
    }

    public Boolean getFault() {
        return this.fault;
    }

    public String getName() {
        return this.name;
    }

    public List<BacktraceStackFrame> getStack() {
        return this.stack;
    }

    public ThreadInformation(Thread thread, List<BacktraceStackFrame> list, Boolean bool) {
        this(thread.getName().toLowerCase(), bool, list);
    }
}
