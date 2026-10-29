package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.firebase.messaging.C2992f0;
import com.google.firebase.messaging.C3008m;
import java.util.concurrent.ExecutionException;
import p191i9.AbstractC6684a;
import sb.C11268m;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC6684a {
    /* JADX INFO: renamed from: f */
    public static Intent m14407f(@NonNull Context context, @NonNull String str, @NonNull Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // p191i9.AbstractC6684a
    /* JADX INFO: renamed from: b */
    public int mo14408b(@NonNull Context context, @NonNull CloudMessage cloudMessage) {
        try {
            return ((Integer) C11268m.m42331a(new C3008m(context).m14614g(cloudMessage.m9132v3()))).intValue();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e10);
            return 500;
        }
    }

    @Override // p191i9.AbstractC6684a
    /* JADX INFO: renamed from: c */
    public void mo14409c(@NonNull Context context, @NonNull Bundle bundle) {
        Intent intentM14407f = m14407f(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (C2992f0.m14526D(intentM14407f)) {
            C2992f0.m14549v(intentM14407f);
        }
    }
}
