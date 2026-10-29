package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import p536x5.AbstractC12719p0;
import p536x5.AbstractC12732w;
import p536x5.C12738z;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final String f4603a = AbstractC12732w.m47443i("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        AbstractC12732w.m47441e().mo47444a(f4603a, "Requesting diagnostics");
        try {
            AbstractC12719p0.m47392h(context).m47397d(C12738z.m47455e(DiagnosticsWorker.class));
        } catch (IllegalStateException e10) {
            AbstractC12732w.m47441e().mo47447d(f4603a, "WorkManager is not initialized", e10);
        }
    }
}
