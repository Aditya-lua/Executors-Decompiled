package cb;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class f extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Looper f4691a;

    public f(Looper looper) {
        super(looper);
        this.f4691a = Looper.getMainLooper();
    }

    public f(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f4691a = Looper.getMainLooper();
    }
}
