package com.roblox.client.pushnotification.p051v2.receiver;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.roblox.client.AbstractActivityC3152a;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.C3272a;
import com.roblox.client.startup.StartedForEnum;
import km.C7635f;
import p104ei.C5125c;
import p151gk.C6124q;
import p151gk.C6130w;
import p222jj.C7193r;
import p222jj.C7198w;
import p222jj.C7199x;
import sg.C11356t0;
import sg.C11365w0;
import sg.C11370y;
import th.C11659h;
import vi.C12211b;
import vi.C12217h;

/* JADX INFO: loaded from: classes2.dex */
public class Sendr1PushNotificationReceiver extends C11365w0 {

    /* JADX INFO: renamed from: com.roblox.client.pushnotification.v2.receiver.Sendr1PushNotificationReceiver$a */
    public class RunnableC3243a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f12136a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Intent f12137b;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public RunnableC3243a(Context context, Intent intent) {
            this.f12136a = context;
            this.f12137b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            Intent intentM15472n = Sendr1PushNotificationReceiver.this.m15472n(C11370y.m42581h().m42589i(this.f12136a), this.f12137b);
            intentM15472n.setFlags(268435456);
            Bundle extras = intentM15472n.getExtras();
            if (extras != null) {
                C7193r.m30069k().m30076G(extras);
            }
            String strM15470g = Sendr1PushNotificationReceiver.this.m15470g(this.f12137b);
            this.f12136a.startActivity(intentM15472n);
            if (C11659h.m43403a().mo43610d1()) {
                C7635f.m31524D().m31540h(strM15470g, "android_push_notification", false);
            } else {
                C7635f.m31524D().m31538f(strM15470g, "android_push_notification", false);
            }
            C7635f.m31524D().m31543k(strM15470g);
            Sendr1PushNotificationReceiver.this.m15467d(this.f12137b, strM15470g);
        }
    }

    /* JADX INFO: renamed from: i */
    private String m15462i(Intent intent) {
        return intent.getStringExtra("EXTRA_NOTIFICATION_VERSION");
    }

    /* JADX INFO: renamed from: j */
    private void m15463j(Context context, Intent intent) {
        if (C12217h.m45288e().m45295f()) {
            C6124q.m27063h("rbx.push", "loadTheApp: (v2) ...(logged in) launch Main.");
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC3243a(context, intent), AbstractActivityC3152a.f11622R == 0 ? 1000 : 0);
            return;
        }
        C6124q.m27063h("rbx.push", "loadTheApp: (v2) ...(not logged in) launch Splash.");
        Intent intentM15472n = m15472n(ActivitySplash.m15531o2(context, StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION), intent);
        Bundle extras = intentM15472n.getExtras();
        if (extras != null) {
            C7193r.m30069k().m30076G(extras);
        }
        intentM15472n.setFlags(268468224);
        String strM15470g = m15470g(intent);
        context.startActivity(intentM15472n);
        if (C11659h.m43403a().mo43610d1()) {
            C7635f.m31524D().m31540h(strM15470g, "android_push_notification", false);
        } else {
            C7635f.m31524D().m31538f(strM15470g, "android_push_notification", false);
        }
        C7635f.m31524D().m31543k(strM15470g);
        m15467d(intent, strM15470g);
    }

    /* JADX INFO: renamed from: k */
    private void m15464k(Intent intent, Context context) {
    }

    /* JADX INFO: renamed from: l */
    private void m15465l(Context context, Intent intent) {
        m15463j(context, intent);
        m15464k(intent, context);
        m15468e("clicked", context, intent, true);
    }

    /* JADX INFO: renamed from: m */
    private void m15466m(Context context, Intent intent) {
        C6124q.m27064i("rbx.push", "cleared notifications of type: " + m15471h(intent));
        m15468e("dismissed", context, intent, false);
    }

    /* JADX INFO: renamed from: d */
    public final void m15467d(Intent intent, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        C11356t0.m42543m(m15471h(intent), m15469f(intent), m15462i(intent), str);
    }

    /* JADX INFO: renamed from: e */
    public final void m15468e(String str, Context context, Intent intent, boolean z10) {
        C11356t0.m42548r(str, new C7199x().m30120a(context, "GcmPlatform"), m15471h(intent), m15469f(intent), C6130w.m27099a(context), z10, m15462i(intent), "sendr1", C7198w.m30118a(intent));
    }

    /* JADX INFO: renamed from: f */
    public final String m15469f(Intent intent) {
        return intent.getStringExtra("EXTRA_NOTIFICATION_ID");
    }

    /* JADX INFO: renamed from: g */
    public final String m15470g(Intent intent) {
        return intent.getStringExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION");
    }

    /* JADX INFO: renamed from: h */
    public final String m15471h(Intent intent) {
        return intent.getStringExtra("EXTRA_NOTIFICATION_TYPE");
    }

    /* JADX INFO: renamed from: n */
    public final Intent m15472n(Intent intent, Intent intent2) {
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", intent2.getStringExtra("EXTRA_NOTIFICATION_TYPE"));
        intent.putExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", intent2.getStringExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION"));
        return intent;
    }

    @Override // sg.C11365w0, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        C12211b.m45200f().m45210l(context);
        C3272a.m15711s(context);
        C5125c.m23921e(context);
        if (intent != null) {
            if (intent.getIntExtra("EXTRA_INTENT_ACTION_TYPE_CODE", -1) == 1) {
                m15466m(context, intent);
            } else if (intent.getIntExtra("EXTRA_INTENT_ACTION_TYPE_CODE", -1) == 2) {
                m15465l(context, intent);
            }
        }
    }
}
