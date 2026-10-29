package p210j6;

import android.content.Context;
import backtraceio.library.anr.AnrType;
import backtraceio.library.anr.BacktraceANRHandler;
import backtraceio.library.anr.BacktraceANRSettings;
import backtraceio.library.anr.BacktraceAppExitInfoSenderHandler;
import backtraceio.library.base.BacktraceBase;
import backtraceio.library.events.OnServerResponseEventListener;
import backtraceio.library.interfaces.Database;
import backtraceio.library.models.json.BacktraceReport;
import backtraceio.library.watchdog.BacktraceANRHandlerWatchdog;
import backtraceio.library.watchdog.OnApplicationNotRespondingEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: j6.a */
/* JADX INFO: loaded from: classes.dex */
public class C7032a extends BacktraceBase {

    /* JADX INFO: renamed from: a */
    public BacktraceANRHandler f27592a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7032a(Context context, C7033b c7033b) {
        this(context, c7033b, (Database) null);
    }

    /* JADX INFO: renamed from: a */
    public BacktraceANRHandler m29717a(AnrType anrType, BacktraceANRSettings backtraceANRSettings) {
        if (anrType == AnrType.ApplicationExit) {
            return new BacktraceAppExitInfoSenderHandler(this, this.context);
        }
        if (anrType == AnrType.Threshold) {
            return new BacktraceANRHandlerWatchdog(this, backtraceANRSettings.getTimeout(), backtraceANRSettings.isDebug());
        }
        throw new IllegalArgumentException("Unsupported type of ANR: " + anrType.name());
    }

    /* JADX INFO: renamed from: b */
    public void m29718b(int i10, OnApplicationNotRespondingEvent onApplicationNotRespondingEvent) {
        m29719c(i10, onApplicationNotRespondingEvent, false);
    }

    /* JADX INFO: renamed from: c */
    public void m29719c(int i10, OnApplicationNotRespondingEvent onApplicationNotRespondingEvent, boolean z10) {
        m29721e(new BacktraceANRSettings(i10, onApplicationNotRespondingEvent, z10));
    }

    /* JADX INFO: renamed from: d */
    public void m29720d(AnrType anrType, BacktraceANRSettings backtraceANRSettings) {
        this.f27592a = m29722f(anrType, backtraceANRSettings);
    }

    /* JADX INFO: renamed from: e */
    public void m29721e(BacktraceANRSettings backtraceANRSettings) {
        m29720d(AnrType.Threshold, backtraceANRSettings);
    }

    /* JADX INFO: renamed from: f */
    public BacktraceANRHandler m29722f(AnrType anrType, BacktraceANRSettings backtraceANRSettings) {
        BacktraceANRHandler backtraceANRHandlerM29717a = m29717a(anrType, backtraceANRSettings);
        if (backtraceANRSettings.getOnApplicationNotRespondingEvent() != null) {
            backtraceANRHandlerM29717a.setOnApplicationNotRespondingEvent(backtraceANRSettings.getOnApplicationNotRespondingEvent());
        }
        return backtraceANRHandlerM29717a;
    }

    /* JADX INFO: renamed from: g */
    public void m29723g(Throwable th2) {
        m29724h(th2, null);
    }

    /* JADX INFO: renamed from: h */
    public void m29724h(Throwable th2, OnServerResponseEventListener onServerResponseEventListener) {
        m29725i(th2, null, onServerResponseEventListener);
    }

    /* JADX INFO: renamed from: i */
    public void m29725i(Throwable th2, Map<String, Object> map, OnServerResponseEventListener onServerResponseEventListener) {
        super.send(new BacktraceReport(th2, map), onServerResponseEventListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // backtraceio.library.base.BacktraceBase, backtraceio.library.interfaces.Client
    public void send(BacktraceReport backtraceReport) {
        send(backtraceReport, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C7032a(Context context, C7033b c7033b, List<String> list) {
        this(context, c7033b, (Database) null, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // backtraceio.library.base.BacktraceBase
    public void send(BacktraceReport backtraceReport, OnServerResponseEventListener onServerResponseEventListener) {
        super.send(backtraceReport, onServerResponseEventListener);
    }

    public C7032a(Context context, C7033b c7033b, Database database) {
        this(context, c7033b, database, new HashMap());
    }

    public C7032a(Context context, C7033b c7033b, Database database, List<String> list) {
        this(context, c7033b, database, null, list);
    }

    public C7032a(Context context, C7033b c7033b, Database database, Map<String, Object> map) {
        this(context, c7033b, database, map, null);
    }

    public C7032a(Context context, C7033b c7033b, Database database, Map<String, Object> map, List<String> list) {
        super(context, c7033b, database, map, list);
    }
}
