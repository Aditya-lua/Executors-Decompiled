package bb;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class j extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Looper f4085a;

    public j(Looper looper) {
        super(looper);
        this.f4085a = Looper.getMainLooper();
    }

    public j(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f4085a = Looper.getMainLooper();
    }
}
