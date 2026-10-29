package backtraceio.library.models.json;

import backtraceio.library.logger.BacktraceLogger;
import backtraceio.library.models.BacktraceStackFrame;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class SourceCodeData {
    private static final transient String LOG_TAG = "SourceCodeData";
    public final Map<String, SourceCode> data = new HashMap();

    public SourceCodeData(List<BacktraceStackFrame> list) {
        String str = LOG_TAG;
        BacktraceLogger.m7080d(str, "Initialization source code data");
        if (list == null || list.size() == 0) {
            BacktraceLogger.m7083w(str, "Exception stack is null or empty");
            return;
        }
        for (BacktraceStackFrame backtraceStackFrame : list) {
            if (backtraceStackFrame == null || backtraceStackFrame.sourceCode.equals("")) {
                BacktraceLogger.m7083w(LOG_TAG, "Stack frame is null or sourceCode is empty");
            } else {
                this.data.put(backtraceStackFrame.sourceCode, new SourceCode(backtraceStackFrame));
            }
        }
    }
}
