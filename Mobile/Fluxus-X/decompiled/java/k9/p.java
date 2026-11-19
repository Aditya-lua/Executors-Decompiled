package k9;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"HandlerLeak"})
public final class p extends cb.j {
    public final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f21284c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f21284c = eVar;
        this.b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        e eVar = this.f21284c;
        int iG = eVar.g(this.b);
        if (eVar.j(iG)) {
            this.f21284c.q(this.b, iG);
        }
    }
}
