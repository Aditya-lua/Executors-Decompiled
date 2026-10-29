package l9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class q0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f23076a;
    private final p0 b;

    public q0(p0 p0Var) {
        this.b = p0Var;
    }

    public final void a(Context context) {
        this.f23076a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.f23076a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f23076a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.b.a();
            b();
        }
    }
}
