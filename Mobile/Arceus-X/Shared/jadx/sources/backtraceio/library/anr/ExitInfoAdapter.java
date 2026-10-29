package backtraceio.library.anr;

import android.app.ApplicationExitInfo;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class ExitInfoAdapter implements ExitInfo {
    private final ApplicationExitInfo systemExitInfo;

    public ExitInfoAdapter(ApplicationExitInfo applicationExitInfo) {
        this.systemExitInfo = applicationExitInfo;
    }

    @Override // backtraceio.library.anr.ExitInfo
    public String getDescription() {
        return this.systemExitInfo.getDescription();
    }

    @Override // backtraceio.library.anr.ExitInfo
    public int getImportance() {
        return this.systemExitInfo.getImportance();
    }

    @Override // backtraceio.library.anr.ExitInfo
    public int getPid() {
        return this.systemExitInfo.getPid();
    }

    @Override // backtraceio.library.anr.ExitInfo
    public long getPss() {
        return this.systemExitInfo.getPss();
    }

    @Override // backtraceio.library.anr.ExitInfo
    public int getReason() {
        return this.systemExitInfo.getReason();
    }

    @Override // backtraceio.library.anr.ExitInfo
    public long getRss() {
        return this.systemExitInfo.getRss();
    }

    @Override // backtraceio.library.anr.ExitInfo
    public long getTimestamp() {
        return this.systemExitInfo.getTimestamp();
    }

    @Override // backtraceio.library.anr.ExitInfo
    public InputStream getTraceInputStream() {
        return this.systemExitInfo.getTraceInputStream();
    }

    @Override // backtraceio.library.anr.ExitInfo
    public int getUid() {
        return this.systemExitInfo.getDefiningUid();
    }
}
