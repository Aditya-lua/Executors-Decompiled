package j6;

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

/* JADX INFO: loaded from: classes.dex */
public class a extends BacktraceBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BacktraceANRHandler f21097a;

    public a(Context context, b bVar) {
        this(context, bVar, (Database) null);
    }

    public BacktraceANRHandler a(AnrType anrType, BacktraceANRSettings backtraceANRSettings) {
        if (anrType == AnrType.ApplicationExit) {
            return new BacktraceAppExitInfoSenderHandler(this, this.context);
        }
        if (anrType == AnrType.Threshold) {
            return new BacktraceANRHandlerWatchdog(this, backtraceANRSettings.getTimeout(), backtraceANRSettings.isDebug());
        }
        throw new IllegalArgumentException("Unsupported type of ANR: " + anrType.name());
    }

    public void b(int i10, OnApplicationNotRespondingEvent onApplicationNotRespondingEvent) {
        c(i10, onApplicationNotRespondingEvent, false);
    }

    public void c(int i10, OnApplicationNotRespondingEvent onApplicationNotRespondingEvent, boolean z10) {
        e(new BacktraceANRSettings(i10, onApplicationNotRespondingEvent, z10));
    }

    public void d(AnrType anrType, BacktraceANRSettings backtraceANRSettings) {
        this.f21097a = f(anrType, backtraceANRSettings);
    }

    public void e(BacktraceANRSettings backtraceANRSettings) {
        d(AnrType.Threshold, backtraceANRSettings);
    }

    public BacktraceANRHandler f(AnrType anrType, BacktraceANRSettings backtraceANRSettings) {
        BacktraceANRHandler backtraceANRHandlerA = a(anrType, backtraceANRSettings);
        if (backtraceANRSettings.getOnApplicationNotRespondingEvent() != null) {
            backtraceANRHandlerA.setOnApplicationNotRespondingEvent(backtraceANRSettings.getOnApplicationNotRespondingEvent());
        }
        return backtraceANRHandlerA;
    }

    public void g(Throwable th2) {
        h(th2, null);
    }

    public void h(Throwable th2, OnServerResponseEventListener onServerResponseEventListener) {
        i(th2, null, onServerResponseEventListener);
    }

    public void i(Throwable th2, Map<String, Object> map, OnServerResponseEventListener onServerResponseEventListener) {
        super.send(new BacktraceReport(th2, map), onServerResponseEventListener);
    }

    @Override // backtraceio.library.base.BacktraceBase, backtraceio.library.interfaces.Client
    public void send(BacktraceReport backtraceReport) {
        send(backtraceReport, null);
    }

    public a(Context context, b bVar, List<String> list) {
        this(context, bVar, (Database) null, list);
    }

    @Override // backtraceio.library.base.BacktraceBase
    public void send(BacktraceReport backtraceReport, OnServerResponseEventListener onServerResponseEventListener) {
        super.send(backtraceReport, onServerResponseEventListener);
    }

    public a(Context context, b bVar, Database database) {
        this(context, bVar, database, new HashMap());
    }

    public a(Context context, b bVar, Database database, List<String> list) {
        this(context, bVar, database, null, list);
    }

    public a(Context context, b bVar, Database database, Map<String, Object> map) {
        this(context, bVar, database, map, null);
    }

    public a(Context context, b bVar, Database database, Map<String, Object> map, List<String> list) {
        super(context, bVar, database, map, list);
    }
}
