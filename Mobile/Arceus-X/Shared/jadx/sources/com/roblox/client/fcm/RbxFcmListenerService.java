package com.roblox.client.fcm;

import android.os.SystemClock;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.roblox.client.pushnotification.PushHandlerWorker;
import jm.C7209a;
import p128ff.C5590e;
import p151gk.C6124q;
import p222jj.C7193r;
import p294mj.EnumC8545h0;
import p382qh.C10581a;
import vi.C12211b;

/* JADX INFO: loaded from: classes2.dex */
public class RbxFcmListenerService extends FirebaseMessagingService {
    @Override // android.app.Service
    public void onCreate() {
        boolean zIsEmpty = C5590e.m25259k(this).isEmpty();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zIsEmpty) {
            C5590e.m25261q(this);
        }
        C10581a.m40564a("listener_service", zIsEmpty, SystemClock.elapsedRealtime() - jElapsedRealtime);
        super.onCreate();
        C7209a.m30129c(this);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        C12211b.m45200f().m45210l(getApplicationContext());
        C6124q.m27057b("rbx.push", "RGLS.onMessageReceived() Scheduling PushHandlerWorker");
        PushHandlerWorker.m15397b(getApplicationContext(), remoteMessage);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        super.onNewToken(str);
        C6124q.m27063h("rbx.push", "Token refresh triggered.");
        if (C7193r.m30069k().m30084o(this) == EnumC8545h0.FIREBASE_CLOUD_MESSAGING) {
            FCMRegistrationWorker.INSTANCE.m15110a(this);
        }
    }
}
