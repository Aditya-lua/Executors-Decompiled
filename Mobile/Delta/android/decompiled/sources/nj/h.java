package nj;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.StartedForEnum;
import ei.o;
import ei.p;
import gk.v;
import jj.r;
import jj.u;
import jj.w;
import jj.x;
import sg.t0;
import sg.w0;
import sg.y;

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
            gk.p.i("rbx.push", "marking stacked notifications as read with last id: " + intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
            f(intent.getStringExtra("EXTRA_NOTIFICATION_TYPE"), intent.getStringExtra("EXTRA_CATEGORY"), intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
            return;
        }
        gk.p.i("rbx.push", "marking single notification as read with id: " + intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
        e(context, intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
    }

    public void a(String str) {
        u.c().d(str).clear();
    }

    public void b(String str, Context context, Intent intent, boolean z10, String str2) {
        t0.r(str, new x().a(context, "GcmPlatform"), str2, intent.getStringExtra("EXTRA_NOTIFICATION_ID"), v.a(context), z10, c(intent), "base", w.a(intent));
    }

    public String c(Intent intent) {
        String stringExtra = intent.getStringExtra("EXTRA_NOTIFICATION_VERSION");
        return (stringExtra == null || stringExtra.isEmpty()) ? "0" : stringExtra;
    }

    public void d(Context context, Intent intent) {
        Intent intentJ;
        if (vi.h.e().f()) {
            gk.p.h("rbx.push", "loadTheApp: ...(logged in) launch Main.");
            intentJ = j(context, y.h().i(context), intent);
            intentJ.setFlags(268435456);
        } else {
            gk.p.h("rbx.push", "loadTheApp: ...(not logged in) launch Splash.");
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
        gk.p.i("rbx.push", "notification of type " + stringExtra + " clicked");
        d(context, intent);
        a(stringExtra);
        g(intent, context);
        b("clicked", context, intent, true, stringExtra);
    }

    public void i(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("EXTRA_NOTIFICATION_TYPE");
        gk.p.i("rbx.push", "cleared notifications of type: " + stringExtra);
        a(stringExtra);
        b("dismissed", context, intent, false, stringExtra);
    }

    public abstract Intent j(Context context, Intent intent, Intent intent2);

    @Override // sg.w0, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        vi.b.f().l(context);
        com.roblox.client.startup.a.s(context);
        ei.c.e(context);
        if (intent != null) {
            if (intent.getIntExtra("EXTRA_INTENT_ACTION_TYPE_CODE", -1) == 1) {
                i(context, intent);
            } else if (intent.getIntExtra("EXTRA_INTENT_ACTION_TYPE_CODE", -1) == 2) {
                h(context, intent);
            }
        }
    }
}
