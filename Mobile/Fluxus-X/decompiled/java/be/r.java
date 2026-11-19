package be;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f3981a;

    public r(a aVar) {
        this.f3981a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f3981a.f3961a.k();
        } catch (Exception e10) {
            Log.e("SplitCompat", "Failed to cleanup splitcompat storage", e10);
        }
    }
}
