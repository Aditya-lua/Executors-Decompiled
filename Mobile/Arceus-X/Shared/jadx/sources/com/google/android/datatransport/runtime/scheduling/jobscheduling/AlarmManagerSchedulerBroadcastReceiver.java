package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import p028b8.AbstractC1267o;
import p028b8.C1272t;
import p289m8.C8469a;

/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8976a() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        C1272t.m7051f(context);
        AbstractC1267o.a aVarMo7013d = AbstractC1267o.m7040a().mo7011b(queryParameter).mo7013d(C8469a.m34256b(iIntValue));
        if (queryParameter2 != null) {
            aVarMo7013d.mo7012c(Base64.decode(queryParameter2, 0));
        }
        C1272t.m7049c().m7053e().m28764m(aVarMo7013d.mo7010a(), i10, new Runnable() { // from class: i8.a
            @Override // java.lang.Runnable
            public final void run() {
                AlarmManagerSchedulerBroadcastReceiver.m8976a();
            }
        });
    }
}
