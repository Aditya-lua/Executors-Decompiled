package hb;

import android.content.Context;
import android.os.Looper;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class n extends v {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f18760g;

    public n(Context context, Looper looper, k9.f.a aVar, k9.f.b bVar, String str, n9.d dVar) {
        super(context, looper, aVar, bVar, str, dVar);
        this.f18760g = new m(context, this.f18764f);
    }

    @Override // n9.c, k9.a.f
    public final void disconnect() {
        synchronized (this.f18760g) {
            if (isConnected()) {
                try {
                    this.f18760g.b();
                    this.f18760g.c();
                } catch (Exception e10) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e10);
                }
                super.disconnect();
            } else {
                super.disconnect();
            }
            throw th;
        }
    }

    @Override // n9.c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
