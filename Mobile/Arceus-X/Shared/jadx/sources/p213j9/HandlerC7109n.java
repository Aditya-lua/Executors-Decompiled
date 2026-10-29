package p213j9;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import bb.HandlerC1302j;

/* JADX INFO: renamed from: j9.n */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"HandlerLeak"})
public final class HandlerC7109n extends HandlerC1302j {

    /* JADX INFO: renamed from: b */
    public final Context f27735b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C7089c f27736c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC7109n(C7089c c7089c, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f27736c = c7089c;
        this.f27735b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        C7089c c7089c = this.f27736c;
        int iMo29854g = c7089c.mo29854g(this.f27735b);
        if (c7089c.mo29856j(iMo29854g)) {
            this.f27736c.m29861q(this.f27735b, iMo29854g);
        }
    }
}
