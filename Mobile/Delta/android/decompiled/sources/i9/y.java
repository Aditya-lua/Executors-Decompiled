package i9;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20445a;
    public final sb.k b = new sb.k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f20447d;

    public y(int i10, int i11, Bundle bundle) {
        this.f20445a = i10;
        this.f20446c = i11;
        this.f20447d = bundle;
    }

    public abstract void a(Bundle bundle);

    public abstract boolean b();

    public final void c(z zVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + zVar.toString());
        }
        this.b.b(zVar);
    }

    public final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(obj));
        }
        this.b.c(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f20446c + " id=" + this.f20445a + " oneWay=" + b() + "}";
    }
}
