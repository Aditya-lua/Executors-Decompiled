package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p536x5.AbstractC12732w;
import p567y5.C13048f1;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final String f4597a = AbstractC12732w.m47443i("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AbstractC12732w.m47441e().mo47444a(f4597a, "Received intent " + intent);
        try {
            C13048f1.m48580p(context).m48593y(goAsync());
        } catch (IllegalStateException e10) {
            AbstractC12732w.m47441e().mo47447d(f4597a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }
}
