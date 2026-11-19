package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import y5.p0;
import y5.w;
import y5.z;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3033a = w.i("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        w.e().a(f3033a, "Requesting diagnostics");
        try {
            p0.h(context).d(z.e(DiagnosticsWorker.class));
        } catch (IllegalStateException e10) {
            w.e().d(f3033a, "WorkManager is not initialized", e10);
        }
    }
}
