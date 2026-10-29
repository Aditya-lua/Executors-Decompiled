package p551xl;

import android.util.Log;
import androidx.annotation.NonNull;
import com.roblox.universalapp.call.JNICallProtocol;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: xl.g */
/* JADX INFO: loaded from: classes2.dex */
public class C12864g {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final MessageBus f45690a;

    /* JADX INFO: renamed from: b */
    public Connection f45691b;

    /* JADX INFO: renamed from: c */
    public Connection f45692c;

    /* JADX INFO: renamed from: d */
    public Connection f45693d;

    /* JADX INFO: renamed from: e */
    public Connection f45694e;

    /* JADX INFO: renamed from: f */
    public Connection f45695f;

    /* JADX INFO: renamed from: g */
    public Connection f45696g;

    /* JADX INFO: renamed from: h */
    public boolean f45697h;

    /* JADX INFO: renamed from: i */
    public boolean f45698i;

    /* JADX INFO: renamed from: j */
    public Set<a> f45699j = new HashSet();

    /* JADX INFO: renamed from: xl.g$a */
    public interface a {
        /* JADX INFO: renamed from: C */
        void mo14808C(String str, boolean z10);

        /* JADX INFO: renamed from: V */
        void mo14812V(String str);

        /* JADX INFO: renamed from: m0 */
        void mo14813m0(String str);

        /* JADX INFO: renamed from: o */
        void mo14814o(String str, String str2, String str3, String str4, String str5, String str6);

        /* JADX INFO: renamed from: p */
        void mo14815p(String str, String str2, String str3, String str4, String str5, String str6);

        /* JADX INFO: renamed from: v */
        void mo14816v(String str, String str2);
    }

    /* JADX INFO: renamed from: xl.g$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final C12864g f45700a = new C12864g(null);
    }

    public C12864g(MessageBus messageBus) {
        messageBus = messageBus == null ? MessageBus.m16016f() : messageBus;
        this.f45690a = messageBus;
        this.f45696g = messageBus.m16030t(JNICallProtocol.getHandleConnectingCallId(), new Callback() { // from class: xl.a
            @Override // com.roblox.universalapp.messagebus.Callback
            /* JADX INFO: renamed from: a */
            public final void mo7492a(JSONObject jSONObject) {
                this.f45684a.m47844i(jSONObject);
            }
        });
        this.f45691b = messageBus.m16030t(JNICallProtocol.getHandleReceiveCallId(), new Callback() { // from class: xl.b
            @Override // com.roblox.universalapp.messagebus.Callback
            /* JADX INFO: renamed from: a */
            public final void mo7492a(JSONObject jSONObject) {
                this.f45685a.m47845j(jSONObject);
            }
        });
        this.f45692c = messageBus.m16030t(JNICallProtocol.getHandleAnswerCallId(), new Callback() { // from class: xl.c
            @Override // com.roblox.universalapp.messagebus.Callback
            /* JADX INFO: renamed from: a */
            public final void mo7492a(JSONObject jSONObject) {
                this.f45686a.m47846k(jSONObject);
            }
        });
        this.f45693d = messageBus.m16030t(JNICallProtocol.getHandleEndCallId(), new Callback() { // from class: xl.d
            @Override // com.roblox.universalapp.messagebus.Callback
            /* JADX INFO: renamed from: a */
            public final void mo7492a(JSONObject jSONObject) {
                this.f45687a.m47847l(jSONObject);
            }
        });
        this.f45694e = messageBus.m16030t(JNICallProtocol.getHandleActiveCallId(), new Callback() { // from class: xl.e
            @Override // com.roblox.universalapp.messagebus.Callback
            /* JADX INFO: renamed from: a */
            public final void mo7492a(JSONObject jSONObject) {
                this.f45688a.m47848m(jSONObject);
            }
        });
        this.f45695f = messageBus.m16030t(JNICallProtocol.getHandleRemovePendingReceivedCall(), new Callback() { // from class: xl.f
            @Override // com.roblox.universalapp.messagebus.Callback
            /* JADX INFO: renamed from: a */
            public final void mo7492a(JSONObject jSONObject) {
                this.f45689a.m47849n(jSONObject);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public static C12864g m47841x() {
        return b.f45700a;
    }

    /* JADX INFO: renamed from: g */
    public void m47842g(a aVar) {
        synchronized (this) {
            this.f45699j.add(aVar);
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m47843h() {
        return this.f45697h;
    }

    /* JADX DEBUG: Method merged with bridge method: m(Lorg/json/JSONObject;)V */
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void m47848m(JSONObject jSONObject) {
        this.f45698i = false;
        String strOptString = jSONObject.optString(JNICallProtocol.getCallIdKey());
        String strOptString2 = jSONObject.optString(JNICallProtocol.getNotificationIdKey());
        String strOptString3 = jSONObject.optString(JNICallProtocol.getCallerUserIdKey());
        String strOptString4 = jSONObject.optString(JNICallProtocol.getCallerCombinedNameKey());
        String strOptString5 = jSONObject.optString(JNICallProtocol.getCalleeUserIdKey());
        String strOptString6 = jSONObject.optString(JNICallProtocol.getCalleeCombinedNameKey());
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f45699j).iterator();
                while (it.hasNext()) {
                    ((a) it.next()).mo14815p(strOptString, strOptString2, strOptString3, strOptString5, strOptString4, strOptString6);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: k(Lorg/json/JSONObject;)V */
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void m47846k(JSONObject jSONObject) {
        String strOptString = jSONObject.optString(JNICallProtocol.getNotificationIdKey());
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f45699j).iterator();
                while (it.hasNext()) {
                    ((a) it.next()).mo14812V(strOptString);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: i(Lorg/json/JSONObject;)V */
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void m47844i(JSONObject jSONObject) {
        this.f45698i = true;
        this.f45697h = true;
        String strOptString = jSONObject.optString(JNICallProtocol.getCallIdKey());
        String strOptString2 = jSONObject.optString(JNICallProtocol.getNotificationIdKey());
        String strOptString3 = jSONObject.optString(JNICallProtocol.getCallerUserIdKey());
        String strOptString4 = jSONObject.optString(JNICallProtocol.getCallerCombinedNameKey());
        String strOptString5 = jSONObject.optString(JNICallProtocol.getCalleeUserIdKey());
        String strOptString6 = jSONObject.optString(JNICallProtocol.getCalleeCombinedNameKey());
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f45699j).iterator();
                while (it.hasNext()) {
                    ((a) it.next()).mo14814o(strOptString, strOptString2, strOptString3, strOptString5, strOptString4, strOptString6);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: l(Lorg/json/JSONObject;)V */
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void m47847l(JSONObject jSONObject) {
        this.f45698i = false;
        this.f45697h = false;
        String strOptString = jSONObject.optString(JNICallProtocol.getCallActionKey());
        String strOptString2 = jSONObject.optString(JNICallProtocol.getNotificationIdKey());
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f45699j).iterator();
                while (it.hasNext()) {
                    ((a) it.next()).mo14816v(strOptString2, strOptString);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: j(Lorg/json/JSONObject;)V */
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void m47845j(JSONObject jSONObject) {
        this.f45697h = true;
        String strOptString = jSONObject.optString(JNICallProtocol.getNotificationIdKey());
        boolean zOptBoolean = jSONObject.optBoolean(JNICallProtocol.getIsDuplicateKey());
        boolean zOptBoolean2 = jSONObject.optBoolean(JNICallProtocol.getIsExpiredKey());
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f45699j).iterator();
                while (it.hasNext()) {
                    ((a) it.next()).mo14808C(strOptString, (zOptBoolean || zOptBoolean2) ? false : true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: n(Lorg/json/JSONObject;)V */
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void m47849n(JSONObject jSONObject) {
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f45699j).iterator();
                while (it.hasNext()) {
                    ((a) it.next()).mo14813m0(jSONObject.optString(JNICallProtocol.getNotificationIdKey()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m47856u(String str, long j10, String str2, long j11, String str3, long j12, String str4, String str5, long j13, boolean z10, String str6) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNICallProtocol.getCallIdKey(), str);
            jSONObject.put(JNICallProtocol.getCallerUserIdKey(), j10);
            jSONObject.put(JNICallProtocol.getCallerCombinedNameKey(), str2);
            jSONObject.put(JNICallProtocol.getCalleeUserIdKey(), j11);
            jSONObject.put(JNICallProtocol.getCalleeCombinedNameKey(), str3);
            jSONObject.put(JNICallProtocol.getPlaceIdKey(), j12);
            jSONObject.put(JNICallProtocol.getGameInstanceIdKey(), str4);
            jSONObject.put(JNICallProtocol.getReservedServerAccessCodeKey(), str5);
            jSONObject.put(JNICallProtocol.getCreatedUtcKey(), j13);
            jSONObject.put(JNICallProtocol.getIsCalleeMicEnabledKey(), z10);
            jSONObject.put(JNICallProtocol.getNotificationIdKey(), str6);
            JNICallProtocol.receiveCall(jSONObject.toString());
        } catch (JSONException e10) {
            Log.e("CallProtocol", "Constructing JSON params for receive call failed with error.", e10);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m47857v(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNICallProtocol.getCallIdKey(), str);
            this.f45690a.m16024l(JNICallProtocol.getRejectCallId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("CallProtocol", "Constructing JSON params for reject call failed with error: " + e10.getMessage());
        }
    }

    /* JADX INFO: renamed from: w */
    public void m47858w(a aVar) {
        synchronized (this) {
            this.f45699j.remove(aVar);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m47859y(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNICallProtocol.getCallIdKey(), str);
            this.f45690a.m16024l(JNICallProtocol.getSuppressCallId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("CallProtocol", "Constructing JSON params for suppress call failed with error: " + e10.getMessage());
        }
    }
}
