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
import jm.C7209a;
import org.greenrobot.eventbus.ThreadMode;
import p138fv.C5840c;
import p138fv.InterfaceC5847j;
import p151gk.C6124q;
import ph.C10256e;
import sg.C11312e2;
import sj.AbstractC11386a;
import vi.C12217h;

/* JADX INFO: loaded from: classes2.dex */
public class RealtimeService extends Service {

    /* JADX INFO: renamed from: d */
    public volatile Looper f12150d;

    /* JADX INFO: renamed from: e */
    public volatile HandlerC3247c f12151e;

    /* JADX INFO: renamed from: a */
    public final int f12147a = 10;

    /* JADX INFO: renamed from: b */
    public final int f12148b = 20;

    /* JADX INFO: renamed from: c */
    public final int f12149c = 30;

    /* JADX INFO: renamed from: f */
    public final IBinder f12152f = new BinderC3246b();

    /* JADX INFO: renamed from: g */
    public BroadcastReceiver f12153g = new C3245a();

    /* JADX INFO: renamed from: com.roblox.client.realtime.RealtimeService$a */
    public static class C3245a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public boolean f12154a;

        /* JADX INFO: renamed from: b */
        public boolean f12155b;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean zM42506j = C11312e2.m42506j(context);
            if (this.f12155b) {
                this.f12154a = zM42506j;
                this.f12155b = false;
            } else if (zM42506j != this.f12154a) {
                this.f12154a = zM42506j;
                C5840c.m26204d().m26211j(new C10256e(zM42506j));
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C3245a() {
            this.f12154a = false;
            this.f12155b = true;
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.realtime.RealtimeService$b */
    public class BinderC3246b extends Binder {
        public BinderC3246b() {
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.realtime.RealtimeService$c */
    public final class HandlerC3247c extends Handler {
        public HandlerC3247c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.arg1;
            if (i10 == 10) {
                RealtimeService.this.m15487h();
                return;
            }
            if (i10 == 20) {
                RealtimeService.this.m15488i();
            } else if (i10 == 30) {
                RealtimeService.this.m15488i();
                getLooper().quit();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static long m15482c() {
        return AbstractC11386a.m42705a();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m15483d() {
        return AbstractC11386a.m42706b();
    }

    /* JADX INFO: renamed from: e */
    public final void m15484e(long j10) {
        if (C12217h.m45288e().m45296g() != -1) {
            Message messageObtainMessage = this.f12151e.obtainMessage();
            messageObtainMessage.arg1 = 10;
            this.f12151e.sendMessageDelayed(messageObtainMessage, j10);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m15485f() {
        Message messageObtainMessage = this.f12151e.obtainMessage();
        messageObtainMessage.arg1 = 20;
        this.f12151e.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: renamed from: g */
    public final void m15486g() {
        Message messageObtainMessage = this.f12151e.obtainMessage();
        messageObtainMessage.arg1 = 30;
        this.f12151e.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: renamed from: h */
    public final void m15487h() {
    }

    /* JADX INFO: renamed from: i */
    public final void m15488i() {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        registerReceiver(this.f12153g, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        C5840c.m26204d().m26215n(this);
        m15484e(0L);
        return this.f12152f;
    }

    @InterfaceC5847j(threadMode = ThreadMode.POSTING)
    public void onConnectivityChangeEvent(C10256e c10256e) {
        C6124q.m27064i("RealtimeService", "RealtimeService.onConnectivityChangeEvent() " + c10256e.m39407a());
        if (c10256e.m39407a()) {
            m15484e(0L);
        } else {
            m15485f();
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C7209a.m30129c(this);
        HandlerThread handlerThread = new HandlerThread("RealtimeService");
        handlerThread.start();
        this.f12150d = handlerThread.getLooper();
        this.f12151e = new HandlerC3247c(this.f12150d);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        C5840c.m26204d().m26217p(this);
        unregisterReceiver(this.f12153g);
        m15486g();
        return super.onUnbind(intent);
    }
}
