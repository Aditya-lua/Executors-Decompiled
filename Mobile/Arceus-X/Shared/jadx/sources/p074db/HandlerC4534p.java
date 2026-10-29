package p074db;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: db.p */
/* JADX INFO: loaded from: classes.dex */
public class HandlerC4534p extends Handler {

    /* JADX INFO: renamed from: a */
    public final Looper f18582a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public HandlerC4534p(Looper looper) {
        super(looper);
        this.f18582a = Looper.getMainLooper();
    }

    public HandlerC4534p(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f18582a = Looper.getMainLooper();
    }
}
