package backtraceio.library.models.json;

import backtraceio.library.models.BacktraceStackFrame;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes.dex */
public class SourceCode {

    @SerializedName("path")
    public String sourceCodeFileName;

    @SerializedName("startLine")
    public Integer startLine;

    public SourceCode(BacktraceStackFrame backtraceStackFrame) {
        this(backtraceStackFrame.line, backtraceStackFrame.sourceCodeFileName);
    }

    public String getSourceCodeFileName() {
        return this.sourceCodeFileName;
    }

    public Integer getStartLine() {
        return this.startLine;
    }

    public SourceCode(Integer num, String str) {
        this.startLine = num;
        this.sourceCodeFileName = str;
    }
}
