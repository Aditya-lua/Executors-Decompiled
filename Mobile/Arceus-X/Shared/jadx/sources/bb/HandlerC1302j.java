package bb;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: bb.j */
/* JADX INFO: loaded from: classes.dex */
public class HandlerC1302j extends Handler {

    /* JADX INFO: renamed from: a */
    public final Looper f5337a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public HandlerC1302j(Looper looper) {
        super(looper);
        this.f5337a = Looper.getMainLooper();
    }

    public HandlerC1302j(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f5337a = Looper.getMainLooper();
    }
}
