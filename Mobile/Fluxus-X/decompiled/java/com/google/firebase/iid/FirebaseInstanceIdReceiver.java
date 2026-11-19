package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.firebase.messaging.f0;
import j9.a;
import j9.b;
import java.util.concurrent.ExecutionException;
import tb.m;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseInstanceIdReceiver extends b {
    public static Intent f(@NonNull Context context, @NonNull String str, @NonNull Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // j9.b
    public int b(@NonNull Context context, @NonNull a aVar) {
        try {
            return ((Integer) m.a(new com.google.firebase.messaging.m(context).g(aVar.A3()))).intValue();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e10);
            return 500;
        }
    }

    @Override // j9.b
    public void c(@NonNull Context context, @NonNull Bundle bundle) {
        Intent intentF = f(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (f0.D(intentF)) {
            f0.v(intentF);
        }
    }
}
