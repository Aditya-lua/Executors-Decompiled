package p268l9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: renamed from: l9.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8067q0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    Context f30081a;

    /* JADX INFO: renamed from: b */
    private final AbstractC8064p0 f30082b;

    public C8067q0(AbstractC8064p0 abstractC8064p0) {
        this.f30082b = abstractC8064p0;
    }

    /* JADX INFO: renamed from: a */
    public final void m33268a(Context context) {
        this.f30081a = context;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m33269b() {
        try {
            Context context = this.f30081a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f30081a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f30082b.mo33264a();
            m33269b();
        }
    }
}
