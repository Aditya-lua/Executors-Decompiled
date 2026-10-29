package com.roblox.client.fcm;

import android.os.SystemClock;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.roblox.client.pushnotification.PushHandlerWorker;
import ef.e;
import gk.p;
import jj.r;
import mj.h0;
import vi.b;

/* JADX INFO: loaded from: classes2.dex */
public class RbxFcmListenerService extends FirebaseMessagingService {
    @Override // android.app.Service
    public void onCreate() {
        boolean zIsEmpty = e.k(this).isEmpty();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zIsEmpty) {
            e.q(this);
        }
        qh.a.a("listener_service", zIsEmpty, SystemClock.elapsedRealtime() - jElapsedRealtime);
        super.onCreate();
        jm.a.c(this);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        b.f().l(getApplicationContext());
        p.b("rbx.push", "RGLS.onMessageReceived() Scheduling PushHandlerWorker");
        PushHandlerWorker.b(getApplicationContext(), remoteMessage);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        super.onNewToken(str);
        p.h("rbx.push", "Token refresh triggered.");
        if (r.k().o(this) == h0.FIREBASE_CLOUD_MESSAGING) {
            FCMRegistrationWorker.INSTANCE.a(this);
        }
    }
}
