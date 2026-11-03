package db;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class p extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Looper f14528a;

    public p(Looper looper) {
        super(looper);
        this.f14528a = Looper.getMainLooper();
    }

    public p(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f14528a = Looper.getMainLooper();
    }
}
