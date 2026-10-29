package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.firebase.messaging.f0;
import i9.a;
import java.util.concurrent.ExecutionException;
import sb.m;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseInstanceIdReceiver extends a {
    public static Intent f(@NonNull Context context, @NonNull String str, @NonNull Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // i9.a
    public int b(@NonNull Context context, @NonNull CloudMessage cloudMessage) {
        try {
            return ((Integer) m.a(new com.google.firebase.messaging.m(context).g(cloudMessage.v3()))).intValue();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e10);
            return 500;
        }
    }

    @Override // i9.a
    public void c(@NonNull Context context, @NonNull Bundle bundle) {
        Intent intentF = f(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (f0.D(intentF)) {
            f0.v(intentF);
        }
    }
}
