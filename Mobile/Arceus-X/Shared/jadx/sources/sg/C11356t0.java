package sg;

import android.content.Context;
import com.appsflyer.sdk_base.referrer.Payload;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.pushnotification.p051v2.richpushnotifications.RichPushNotificationMedia;
import com.roblox.engine.jni.NativeReportingInterface;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import fk.C5654c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p151gk.C6124q;
import p151gk.C6127t;
import p222jj.C7193r;
import p360pj.InterfaceC10290f;
import th.C11659h;
import vg.C12180j;
import vg.C12183m;
import vg.C12187q;

/* JADX INFO: renamed from: sg.t0 */
/* JADX INFO: loaded from: classes2.dex */
public class C11356t0 {

    /* JADX INFO: renamed from: a */
    public static String f40157a;

    /* JADX INFO: renamed from: A */
    public static void m42530A() {
        C12180j.m45086q().m45102s();
    }

    /* JADX INFO: renamed from: a */
    public static List<NameValuePair> m42531a(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NameValuePair("notificationType", str));
        arrayList.add(new NameValuePair("notificationId", str2));
        arrayList.add(new NameValuePair("version", str3));
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static void m42532b(Context context, String str) {
        C12180j.m45086q().m45088c(str, C11659h.m43403a().mo43613d4() ? C6127t.m27087c(context) : -1L);
    }

    /* JADX INFO: renamed from: c */
    public static void m42533c(String str, String str2, String str3, String str4) {
        C12180j.m45086q().m45089d(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: d */
    public static void m42534d(String str, String str2) {
        C12180j.m45086q().m45090e(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m42535e(String str, String str2, String str3) {
        C12180j.m45086q().m45091f(str, str2, str3);
    }

    /* JADX INFO: renamed from: f */
    public static void m42536f(String str, String str2, String str3) {
        C12180j.m45086q().m45092g(str, str2, str3);
    }

    /* JADX INFO: renamed from: g */
    public static void m42537g(String str, String str2, int i10, int i11) {
        C12180j.m45086q().m45093h(str, str2, i10, i11);
    }

    /* JADX INFO: renamed from: h */
    public static void m42538h(String str, String str2) {
        m42539i(str, str2, null);
    }

    /* JADX INFO: renamed from: i */
    public static void m42539i(String str, String str2, List<NameValuePair> list) {
        C12180j.m45086q().m45094i(str, str2, list);
    }

    /* JADX INFO: renamed from: j */
    public static void m42540j(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NameValuePair(Payload.TYPE, str2));
        m42539i(str, "logout", arrayList);
    }

    /* JADX INFO: renamed from: k */
    public static void m42541k(String str) {
        C12183m.m45108c("androidNotificationsSettings", str, new ArrayList(C7193r.m30070l()), false);
    }

    /* JADX INFO: renamed from: l */
    public static void m42542l(String str, boolean z10) {
        C12180j.m45086q().m45095j(str, z10);
    }

    /* JADX INFO: renamed from: m */
    public static void m42543m(String str, String str2, String str3, String str4) {
        List<NameValuePair> listM42531a = m42531a(str, str2, str3);
        listM42531a.add(new NameValuePair("notificationUrl", str4));
        m42539i("pushNotificationAction", "deepLink", listM42531a);
        m42530A();
    }

    /* JADX INFO: renamed from: n */
    public static void m42544n(String str, String str2, InterfaceC10290f interfaceC10290f, Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new NameValuePair(Title.type, interfaceC10290f.getTitle()));
        arrayList.add(new NameValuePair("badge", Integer.toString(interfaceC10290f.mo39534f())));
        if (interfaceC10290f.mo39549u() != null) {
            RichPushNotificationMedia richPushNotificationMediaMo39549u = interfaceC10290f.mo39549u();
            arrayList.add(new NameValuePair("primaryIcon", richPushNotificationMediaMo39549u.getPrimaryImage() != null ? richPushNotificationMediaMo39549u.getPrimaryImage().toString() : null));
            arrayList.add(new NameValuePair("secondaryIcon", richPushNotificationMediaMo39549u.getSecondaryImage() != null ? richPushNotificationMediaMo39549u.getSecondaryImage().toString() : null));
        }
        arrayList.add(new NameValuePair("notificationType", interfaceC10290f.mo39531c()));
        arrayList.add(new NameValuePair("notificationId", interfaceC10290f.getId()));
        arrayList.add(new NameValuePair("version", interfaceC10290f.mo39542n()));
        if (C11659h.m43403a().mo43560W3()) {
            arrayList.add(new NameValuePair("groupId", interfaceC10290f.getGroupId()));
        }
        arrayList.add(new NameValuePair("channelId", interfaceC10290f.mo39546r()));
        arrayList.add(new NameValuePair("recipient", Long.toString(C5654c.m25669c().m25678j())));
        arrayList.add(new NameValuePair("platformType", "AndroidNative"));
        arrayList.add(new NameValuePair("extraParams", map != null ? new JSONObject(map).toString() : null));
        arrayList.addAll(interfaceC10290f.mo39530b());
        arrayList.addAll(C7193r.m30070l());
        C12183m.m45108c(str2, str, arrayList, false);
    }

    /* JADX INFO: renamed from: o */
    public static void m42545o(InterfaceC10290f interfaceC10290f, Map<String, String> map) {
        m42544n("imageAttachment", "pushNotificationExtensionPrimaryImageAttachment", interfaceC10290f, map);
    }

    /* JADX INFO: renamed from: p */
    public static void m42546p(InterfaceC10290f interfaceC10290f, Map<String, String> map) {
        m42544n("imageAttachment", "pushNotificationExtensionSecondaryImageAttachment", interfaceC10290f, map);
    }

    /* JADX INFO: renamed from: q */
    public static void m42547q(String str, String str2, String str3, String str4, String str5, String str6, boolean z10, String str7, String str8, List<NameValuePair> list) {
        List<NameValuePair> listM42531a = m42531a(str3, str4, str7);
        listM42531a.add(new NameValuePair("actionTaken", str5));
        listM42531a.add(new NameValuePair("clientState", str6));
        listM42531a.add(new NameValuePair("openedClient", z10 ? "true" : "false"));
        listM42531a.add(new NameValuePair("platformType", str2));
        listM42531a.addAll(list);
        listM42531a.addAll(C7193r.m30070l());
        ArrayList arrayList = new ArrayList(listM42531a);
        for (Map.Entry<String, String> entry : NativeReportingInterface.getPushNotificationSessionInfo(str).entrySet()) {
            arrayList.add(new NameValuePair(entry.getKey(), entry.getValue()));
        }
        NativeReportingInterface.pushNotificationInteracted("pushNotificationInteracted", str, listM42531a);
        C12183m.m45108c("pushNotificationInteractedV2", str, arrayList, false);
    }

    /* JADX INFO: renamed from: r */
    public static void m42548r(String str, String str2, String str3, String str4, String str5, boolean z10, String str6, String str7, List<NameValuePair> list) {
        m42547q(str, str2, str3, str4, null, str5, z10, str6, str7, list);
    }

    /* JADX INFO: renamed from: s */
    public static void m42549s(String str, String str2, String str3) {
        m42550t(str, str2, null, null, str3, "0", new ArrayList());
    }

    /* JADX INFO: renamed from: t */
    public static void m42550t(String str, String str2, String str3, String str4, String str5, String str6, List<NameValuePair> list) {
        List<NameValuePair> listM42531a = m42531a(str3, str4, str6);
        listM42531a.add(new NameValuePair("clientState", str5));
        listM42531a.add(new NameValuePair("platformType", str2));
        listM42531a.addAll(list);
        listM42531a.addAll(C7193r.m30070l());
        if (C11659h.m43403a().mo43599b6()) {
            return;
        }
        C12183m.m45108c("pushNotificationReceived", str, listM42531a, false);
        if (!C11659h.m43403a().mo43732u2() || str4 == null) {
            return;
        }
        C12187q.m45146a(str4);
    }

    /* JADX INFO: renamed from: u */
    public static void m42551u(String str, InterfaceC10290f interfaceC10290f, Map<String, String> map) {
        m42544n(str, "pushNotificationReceivedExtension", interfaceC10290f, map);
    }

    /* JADX INFO: renamed from: v */
    public static void m42552v(String str) {
        String str2;
        if (str == null || str.equalsIgnoreCase("splash") || (str2 = f40157a) == null || !str2.equalsIgnoreCase(str)) {
            C6124q.m27057b("rbx.eventstream", "fireScreenLoaded() " + str);
            f40157a = str;
            C12180j.m45086q().m45096k(str);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m42553w(String str, String str2) {
        C12180j.m45086q().m45097l(str, str2);
        m42530A();
    }

    /* JADX INFO: renamed from: x */
    public static void m42554x(String str, String str2) {
        C12180j.m45086q().m45098m(str, str2);
        m42530A();
    }

    /* JADX INFO: renamed from: y */
    public static void m42555y(String str) {
        C12180j.m45086q().m45099n(str);
    }

    /* JADX INFO: renamed from: z */
    public static void m42556z() {
        C12180j.m45086q().m45100o();
    }
}
