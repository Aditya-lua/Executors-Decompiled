package backtraceio.library.models.json;

import backtraceio.library.models.BacktraceStackFrame;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes.dex */
public class SourceCode {

    @SerializedName("path")
    public String sourceCodeFileName;

    @SerializedName("startLine")
    public Integer startLine;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SourceCode(BacktraceStackFrame backtraceStackFrame) {
        this(backtraceStackFrame.line, backtraceStackFrame.sourceCodeFileName);
    }

    public String getSourceCodeFileName() {
        return this.sourceCodeFileName;
    }

    public Integer getStartLine() {
        return this.startLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public SourceCode(Integer num, String str) {
        this.startLine = num;
        this.sourceCodeFileName = str;
    }
}
