package bh;

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
    public static String f4365a;

    public static void A() {
        eh.k.q().s();
    }

    public static List<NameValuePair> a(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NameValuePair("notificationType", str));
        arrayList.add(new NameValuePair("notificationId", str2));
        arrayList.add(new NameValuePair("version", str3));
        return arrayList;
    }

    public static void b(Context context, String str) {
        eh.k.q().c(str, bi.h.a().m4() ? ok.t.c(context) : -1L);
    }

    public static void c(String str, String str2, String str3, String str4) {
        eh.k.q().d(str, str2, str3, str4);
    }

    public static void d(String str, String str2) {
        eh.k.q().e(str, str2);
    }

    public static void e(String str, String str2, String str3) {
        eh.k.q().f(str, str2, str3);
    }

    public static void f(String str, String str2, String str3) {
        eh.k.q().g(str, str2, str3);
    }

    public static void g(String str, String str2, int i10, int i11) {
        eh.k.q().h(str, str2, i10, i11);
    }

    public static void h(String str, String str2) {
        i(str, str2, null);
    }

    public static void i(String str, String str2, List<NameValuePair> list) {
        eh.k.q().i(str, str2, list);
    }

    public static void j(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NameValuePair(Payload.TYPE, str2));
        i(str, "logout", arrayList);
    }

    public static void k(String str) {
        eh.o.c("androidNotificationsSettings", str, new ArrayList(rj.r.l()), false);
    }

    public static void l(String str, boolean z10) {
        eh.k.q().j(str, z10);
    }

    public static void m(String str, String str2, String str3, String str4) {
        List<NameValuePair> listA = a(str, str2, str3);
        listA.add(new NameValuePair("notificationUrl", str4));
        i("pushNotificationAction", "deepLink", listA);
        A();
    }

    public static void n(String str, String str2, xj.f fVar, Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NameValuePair(Title.type, fVar.getTitle()));
        arrayList.add(new NameValuePair("badge", Integer.toString(fVar.f())));
        if (fVar.v() != null) {
            RichPushNotificationMedia richPushNotificationMediaV = fVar.v();
            arrayList.add(new NameValuePair("primaryIcon", richPushNotificationMediaV.getPrimaryImage() != null ? richPushNotificationMediaV.getPrimaryImage().toString() : null));
            arrayList.add(new NameValuePair("secondaryIcon", richPushNotificationMediaV.getSecondaryImage() != null ? richPushNotificationMediaV.getSecondaryImage().toString() : null));
        }
        arrayList.add(new NameValuePair("notificationType", fVar.c()));
        arrayList.add(new NameValuePair("notificationId", fVar.getId()));
        arrayList.add(new NameValuePair("version", fVar.o()));
        arrayList.add(new NameValuePair("groupId", fVar.getGroupId()));
        arrayList.add(new NameValuePair("channelId", fVar.s()));
        arrayList.add(new NameValuePair("recipient", Long.toString(nk.c.c().j())));
        arrayList.add(new NameValuePair("platformType", "AndroidNative"));
        arrayList.add(new NameValuePair("extraParams", map != null ? new JSONObject(map).toString() : null));
        arrayList.addAll(fVar.b());
        arrayList.addAll(rj.r.l());
        eh.o.c(str2, str, arrayList, false);
    }

    public static void o(xj.f fVar, Map<String, String> map) {
        n("imageAttachment", "pushNotificationExtensionPrimaryImageAttachment", fVar, map);
    }

    public static void p(xj.f fVar, Map<String, String> map) {
        n("imageAttachment", "pushNotificationExtensionSecondaryImageAttachment", fVar, map);
    }

    public static void q(String str, String str2, String str3, String str4, String str5, String str6, boolean z10, String str7, String str8, List<NameValuePair> list) {
        List<NameValuePair> listA = a(str3, str4, str7);
        listA.add(new NameValuePair("actionTaken", str5));
        listA.add(new NameValuePair("clientState", str6));
        listA.add(new NameValuePair("openedClient", z10 ? "true" : "false"));
        listA.add(new NameValuePair("platformType", str2));
        listA.addAll(list);
        listA.addAll(rj.r.l());
        ArrayList arrayList = new ArrayList(listA);
        for (Map.Entry<String, String> entry : NativeReportingInterface.getPushNotificationSessionInfo(str).entrySet()) {
            arrayList.add(new NameValuePair(entry.getKey(), entry.getValue()));
        }
        NativeReportingInterface.pushNotificationInteracted("pushNotificationInteracted", str, listA);
        eh.o.c("pushNotificationInteractedV2", str, arrayList, false);
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
        listA.addAll(rj.r.l());
        if (bi.h.a().d6()) {
            return;
        }
        eh.o.c("pushNotificationReceived", str, listA, false);
        if (!bi.h.a().C2() || str4 == null) {
            return;
        }
        eh.i0.a(str4);
    }

    public static void u(String str, xj.f fVar, Map<String, String> map) {
        n(str, "pushNotificationReceivedExtension", fVar, map);
    }

    public static void v(String str) {
        String str2;
        if (str == null || str.equalsIgnoreCase("splash") || (str2 = f4365a) == null || !str2.equalsIgnoreCase(str)) {
            ok.q.b("rbx.eventstream", "fireScreenLoaded() " + str);
            f4365a = str;
            eh.k.q().k(str);
        }
    }

    public static void w(String str, String str2) {
        eh.k.q().l(str, str2);
        A();
    }

    public static void x(String str, String str2) {
        eh.k.q().m(str, str2);
        A();
    }

    public static void y(String str) {
        eh.k.q().n(str);
    }

    public static void z() {
        eh.k.q().o();
    }
}
