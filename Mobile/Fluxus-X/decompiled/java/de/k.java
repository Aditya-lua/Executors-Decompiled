package de;

import android.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f12210a;
    public final /* synthetic */ ce.i0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f12211c;

    public k(l lVar, List list, ce.i0 i0Var) {
        this.f12211c = lVar;
        this.f12210a = list;
        this.b = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f12211c.f12214c.b(this.f12210a)) {
                l.d(this.f12211c, this.b);
            } else {
                l.c(this.f12211c, this.f12210a, this.b);
            }
        } catch (Exception e10) {
            Log.e("SplitCompat", "Error checking verified files.", e10);
            this.b.a(-11);
        }
    }
}
