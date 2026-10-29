package bb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: loaded from: classes.dex */
public final class h extends l2.b {
    @ResultIgnorabilityUnspecified
    @Deprecated
    public static Intent r(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (g.a()) {
            return context.registerReceiver(broadcastReceiver, intentFilter, true != g.a() ? 0 : 2);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
