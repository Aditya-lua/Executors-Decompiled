package sg;

import android.content.Context;
import com.appsflyer.sdk_base.referrer.Payload;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.pushnotification.v2.richpushnotifications.RichPushNotificationMedia;
import com.roblox.engine.jni.NativeReportingInterface;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f31059a;

    public static void A() {
        vg.j.q().s();
    }

    public static List<NameValuePair> a(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NameValuePair("notificationType", str));
        arrayList.add(new NameValuePair("notificationId", str2));
        arrayList.add(new NameValuePair("version", str3));
        return arrayList;
    }

    public static void b(Context context, String str) {
        vg.j.q().c(str, th.h.a().Y3() ? gk.s.c(context) : -1L);
    }

    public static void c(String str, String str2, String str3, String str4) {
        vg.j.q().d(str, str2, str3, str4);
    }

    public static void d(String str, String str2) {
        vg.j.q().e(str, str2);
    }

    public static void e(String str, String str2, String str3) {
        vg.j.q().f(str, str2, str3);
    }

    public static void f(String str, String str2, String str3) {
        vg.j.q().g(str, str2, str3);
    }

    public static void g(String str, String str2, int i10, int i11) {
        vg.j.q().h(str, str2, i10, i11);
    }

    public static void h(String str, String str2) {
        i(str, str2, null);
    }

    public static void i(String str, String str2, List<NameValuePair> list) {
        vg.j.q().i(str, str2, list);
    }

    public static void j(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NameValuePair(Payload.TYPE, str2));
        i(str, "logout", arrayList);
    }

    public static void k(String str) {
        vg.m.c("androidNotificationsSettings", str, new ArrayList(jj.r.l()), false);
    }

    public static void l(String str, boolean z10) {
        vg.j.q().j(str, z10);
    }

    public static void m(String str, String str2, String str3, String str4) {
        List<NameValuePair> listA = a(str, str2, str3);
        listA.add(new NameValuePair("notificationUrl", str4));
        i("pushNotificationAction", "deepLink", listA);
        A();
    }

    public static void n(String str, String str2, pj.f fVar, Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NameValuePair(Title.type, fVar.getTitle()));
        arrayList.add(new NameValuePair("badge", Integer.toString(fVar.f())));
        if (fVar.u() != null) {
            RichPushNotificationMedia richPushNotificationMediaU = fVar.u();
            arrayList.add(new NameValuePair("primaryIcon", richPushNotificationMediaU.getPrimaryImage() != null ? richPushNotificationMediaU.getPrimaryImage().toString() : null));
            arrayList.add(new NameValuePair("secondaryIcon", richPushNotificationMediaU.getSecondaryImage() != null ? richPushNotificationMediaU.getSecondaryImage().toString() : null));
        }
        arrayList.add(new NameValuePair("notificationType", fVar.c()));
        arrayList.add(new NameValuePair("notificationId", fVar.getId()));
        arrayList.add(new NameValuePair("version", fVar.n()));
        if (th.h.a().R3()) {
            arrayList.add(new NameValuePair("groupId", fVar.getGroupId()));
        }
        arrayList.add(new NameValuePair("channelId", fVar.r()));
        arrayList.add(new NameValuePair("recipient", Long.toString(fk.c.c().j())));
        arrayList.add(new NameValuePair("platformType", "AndroidNative"));
        arrayList.add(new NameValuePair("extraParams", map != null ? new JSONObject(map).toString() : null));
        arrayList.addAll(fVar.b());
        arrayList.addAll(jj.r.l());
        vg.m.c(str2, str, arrayList, false);
    }

    public static void o(pj.f fVar, Map<String, String> map) {
        n("imageAttachment", "pushNotificationExtensionPrimaryImageAttachment", fVar, map);
    }

    public static void p(pj.f fVar, Map<String, String> map) {
        n("imageAttachment", "pushNotificationExtensionSecondaryImageAttachment", fVar, map);
    }

    public static void q(String str, String str2, String str3, String str4, String str5, String str6, boolean z10, String str7, String str8, List<NameValuePair> list) {
        List<NameValuePair> listA = a(str3, str4, str7);
        listA.add(new NameValuePair("actionTaken", str5));
        listA.add(new NameValuePair("clientState", str6));
        listA.add(new NameValuePair("openedClient", z10 ? "true" : "false"));
        listA.add(new NameValuePair("platformType", str2));
        listA.addAll(list);
        listA.addAll(jj.r.l());
        ArrayList arrayList = new ArrayList(listA);
        for (Map.Entry<String, String> entry : NativeReportingInterface.getPushNotificationSessionInfo(str).entrySet()) {
            arrayList.add(new NameValuePair(entry.getKey(), entry.getValue()));
        }
        NativeReportingInterface.pushNotificationInteracted("pushNotificationInteracted", str, listA);
        vg.m.c("pushNotificationInteractedV2", str, arrayList, false);
    }

    public static void r(String str, String str2, String str3, String str4, String str5, boolean z10, String str6, String str7, List<NameValuePair> list) {
        q(str, str2, str3, str4, null, str5, z10, str6, str7, list);
    }

    public static void s(String str, String str2, String str3) {
        t(str, str2, null, null, str3, "0", new ArrayList());
    }

    public static void t(String str, String str2, String str3, String str4, String str5, String str6, List<NameValuePair> list) {
        List<NameValuePair> listA = a(str3, str4, str6);
        listA.add(new NameValuePair("clientState", str5));
        listA.add(new NameValuePair("platformType", str2));
        listA.addAll(list);
        listA.addAll(jj.r.l());
        if (th.h.a().V5()) {
            return;
        }
        vg.m.c("pushNotificationReceived", str, listA, false);
        if (!th.h.a().p2() || str4 == null) {
            return;
        }
        vg.q.a(str4);
    }

    public static void u(String str, pj.f fVar, Map<String, String> map) {
        n(str, "pushNotificationReceivedExtension", fVar, map);
    }

    public static void v(String str) {
        String str2;
        if (str == null || str.equalsIgnoreCase("splash") || (str2 = f31059a) == null || !str2.equalsIgnoreCase(str)) {
            gk.p.b("rbx.eventstream", "fireScreenLoaded() " + str);
            f31059a = str;
            vg.j.q().k(str);
        }
    }

    public static void w(String str, String str2) {
        vg.j.q().l(str, str2);
        A();
    }

    public static void x(String str, String str2) {
        vg.j.q().m(str, str2);
        A();
    }

    public static void y(String str) {
        vg.j.q().n(str);
    }

    public static void z() {
        vg.j.q().o();
    }
}
