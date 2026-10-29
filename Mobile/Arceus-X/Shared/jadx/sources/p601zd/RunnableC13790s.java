package p601zd;

import android.util.Log;
import java.util.Set;

/* JADX INFO: renamed from: zd.s */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC13790s implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Set f48384a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C13772a f48385b;

    public RunnableC13790s(C13772a c13772a, Set set) {
        this.f48385b = c13772a;
        this.f48384a = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f48385b.m50198i(this.f48384a);
        } catch (Exception e10) {
            Log.e("SplitCompat", "Failed to remove from splitcompat storage split that is already installed", e10);
        }
    }
}
