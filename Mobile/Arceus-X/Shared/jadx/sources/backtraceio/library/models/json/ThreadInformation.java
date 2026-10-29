package backtraceio.library.models.json;

import backtraceio.library.models.BacktraceStackFrame;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ThreadInformation {

    @SerializedName("fault")
    private final Boolean fault;

    @SerializedName("name")
    public String name;

    @SerializedName("stack")
    private final List<BacktraceStackFrame> stack;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
