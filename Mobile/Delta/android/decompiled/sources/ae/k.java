package ae;

import android.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f340a;
    public final /* synthetic */ zd.i0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f341c;

    public k(l lVar, List list, zd.i0 i0Var) {
        this.f341c = lVar;
        this.f340a = list;
        this.b = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f341c.f344c.b(this.f340a)) {
                l.d(this.f341c, this.b);
            } else {
                l.c(this.f341c, this.f340a, this.b);
            }
        } catch (Exception e10) {
            Log.e("SplitCompat", "Error checking verified files.", e10);
            this.b.a(-11);
        }
    }
}
