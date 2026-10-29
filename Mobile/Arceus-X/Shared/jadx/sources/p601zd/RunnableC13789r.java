package p601zd;

import android.util.Log;

/* JADX INFO: renamed from: zd.r */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC13789r implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C13772a f48383a;

    public RunnableC13789r(C13772a c13772a) {
        this.f48383a = c13772a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f48383a.f48355a.m50222k();
        } catch (Exception e10) {
            Log.e("SplitCompat", "Failed to cleanup splitcompat storage", e10);
        }
    }
}
