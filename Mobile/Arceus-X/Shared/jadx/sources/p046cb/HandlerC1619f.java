package p046cb;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: cb.f */
/* JADX INFO: loaded from: classes.dex */
public class HandlerC1619f extends Handler {

    /* JADX INFO: renamed from: a */
    public final Looper f6303a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public HandlerC1619f(Looper looper) {
        super(looper);
        this.f6303a = Looper.getMainLooper();
    }

    public HandlerC1619f(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f6303a = Looper.getMainLooper();
    }
}
