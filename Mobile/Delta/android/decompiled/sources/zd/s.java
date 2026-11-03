package zd;

import android.util.Log;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f38090a;
    public final /* synthetic */ a b;

    public s(a aVar, Set set) {
        this.b = aVar;
        this.f38090a = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.i(this.f38090a);
        } catch (Exception e10) {
            Log.e("SplitCompat", "Failed to remove from splitcompat storage split that is already installed", e10);
        }
    }
}
