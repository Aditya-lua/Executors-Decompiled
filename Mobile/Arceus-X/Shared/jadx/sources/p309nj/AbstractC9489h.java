package p309nj;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.C3272a;
import com.roblox.client.startup.StartedForEnum;
import p104ei.C5125c;
import p104ei.C5137o;
import p104ei.C5138p;
import p151gk.C6124q;
import p151gk.C6130w;
import p222jj.C7193r;
import p222jj.C7196u;
import p222jj.C7198w;
import p222jj.C7199x;
import sg.C11356t0;
import sg.C11365w0;
import sg.C11370y;
import vi.C12211b;
import vi.C12217h;

/* JADX INFO: renamed from: nj.h */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9489h extends C11365w0 {
    /* JADX INFO: renamed from: e */
    public static void m37370e(Context context, String str) {
        new C5138p();
        C5138p.m23950a(context, str);
    }

    /* JADX INFO: renamed from: f */
    public static void m37371f(String str, String str2, String str3) {
        new C5137o();
        C5137o.m23947a(str, str2, str3);
    }

    /* JADX INFO: renamed from: g */
    public static void m37372g(Intent intent, Context context) {
        if (intent.getBooleanExtra("EXTRA_STACKED_NOTIFICATION", false)) {
            C6124q.m27064i("rbx.push", "marking stacked notifications as read with last id: " + intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
            m37371f(intent.getStringExtra("EXTRA_NOTIFICATION_TYPE"), intent.getStringExtra("EXTRA_CATEGORY"), intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
            return;
        }
        C6124q.m27064i("rbx.push", "marking single notification as read with id: " + intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
        m37370e(context, intent.getStringExtra("EXTRA_NOTIFICATION_ID"));
    }

    /* JADX INFO: renamed from: a */
    public void m37373a(String str) {
        C7196u.m30108c().m30111d(str).clear();
    }

    /* JADX INFO: renamed from: b */
    public void m37374b(String str, Context context, Intent intent, boolean z10, String str2) {
        C11356t0.m42548r(str, new C7199x().m30120a(context, "GcmPlatform"), str2, intent.getStringExtra("EXTRA_NOTIFICATION_ID"), C6130w.m27099a(context), z10, m37375c(intent), "base", C7198w.m30118a(intent));
    }

    /* JADX INFO: renamed from: c */
    public String m37375c(Intent intent) {
        String stringExtra = intent.getStringExtra("EXTRA_NOTIFICATION_VERSION");
        return (stringExtra == null || stringExtra.isEmpty()) ? "0" : stringExtra;
    }

    /* JADX INFO: renamed from: d */
    public void m37376d(Context context, Intent intent) {
        Intent intentMo15453j;
        if (C12217h.m45288e().m45295f()) {
            C6124q.m27063h("rbx.push", "loadTheApp: ...(logged in) launch Main.");
            intentMo15453j = mo15453j(context, C11370y.m42581h().m42589i(context), intent);
            intentMo15453j.setFlags(268435456);
        } else {
            C6124q.m27063h("rbx.push", "loadTheApp: ...(not logged in) launch Splash.");
            intentMo15453j = mo15453j(context, ActivitySplash.m15531o2(context, StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION), intent);
            intentMo15453j.setFlags(268468224);
        }
        Bundle extras = intentMo15453j.getExtras();
        if (extras != null) {
            C7193r.m30069k().m30076G(extras);
        }
        context.startActivity(intentMo15453j);
    }

    /* JADX INFO: renamed from: h */
    public void m37377h(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("EXTRA_NOTIFICATION_TYPE");
        C6124q.m27064i("rbx.push", "notification of type " + stringExtra + " clicked");
        m37376d(context, intent);
        m37373a(stringExtra);
        m37372g(intent, context);
        m37374b("clicked", context, intent, true, stringExtra);
    }

    /* JADX INFO: renamed from: i */
    public void m37378i(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("EXTRA_NOTIFICATION_TYPE");
        C6124q.m27064i("rbx.push", "cleared notifications of type: " + stringExtra);
        m37373a(stringExtra);
        m37374b("dismissed", context, intent, false, stringExtra);
    }

    /* JADX INFO: renamed from: j */
    public abstract Intent mo15453j(Context context, Intent intent, Intent intent2);

    @Override // sg.C11365w0, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        C12211b.m45200f().m45210l(context);
        C3272a.m15711s(context);
        C5125c.m23921e(context);
        if (intent != null) {
            if (intent.getIntExtra("EXTRA_INTENT_ACTION_TYPE_CODE", -1) == 1) {
                m37378i(context, intent);
            } else if (intent.getIntExtra("EXTRA_INTENT_ACTION_TYPE_CODE", -1) == 2) {
                m37377h(context, intent);
            }
        }
    }
}
