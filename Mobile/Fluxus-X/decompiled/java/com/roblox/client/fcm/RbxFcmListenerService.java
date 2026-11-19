package com.roblox.client.fcm;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.n0;
import com.roblox.client.pushnotification.PushHandlerWorker;
import dj.b;
import ok.q;
import rj.r;
import uj.h0;

/* JADX INFO: loaded from: classes2.dex */
public class RbxFcmListenerService extends FirebaseMessagingService {
    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        xm.a.c(this);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(n0 n0Var) {
        super.onMessageReceived(n0Var);
        b.f().k(getApplicationContext());
        q.b("rbx.push", "RGLS.onMessageReceived() Scheduling PushHandlerWorker");
        PushHandlerWorker.b(getApplicationContext(), n0Var);
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
