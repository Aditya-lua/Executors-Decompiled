package jj;

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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import mj.PushNotificationTokenRetrieved;
import mj.RegisterDeviceResponse;
import mj.h0;
import sg.a1;
import sg.t0;
import x5.p0;

/* JADX INFO: loaded from: classes2.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bundle f21506a;
    public d b = new a();

    public class a implements d {
        public a() {
        }

        @Override // jj.r.d
        public void a(RegisterDeviceResponse registerDeviceResponse, Context context) {
            if (context == null || registerDeviceResponse.getPlatform() == null || r.this.q(context) == null) {
                return;
            }
            r.this.H(context, registerDeviceResponse.getPlatform(), new x(), r.this.q(context).b());
            if (a1.q0()) {
                return;
            }
            r.this.D(context);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f21508a = new r();
    }

    public interface c {
        void a();
    }

    public interface d {
        void a(RegisterDeviceResponse registerDeviceResponse, Context context);
    }

    public static void E(Context context) {
        if (a1.q0()) {
            return;
        }
        PushNotificationSettingsWorker.INSTANCE.b(p0.h(context));
    }

    public static /* synthetic */ Unit a(d dVar, Context context, RegisterDeviceResponse registerDeviceResponse) {
        dVar.a(registerDeviceResponse, context);
        return Unit.f22483a;
    }

    public static /* synthetic */ Unit b() {
        fv.c.d().j(new ph.h("PushNotificationRegistrationFailed"));
        return Unit.f22483a;
    }

    public static void f(Context context, pj.b bVar) {
        k2.n nVarE = k2.n.e(context);
        NotificationChannel notificationChannel = new NotificationChannel(bVar.getId(), context.getApplicationContext().getApplicationContext().getString(bVar.getNameId()), bVar.getImportance());
        if (th.h.a().o0()) {
            if (bVar.getGroup() != null) {
                notificationChannel.setGroup(bVar.getGroup().getId());
            }
            if (bVar.getDescription() != null) {
                notificationChannel.setDescription(context.getApplicationContext().getString(bVar.getDescription().intValue()));
            }
        }
        if (!bVar.getUseDefaultChannelAttributes()) {
            notificationChannel.setSound(bVar.getRingtoneUri(), bVar.getRingtoneAttributes());
            notificationChannel.setVibrationPattern(bVar.getVibrationPattern());
        }
        nVarE.c(notificationChannel);
    }

    public static r k() {
        return b.f21508a;
    }

    @NonNull
    public static List<NameValuePair> l() {
        ArrayList arrayList = new ArrayList();
        Context contextF = RobloxApplication.f();
        if (contextF != null) {
            HashMap map = new HashMap(vg.r.a(contextF));
            if (th.h.a().t1()) {
                map.put("channel_settings", vg.r.f(contextF));
            } else {
                for (String str : n.f21503a) {
                    map.putAll(vg.r.d(contextF, str));
                }
            }
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new NameValuePair((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        return arrayList;
    }

    public void A(Context context, boolean z10, s sVar) {
        if (sVar != null) {
            sVar.d(context, z10);
        }
    }

    public void B(Context context, boolean z10, lj.a aVar, x xVar, d dVar, c cVar) {
        if (!z10) {
            aVar.a(cVar);
            return;
        }
        s sVarQ = q(context);
        if (sVarQ == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            z(context, true);
            return;
        }
        String strC = sVarQ.c();
        String strM = m(null, context, xVar, strC);
        if (strM == null || strC == null) {
            return;
        }
        F(context, strM, null, true, aVar, dVar);
    }

    public String C(Context context, pj.f fVar) {
        pj.b next;
        k2.n nVarE = k2.n.e(context);
        String strR = fVar.r();
        if (nVarE.g(strR) != null) {
            return strR;
        }
        Iterator<pj.b> it = pj.b.c().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!next.getId().equals(strR));
        if (next == null) {
            return th.h.a().o0() ? pj.b.A.getId() : fVar.l();
        }
        f(context, next);
        return next.getId();
    }

    public final void D(Context context) {
        PushNotificationSettingsWorker.INSTANCE.b(p0.h(context));
    }

    public void F(final Context context, String str, String str2, boolean z10, lj.a aVar, final d dVar) {
        if (aVar == null || str == null || dVar == null) {
            return;
        }
        aVar.f(str, str2, z10, new Function1() { // from class: jj.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.a(dVar, context, (RegisterDeviceResponse) obj);
            }
        }, new Function0() { // from class: jj.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.b();
            }
        });
    }

    public void G(Bundle bundle) {
        this.f21506a = bundle;
    }

    public void H(Context context, String str, x xVar, String str2) {
        if (str2 == null || xVar == null) {
            return;
        }
        gk.p.b("rbx.push", str2 + " " + str);
        xVar.g(context, str2, str);
    }

    public final void g(Context context, pj.b bVar) {
        k2.n.e(context).d(bVar.getId());
    }

    public final void h(Context context) {
        k2.n nVarE = k2.n.e(context);
        Iterator<String> it = j().iterator();
        while (it.hasNext()) {
            nVarE.d(it.next());
        }
    }

    public Bundle i() {
        Bundle bundle = this.f21506a;
        if (bundle != null) {
            this.f21506a = null;
        }
        return bundle;
    }

    public final List<String> j() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("channel_games");
        if (a1.q0()) {
            arrayList.add("channel_calls");
        }
        return arrayList;
    }

    public final String m(String str, Context context, x xVar, String str2) {
        if (xVar == null || str2 == null) {
            return null;
        }
        String strA = xVar.a(context, str2);
        if (strA == null || !strA.equals(str)) {
            return strA;
        }
        return null;
    }

    public String n(Context context) {
        s sVarQ = q(context);
        if (sVarQ != null) {
            return sVarQ.b();
        }
        return null;
    }

    public h0 o(Context context) {
        s sVarQ = q(context);
        return sVarQ != null ? sVarQ.a() : h0.NONE;
    }

    public String p(Context context, String str, x xVar, String str2) {
        String strM = m(str, context, xVar, str2);
        H(context, str, xVar, str2);
        return strM;
    }

    public final s q(Context context) {
        return t.g().h(context);
    }

    public String r(Context context) {
        s sVarQ = q(context);
        if (sVarQ != null) {
            return sVarQ.c();
        }
        return null;
    }

    public void s(final Context context) {
        Context context2;
        x xVar = new x();
        boolean zA = k2.n.e(context).a();
        gk.p.h("rbx.push", "AndroidNotifState: " + zA);
        if (xVar.e(context, "AndroidNotifStatePrefKey") && zA == xVar.b(context, "AndroidNotifStatePrefKey")) {
            context2 = context;
        } else {
            gk.p.h("rbx.push", "Different value. Reporting new state: " + zA);
            xVar.f(context, "AndroidNotifStatePrefKey", zA);
            t0.l("osSettings", zA);
            context2 = context;
            B(context2, zA, new lj.a(), xVar, this.b, new c() { // from class: jj.q
                @Override // jj.r.c
                public final void a() {
                    PushNotificationSettingsWorker.INSTANCE.a(p0.h(context));
                }
            });
        }
        E(context2);
    }

    public boolean t(@NonNull Bundle bundle) {
        String string = bundle.getString("EXTRA_NOTIFICATION_TYPE", "");
        String string2 = bundle.getString("EXTRA_NOTIFICATION_VERSION", "");
        String string3 = bundle.getString("EXTRA_NOTIFICATION_ID", "");
        if (string2.isEmpty()) {
            return false;
        }
        gk.p.b("rbx.push", "... Will handle this Push bundle using Linking protocol.");
        String string4 = bundle.getString("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", "");
        km.f.v().q(string4, "android_push_notification", false);
        km.f.v().e(string4);
        t0.m(string, string3, string2, string4);
        return true;
    }

    public boolean u() {
        return this.f21506a != null;
    }

    public final void v(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager == null) {
            return;
        }
        for (pj.c cVar : pj.c.b()) {
            notificationManager.createNotificationChannelGroup(new NotificationChannelGroup(cVar.getId(), context.getApplicationContext().getString(cVar.getNameId())));
        }
    }

    public final void w(Context context) {
        k2.n nVarE = k2.n.e(context);
        for (pj.a aVar : pj.a.b()) {
            if (nVarE.g(aVar.getId()) == null) {
                nVarE.c(new NotificationChannel(aVar.getId(), context.getString(aVar.getNameId()), aVar.getImportance()));
            }
        }
    }

    public void x(Context context) {
        if (th.h.a().o0()) {
            v(context);
        } else {
            w(context);
        }
        for (pj.b bVar : pj.b.c()) {
            if (bVar.getIsFlagEnabled()) {
                f(context, bVar);
            } else if (th.h.a().U4()) {
                g(context, bVar);
            }
        }
        h(context);
    }

    public void y(Context context, PushNotificationTokenRetrieved pushNotificationTokenRetrieved) {
        gk.p.b("rbx.push", pushNotificationTokenRetrieved.getToken());
        x xVar = new x();
        s sVarQ = q(context);
        if (sVarQ != null) {
            String strC = sVarQ.c();
            String token = pushNotificationTokenRetrieved.getToken();
            F(context, token, p(context, token, xVar, strC), pushNotificationTokenRetrieved.getIsAuthorizePushForUser(), new lj.a(), this.b);
        }
    }

    public void z(Context context, boolean z10) {
        if (context != null) {
            A(context, z10, q(context));
        }
    }
}
