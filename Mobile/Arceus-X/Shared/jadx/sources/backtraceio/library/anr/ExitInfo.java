package backtraceio.library.anr;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public interface ExitInfo {
    String getDescription();

    int getImportance();

    int getPid();

    long getPss();

    int getReason();

    long getRss();

    long getTimestamp();

    InputStream getTraceInputStream();

    int getUid();
}
