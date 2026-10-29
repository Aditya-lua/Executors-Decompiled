package p222jj;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.roblox.client.RobloxApplication;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.pushnotification.backgroundjob.PushNotificationSettingsWorker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import km.C7635f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import p138fv.C5840c;
import p151gk.C6124q;
import p235k2.C7422n;
import p273lj.C8153a;
import p294mj.EnumC8545h0;
import p294mj.PushNotificationTokenRetrieved;
import p294mj.RegisterDeviceResponse;
import p360pj.EnumC10285a;
import p360pj.EnumC10286b;
import p360pj.EnumC10287c;
import p360pj.InterfaceC10290f;
import p536x5.AbstractC12719p0;
import ph.C10259h;
import sg.C11295a1;
import sg.C11356t0;
import th.C11659h;
import vg.C12188r;

/* JADX INFO: renamed from: jj.r */
/* JADX INFO: loaded from: classes2.dex */
public class C7193r {

    /* JADX INFO: renamed from: a */
    public Bundle f27876a;

    /* JADX INFO: renamed from: b */
    public d f27877b = new a();

    /* JADX INFO: renamed from: jj.r$a */
    public class a implements d {
        public a() {
        }

        @Override // p222jj.C7193r.d
        /* JADX INFO: renamed from: a */
        public void mo30096a(RegisterDeviceResponse registerDeviceResponse, Context context) {
            if (context == null || registerDeviceResponse.getPlatform() == null || C7193r.this.m30086q(context) == null) {
                return;
            }
            C7193r.this.m30077H(context, registerDeviceResponse.getPlatform(), new C7199x(), C7193r.this.m30086q(context).mo15113b());
            if (C11295a1.m42471q0()) {
                return;
            }
            C7193r.this.m30074D(context);
        }
    }

    /* JADX INFO: renamed from: jj.r$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final C7193r f27879a = new C7193r();
    }

    /* JADX INFO: renamed from: jj.r$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo30061a();
    }

    /* JADX INFO: renamed from: jj.r$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo30096a(RegisterDeviceResponse registerDeviceResponse, Context context);
    }

    /* JADX INFO: renamed from: E */
    public static void m30062E(Context context) {
        if (C11295a1.m42471q0()) {
            return;
        }
        PushNotificationSettingsWorker.INSTANCE.m15408b(AbstractC12719p0.m47392h(context));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Unit m30063a(d dVar, Context context, RegisterDeviceResponse registerDeviceResponse) {
        dVar.mo30096a(registerDeviceResponse, context);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Unit m30064b() {
        C5840c.m26204d().m26211j(new C10259h("PushNotificationRegistrationFailed"));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: f */
    public static void m30068f(Context context, EnumC10286b enumC10286b) {
        C7422n c7422nM30883e = C7422n.m30883e(context);
        NotificationChannel notificationChannel = new NotificationChannel(enumC10286b.getId(), context.getApplicationContext().getApplicationContext().getString(enumC10286b.getNameId()), enumC10286b.getImportance());
        if (C11659h.m43403a().mo43716s0()) {
            if (enumC10286b.getGroup() != null) {
                notificationChannel.setGroup(enumC10286b.getGroup().getId());
            }
            if (enumC10286b.getDescription() != null) {
                notificationChannel.setDescription(context.getApplicationContext().getString(enumC10286b.getDescription().intValue()));
            }
        }
        if (!enumC10286b.getUseDefaultChannelAttributes()) {
            notificationChannel.setSound(enumC10286b.getRingtoneUri(), enumC10286b.getRingtoneAttributes());
            notificationChannel.setVibrationPattern(enumC10286b.getVibrationPattern());
        }
        c7422nM30883e.m30888c(notificationChannel);
    }

    /* JADX INFO: renamed from: k */
    public static C7193r m30069k() {
        return b.f27879a;
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public static List<NameValuePair> m30070l() {
        ArrayList arrayList = new ArrayList();
        Context contextM14834f = RobloxApplication.m14834f();
        if (contextM14834f != null) {
            HashMap map = new HashMap(C12188r.m45148a(contextM14834f));
            if (C11659h.m43403a().mo43759y1()) {
                map.put("channel_settings", C12188r.m45151f(contextM14834f));
            } else {
                for (String str : C7189n.f27871a) {
                    map.putAll(C12188r.m45149d(contextM14834f, str));
                }
            }
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new NameValuePair((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: A */
    public void m30071A(Context context, boolean z10, InterfaceC7194s interfaceC7194s) {
        if (interfaceC7194s != null) {
            interfaceC7194s.mo15115d(context, z10);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m30072B(Context context, boolean z10, C8153a c8153a, C7199x c7199x, d dVar, c cVar) {
        if (!z10) {
            c8153a.m33420a(cVar);
            return;
        }
        InterfaceC7194s interfaceC7194sM30086q = m30086q(context);
        if (interfaceC7194sM30086q == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            m30095z(context, true);
            return;
        }
        String strMo15114c = interfaceC7194sM30086q.mo15114c();
        String strM30082m = m30082m(null, context, c7199x, strMo15114c);
        if (strM30082m == null || strMo15114c == null) {
            return;
        }
        m30075F(context, strM30082m, null, true, c8153a, dVar);
    }

    /* JADX INFO: renamed from: C */
    public String m30073C(Context context, InterfaceC10290f interfaceC10290f) {
        EnumC10286b next;
        C7422n c7422nM30883e = C7422n.m30883e(context);
        String strMo39546r = interfaceC10290f.mo39546r();
        if (c7422nM30883e.m30890g(strMo39546r) != null) {
            return strMo39546r;
        }
        Iterator<EnumC10286b> it = EnumC10286b.m39510c().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!next.getId().equals(strMo39546r));
        if (next == null) {
            return C11659h.m43403a().mo43716s0() ? EnumC10286b.f36929A.getId() : interfaceC10290f.mo39540l();
        }
        m30068f(context, next);
        return next.getId();
    }

    /* JADX INFO: renamed from: D */
    public final void m30074D(Context context) {
        PushNotificationSettingsWorker.INSTANCE.m15408b(AbstractC12719p0.m47392h(context));
    }

    /* JADX INFO: renamed from: F */
    public void m30075F(final Context context, String str, String str2, boolean z10, C8153a c8153a, final d dVar) {
        if (c8153a == null || str == null || dVar == null) {
            return;
        }
        c8153a.m33425f(str, str2, z10, new Function1() { // from class: jj.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C7193r.m30063a(dVar, context, (RegisterDeviceResponse) obj);
            }
        }, new Function0() { // from class: jj.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C7193r.m30064b();
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public void m30076G(Bundle bundle) {
        this.f27876a = bundle;
    }

    /* JADX INFO: renamed from: H */
    public void m30077H(Context context, String str, C7199x c7199x, String str2) {
        if (str2 == null || c7199x == null) {
            return;
        }
        C6124q.m27057b("rbx.push", str2 + " " + str);
        c7199x.m30126g(context, str2, str);
    }

    /* JADX INFO: renamed from: g */
    public final void m30078g(Context context, EnumC10286b enumC10286b) {
        C7422n.m30883e(context).m30889d(enumC10286b.getId());
    }

    /* JADX INFO: renamed from: h */
    public final void m30079h(Context context) {
        C7422n c7422nM30883e = C7422n.m30883e(context);
        Iterator<String> it = m30081j().iterator();
        while (it.hasNext()) {
            c7422nM30883e.m30889d(it.next());
        }
    }

    /* JADX INFO: renamed from: i */
    public Bundle m30080i() {
        Bundle bundle = this.f27876a;
        if (bundle != null) {
            this.f27876a = null;
        }
        return bundle;
    }

    /* JADX INFO: renamed from: j */
    public final List<String> m30081j() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("channel_games");
        if (C11295a1.m42471q0()) {
            arrayList.add("channel_calls");
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public final String m30082m(String str, Context context, C7199x c7199x, String str2) {
        if (c7199x == null || str2 == null) {
            return null;
        }
        String strM30120a = c7199x.m30120a(context, str2);
        if (strM30120a == null || !strM30120a.equals(str)) {
            return strM30120a;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public String m30083n(Context context) {
        InterfaceC7194s interfaceC7194sM30086q = m30086q(context);
        if (interfaceC7194sM30086q != null) {
            return interfaceC7194sM30086q.mo15113b();
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public EnumC8545h0 m30084o(Context context) {
        InterfaceC7194s interfaceC7194sM30086q = m30086q(context);
        return interfaceC7194sM30086q != null ? interfaceC7194sM30086q.mo15112a() : EnumC8545h0.NONE;
    }

    /* JADX INFO: renamed from: p */
    public String m30085p(Context context, String str, C7199x c7199x, String str2) {
        String strM30082m = m30082m(str, context, c7199x, str2);
        m30077H(context, str, c7199x, str2);
        return strM30082m;
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC7194s m30086q(Context context) {
        return C7195t.m30098g().m30105h(context);
    }

    /* JADX INFO: renamed from: r */
    public String m30087r(Context context) {
        InterfaceC7194s interfaceC7194sM30086q = m30086q(context);
        if (interfaceC7194sM30086q != null) {
            return interfaceC7194sM30086q.mo15114c();
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public void m30088s(final Context context) {
        Context context2;
        C7199x c7199x = new C7199x();
        boolean zM30886a = C7422n.m30883e(context).m30886a();
        C6124q.m27063h("rbx.push", "AndroidNotifState: " + zM30886a);
        if (c7199x.m30124e(context, "AndroidNotifStatePrefKey") && zM30886a == c7199x.m30121b(context, "AndroidNotifStatePrefKey")) {
            context2 = context;
        } else {
            C6124q.m27063h("rbx.push", "Different value. Reporting new state: " + zM30886a);
            c7199x.m30125f(context, "AndroidNotifStatePrefKey", zM30886a);
            C11356t0.m42542l("osSettings", zM30886a);
            context2 = context;
            m30072B(context2, zM30886a, new C8153a(), c7199x, this.f27877b, new c() { // from class: jj.q
                @Override // p222jj.C7193r.c
                /* JADX INFO: renamed from: a */
                public final void mo30061a() {
                    PushNotificationSettingsWorker.INSTANCE.m15407a(AbstractC12719p0.m47392h(context));
                }
            });
        }
        m30062E(context2);
    }

    /* JADX INFO: renamed from: t */
    public boolean m30089t(@NonNull Bundle bundle) {
        String string = bundle.getString("EXTRA_NOTIFICATION_TYPE", "");
        String string2 = bundle.getString("EXTRA_NOTIFICATION_VERSION", "");
        String string3 = bundle.getString("EXTRA_NOTIFICATION_ID", "");
        if (string2.isEmpty()) {
            return false;
        }
        C6124q.m27057b("rbx.push", "... Will handle this Push bundle using Linking protocol.");
        String string4 = bundle.getString("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", "");
        if (C11659h.m43403a().mo43610d1()) {
            C7635f.m31524D().m31540h(string4, "android_push_notification", false);
        } else {
            C7635f.m31524D().m31538f(string4, "android_push_notification", false);
        }
        C7635f.m31524D().m31543k(string4);
        C11356t0.m42543m(string, string3, string2, string4);
        return true;
    }

    /* JADX INFO: renamed from: u */
    public boolean m30090u() {
        return this.f27876a != null;
    }

    /* JADX INFO: renamed from: v */
    public final void m30091v(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager == null) {
            return;
        }
        for (EnumC10287c enumC10287c : EnumC10287c.m39521b()) {
            notificationManager.createNotificationChannelGroup(new NotificationChannelGroup(enumC10287c.getId(), context.getApplicationContext().getString(enumC10287c.getNameId())));
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m30092w(Context context) {
        C7422n c7422nM30883e = C7422n.m30883e(context);
        for (EnumC10285a enumC10285a : EnumC10285a.m39506b()) {
            if (c7422nM30883e.m30890g(enumC10285a.getId()) == null) {
                c7422nM30883e.m30888c(new NotificationChannel(enumC10285a.getId(), context.getString(enumC10285a.getNameId()), enumC10285a.getImportance()));
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public void m30093x(Context context) {
        if (C11659h.m43403a().mo43716s0()) {
            m30091v(context);
        } else {
            m30092w(context);
        }
        for (EnumC10286b enumC10286b : EnumC10286b.m39510c()) {
            if (enumC10286b.getIsFlagEnabled()) {
                m30068f(context, enumC10286b);
            } else if (C11659h.m43403a().mo43590a5()) {
                m30078g(context, enumC10286b);
            }
        }
        m30079h(context);
    }

    /* JADX INFO: renamed from: y */
    public void m30094y(Context context, PushNotificationTokenRetrieved pushNotificationTokenRetrieved) {
        C6124q.m27057b("rbx.push", pushNotificationTokenRetrieved.getToken());
        C7199x c7199x = new C7199x();
        InterfaceC7194s interfaceC7194sM30086q = m30086q(context);
        if (interfaceC7194sM30086q != null) {
            String strMo15114c = interfaceC7194sM30086q.mo15114c();
            String token = pushNotificationTokenRetrieved.getToken();
            m30075F(context, token, m30085p(context, token, c7199x, strMo15114c), pushNotificationTokenRetrieved.getIsAuthorizePushForUser(), new C8153a(), this.f27877b);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m30095z(Context context, boolean z10) {
        if (context != null) {
            m30071A(context, z10, m30086q(context));
        }
    }
}
