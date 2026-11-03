package nj;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.pushnotification.v2.model.NotificationAction;
import com.roblox.client.pushnotification.v2.model.PayloadNotificationChannel;
import com.roblox.client.pushnotification.v2.receiver.Sendr1PushNotificationReceiver;
import com.roblox.client.pushnotification.v2.richpushnotifications.RichPushNotificationMedia;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.StartedForEnum;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import ek.m;
import ek.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import rg.a1;
import rg.l0;
import rh.h;

/* JADX INFO: loaded from: classes2.dex */
public class d implements f {
    public boolean A;
    public List<NameValuePair> B;
    public RichPushNotificationMedia C;
    public List<NotificationAction> D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27293a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f27297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f27298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f27299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f27300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f27301j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f27302k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public long f27303l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f27304m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f27305n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f27306o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f27307p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public PayloadNotificationChannel f27308q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f27309r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f27310s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f27311t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f27312u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f27313v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Map<String, f> f27314w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public e f27315x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f27316y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f27317z;

    public d(Map<String, String> map) {
        String str;
        String str2;
        this.C = RichPushNotificationMedia.INSTANCE.b();
        this.D = Collections.EMPTY_LIST;
        this.f27293a = map.get("version");
        this.b = map.get("notificationType");
        this.f27294c = map.get("notificationId");
        this.f27295d = map.get("body");
        this.f27296e = map.get(Title.type);
        this.f27297f = map.get("iconUrl");
        this.f27298g = map.get("tag");
        this.f27299h = map.get("sound");
        this.f27300i = m.a(map.get("badge"), 1);
        this.f27301j = map.get("linkOnInteraction");
        this.f27306o = map.get("importanceChannel");
        if (h.a().Q4() || h.a().S0()) {
            this.f27307p = map.get("channelId");
        }
        if (h.a().S0() && (str2 = map.get("channel")) != null) {
            this.f27308q = PayloadNotificationChannel.fromJson(str2);
        }
        if (h.a().c4()) {
            this.f27310s = map.get("groupId");
        }
        if (h.a().t0()) {
            this.f27309r = Boolean.parseBoolean(map.get("doNotDisturbEnabled"));
        }
        this.f27311t = m.a(map.get("visibility"), 1);
        this.B = new ArrayList();
        for (String str3 : map.keySet()) {
            if (str3.startsWith("ClientEventField.")) {
                this.B.add(new NameValuePair(str3, map.get(str3)));
            }
        }
        this.f27312u = map.get("notificationTypeData");
        this.f27313v = "CallReceived".equals(this.b);
        if (a1.q0()) {
            this.f27314w = new HashMap();
        } else {
            this.f27314w = G(map.get("states"));
        }
        try {
            Map<String, String> mapF = F(map.get("parameters"));
            if (mapF.containsKey("IsChatReplyEnabled")) {
                this.f27302k = Boolean.parseBoolean(mapF.get("IsChatReplyEnabled"));
            }
            if (mapF.containsKey("ConversationId")) {
                if (h.a().y2()) {
                    this.f27304m = mapF.get("ConversationId");
                } else {
                    this.f27303l = Long.parseLong(mapF.get("ConversationId"));
                }
            }
            if (mapF.containsKey("MessageId")) {
                this.f27305n = mapF.get("MessageId");
            }
        } catch (Exception unused) {
            this.f27302k = false;
            q.h("PushNotification", "Could not build notification reply payload");
        }
        if (h.a().P5()) {
            try {
                if (map.containsKey("media")) {
                    this.C = RichPushNotificationMedia.INSTANCE.a(map.get("media"));
                }
            } catch (Exception e10) {
                q.h("PushNotification", "Could not build rich push notification data from payload. Exception: " + e10);
            }
        }
        if (h.a().K0() && (str = map.get("actions")) != null) {
            this.D = NotificationAction.getListFromJson(str);
        }
        try {
            this.f27315x = e.valueOf(map.get("thumbnailType"));
            this.f27316y = Long.parseLong(map.get("thumbnailId"));
            this.f27317z = map.get("thumbnailDefaultUrl");
        } catch (Exception e11) {
            this.f27315x = e.none;
            this.f27316y = 0L;
            q.h("PushNotification", "Could not build thumbnail data from payload. Exception : " + e11);
        }
        try {
            Map<String, String> mapF2 = F(map.get("parameters"));
            if (mapF2.containsKey("IsForegroundDisabled")) {
                this.A = Boolean.parseBoolean(mapF2.get("IsForegroundDisabled"));
            } else {
                this.A = false;
            }
        } catch (Exception unused2) {
            this.A = false;
            q.h("PushNotification", "Could not build notification isForegroundPushDisabled payload");
        }
    }

    @Override // nj.f
    public String A() {
        return this.f27305n;
    }

    @Override // nj.f
    public String B() {
        return this.f27317z;
    }

    @Override // nj.f
    public long C() {
        return this.f27316y;
    }

    public String D() {
        return this.f27306o;
    }

    public String E() {
        return this.f27301j;
    }

    public final Map<String, String> F(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.getString(next));
                }
            } catch (JSONException e10) {
                q.f("PushNotification", "Push notification param parse exception.", e10);
            }
        }
        return map;
    }

    public final Map<String, f> G(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    HashMap map2 = new HashMap();
                    String next = itKeys.next();
                    JSONObject jSONObject2 = new JSONObject(jSONObject.getString(next));
                    Iterator<String> itKeys2 = jSONObject2.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        String string = jSONObject2.getString(next2);
                        if ("notificationId".equals(next2) || "tag".equals(next2) || "notificationType".equals(next2)) {
                            string = String.format("%s-%s", string, next);
                        }
                        map2.put(next2, string);
                    }
                    map.put(next, new d(map2));
                }
            } catch (JSONException e10) {
                q.f("PushNotification", "Push notification states parse exception.", e10);
            }
        }
        return map;
    }

    @Override // nj.f
    public String a() {
        return this.f27298g;
    }

    @Override // nj.f
    public List<NameValuePair> b() {
        return this.B;
    }

    @Override // nj.f
    public String c() {
        return this.b;
    }

    @Override // nj.f
    public int d() {
        if (TextUtils.isEmpty(this.f27305n)) {
            return 3;
        }
        return this.f27305n.hashCode();
    }

    @Override // nj.f
    public boolean e() {
        return this.f27313v;
    }

    @Override // nj.f
    public int f() {
        return this.f27300i;
    }

    @Override // nj.f
    public PendingIntent g(Context context) {
        Intent intent = new Intent("push_notification_opened");
        intent.setClass(context, ActivitySplash.class);
        intent.putExtra("STARTED_FOR_INTENT_KEY", StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION);
        intent.putExtra("EXTRA_NOTIFICATION_ID", getId());
        intent.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 2);
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", c());
        intent.putExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", E());
        intent.putExtra("EXTRA_NOTIFICATION_VERSION", o());
        intent.putExtra("EXTRA_NOTIFICATION_LOGGING_FIELDS", h());
        return PendingIntent.getActivity(context, d(), intent, 301989888);
    }

    @Override // nj.f
    public String getBody() {
        return this.f27295d;
    }

    @Override // nj.f
    public String getGroupId() {
        return this.f27310s;
    }

    @Override // nj.f
    public String getId() {
        return this.f27294c;
    }

    @Override // nj.f
    public String getTitle() {
        return this.f27296e;
    }

    @Override // nj.f
    public int getVisibility() {
        return this.f27311t;
    }

    @Override // nj.f
    public Bundle h() {
        Bundle bundle = new Bundle();
        for (NameValuePair nameValuePair : this.B) {
            bundle.putString(nameValuePair.getName(), nameValuePair.getValue());
        }
        return bundle;
    }

    @Override // nj.f
    public int i(Context context) {
        String str = this.f27297f;
        if (str == null) {
            return l0.f30409j;
        }
        str.getClass();
        return l0.f30409j;
    }

    @Override // nj.f
    public boolean j() {
        return this.f27302k;
    }

    @Override // nj.f
    public boolean k() {
        return this.A;
    }

    @Override // nj.f
    public PayloadNotificationChannel l() {
        return this.f27308q;
    }

    @Override // nj.f
    public String m() {
        return "CallReceived".equals(this.b) ? "channel_calls" : D();
    }

    @Override // nj.f
    public PendingIntent n(Context context) {
        Intent intent = new Intent("push_notification_cleared");
        intent.setClass(context, Sendr1PushNotificationReceiver.class);
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", c());
        intent.putExtra("EXTRA_NOTIFICATION_ID", getId());
        intent.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 1);
        intent.putExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", E());
        intent.putExtra("EXTRA_NOTIFICATION_VERSION", o());
        intent.putExtra("EXTRA_NOTIFICATION_LOGGING_FIELDS", h());
        return PendingIntent.getBroadcast(context, d(), intent, 301989888);
    }

    @Override // nj.f
    public String o() {
        return this.f27293a;
    }

    @Override // nj.f
    @Deprecated
    public long p() {
        return this.f27303l;
    }

    @Override // nj.f
    public e q() {
        return this.f27315x;
    }

    @Override // nj.f
    public String r() {
        return this.f27312u;
    }

    @Override // nj.f
    public String s() {
        return this.f27307p;
    }

    @Override // nj.f
    public int t() {
        String str = this.f27306o;
        if (str == null) {
            return 0;
        }
        str.getClass();
        switch (str) {
            case "channel_medium":
                return -1;
            case "channel_urgent":
                return 1;
            case "channel_minimum":
                return -2;
            default:
                return 0;
        }
    }

    @Override // nj.f
    public List<NotificationAction> u() {
        return this.D;
    }

    @Override // nj.f
    public RichPushNotificationMedia v() {
        return this.C;
    }

    @Override // nj.f
    public boolean w() {
        return this.f27309r;
    }

    @Override // nj.f
    public Uri x(Context context) {
        if (TextUtils.isEmpty(this.f27299h)) {
            return e() ? Settings.System.DEFAULT_RINGTONE_URI : Settings.System.DEFAULT_NOTIFICATION_URI;
        }
        this.f27299h.getClass();
        return null;
    }

    @Override // nj.f
    public Map<String, f> y() {
        return this.f27314w;
    }

    @Override // nj.f
    public String z() {
        return this.f27304m;
    }
}
