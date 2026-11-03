package vl;

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
    public final MessageBus f33560a;
    public Connection b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Connection f33561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Connection f33562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Connection f33563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Connection f33564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Connection f33565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f33566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f33567i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Set<a> f33568j = new HashSet();

    public interface a {
        void B(String str, boolean z10);

        void U(String str);

        void m0(String str);

        void o(String str, String str2, String str3, String str4, String str5, String str6);

        void p(String str, String str2, String str3, String str4, String str5, String str6);

        void u(String str, String str2);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f33569a = new g(null);
    }

    public g(MessageBus messageBus) {
        messageBus = messageBus == null ? MessageBus.f() : messageBus;
        this.f33560a = messageBus;
        this.f33565g = messageBus.t(JNICallProtocol.getHandleConnectingCallId(), new Callback() { // from class: vl.a
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f33554a.i(jSONObject);
            }
        });
        this.b = messageBus.t(JNICallProtocol.getHandleReceiveCallId(), new Callback() { // from class: vl.b
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f33555a.j(jSONObject);
            }
        });
        this.f33561c = messageBus.t(JNICallProtocol.getHandleAnswerCallId(), new Callback() { // from class: vl.c
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f33556a.k(jSONObject);
            }
        });
        this.f33562d = messageBus.t(JNICallProtocol.getHandleEndCallId(), new Callback() { // from class: vl.d
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f33557a.l(jSONObject);
            }
        });
        this.f33563e = messageBus.t(JNICallProtocol.getHandleActiveCallId(), new Callback() { // from class: vl.e
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f33558a.m(jSONObject);
            }
        });
        this.f33564f = messageBus.t(JNICallProtocol.getHandleRemovePendingReceivedCall(), new Callback() { // from class: vl.f
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f33559a.n(jSONObject);
            }
        });
    }

    public static g x() {
        return b.f33569a;
    }

    public void g(a aVar) {
        synchronized (this) {
            this.f33568j.add(aVar);
        }
    }

    public boolean h() {
        return this.f33566h;
    }

    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void m(JSONObject jSONObject) {
        this.f33567i = false;
        String strOptString = jSONObject.optString(JNICallProtocol.getCallIdKey());
        String strOptString2 = jSONObject.optString(JNICallProtocol.getNotificationIdKey());
        String strOptString3 = jSONObject.optString(JNICallProtocol.getCallerUserIdKey());
        String strOptString4 = jSONObject.optString(JNICallProtocol.getCallerCombinedNameKey());
        String strOptString5 = jSONObject.optString(JNICallProtocol.getCalleeUserIdKey());
        String strOptString6 = jSONObject.optString(JNICallProtocol.getCalleeCombinedNameKey());
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f33568j).iterator();
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
                Iterator it = new HashSet(this.f33568j).iterator();
                while (it.hasNext()) {
                    ((a) it.next()).U(strOptString);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void i(JSONObject jSONObject) {
        this.f33567i = true;
        this.f33566h = true;
        String strOptString = jSONObject.optString(JNICallProtocol.getCallIdKey());
        String strOptString2 = jSONObject.optString(JNICallProtocol.getNotificationIdKey());
        String strOptString3 = jSONObject.optString(JNICallProtocol.getCallerUserIdKey());
        String strOptString4 = jSONObject.optString(JNICallProtocol.getCallerCombinedNameKey());
        String strOptString5 = jSONObject.optString(JNICallProtocol.getCalleeUserIdKey());
        String strOptString6 = jSONObject.optString(JNICallProtocol.getCalleeCombinedNameKey());
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f33568j).iterator();
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
        this.f33567i = false;
        this.f33566h = false;
        String strOptString = jSONObject.optString(JNICallProtocol.getCallActionKey());
        String strOptString2 = jSONObject.optString(JNICallProtocol.getNotificationIdKey());
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f33568j).iterator();
                while (it.hasNext()) {
                    ((a) it.next()).u(strOptString2, strOptString);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void j(JSONObject jSONObject) {
        this.f33566h = true;
        String strOptString = jSONObject.optString(JNICallProtocol.getNotificationIdKey());
        boolean zOptBoolean = jSONObject.optBoolean(JNICallProtocol.getIsDuplicateKey());
        boolean zOptBoolean2 = jSONObject.optBoolean(JNICallProtocol.getIsExpiredKey());
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f33568j).iterator();
                while (it.hasNext()) {
                    ((a) it.next()).B(strOptString, (zOptBoolean || zOptBoolean2) ? false : true);
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
                Iterator it = new HashSet(this.f33568j).iterator();
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
            this.f33560a.l(JNICallProtocol.getRejectCallId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("CallProtocol", "Constructing JSON params for reject call failed with error: " + e10.getMessage());
        }
    }

    public void w(a aVar) {
        synchronized (this) {
            this.f33568j.remove(aVar);
        }
    }

    public void y(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(JNICallProtocol.getCallIdKey(), str);
            this.f33560a.l(JNICallProtocol.getSuppressCallId(), jSONObject);
        } catch (JSONException e10) {
            Log.e("CallProtocol", "Constructing JSON params for suppress call failed with error: " + e10.getMessage());
        }
    }
}
