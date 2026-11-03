package hj;

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
import com.roblox.client.pushnotification.v2.model.PayloadNotificationChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kj.PushNotificationTokenRetrieved;
import kj.RegisterDeviceResponse;
import kj.h0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import rg.a1;
import rg.t0;
import x5.p0;

/* JADX INFO: loaded from: classes2.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bundle f19514a;
    public d b = new a();

    public class a implements d {
        public a() {
        }

        @Override // hj.r.d
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
        public static final r f19516a = new r();
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
        return Unit.f22938a;
    }

    public static /* synthetic */ Unit b() {
        dv.c.d().j(new oh.h("PushNotificationRegistrationFailed"));
        return Unit.f22938a;
    }

    public static void f(Context context, nj.b bVar) {
        k2.n nVarF = k2.n.f(context);
        NotificationChannel notificationChannel = new NotificationChannel(bVar.getId(), context.getApplicationContext().getApplicationContext().getString(bVar.getNameId()), bVar.getImportance());
        if (rh.h.a().t0()) {
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
        nVarF.c(notificationChannel);
    }

    public static r k() {
        return b.f19516a;
    }

    @NonNull
    public static List<NameValuePair> l() {
        ArrayList arrayList = new ArrayList();
        Context contextF = RobloxApplication.f();
        if (contextF != null) {
            HashMap map = new HashMap(ug.r.a(contextF));
            if (rh.h.a().C1()) {
                map.put("channel_settings", ug.r.f(contextF));
            } else {
                for (String str : n.f19511a) {
                    map.putAll(ug.r.d(contextF, str));
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

    public void B(Context context, boolean z10, jj.a aVar, x xVar, d dVar, c cVar) {
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

    public String C(Context context, nj.f fVar) {
        nj.b next;
        PayloadNotificationChannel payloadNotificationChannelL;
        if (rh.h.a().S0() && (payloadNotificationChannelL = fVar.l()) != null) {
            try {
                return mj.b.d(context, payloadNotificationChannelL);
            } catch (RuntimeException e10) {
                ek.q.f("rbx.push", "Failed to register payload notification channel", e10);
            }
        }
        k2.n nVarF = k2.n.f(context);
        String strS = fVar.s();
        String strG = mj.b.g(nVarF.k(), strS);
        if (strG != null) {
            nVarF.e(strS);
            return strG;
        }
        if (nVarF.h(strS) != null) {
            return strS;
        }
        Iterator<nj.b> it = nj.b.c().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!next.getId().equals(strS));
        if (next == null) {
            return rh.h.a().t0() ? nj.b.A.getId() : fVar.m();
        }
        f(context, next);
        return next.getId();
    }

    public final void D(Context context) {
        PushNotificationSettingsWorker.INSTANCE.b(p0.h(context));
    }

    public void F(final Context context, String str, String str2, boolean z10, jj.a aVar, final d dVar) {
        if (aVar == null || str == null || dVar == null) {
            return;
        }
        aVar.f(str, str2, z10, new Function1() { // from class: hj.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.a(dVar, context, (RegisterDeviceResponse) obj);
            }
        }, new Function0() { // from class: hj.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return r.b();
            }
        });
    }

    public void G(Bundle bundle) {
        this.f19514a = bundle;
    }

    public void H(Context context, String str, x xVar, String str2) {
        if (str2 == null || xVar == null) {
            return;
        }
        ek.q.b("rbx.push", str2 + " " + str);
        xVar.g(context, str2, str);
    }

    public final void g(Context context, nj.b bVar) {
        k2.n.f(context).e(bVar.getId());
    }

    public final void h(Context context) {
        k2.n nVarF = k2.n.f(context);
        Iterator<String> it = j().iterator();
        while (it.hasNext()) {
            nVarF.e(it.next());
        }
    }

    public Bundle i() {
        Bundle bundle = this.f19514a;
        if (bundle != null) {
            this.f19514a = null;
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
        boolean zA = k2.n.f(context).a();
        ek.q.h("rbx.push", "AndroidNotifState: " + zA);
        if (xVar.e(context, "AndroidNotifStatePrefKey") && zA == xVar.b(context, "AndroidNotifStatePrefKey")) {
            context2 = context;
        } else {
            ek.q.h("rbx.push", "Different value. Reporting new state: " + zA);
            xVar.f(context, "AndroidNotifStatePrefKey", zA);
            t0.l("osSettings", zA);
            context2 = context;
            B(context2, zA, new jj.a(), xVar, this.b, new c() { // from class: hj.q
                @Override // hj.r.c
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
        ek.q.b("rbx.push", "... Will handle this Push bundle using Linking protocol.");
        String string4 = bundle.getString("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", "");
        if (rh.h.a().g1()) {
            im.f.F().h(string4, "android_push_notification", false);
        } else {
            im.f.F().f(string4, "android_push_notification", false);
        }
        im.f.F().k(string4);
        t0.m(string, string3, string2, string4);
        return true;
    }

    public boolean u() {
        return this.f19514a != null;
    }

    public final void v(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager == null) {
            return;
        }
        for (nj.c cVar : nj.c.b()) {
            notificationManager.createNotificationChannelGroup(new NotificationChannelGroup(cVar.getId(), context.getApplicationContext().getString(cVar.getNameId())));
        }
    }

    public final void w(Context context) {
        k2.n nVarF = k2.n.f(context);
        for (nj.a aVar : nj.a.b()) {
            if (nVarF.h(aVar.getId()) == null) {
                nVarF.c(new NotificationChannel(aVar.getId(), context.getString(aVar.getNameId()), aVar.getImportance()));
            }
        }
    }

    public void x(Context context) {
        if (rh.h.a().t0()) {
            v(context);
        } else {
            w(context);
        }
        k2.n nVarF = k2.n.f(context);
        List<NotificationChannel> listK = nVarF.k();
        for (nj.b bVar : nj.b.c()) {
            if (mj.b.g(listK, bVar.getId()) != null) {
                nVarF.e(bVar.getId());
            } else if (bVar.getIsFlagEnabled()) {
                f(context, bVar);
            } else if (rh.h.a().h5()) {
                g(context, bVar);
            }
        }
        h(context);
    }

    public void y(Context context, PushNotificationTokenRetrieved pushNotificationTokenRetrieved) {
        ek.q.b("rbx.push", pushNotificationTokenRetrieved.getToken());
        x xVar = new x();
        s sVarQ = q(context);
        if (sVarQ != null) {
            String strC = sVarQ.c();
            String token = pushNotificationTokenRetrieved.getToken();
            F(context, token, p(context, token, xVar, strC), pushNotificationTokenRetrieved.getIsAuthorizePushForUser(), new jj.a(), this.b);
        }
    }

    public void z(Context context, boolean z10) {
        if (context != null) {
            A(context, z10, q(context));
        }
    }
}
