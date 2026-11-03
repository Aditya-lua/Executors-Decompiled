package lj;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ci.o;
import ci.p;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.StartedForEnum;
import ek.q;
import ek.w;
import hj.r;
import hj.u;
import hj.x;
import rg.t0;
import rg.w0;
import rg.y;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h extends w0 {
    public static void e(Context context, String str) {
        new p();
        p.a(context, str);
    }

    public static void f(String str, String str2, String str3) {
        new o();
        o.a(str, str2, str3);
    }

    public static void g(Intent intent, Context context) {
        if (intent.getBooleanExtra("EXTRA_STACKED_NOTIFICATION", false)) {
            q.i("rbx.push", "marking stacked notifications as read with last id: " + intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
            f(intent.getStringExtra("EXTRA_NOTIFICATION_TYPE"), intent.getStringExtra("EXTRA_CATEGORY"), intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
            return;
        }
        q.i("rbx.push", "marking single notification as read with id: " + intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
        e(context, intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
    }

    public void a(String str) {
        u.c().d(str).clear();
    }

    public void b(String str, Context context, Intent intent, boolean z10, String str2) {
        t0.r(str, new x().a(context, "GcmPlatform"), str2, intent.getStringExtra("EXTRA_NOTIFICATION_ID"), w.a(context), z10, c(intent), "base", hj.w.a(intent));
    }

    public String c(Intent intent) {
        String stringExtra = intent.getStringExtra("EXTRA_NOTIFICATION_VERSION");
        return (stringExtra == null || stringExtra.isEmpty()) ? "0" : stringExtra;
    }

    public void d(Context context, Intent intent) {
        Intent intentJ;
        if (ti.h.e().f()) {
            q.h("rbx.push", "loadTheApp: ...(logged in) launch Main.");
            intentJ = j(context, y.h().i(context), intent);
            intentJ.setFlags(268435456);
        } else {
            q.h("rbx.push", "loadTheApp: ...(not logged in) launch Splash.");
            intentJ = j(context, ActivitySplash.o2(context, StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION), intent);
            intentJ.setFlags(268468224);
        }
        Bundle extras = intentJ.getExtras();
        if (extras != null) {
            r.k().G(extras);
        }
        context.startActivity(intentJ);
    }

    public void h(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("EXTRA_NOTIFICATION_TYPE");
        q.i("rbx.push", "notification of type " + stringExtra + " clicked");
        d(context, intent);
        a(stringExtra);
        g(intent, context);
        b("clicked", context, intent, true, stringExtra);
    }

    public void i(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("EXTRA_NOTIFICATION_TYPE");
        q.i("rbx.push", "cleared notifications of type: " + stringExtra);
        a(stringExtra);
        b("dismissed", context, intent, false, stringExtra);
    }

    public abstract Intent j(Context context, Intent intent, Intent intent2);

    @Override // rg.w0, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        ti.b.f().l(context);
        com.roblox.client.startup.a.s(context);
        ci.c.e(context);
        if (intent != null) {
            if (intent.getIntExtra("EXTRA_INTENT_ACTION_TYPE_CODE", -1) == 1) {
                i(context, intent);
            } else if (intent.getIntExtra("EXTRA_INTENT_ACTION_TYPE_CODE", -1) == 2) {
                h(context, intent);
            }
        }
    }
}
