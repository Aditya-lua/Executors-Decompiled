package p191i9;

import android.os.Bundle;
import android.util.Log;
import sb.C11264k;

/* JADX INFO: renamed from: i9.y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6714y {

    /* JADX INFO: renamed from: a */
    public final int f25821a;

    /* JADX INFO: renamed from: b */
    public final C11264k f25822b = new C11264k();

    /* JADX INFO: renamed from: c */
    public final int f25823c;

    /* JADX INFO: renamed from: d */
    public final Bundle f25824d;

    public AbstractC6714y(int i10, int i11, Bundle bundle) {
        this.f25821a = i10;
        this.f25823c = i11;
        this.f25824d = bundle;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo28777a(Bundle bundle);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo28778b();

    /* JADX INFO: renamed from: c */
    public final void m28809c(C6715z c6715z) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + c6715z.toString());
        }
        this.f25822b.m42327b(c6715z);
    }

    /* JADX INFO: renamed from: d */
    public final void m28810d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(obj));
        }
        this.f25822b.m42328c(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f25823c + " id=" + this.f25821a + " oneWay=" + mo28778b() + "}";
    }
}
