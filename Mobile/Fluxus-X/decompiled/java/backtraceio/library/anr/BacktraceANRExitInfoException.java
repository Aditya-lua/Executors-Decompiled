package backtraceio.library.anr;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class BacktraceANRExitInfoException extends Exception {
    private final transient StackTraceElement[] anrStackTrace;

    public BacktraceANRExitInfoException(ExitInfo exitInfo, StackTraceElement[] stackTraceElementArr) {
        super(AppExitInfoDetailsExtractor.getANRMessage(exitInfo));
        this.anrStackTrace = stackTraceElementArr;
    }

    @Override // java.lang.Throwable
    @NonNull
    public StackTraceElement[] getStackTrace() {
        StackTraceElement[] stackTraceElementArr = this.anrStackTrace;
        return stackTraceElementArr != null ? stackTraceElementArr : super.getStackTrace();
    }
}
