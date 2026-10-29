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
import fv.j;
import gk.p;
import org.greenrobot.eventbus.ThreadMode;
import ph.e;
import sg.e2;
import vi.h;

/* JADX INFO: loaded from: classes2.dex */
public class RealtimeService extends Service {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Looper f9328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile c f9329e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9326a = 10;
    public final int b = 20;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9327c = 30;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IBinder f9330f = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public BroadcastReceiver f9331g = new a();

    public static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f9332a;
        public boolean b;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean zJ = e2.j(context);
            if (this.b) {
                this.f9332a = zJ;
                this.b = false;
            } else if (zJ != this.f9332a) {
                this.f9332a = zJ;
                fv.c.d().j(new e(zJ));
            }
        }

        public a() {
            this.f9332a = false;
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
        return sj.a.a();
    }

    public static boolean d() {
        return sj.a.b();
    }

    public final void e(long j10) {
        if (h.e().g() != -1) {
            Message messageObtainMessage = this.f9329e.obtainMessage();
            messageObtainMessage.arg1 = 10;
            this.f9329e.sendMessageDelayed(messageObtainMessage, j10);
        }
    }

    public final void f() {
        Message messageObtainMessage = this.f9329e.obtainMessage();
        messageObtainMessage.arg1 = 20;
        this.f9329e.sendMessage(messageObtainMessage);
    }

    public final void g() {
        Message messageObtainMessage = this.f9329e.obtainMessage();
        messageObtainMessage.arg1 = 30;
        this.f9329e.sendMessage(messageObtainMessage);
    }

    public final void h() {
    }

    public final void i() {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        registerReceiver(this.f9331g, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        fv.c.d().n(this);
        e(0L);
        return this.f9330f;
    }

    @j(threadMode = ThreadMode.POSTING)
    public void onConnectivityChangeEvent(e eVar) {
        p.i("RealtimeService", "RealtimeService.onConnectivityChangeEvent() " + eVar.a());
        if (eVar.a()) {
            e(0L);
        } else {
            f();
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        jm.a.c(this);
        HandlerThread handlerThread = new HandlerThread("RealtimeService");
        handlerThread.start();
        this.f9328d = handlerThread.getLooper();
        this.f9329e = new c(this.f9328d);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        fv.c.d().p(this);
        unregisterReceiver(this.f9331g);
        g();
        return super.onUnbind(intent);
    }
}
