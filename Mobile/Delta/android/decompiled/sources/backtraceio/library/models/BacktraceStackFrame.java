package backtraceio.library.models;

import backtraceio.library.logger.BacktraceLogger;
import com.google.gson.annotations.SerializedName;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceStackFrame {
    private static final transient String LOG_TAG = "BacktraceStackFrame";

    @SerializedName("funcName")
    public String functionName;

    @SerializedName("line")
    public Integer line;

    @SerializedName("sourceCode")
    public String sourceCode;
    public transient String sourceCodeFileName;

    @Deprecated
    public BacktraceStackFrame() {
        this.line = null;
    }

    public static BacktraceStackFrame fromStackTraceElement(StackTraceElement stackTraceElement) {
        if (stackTraceElement == null || stackTraceElement.getMethodName() == null) {
            BacktraceLogger.e(LOG_TAG, "Frame or method name is null");
            throw new IllegalArgumentException("Frame or method name is null");
        }
        return new BacktraceStackFrame(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber() > 0 ? Integer.valueOf(stackTraceElement.getLineNumber()) : null);
    }

    @Deprecated
    public BacktraceStackFrame(StackTraceElement stackTraceElement) {
        this.line = null;
        BacktraceStackFrame backtraceStackFrameFromStackTraceElement = fromStackTraceElement(stackTraceElement);
        if (backtraceStackFrameFromStackTraceElement != null) {
            this.functionName = backtraceStackFrameFromStackTraceElement.functionName;
            this.sourceCodeFileName = backtraceStackFrameFromStackTraceElement.sourceCodeFileName;
            this.sourceCode = backtraceStackFrameFromStackTraceElement.sourceCode;
            this.line = backtraceStackFrameFromStackTraceElement.line;
            return;
        }
        throw new IllegalArgumentException("Wrong stacktrace element frame - can`t be null");
    }

    public BacktraceStackFrame(String str, String str2, Integer num) {
        this(str, str2, num, UUID.randomUUID().toString());
    }

    public BacktraceStackFrame(String str, String str2, Integer num, String str3) {
        this.functionName = str;
        this.sourceCodeFileName = str2;
        this.sourceCode = str3;
        this.line = num;
    }
}
