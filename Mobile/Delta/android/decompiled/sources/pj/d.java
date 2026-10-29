package pj;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.pushnotification.v2.model.NotificationAction;
import com.roblox.client.pushnotification.v2.receiver.Sendr1PushNotificationReceiver;
import com.roblox.client.pushnotification.v2.richpushnotifications.RichPushNotificationMedia;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.StartedForEnum;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import gk.l;
import gk.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.a1;
import sg.l0;
import th.h;

/* JADX INFO: loaded from: classes2.dex */
public class d implements f {
    public List<NameValuePair> A;
    public RichPushNotificationMedia B;
    public List<NotificationAction> C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f28699a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f28700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f28701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f28702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f28703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f28704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f28705h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f28706i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f28707j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f28708k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public long f28709l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f28710m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f28711n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f28712o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f28713p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f28714q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f28715r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f28716s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f28717t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f28718u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Map<String, f> f28719v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public e f28720w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f28721x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f28722y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f28723z;

    public d(Map<String, String> map) {
        String str;
        this.B = RichPushNotificationMedia.INSTANCE.b();
        this.C = Collections.EMPTY_LIST;
        this.f28699a = map.get("version");
        this.b = map.get("notificationType");
        this.f28700c = map.get("notificationId");
        this.f28701d = map.get("body");
        this.f28702e = map.get(Title.type);
        this.f28703f = map.get("iconUrl");
        this.f28704g = map.get("tag");
        this.f28705h = map.get("sound");
        this.f28706i = l.a(map.get("badge"), 1);
        this.f28707j = map.get("linkOnInteraction");
        this.f28712o = map.get("importanceChannel");
        if (h.a().E4()) {
            this.f28713p = map.get("channelId");
        }
        if (h.a().R3()) {
            this.f28715r = map.get("groupId");
        }
        if (h.a().o0()) {
            this.f28714q = Boolean.parseBoolean(map.get("doNotDisturbEnabled"));
        }
        this.f28716s = l.a(map.get("visibility"), 1);
        this.A = new ArrayList();
        for (String str2 : map.keySet()) {
            if (str2.startsWith("ClientEventField.")) {
                this.A.add(new NameValuePair(str2, map.get(str2)));
            }
        }
        this.f28717t = map.get("notificationTypeData");
        this.f28718u = "CallReceived".equals(this.b);
        if (a1.q0()) {
            this.f28719v = new HashMap();
        } else {
            this.f28719v = F(map.get("states"));
        }
        try {
            Map<String, String> mapE = E(map.get("parameters"));
            if (mapE.containsKey("IsChatReplyEnabled")) {
                this.f28708k = Boolean.parseBoolean(mapE.get("IsChatReplyEnabled"));
            }
            if (mapE.containsKey("ConversationId")) {
                if (h.a().n2()) {
                    this.f28710m = mapE.get("ConversationId");
                } else {
                    this.f28709l = Long.parseLong(mapE.get("ConversationId"));
                }
            }
            if (mapE.containsKey("MessageId")) {
                this.f28711n = mapE.get("MessageId");
            }
        } catch (Exception unused) {
            this.f28708k = false;
            p.h("PushNotification", "Could not build notification reply payload");
        }
        if (h.a().F5()) {
            try {
                if (map.containsKey("media")) {
                    this.B = RichPushNotificationMedia.INSTANCE.a(map.get("media"));
                }
            } catch (Exception e10) {
                p.h("PushNotification", "Could not build rich push notification data from payload. Exception: " + e10);
            }
        }
        if (h.a().F0() && (str = map.get("actions")) != null) {
            this.C = NotificationAction.getListFromJson(str);
        }
        try {
            this.f28720w = e.valueOf(map.get("thumbnailType"));
            this.f28721x = Long.parseLong(map.get("thumbnailId"));
            this.f28722y = map.get("thumbnailDefaultUrl");
        } catch (Exception e11) {
            this.f28720w = e.none;
            this.f28721x = 0L;
            p.h("PushNotification", "Could not build thumbnail data from payload. Exception : " + e11);
        }
        try {
            Map<String, String> mapE2 = E(map.get("parameters"));
            if (mapE2.containsKey("IsForegroundDisabled")) {
                this.f28723z = Boolean.parseBoolean(mapE2.get("IsForegroundDisabled"));
            } else {
                this.f28723z = false;
            }
        } catch (Exception unused2) {
            this.f28723z = false;
            p.h("PushNotification", "Could not build notification isForegroundPushDisabled payload");
        }
    }

    @Override // pj.f
    public String A() {
        return this.f28722y;
    }

    @Override // pj.f
    public long B() {
        return this.f28721x;
    }

    public String C() {
        return this.f28712o;
    }

    public String D() {
        return this.f28707j;
    }

    public final Map<String, String> E(String str) {
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
                p.f("PushNotification", "Push notification param parse exception.", e10);
            }
        }
        return map;
    }

    public final Map<String, f> F(String str) {
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
                p.f("PushNotification", "Push notification states parse exception.", e10);
            }
        }
        return map;
    }

    @Override // pj.f
    public String a() {
        return this.f28704g;
    }

    @Override // pj.f
    public List<NameValuePair> b() {
        return this.A;
    }

    @Override // pj.f
    public String c() {
        return this.b;
    }

    @Override // pj.f
    public int d() {
        if (TextUtils.isEmpty(this.f28711n)) {
            return 3;
        }
        return this.f28711n.hashCode();
    }

    @Override // pj.f
    public boolean e() {
        return this.f28718u;
    }

    @Override // pj.f
    public int f() {
        return this.f28706i;
    }

    @Override // pj.f
    public PendingIntent g(Context context) {
        Intent intent = new Intent("push_notification_opened");
        intent.setClass(context, ActivitySplash.class);
        intent.putExtra("STARTED_FOR_INTENT_KEY", StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION);
        intent.putExtra("EXTRA_NOTIFICATION_ID", getId());
        intent.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 2);
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", c());
        intent.putExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", D());
        intent.putExtra("EXTRA_NOTIFICATION_VERSION", n());
        intent.putExtra("EXTRA_NOTIFICATION_LOGGING_FIELDS", h());
        return PendingIntent.getActivity(context, d(), intent, 301989888);
    }

    @Override // pj.f
    public String getBody() {
        return this.f28701d;
    }

    @Override // pj.f
    public String getGroupId() {
        return this.f28715r;
    }

    @Override // pj.f
    public String getId() {
        return this.f28700c;
    }

    @Override // pj.f
    public String getTitle() {
        return this.f28702e;
    }

    @Override // pj.f
    public int getVisibility() {
        return this.f28716s;
    }

    @Override // pj.f
    public Bundle h() {
        Bundle bundle = new Bundle();
        for (NameValuePair nameValuePair : this.A) {
            bundle.putString(nameValuePair.getName(), nameValuePair.getValue());
        }
        return bundle;
    }

    @Override // pj.f
    public int i(Context context) {
        String str = this.f28703f;
        if (str == null) {
            return l0.f30806j;
        }
        str.getClass();
        return l0.f30806j;
    }

    @Override // pj.f
    public boolean j() {
        return this.f28708k;
    }

    @Override // pj.f
    public boolean k() {
        return this.f28723z;
    }

    @Override // pj.f
    public String l() {
        return "CallReceived".equals(this.b) ? "channel_calls" : C();
    }

    @Override // pj.f
    public PendingIntent m(Context context) {
        Intent intent = new Intent("push_notification_cleared");
        intent.setClass(context, Sendr1PushNotificationReceiver.class);
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", c());
        intent.putExtra("EXTRA_NOTIFICATION_ID", getId());
        intent.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 1);
        intent.putExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", D());
        intent.putExtra("EXTRA_NOTIFICATION_VERSION", n());
        intent.putExtra("EXTRA_NOTIFICATION_LOGGING_FIELDS", h());
        return PendingIntent.getBroadcast(context, d(), intent, 301989888);
    }

    @Override // pj.f
    public String n() {
        return this.f28699a;
    }

    @Override // pj.f
    @Deprecated
    public long o() {
        return this.f28709l;
    }

    @Override // pj.f
    public e p() {
        return this.f28720w;
    }

    @Override // pj.f
    public String q() {
        return this.f28717t;
    }

    @Override // pj.f
    public String r() {
        return this.f28713p;
    }

    @Override // pj.f
    public int s() {
        String str = this.f28712o;
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

    @Override // pj.f
    public List<NotificationAction> t() {
        return this.C;
    }

    @Override // pj.f
    public RichPushNotificationMedia u() {
        return this.B;
    }

    @Override // pj.f
    public boolean v() {
        return this.f28714q;
    }

    @Override // pj.f
    public Uri w(Context context) {
        if (TextUtils.isEmpty(this.f28705h)) {
            return e() ? Settings.System.DEFAULT_RINGTONE_URI : Settings.System.DEFAULT_NOTIFICATION_URI;
        }
        this.f28705h.getClass();
        return null;
    }

    @Override // pj.f
    public Map<String, f> x() {
        return this.f28719v;
    }

    @Override // pj.f
    public String y() {
        return this.f28710m;
    }

    @Override // pj.f
    public String z() {
        return this.f28711n;
    }
}
