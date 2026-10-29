package p360pj;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.pushnotification.p051v2.model.NotificationAction;
import com.roblox.client.pushnotification.p051v2.receiver.Sendr1PushNotificationReceiver;
import com.roblox.client.pushnotification.p051v2.richpushnotifications.RichPushNotificationMedia;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.StartedForEnum;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p151gk.C6120m;
import p151gk.C6124q;
import sg.C11295a1;
import sg.C11332l0;
import th.C11659h;

/* JADX INFO: renamed from: pj.d */
/* JADX INFO: loaded from: classes2.dex */
public class C10288d implements InterfaceC10290f {

    /* JADX INFO: renamed from: A */
    public List<NameValuePair> f36966A;

    /* JADX INFO: renamed from: B */
    public RichPushNotificationMedia f36967B;

    /* JADX INFO: renamed from: C */
    public List<NotificationAction> f36968C;

    /* JADX INFO: renamed from: a */
    public String f36969a;

    /* JADX INFO: renamed from: b */
    public String f36970b;

    /* JADX INFO: renamed from: c */
    public String f36971c;

    /* JADX INFO: renamed from: d */
    public String f36972d;

    /* JADX INFO: renamed from: e */
    public String f36973e;

    /* JADX INFO: renamed from: f */
    public String f36974f;

    /* JADX INFO: renamed from: g */
    public String f36975g;

    /* JADX INFO: renamed from: h */
    public String f36976h;

    /* JADX INFO: renamed from: i */
    public int f36977i;

    /* JADX INFO: renamed from: j */
    public String f36978j;

    /* JADX INFO: renamed from: k */
    public boolean f36979k;

    /* JADX INFO: renamed from: l */
    @Deprecated
    public long f36980l;

    /* JADX INFO: renamed from: m */
    public String f36981m;

    /* JADX INFO: renamed from: n */
    public String f36982n;

    /* JADX INFO: renamed from: o */
    public String f36983o;

    /* JADX INFO: renamed from: p */
    public String f36984p;

    /* JADX INFO: renamed from: q */
    public boolean f36985q;

    /* JADX INFO: renamed from: r */
    public String f36986r;

    /* JADX INFO: renamed from: s */
    public int f36987s;

    /* JADX INFO: renamed from: t */
    public String f36988t;

    /* JADX INFO: renamed from: u */
    public boolean f36989u;

    /* JADX INFO: renamed from: v */
    public final Map<String, InterfaceC10290f> f36990v;

    /* JADX INFO: renamed from: w */
    public EnumC10289e f36991w;

    /* JADX INFO: renamed from: x */
    public long f36992x;

    /* JADX INFO: renamed from: y */
    public String f36993y;

    /* JADX INFO: renamed from: z */
    public boolean f36994z;

    public C10288d(Map<String, String> map) {
        String str;
        this.f36967B = RichPushNotificationMedia.INSTANCE.m15474b();
        this.f36968C = Collections.EMPTY_LIST;
        this.f36969a = map.get("version");
        this.f36970b = map.get("notificationType");
        this.f36971c = map.get("notificationId");
        this.f36972d = map.get("body");
        this.f36973e = map.get(Title.type);
        this.f36974f = map.get("iconUrl");
        this.f36975g = map.get("tag");
        this.f36976h = map.get("sound");
        this.f36977i = C6120m.m27043a(map.get("badge"), 1);
        this.f36978j = map.get("linkOnInteraction");
        this.f36983o = map.get("importanceChannel");
        if (C11659h.m43403a().mo43472J4()) {
            this.f36984p = map.get("channelId");
        }
        if (C11659h.m43403a().mo43560W3()) {
            this.f36986r = map.get("groupId");
        }
        if (C11659h.m43403a().mo43716s0()) {
            this.f36985q = Boolean.parseBoolean(map.get("doNotDisturbEnabled"));
        }
        this.f36987s = C6120m.m27043a(map.get("visibility"), 1);
        this.f36966A = new ArrayList();
        for (String str2 : map.keySet()) {
            if (str2.startsWith("ClientEventField.")) {
                this.f36966A.add(new NameValuePair(str2, map.get(str2)));
            }
        }
        this.f36988t = map.get("notificationTypeData");
        this.f36989u = "CallReceived".equals(this.f36970b);
        if (C11295a1.m42471q0()) {
            this.f36990v = new HashMap();
        } else {
            this.f36990v = m39528F(map.get("states"));
        }
        try {
            Map<String, String> mapM39527E = m39527E(map.get("parameters"));
            if (mapM39527E.containsKey("IsChatReplyEnabled")) {
                this.f36979k = Boolean.parseBoolean(mapM39527E.get("IsChatReplyEnabled"));
            }
            if (mapM39527E.containsKey("ConversationId")) {
                if (C11659h.m43403a().mo43718s2()) {
                    this.f36981m = mapM39527E.get("ConversationId");
                } else {
                    this.f36980l = Long.parseLong(mapM39527E.get("ConversationId"));
                }
            }
            if (mapM39527E.containsKey("MessageId")) {
                this.f36982n = mapM39527E.get("MessageId");
            }
        } catch (Exception unused) {
            this.f36979k = false;
            C6124q.m27063h("PushNotification", "Could not build notification reply payload");
        }
        if (C11659h.m43403a().mo43487L5()) {
            try {
                if (map.containsKey("media")) {
                    this.f36967B = RichPushNotificationMedia.INSTANCE.m15473a(map.get("media"));
                }
            } catch (Exception e10) {
                C6124q.m27063h("PushNotification", "Could not build rich push notification data from payload. Exception: " + e10);
            }
        }
        if (C11659h.m43403a().mo43461I0() && (str = map.get("actions")) != null) {
            this.f36968C = NotificationAction.getListFromJson(str);
        }
        try {
            this.f36991w = EnumC10289e.valueOf(map.get("thumbnailType"));
            this.f36992x = Long.parseLong(map.get("thumbnailId"));
            this.f36993y = map.get("thumbnailDefaultUrl");
        } catch (Exception e11) {
            this.f36991w = EnumC10289e.none;
            this.f36992x = 0L;
            C6124q.m27063h("PushNotification", "Could not build thumbnail data from payload. Exception : " + e11);
        }
        try {
            Map<String, String> mapM39527E2 = m39527E(map.get("parameters"));
            if (mapM39527E2.containsKey("IsForegroundDisabled")) {
                this.f36994z = Boolean.parseBoolean(mapM39527E2.get("IsForegroundDisabled"));
            } else {
                this.f36994z = false;
            }
        } catch (Exception unused2) {
            this.f36994z = false;
            C6124q.m27063h("PushNotification", "Could not build notification isForegroundPushDisabled payload");
        }
    }

    @Override // p360pj.InterfaceC10290f
    /* JADX INFO: renamed from: A */
    public String mo39523A() {
        return this.f36993y;
    }

    @Override // p360pj.InterfaceC10290f
    /* JADX INFO: renamed from: B */
    public long mo39524B() {
        return this.f36992x;
    }

    /* JADX INFO: renamed from: C */
    public String m39525C() {
        return this.f36983o;
    }

    /* JADX INFO: renamed from: D */
    public String m39526D() {
        return this.f36978j;
    }

    /* JADX INFO: renamed from: E */
    public final Map<String, String> m39527E(String str) {
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
                C6124q.m27061f("PushNotification", "Push notification param parse exception.", e10);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: F */
    public final Map<String, InterfaceC10290f> m39528F(String str) {
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
                    map.put(next, new C10288d(map2));
                }
            } catch (JSONException e10) {
                C6124q.m27061f("PushNotification", "Push notification states parse exception.", e10);
            }
        }
        return map;
    }

    @Override // p360pj.InterfaceC10290f
    /* JADX INFO: renamed from: a */
    public String mo39529a() {
        return this.f36975g;
    }

    @Override // p360pj.InterfaceC10290f
    /* JADX INFO: renamed from: b */
    public List<NameValuePair> mo39530b() {
        return this.f36966A;
    }

    @Override // p360pj.InterfaceC10290f
    /* JADX INFO: renamed from: c */
    public String mo39531c() {
        return this.f36970b;
    }

    @Override // p360pj.InterfaceC10290f
    /* JADX INFO: renamed from: d */
    public int mo39532d() {
        if (TextUtils.isEmpty(this.f36982n)) {
            return 3;
        }
        return this.f36982n.hashCode();
    }

    @Override // p360pj.InterfaceC10290f
    /* JADX INFO: renamed from: e */
    public boolean mo39533e() {
        return this.f36989u;
    }

    @Override // p360pj.InterfaceC10290f
    /* JADX INFO: renamed from: f */
    public int mo39534f() {
        return this.f36977i;
    }

    @Override // p360pj.InterfaceC10290f
    /* JADX INFO: renamed from: g */
    public PendingIntent mo39535g(Context context) {
        Intent intent = new Intent("push_notification_opened");
        intent.setClass(context, ActivitySplash.class);
        intent.putExtra("STARTED_FOR_INTENT_KEY", StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION);
        intent.putExtra("EXTRA_NOTIFICATION_ID", getId());
        intent.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 2);
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", mo39531c());
        intent.putExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", m39526D());
        intent.putExtra("EXTRA_NOTIFICATION_VERSION", mo39542n());
        intent.putExtra("EXTRA_NOTIFICATION_LOGGING_FIELDS", mo39536h());
        return PendingIntent.getActivity(context, mo39532d(), intent, 301989888);
    }

    @Override // p360pj.InterfaceC10290f
    public String getBody() {
        return this.f36972d;
    }

    @Override // p360pj.InterfaceC10290f
    public String getGroupId() {
        return this.f36986r;
    }

    @Override // p360pj.InterfaceC10290f
    public String getId() {
        return this.f36971c;
    }

    @Override // p360pj.InterfaceC10290f
    public String getTitle() {
        return this.f36973e;
    }

    @Override // p360pj.InterfaceC10290f
    public int getVisibility() {
        return this.f36987s;
    }

    @Override // p360pj.InterfaceC10290f
    /* JADX INFO: renamed from: h */
    public Bundle mo39536h() {
        Bundle bundle = new Bundle();
        for (NameValuePair nameValuePair : this.f36966A) {
            bundle.putString(nameValuePair.getName(), nameValuePair.getValue());
        }
        return bundle;
    }

    @Override // p360pj.InterfaceC10290f
    /* JADX INFO: renamed from: i */
    public int mo39537i(Context context) {
        String str = this.f36974f;
        if (str == null) {
            return C11332l0.f39750j;
        }
        str.getClass();
        return C11332l0.f39750j;
    }

    @Override // p360pj.InterfaceC10290f
    /* JADX INFO: renamed from: j */
    public boolean mo39538j() {
        return this.f36979k;
    }

    @Override // p360pj.InterfaceC10290f
    /* JADX INFO: renamed from: k */
    public boolean mo39539k() {
        return this.f36994z;
    }

    @Override // p360pj.InterfaceC10290f
    /* JADX INFO: renamed from: l */
    public String mo39540l() {
        return "CallReceived".equals(this.f36970b) ? "channel_calls" : m39525C();
    }

    @Override // p360pj.InterfaceC10290f
    /* JADX INFO: renamed from: m */
    public PendingIntent mo39541m(Context context) {
        Intent intent = new Intent("push_notification_cleared");
        intent.setClass(context, Sendr1PushNotificationReceiver.class);
        intent.putExtra("EXTRA_NOTIFICATION_TYPE", mo39531c());
        intent.putExtra("EXTRA_NOTIFICATION_ID", getId());
        intent.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 1);
        intent.putExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION", m39526D());
        intent.putExtra("EXTRA_NOTIFICATION_VERSION", mo39542n());
        intent.putExtra("EXTRA_NOTIFICATION_LOGGING_FIELDS", mo39536h());
        return PendingIntent.getBroadcast(context, mo39532d(), intent, 301989888);
    }

    @Override // p360pj.InterfaceC10290f
    /* JADX INFO: renamed from: n */
    public String mo39542n() {
        return this.f36969a;
    }

    @Override // p360pj.InterfaceC10290f
    @Deprecated
    /* JADX INFO: renamed from: o */
    public long mo39543o() {
        return this.f36980l;
    }

    @Override // p360pj.InterfaceC10290f
    /* JADX INFO: renamed from: p */
    public EnumC10289e mo39544p() {
        return this.f36991w;
    }

    @Override // p360pj.InterfaceC10290f
    /* JADX INFO: renamed from: q */
    public String mo39545q() {
        return this.f36988t;
    }

    @Override // p360pj.InterfaceC10290f
    /* JADX INFO: renamed from: r */
    public String mo39546r() {
        return this.f36984p;
    }

    @Override // p360pj.InterfaceC10290f
    /* JADX INFO: renamed from: s */
    public int mo39547s() {
        String str = this.f36983o;
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

    @Override // p360pj.InterfaceC10290f
    /* JADX INFO: renamed from: t */
    public List<NotificationAction> mo39548t() {
        return this.f36968C;
    }

    @Override // p360pj.InterfaceC10290f
    /* JADX INFO: renamed from: u */
    public RichPushNotificationMedia mo39549u() {
        return this.f36967B;
    }

    @Override // p360pj.InterfaceC10290f
    /* JADX INFO: renamed from: v */
    public boolean mo39550v() {
        return this.f36985q;
    }

    @Override // p360pj.InterfaceC10290f
    /* JADX INFO: renamed from: w */
    public Uri mo39551w(Context context) {
        if (TextUtils.isEmpty(this.f36976h)) {
            return mo39533e() ? Settings.System.DEFAULT_RINGTONE_URI : Settings.System.DEFAULT_NOTIFICATION_URI;
        }
        this.f36976h.getClass();
        return null;
    }

    @Override // p360pj.InterfaceC10290f
    /* JADX INFO: renamed from: x */
    public Map<String, InterfaceC10290f> mo39552x() {
        return this.f36990v;
    }

    @Override // p360pj.InterfaceC10290f
    /* JADX INFO: renamed from: y */
    public String mo39553y() {
        return this.f36981m;
    }

    @Override // p360pj.InterfaceC10290f
    /* JADX INFO: renamed from: z */
    public String mo39554z() {
        return this.f36982n;
    }
}
