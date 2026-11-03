package com.roblox.client.fcm;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.roblox.client.pushnotification.PushHandlerWorker;
import ek.q;
import hj.r;
import kj.h0;
import ti.b;

/* JADX INFO: loaded from: classes2.dex */
public class RbxFcmListenerService extends FirebaseMessagingService {
    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        hm.a.c(this);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        b.f().l(getApplicationContext());
        q.b("rbx.push", "RGLS.onMessageReceived() Scheduling PushHandlerWorker");
        PushHandlerWorker.b(getApplicationContext(), remoteMessage);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        super.onNewToken(str);
        q.h("rbx.push", "Token refresh triggered.");
        if (r.k().o(this) == h0.FIREBASE_CLOUD_MESSAGING) {
            FCMRegistrationWorker.INSTANCE.a(this);
        }
    }
}
