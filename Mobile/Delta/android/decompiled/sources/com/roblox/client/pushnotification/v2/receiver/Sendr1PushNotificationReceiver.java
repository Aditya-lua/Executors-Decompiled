package com.roblox.client.pushnotification.v2.receiver;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import ci.c;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.StartedForEnum;
import ek.q;
import ek.w;
import hj.r;
import hj.x;
import im.f;
import rg.t0;
import rg.w0;
import rg.y;
import rh.h;
import ti.b;

/* JADX INFO: loaded from: classes2.dex */
public class Sendr1PushNotificationReceiver extends w0 {

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f9394a;
        public final /* synthetic */ Intent b;

        public a(Context context, Intent intent) {
            this.f9394a = context;
            this.b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            Intent intentN = Sendr1PushNotificationReceiver.this.n(y.h().i(this.f9394a), this.b);
            intentN.setFlags(268435456);
            Bundle extras = intentN.getExtras();
            if (extras != null) {
                r.k().G(extras);
            }
            String strG = Sendr1PushNotificationReceiver.this.g(this.b);
            this.f9394a.startActivity(intentN);
            if (h.a().g1()) {
                f.F().h(strG, "android_push_notification", false);
            } else {
                f.F().f(strG, "android_push_notification", false);
            }
            f.F().k(strG);
            Sendr1PushNotificationReceiver.this.d(this.b, strG);
        }
    }

    private String i(Intent intent) {
        return intent.getStringExtra("EXTRA_NOTIFICATION_VERSION");
    }

    private void j(Context context, Intent intent) {
        if (ti.h.e().f()) {
            q.h("rbx.push", "loadTheApp: (v2) ...(logged in) launch Main.");
            new Handler(Looper.getMainLooper()).postDelayed(new a(context, intent), com.roblox.client.a.R == 0 ? 1000 : 0);
            return;
        }
        q.h("rbx.push", "loadTheApp: (v2) ...(not logged in) launch Splash.");
        Intent intentN = n(ActivitySplash.o2(context, StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION), intent);
        Bundle extras = intentN.getExtras();
        if (extras != null) {
            r.k().G(extras);
        }
        intentN.setFlags(268468224);
        String strG = g(intent);
        context.startActivity(intentN);
        if (h.a().g1()) {
            f.F().h(strG, "android_push_notification", false);
        } else {
            f.F().f(strG, "android_push_notification", false);
        }
        f.F().k(strG);
        d(intent, strG);
    }

    private void k(Intent intent, Context context) {
    }

    private void l(Context context, Intent intent) {
        j(context, intent);
        k(intent, context);
        e("clicked", context, intent, true);
    }

    private void m(Context context, Intent intent) {
        q.i("rbx.push", "cleared notifications of type: " + h(intent));
        e("dismissed", context, intent, false);
    }

    public final void d(Intent intent, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        t0.m(h(intent), f(intent), i(intent), str);
    }

    public final void e(String str, Context context, Intent intent, boolean z10) {
        t0.r(str, new x().a(context, "GcmPlatform"), h(intent), f(intent), w.a(context), z10, i(intent), "sendr1", hj.w.a(intent));
    }

    public final String f(Intent intent) {
        return intent.getStringExtra("EXTRA_NOTIFICATION_ID");
    }

    public final String g(Intent intent) {
        return intent.getStringExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION");
    }

    public final String h(Intent intent) {
        return intent.getStringExtra("EXTRA_NOTIFICATION_TYPE");
    }

    public final Intent n(Intent intent, Intent intent2) {
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", intent2.getStringExtra("EXTRA_NOTIFICATION_TYPE"));
        intent.putExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", intent2.getStringExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION"));
        return intent;
    }

    @Override // rg.w0, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        b.f().l(context);
        com.roblox.client.startup.a.s(context);
        c.e(context);
        if (intent != null) {
            if (intent.getIntExtra("EXTRA_INTENT_ACTION_TYPE_CODE", -1) == 1) {
                m(context, intent);
            } else if (intent.getIntExtra("EXTRA_INTENT_ACTION_TYPE_CODE", -1) == 2) {
                l(context, intent);
            }
        }
    }
}
