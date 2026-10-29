package xl;

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

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final MessageBus f35238a;
    public Connection b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Connection f35239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Connection f35240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Connection f35241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Connection f35242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Connection f35243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f35244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f35245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Set<a> f35246j = new HashSet();

    public interface a {
        void C(String str, boolean z10);

        void V(String str);

        void m0(String str);

        void o(String str, String str2, String str3, String str4, String str5, String str6);

        void p(String str, String str2, String str3, String str4, String str5, String str6);

        void v(String str, String str2);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f35247a = new g(null);
    }

    public g(MessageBus messageBus) {
        messageBus = messageBus == null ? MessageBus.f() : messageBus;
        this.f35238a = messageBus;
        this.f35243g = messageBus.t(JNICallProtocol.getHandleConnectingCallId(), new Callback() { // from class: xl.a
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f35232a.i(jSONObject);
            }
        });
        this.b = messageBus.t(JNICallProtocol.getHandleReceiveCallId(), new Callback() { // from class: xl.b
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f35233a.j(jSONObject);
            }
        });
        this.f35239c = messageBus.t(JNICallProtocol.getHandleAnswerCallId(), new Callback() { // from class: xl.c
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f35234a.k(jSONObject);
            }
        });
        this.f35240d = messageBus.t(JNICallProtocol.getHandleEndCallId(), new Callback() { // from class: xl.d
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f35235a.l(jSONObject);
            }
        });
        this.f35241e = messageBus.t(JNICallProtocol.getHandleActiveCallId(), new Callback() { // from class: xl.e
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f35236a.m(jSONObject);
            }
        });
        this.f35242f = messageBus.t(JNICallProtocol.getHandleRemovePendingReceivedCall(), new Callback() { // from class: xl.f
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f35237a.n(jSONObject);
            }
        });
    }

    public static g x() {
        return b.f35247a;
    }

    public void g(a aVar) {
        synchronized (this) {
            this.f35246j.add(aVar);
        }
    }

    public boolean h() {
        return this.f35244h;
    }

    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void m(JSONObject jSONObject) {
        this.f35245i = false;
        String strOptString = jSONObject.optString(JNICallProtocol.getCallIdKey());
        String strOptString2 = jSONObject.optString(JNICallProtocol.getNotificationIdKey());
        String strOptString3 = jSONObject.optString(JNICallProtocol.getCallerUserIdKey());
        String strOptString4 = jSONObject.optString(JNICallProtocol.getCallerCombinedNameKey());
        String strOptString5 = jSONObject.optString(JNICallProtocol.getCalleeUserIdKey());
        String strOptString6 = jSONObject.optString(JNICallProtocol.getCalleeCombinedNameKey());
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f35246j).iterator();
                while (it.hasNext()) {
                    ((a) it.next()).p(strOptString, strOptString2, strOptString3, strOptString5, strOptString4, strOptString6);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void k(JSONObject jSONObject) {
        String strOptString = jSONObject.optString(JNICallProtocol.getNotificationIdKey());
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f35246j).iterator();
                while (it.hasNext()) {
                    ((a) it.next()).V(strOptString);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void i(JSONObject jSONObject) {
        this.f35245i = true;
        this.f35244h = true;
        String strOptString = jSONObject.optString(JNICallProtocol.getCallIdKey());
        String strOptString2 = jSONObject.optString(JNICallProtocol.getNotificationIdKey());
        String strOptString3 = jSONObject.optString(JNICallProtocol.getCallerUserIdKey());
        String strOptString4 = jSONObject.optString(JNICallProtocol.getCallerCombinedNameKey());
        String strOptString5 = jSONObject.optString(JNICallProtocol.getCalleeUserIdKey());
        String strOptString6 = jSONObject.optString(JNICallProtocol.getCalleeCombinedNameKey());
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f35246j).iterator();
                while (it.hasNext()) {
                    ((a) it.next()).o(strOptString, strOptString2, strOptString3, strOptString5, strOptString4, strOptString6);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void l(JSONObject jSONObject) {
        this.f35245i = false;
        this.f35244h = false;
        String strOptString = jSONObject.optString(JNICallProtocol.getCallActionKey());
        String strOptString2 = jSONObject.optString(JNICallProtocol.getNotificationIdKey());
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f35246j).iterator();
                while (it.hasNext()) {
                    ((a) it.next()).v(strOptString2, strOptString);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void j(JSONObject jSONObject) {
        this.f35244h = true;
        String strOptString = jSONObject.optString(JNICallProtocol.getNotificationIdKey());
        boolean zOptBoolean = jSONObject.optBoolean(JNICallProtocol.getIsDuplicateKey());
        boolean zOptBoolean2 = jSONObject.optBoolean(JNICallProtocol.getIsExpiredKey());
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f35246j).iterator();
                while (it.hasNext()) {
                    ((a) it.next()).C(strOptString, (zOptBoolean || zOptBoolean2) ? false : true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void n(JSONObject jSONObject) {
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f35246j).iterator();
                while (it.hasNext()) {
                    ((a) it.next()).m0(jSONObject.optString(JNICallProtocol.getNotificationIdKey()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void u(String str, long j10, String str2, long j11, String str3, long j12, String str4, String str5, long j13, boolean z10, String str6) {
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

    public void v(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNICallProtocol.getCallIdKey(), str);
            this.f35238a.l(JNICallProtocol.getRejectCallId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("CallProtocol", "Constructing JSON params for reject call failed with error: " + e10.getMessage());
        }
    }

    public void w(a aVar) {
        synchronized (this) {
            this.f35246j.remove(aVar);
        }
    }

    public void y(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNICallProtocol.getCallIdKey(), str);
            this.f35238a.l(JNICallProtocol.getSuppressCallId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("CallProtocol", "Constructing JSON params for suppress call failed with error: " + e10.getMessage());
        }
    }
}
