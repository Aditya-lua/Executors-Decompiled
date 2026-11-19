package j9;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20203a;
    public final tb.k b = new tb.k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f20205d;

    public a0(int i10, int i11, Bundle bundle) {
        this.f20203a = i10;
        this.f20204c = i11;
        this.f20205d = bundle;
    }

    public abstract void a(Bundle bundle);

    public abstract boolean b();

    public final void c(b0 b0Var) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + b0Var.toString());
        }
        this.b.b(b0Var);
    }

    public final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(obj));
        }
        this.b.c(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f20204c + " id=" + this.f20203a + " oneWay=" + b() + "}";
    }
}
