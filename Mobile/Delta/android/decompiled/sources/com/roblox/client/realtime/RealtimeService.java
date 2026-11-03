package com.roblox.client.realtime;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import dv.j;
import ek.q;
import oh.e;
import org.greenrobot.eventbus.ThreadMode;
import rg.e2;
import ti.h;

/* JADX INFO: loaded from: classes2.dex */
public class RealtimeService extends Service {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Looper f9405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile c f9406e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9403a = 10;
    public final int b = 20;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9404c = 30;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IBinder f9407f = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public BroadcastReceiver f9408g = new a();

    public static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f9409a;
        public boolean b;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean zJ = e2.j(context);
            if (this.b) {
                this.f9409a = zJ;
                this.b = false;
            } else if (zJ != this.f9409a) {
                this.f9409a = zJ;
                dv.c.d().j(new e(zJ));
            }
        }

        public a() {
            this.f9409a = false;
            this.b = true;
        }
    }

    public class b extends Binder {
        public b() {
        }
    }

    public final class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.arg1;
            if (i10 == 10) {
                RealtimeService.this.h();
                return;
            }
            if (i10 == 20) {
                RealtimeService.this.i();
            } else if (i10 == 30) {
                RealtimeService.this.i();
                getLooper().quit();
            }
        }
    }

    public static long c() {
        return qj.a.a();
    }

    public static boolean d() {
        return qj.a.b();
    }

    public final void e(long j10) {
        if (h.e().g() != -1) {
            Message messageObtainMessage = this.f9406e.obtainMessage();
            messageObtainMessage.arg1 = 10;
            this.f9406e.sendMessageDelayed(messageObtainMessage, j10);
        }
    }

    public final void f() {
        Message messageObtainMessage = this.f9406e.obtainMessage();
        messageObtainMessage.arg1 = 20;
        this.f9406e.sendMessage(messageObtainMessage);
    }

    public final void g() {
        Message messageObtainMessage = this.f9406e.obtainMessage();
        messageObtainMessage.arg1 = 30;
        this.f9406e.sendMessage(messageObtainMessage);
    }

    public final void h() {
    }

    public final void i() {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        registerReceiver(this.f9408g, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        dv.c.d().n(this);
        e(0L);
        return this.f9407f;
    }

    @j(threadMode = ThreadMode.POSTING)
    public void onConnectivityChangeEvent(e eVar) {
        q.i("RealtimeService", "RealtimeService.onConnectivityChangeEvent() " + eVar.a());
        if (eVar.a()) {
            e(0L);
        } else {
            f();
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        hm.a.c(this);
        HandlerThread handlerThread = new HandlerThread("RealtimeService");
        handlerThread.start();
        this.f9405d = handlerThread.getLooper();
        this.f9406e = new c(this.f9405d);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        dv.c.d().p(this);
        unregisterReceiver(this.f9408g);
        g();
        return super.onUnbind(intent);
    }
}
