package p166hb;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import p242k9.AbstractC7496f;
import p305n9.C8926d;

/* JADX INFO: renamed from: hb.n */
/* JADX INFO: loaded from: classes.dex */
public final class C6340n extends C6348v {

    /* JADX INFO: renamed from: g */
    public final C6339m f24083g;

    public C6340n(Context context, Looper looper, AbstractC7496f.a aVar, AbstractC7496f.b bVar, String str, C8926d c8926d) {
        super(context, looper, aVar, bVar, str, c8926d);
        this.f24083g = new C6339m(context, this.f24087f);
    }

    @Override // p305n9.AbstractC8923c, p242k9.C7491a.f
    public final void disconnect() {
        synchronized (this.f24083g) {
            if (isConnected()) {
                try {
                    this.f24083g.m27647b();
                    this.f24083g.m27648c();
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

    @Override // p305n9.AbstractC8923c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
