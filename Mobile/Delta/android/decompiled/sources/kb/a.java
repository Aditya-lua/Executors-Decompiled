package kb;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Looper f22302a;

    public a(Looper looper) {
        super(looper);
        this.f22302a = Looper.getMainLooper();
    }
}
