package be;

import android.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f4012a;
    public final /* synthetic */ ae.i0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f4013c;

    public k(l lVar, List list, ae.i0 i0Var) {
        this.f4013c = lVar;
        this.f4012a = list;
        this.b = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f4013c.f4016c.b(this.f4012a)) {
                l.d(this.f4013c, this.b);
            } else {
                l.c(this.f4013c, this.f4012a, this.b);
            }
        } catch (Exception e10) {
            Log.e("SplitCompat", "Error checking verified files.", e10);
            this.b.a(-11);
        }
    }
}
