package ib;

import android.content.Context;
import android.os.Looper;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class n extends x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f19321g;

    public n(Context context, Looper looper, l9.h.a aVar, l9.h.b bVar, String str, o9.f fVar) {
        super(context, looper, aVar, bVar, str, fVar);
        this.f19321g = new m(context, this.f19343f);
    }

    @Override // o9.d, l9.a.f
    public final void disconnect() {
        synchronized (this.f19321g) {
            if (isConnected()) {
                try {
                    this.f19321g.b();
                    this.f19321g.c();
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

    @Override // o9.d
    public final boolean usesClientTelemetry() {
        return true;
    }
}
