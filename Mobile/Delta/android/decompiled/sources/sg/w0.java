package sg;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public class w0 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        gk.p.b("rbx.broadcast", getClass().getName() + ":onReceive");
        jm.a.c(context);
    }
}
