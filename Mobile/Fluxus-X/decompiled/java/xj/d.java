package xj;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import bh.a1;
import bh.l0;
import bi.h;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.pushnotification.v2.model.NotificationAction;
import com.roblox.client.pushnotification.v2.model.PayloadNotificationChannel;
import com.roblox.client.pushnotification.v2.receiver.Sendr1PushNotificationReceiver;
import com.roblox.client.pushnotification.v2.richpushnotifications.RichPushNotificationMedia;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.StartedForEnum;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ok.m;
import ok.q;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class d implements f {
    public boolean A;
    public List<NameValuePair> B;
    public RichPushNotificationMedia C;
    public List<NotificationAction> D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f36762a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f36763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f36764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f36765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f36766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f36767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f36768h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f36769i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f36770j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f36771k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Deprecated
    public long f36772l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f36773m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f36774n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f36775o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f36776p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public PayloadNotificationChannel f36777q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f36778r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f36779s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f36780t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f36781u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f36782v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Map<String, f> f36783w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public e f36784x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f36785y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f36786z;

    public d(Map<String, String> map) {
        String str;
        this.C = RichPushNotificationMedia.INSTANCE.b();
        this.D = Collections.EMPTY_LIST;
        this.f36762a = map.get("version");
        this.b = map.get("notificationType");
        this.f36763c = map.get("notificationId");
        this.f36764d = map.get("body");
        this.f36765e = map.get(Title.type);
        this.f36766f = map.get("iconUrl");
        this.f36767g = map.get("tag");
        this.f36768h = map.get("sound");
        this.f36769i = m.a(map.get("badge"), 1);
        this.f36770j = map.get("linkOnInteraction");
        this.f36775o = map.get("importanceChannel");
        this.f36776p = map.get("channelId");
        if (h.a().U0() && (str = map.get("channel")) != null) {
            this.f36777q = PayloadNotificationChannel.fromJson(str);
        }
        this.f36779s = map.get("groupId");
        if (h.a().v0()) {
            this.f36778r = Boolean.parseBoolean(map.get("doNotDisturbEnabled"));
        }
        this.f36780t = m.a(map.get("visibility"), 1);
        this.B = new ArrayList();
        for (String str2 : map.keySet()) {
            if (str2.startsWith("ClientEventField.")) {
                this.B.add(new NameValuePair(str2, map.get(str2)));
            }
        }
        this.f36781u = map.get("notificationTypeData");
        this.f36782v = "CallReceived".equals(this.b);
        if (a1.q0()) {
            this.f36783w = new HashMap();
        } else {
            this.f36783w = G(map.get("states"));
        }
        try {
            Map<String, String> mapF = F(map.get("parameters"));
            if (mapF.containsKey("IsChatReplyEnabled")) {
                this.f36771k = Boolean.parseBoolean(mapF.get("IsChatReplyEnabled"));
            }
            if (mapF.containsKey("ConversationId")) {
                if (h.a().A2()) {
                    this.f36773m = mapF.get("ConversationId");
                } else {
                    this.f36772l = Long.parseLong(mapF.get("ConversationId"));
                }
            }
            if (mapF.containsKey("MessageId")) {
                this.f36774n = mapF.get("MessageId");
            }
        } catch (Exception unused) {
            this.f36771k = false;
            q.h("PushNotification", "Could not build notification reply payload");
        }
        try {
            if (map.containsKey("media")) {
                this.C = RichPushNotificationMedia.INSTANCE.a(map.get("media"));
            }
        } catch (Exception e10) {
            q.h("PushNotification", "Could not build rich push notification data from payload. Exception: " + e10);
        }
        String str3 = map.get("actions");
        if (str3 != null) {
            this.D = NotificationAction.getListFromJson(str3);
        }
        try {
            this.f36784x = e.valueOf(map.get("thumbnailType"));
            this.f36785y = Long.parseLong(map.get("thumbnailId"));
            this.f36786z = map.get("thumbnailDefaultUrl");
        } catch (Exception e11) {
            this.f36784x = e.none;
            this.f36785y = 0L;
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

    @Override // xj.f
    public String A() {
        return this.f36774n;
    }

    @Override // xj.f
    public String B() {
        return this.f36786z;
    }

    @Override // xj.f
    public long C() {
        return this.f36785y;
    }

    public String D() {
        return this.f36775o;
    }

    public String E() {
        return this.f36770j;
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

    @Override // xj.f
    public String a() {
        return this.f36767g;
    }

    @Override // xj.f
    public List<NameValuePair> b() {
        return this.B;
    }

    @Override // xj.f
    public String c() {
        return this.b;
    }

    @Override // xj.f
    public int d() {
        if (TextUtils.isEmpty(this.f36774n)) {
            return 3;
        }
        return this.f36774n.hashCode();
    }

    @Override // xj.f
    public boolean e() {
        return this.f36782v;
    }

    @Override // xj.f
    public int f() {
        return this.f36769i;
    }

    @Override // xj.f
    public PendingIntent g(Context context) {
        Intent intent = new Intent("push_notification_opened");
        intent.setClass(context, ActivitySplash.class);
        if (h.a().y2()) {
            Uri.Builder builderAppendPath = new Uri.Builder().scheme("roblox").authority("push").appendPath(String.valueOf(d()));
            String id2 = getId();
            String strE = BuildConfig.FLAVOR;
            Uri.Builder builderAppendQueryParameter = builderAppendPath.appendQueryParameter("notificationId", id2 == null ? BuildConfig.FLAVOR : getId()).appendQueryParameter("messageId", A() == null ? BuildConfig.FLAVOR : A());
            if (E() != null) {
                strE = E();
            }
            intent.setData(builderAppendQueryParameter.appendQueryParameter("link", strE).build());
        }
        intent.putExtra("STARTED_FOR_INTENT_KEY", StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION);
        intent.putExtra("EXTRA_NOTIFICATION_ID", getId());
        intent.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 2);
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", c());
        intent.putExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", E());
        intent.putExtra("EXTRA_NOTIFICATION_VERSION", o());
        intent.putExtra("EXTRA_NOTIFICATION_LOGGING_FIELDS", h());
        return PendingIntent.getActivity(context, d(), intent, 301989888);
    }

    @Override // xj.f
    public String getBody() {
        return this.f36764d;
    }

    @Override // xj.f
    public String getGroupId() {
        return this.f36779s;
    }

    @Override // xj.f
    public String getId() {
        return this.f36763c;
    }

    @Override // xj.f
    public String getTitle() {
        return this.f36765e;
    }

    @Override // xj.f
    public int getVisibility() {
        return this.f36780t;
    }

    @Override // xj.f
    public Bundle h() {
        Bundle bundle = new Bundle();
        for (NameValuePair nameValuePair : this.B) {
            bundle.putString(nameValuePair.getName(), nameValuePair.getValue());
        }
        return bundle;
    }

    @Override // xj.f
    public int i(Context context) {
        String str = this.f36766f;
        if (str == null) {
            return l0.f4110j;
        }
        str.getClass();
        return l0.f4110j;
    }

    @Override // xj.f
    public boolean j() {
        return this.f36771k;
    }

    @Override // xj.f
    public boolean k() {
        return this.A;
    }

    @Override // xj.f
    public PayloadNotificationChannel l() {
        return this.f36777q;
    }

    @Override // xj.f
    public String m() {
        return "CallReceived".equals(this.b) ? "channel_calls" : D();
    }

    @Override // xj.f
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

    @Override // xj.f
    public String o() {
        return this.f36762a;
    }

    @Override // xj.f
    @Deprecated
    public long p() {
        return this.f36772l;
    }

    @Override // xj.f
    public e q() {
        return this.f36784x;
    }

    @Override // xj.f
    public String r() {
        return this.f36781u;
    }

    @Override // xj.f
    public String s() {
        return this.f36776p;
    }

    @Override // xj.f
    public int t() {
        String str = this.f36775o;
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

    @Override // xj.f
    public List<NotificationAction> u() {
        return this.D;
    }

    @Override // xj.f
    public RichPushNotificationMedia v() {
        return this.C;
    }

    @Override // xj.f
    public boolean w() {
        return this.f36778r;
    }

    @Override // xj.f
    public Uri x(Context context) {
        if (TextUtils.isEmpty(this.f36768h)) {
            return e() ? Settings.System.DEFAULT_RINGTONE_URI : Settings.System.DEFAULT_NOTIFICATION_URI;
        }
        this.f36768h.getClass();
        return null;
    }

    @Override // xj.f
    public Map<String, f> y() {
        return this.f36783w;
    }

    @Override // xj.f
    public String z() {
        return this.f36773m;
    }
}
