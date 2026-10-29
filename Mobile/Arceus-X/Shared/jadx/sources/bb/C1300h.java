package bb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import p261l2.C7975b;

/* JADX INFO: renamed from: bb.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1300h extends C7975b {
    @ResultIgnorabilityUnspecified
    @Deprecated
    /* JADX INFO: renamed from: r */
    public static Intent m7095r(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (C1299g.m7094a()) {
            return context.registerReceiver(broadcastReceiver, intentFilter, true != C1299g.m7094a() ? 0 : 2);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
