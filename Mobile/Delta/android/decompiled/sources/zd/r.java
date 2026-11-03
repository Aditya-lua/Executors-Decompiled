package zd;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f38089a;

    public r(a aVar) {
        this.f38089a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f38089a.f38069a.k();
        } catch (Exception e10) {
            Log.e("SplitCompat", "Failed to cleanup splitcompat storage", e10);
        }
    }
}
